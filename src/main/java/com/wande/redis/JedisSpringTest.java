package com.wande.redis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import redis.clients.jedis.JedisCluster;

/**
 * @author yangyang
 * @desc redis与spring整合下。很简单，对比JedisTest看
 */
public class JedisSpringTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-*.xml");
		JedisCluster jedisCluster = (JedisCluster) ctx.getBean("jedisCluster");
		
		System.out.println(jedisCluster.get("ssh"));
		System.out.println(jedisCluster.set("hua", "zhaoxuhua"));
	}

}
