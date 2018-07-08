package com.spring;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wande.web.service.MemcacheService;

public class ContextTest {

	public static void main(String[] args) {
		ApplicationContext act = new ClassPathXmlApplicationContext("spring-servlet.xml");
		
		System.out.println(act.getBean("memcacheController"));
		
		System.out.println(act.getBean("memcacheService"));
		
		MemcacheService service = (MemcacheService) act.getBean("memcacheService");
		service.testMemcache();
		System.out.println(service);
		
		AtomicInteger in = new AtomicInteger();
	}

}
