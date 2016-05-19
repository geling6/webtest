package com.wanda.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

/**
 * @author yangyang
 *
 */
public class SendUtil {

    /**
     * @desc 发送的公共方法，支持各种http方法。参数的发送格式是拼接在url后边的
     * @param url
     * @param map 要拼接的参数
     * @param method
     */
    public static void sendesponse(String url, Map<String, Object> map, HttpMethod method) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String params = null;
        if (map != null && map.size() > 0) {
            Set<Map.Entry<String, Object>> keyValues = map.entrySet();
            Iterator<Map.Entry<String, Object>> iterator = keyValues.iterator();
            Map.Entry<String, Object> first = iterator.next();
            params = "?" + first.getKey() + "=" + first.getValue();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> keyValue = iterator.next();
                params += "&" + keyValue.getKey() + "=" + keyValue.getValue();
            }
            url += params;
        }
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(headers);
        RestTemplate restTemplate = new RestTemplate();
        try {
            System.out.println(url);
            ResponseEntity<String> retJson =
                    restTemplate.exchange(url, method, requestEntity, String.class);
            System.out.println("---json: " + retJson.getBody());
        }
        catch (HttpClientErrorException e) {
            System.out.println(e.getResponseBodyAsString());
            throw e;
        }
    }
    /**
     * @desc 发送的公共方法，支持各种http方法。参数的发送格式是拼接在url后边的和放到body里的
     * @param url
     * @param map 要拼接的参数
     * @param method
     * @param variables 放到body里的参数
     */
    public static void sendRequest(String url, Map<String, Object> map, HttpMethod method,Map<String,Object> variables) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String params = null;
        if (map != null && map.size() > 0) {
            Set<Map.Entry<String, Object>> keyValues = map.entrySet();
            Iterator<Map.Entry<String, Object>> iterator = keyValues.iterator();
            Map.Entry<String, Object> first = iterator.next();
            params = "?" + first.getKey() + "=" + first.getValue();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> keyValue = iterator.next();
                params += "&" + keyValue.getKey() + "=" + keyValue.getValue();
            }
            url += params;
        }
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(headers);
        RestTemplate restTemplate = new RestTemplate();
        try {
            System.out.println(url);
            ResponseEntity<String> retJson =
                    restTemplate.exchange(url, method, requestEntity, String.class,variables);
            System.out.println("---json: " + retJson.getBody());
        }
        catch (HttpClientErrorException e) {
            System.out.println(e.getResponseBodyAsString());
            throw e;
        }
    }
    
    /**
     * @desc 发送的公共方法，支持各种http方法。参数的发送格式是拼接在url后边的
     * @param url
     * @param map 要拼接的参数
     * @param method
     * @param variables url里已经有的占位置的参数
     */
    public static void sendSelfJson(String url, Map<String, Object> map, HttpMethod method,Map<String,Object> variables) throws Exception{
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        String params = null;
        if (map != null && map.size() > 0) {
        	Set<Map.Entry<String, Object>> keyValues = map.entrySet();
            Iterator<Map.Entry<String, Object>> iterator = keyValues.iterator();
            Map.Entry<String, Object> first = iterator.next();
            params = "&" + first.getKey() + "=" + first.getValue();
            while (iterator.hasNext()) {
                Map.Entry<String, Object> keyValue = iterator.next();
                params += "&" + keyValue.getKey() + "=" + keyValue.getValue();
            }
            url += params;
        }
        System.out.println(params);
        HttpEntity<Object> requestEntity = new HttpEntity<Object>(headers);
        RestTemplate restTemplate = new RestTemplate();
        try {
            System.out.println(url);
            ResponseEntity<String> retJson =
                    restTemplate.exchange(url, method, requestEntity, String.class,variables);
            System.out.println("---json: " + retJson.getBody());
        }
        catch (HttpClientErrorException e) {
            System.out.println(e.getResponseBodyAsString());
            throw e;
        }
    }
    
  //发送
    public static void postResponse(String url, Map<String, Object> param, Object map) {
    	HttpHeaders headers = new HttpHeaders();
  		headers.setContentType(MediaType.APPLICATION_JSON);
  		 
  		String params = null;
        if (param != null && param.size() > 0) {
        	Set<Map.Entry<String, Object>> keyValues = param.entrySet();
            Iterator<Map.Entry<String, Object>> iterator = keyValues.iterator();
            Map.Entry<String, Object> first = iterator.next();
            params = "?" + first.getKey() + "=" + first.getValue();
            while (iterator.hasNext()) {
            	Map.Entry<String, Object> keyValue = iterator.next();
                params += "&" + keyValue.getKey() + "=" + keyValue.getValue();
            }
            url += params;
        }
        System.out.println(url);
  		System.out.println("发送json: " + map);
  		HttpEntity<Object> requestEntity = new HttpEntity<Object>(map, headers);
  		RestTemplate restTemplate = new RestTemplate();
  		try {
  		    String strObject = restTemplate.postForObject(url, requestEntity, String.class);
  		    System.out.println("接受json: " + strObject);
  		}catch (HttpClientErrorException e) {
  		    System.out.println(e.getResponseBodyAsString());
  		    throw e;
  		}
  	}
}
