package com.wande.redis;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import com.wande.mybatis.bean.Store;
import com.wande.mybatis.dao.StoreMapper;

import redis.clients.jedis.JedisCluster;

/**
 * @author yangyang
 * @desc redis与spring整合下。很简单，对比JedisTest看
 */
public class JedisSpringTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-*.xml");
		JedisCluster jedisCluster = (JedisCluster) ctx.getBean("jedisCluster");
		
		System.out.println(jedisCluster.get("fuck"));
		System.out.println(jedisCluster.set("hua", "zhaoxuhua"));
		
		
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		StoreMapper mapper = session.getMapper(StoreMapper.class);
		int count = mapper.count();
		
		Class<?> storeClass = Class.forName("com.wande.mybatis.bean.Store");
		Field[] fields = Store.class.getDeclaredFields();
		
		int offset = 0, limit = 100;
		while(offset <= count) {
			List<Store> stores = mapper.queryStores(offset, limit);
			for(Store store : stores) {
				String key = "STORE_" + store.getStoreId();
				Map<String, String> old = jedisCluster.hgetAll(key);
				if(!CollectionUtils.isEmpty(old)) {
					for(Field field : fields) {
						String fieldSetter = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
						Method met = storeClass.getMethod("get" + fieldSetter);
						Object value = met.invoke(store);
						if(value != null) {
							jedisCluster.hsetnx(key, field.getName(), value.toString());
						}
					}					
				}
			}
			
			System.out.println("offset:" + offset + ", limit" + limit);
			offset += limit;
		}
				
	}

}
