package com.wande.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wande.web.bean.User;

@Controller
@RequestMapping(value = "/aop")
public class AOPController {
	Logger logger = Logger.getLogger(AOPController.class);
	@RequestMapping(value = "/user",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
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
	
	@RequestMapping(value="/log")
	@ResponseBody
	public Object logTest(HttpServletRequest request){
		logger.debug("fuck debug");
		logger.info("fuck info");
		logger.warn("fuck warn");
		logger.error("fuck error");
		return "fuck";
	}
}
