package com.wande.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONUtil {
	private static ObjectMapper mapper;
	private JSONUtil(){
	}
	public static ObjectMapper getMapper(){
		if(mapper == null){
			return new ObjectMapper();
		}
		return mapper;
	}
}
