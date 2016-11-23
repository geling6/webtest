package com.geling.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wande.web.service.MemcacheService;

public class StringTest {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-servlet.xml");
		MemcacheService memcacheService = (MemcacheService) act.getBean("memcacheService");
		memcacheService.testMemcache();
	}

}
