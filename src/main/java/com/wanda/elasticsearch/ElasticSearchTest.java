package com.wanda.elasticsearch;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpMethod;

import com.wanda.utils.SendUtil;

public class ElasticSearchTest {

	public static void main(String[] args) throws Exception{
		Map<String,Object> map = new HashMap<>();
		
		String url = "http://192.168.203.128:9200/yangyang/fucker/3?pretty";
		SendUtil.sendRequestWithParam(url, map, HttpMethod.GET);

	}

}
