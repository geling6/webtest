package com.wande.elasticsearch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpMethod;

import com.wande.utils.SendUtil;

public class ESTest {

	public static void main(String[] args) throws Exception{
		Map<String,Object> map = new HashMap<String,Object>();
		
		String url = "http://10.1.80.63:9200/yangyang/fucker/3?pretty";
		SendUtil.sendRequestWithParam(url, map, HttpMethod.GET);

	}

}
