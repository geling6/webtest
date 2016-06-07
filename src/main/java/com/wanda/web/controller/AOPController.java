package com.wanda.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wanda.web.bean.User;

@Controller
@RequestMapping(value = "/aop",method = RequestMethod.POST)
public class AOPController {
	
	@RequestMapping(value = "/user",produces = "application/json;charset=UTF-8")
	@ResponseBody
	public Object aopTest(@RequestBody User param) throws Exception{
		ObjectMapper mapper = new ObjectMapper(); 
		
		System.out.println(mapper.writeValueAsString(param));
		User user = new User();
		user.setId(1);
		user.setUsername("xiaohua");
		user.setPassword("123456");
		String json = mapper.writeValueAsString(user);
		return json;
	}
}
