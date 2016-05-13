package com.wanda.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wanda.bean.User;
import com.wanda.utils.SendUtil;

public class AOPControllerTest {

	public static void main(String[] args)throws Exception {
		testAop();
	}
	
	public  static void testAop()throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		
		User user = new User();
		user.setId(2);
		user.setUsername("xiaoming");
		user.setPassword("abcdefg");
		
		String userStr = mapper.writeValueAsString(user);
		
		String url = "http://localhost:8080/webtest/aop/user";
		SendUtil.postResponse(url, null, userStr);
	}

}
