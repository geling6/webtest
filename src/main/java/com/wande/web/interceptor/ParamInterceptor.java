package com.wande.web.interceptor;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
@Aspect
public class ParamInterceptor {

	//@Before("execution(public Object com.wanda.web.controller.AOPController.aopTest(..))")
	public void beforeMethod(JoinPoint joinPoint)throws Exception{
		Object[] args = joinPoint.getArgs();
		ObjectMapper mapper = new ObjectMapper();
		System.out.println("param : " + mapper.writeValueAsString(args));
	}
}
