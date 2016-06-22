package com.wanda.controller;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wande.utils.SendUtil;
import com.wande.web.bean.User;

public class AOPControllerTest {

	public static void main(String[] args)throws Exception {
		testAop();
	}
	
	public  static void testAop()throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("id", 4L);
		map.put("username", "xiaolig");
		map.put("password", "no fuck");
		
		String url = "http://localhost:8080/webtest/aop/user";
		SendUtil.postResponse(url, null, map);
	}

}
