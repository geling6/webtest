package com.wande.redis;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
		List<Store> stores = mapper.queryStores(0, 100);
		
		System.out.println(count + "" + stores);
		
	}

}
