package com.wande.web.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.wande.xmemcached.MemcacheUtil;

@Service
public class MemcacheService {
	private static final Logger logger = Logger.getLogger(MemcacheService.class);
	public void testMemcache(){
		MemcacheUtil.memcacheSet("fuck",10,"hui");
		String value = (String)MemcacheUtil.memcacheGet("fuck");
		logger.info(value);
		System.out.println("level: " + logger.getLevel());
		System.out.println("rootLogger: " + logger.getRootLogger());
		System.out.println("all appender: " + logger.getAllAppenders());
		logger.debug("debug.............");
		List<String> list = new ArrayList<String>();
		logger.info("class loading : " + list.getClass().getClassLoader());
	}
}
