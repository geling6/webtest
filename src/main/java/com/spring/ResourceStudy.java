package com.spring;


import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ResourceStudy {
	public static void main(String[] args) throws Exception{
		Resource resource = new ClassPathResource("redis.properties");
		if(resource.exists()){
			System.out.println(resource.contentLength());
		}else{
			System.out.println("fuck");
		}
	}
	
}
