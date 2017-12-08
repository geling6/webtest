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
import org.springframework.util.CollectionUtils;

import com.wande.mybatis.bean.Store;
import com.wande.mybatis.dao.StoreMapper;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author yangyang
 * @desc redis与spring整合下。很简单，对比JedisTest看
 */
public class JedisStoreValidation {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		
		JedisPoolConfig cfg = new JedisPoolConfig();
        cfg.setMaxIdle(10);
        cfg.setMaxTotal(15);
        cfg.setMaxWaitMillis(-1);
        cfg.setTestOnBorrow(true);
        
        JedisPool jedisPool = new JedisPool(cfg, "192.168.163.128", 6379);
        Jedis jedis = jedisPool.getResource();
        
        JedisPool jedisPool1 = new JedisPool(cfg, "192.168.163.129", 6379);
        Jedis jedis1 = jedisPool1.getResource();
		
		String resource = "mybatis.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		
		SqlSession session = sqlSessionFactory.openSession();
		
		StoreMapper mapper = session.getMapper(StoreMapper.class);
		int count = mapper.count();
				
		int offset = 0, limit = 100;
		while(offset <= count) {
			List<Store> stores = mapper.queryStores(offset, limit);
			for(Store store : stores) {
				String key = "STORE_" + store.getStoreId();
				Map<String, String> old = jedis.hgetAll(key);
				Map<String, String> keyIn3 = jedis1.hgetAll(key);
				if(CollectionUtils.isEmpty(old) && !CollectionUtils.isEmpty(keyIn3)) {
					System.out.println("Error : " + key);
				}
			}
			
			System.out.println("offset:" + offset + ", limit" + limit);
			offset += limit;
		}
				
	}

}
