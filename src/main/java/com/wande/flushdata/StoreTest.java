package com.wande.flushdata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.concurrent.TimeUnit;

import org.springframework.http.HttpMethod;
import org.springframework.util.StringUtils;

import com.wande.utils.SendUtil;

public class StoreTest {
	
	
	public static void main(String[] args) {
		
		//方法叫直推kafka和pubsub,其实还会刷缓存
		//refreshStoreKFKAndCache();
		
		//只刷缓存
		//refreshStoreCache();
		
		//刷es和缓存
		//refreshStoreES();
		
		//刷所有:缓存,es,kafka,pubsub
		refreshStoreAll();
	}
	
	
	/**
	 * 刷新门店缓存,推kafka,pubsub
	 * 文件store_id.txt是门店id,每行以逗号分隔
	 */
	public static void refreshStoreKFKAndCache(){
		int count = 5;
		
		try{
			Reader reader = new FileReader("src" + File.separator + "main" + File.separator + "java" + File.separator + "com" 
					+ File.separator + "wande" + File.separator + "test" + File.separator + "store_id.txt");
			BufferedReader br = new BufferedReader(reader);
			String line = null;
			while((line = br.readLine()) != null){
				String[] storeIds = line.split(",");
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<storeIds.length;i++){
					Integer storeId = Integer.valueOf(storeIds[i]);
					sb.append(storeId + ",");
					if(i%count == 0){
						String url = "http://cda.intra.sit.ffan.com/cdaservice/sendStoreInKFK?key=142536&storeIds=" + sb;
						url = url.substring(0, url.length()-1);
						SendUtil.sendRequestWithParam(url, null, HttpMethod.GET);
						sb = new StringBuilder();
						TimeUnit.MILLISECONDS.sleep(1500);
					}
				}
				if(!StringUtils.isEmpty(sb.toString())){
					String url = "http://cda.intra.sit.ffan.com/cdaservice/sendStoreInKFK?key=142536&storeIds=" + sb;
					SendUtil.sendRequestWithParam(url, null, HttpMethod.GET);
					sb = null;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 只刷门店缓存,先删除,再调一次详情接口
	 */
	public static void refreshStoreCache(){
		try{
			Reader reader = new FileReader("src" + File.separator + "main" + File.separator + "java" + File.separator + "com" 
					+ File.separator + "wande" + File.separator + "test" + File.separator + "store_id.txt");
			BufferedReader br = new BufferedReader(reader);
			String line = null;
			while((line = br.readLine()) != null){
				String[] storeIds = line.split(",");
				for(int i=0;i<storeIds.length;i++){
					Integer storeId = Integer.valueOf(storeIds[i]);
					String url = "http://cda.intra.sit.ffan.com/cdaservice/cache?key=142536&action=delete&cacheKey=STORE_" + storeId;
					SendUtil.sendRequestWithParam(url, null, HttpMethod.GET);
					String url2 = "http://cda.intra.sit.ffan.com/cdaservice/cache?key=142536&action=delete&cacheKey=STORE_VO_LUA_" + storeId;
					SendUtil.sendRequestWithParam(url2, null, HttpMethod.GET);
					TimeUnit.MILLISECONDS.sleep(1500);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 门店刷es和缓存
	 */
	public static void refreshStoreES(){
		int count = 5;
		
		try{
			Reader reader = new FileReader("src" + File.separator + "main" + File.separator + "java" + File.separator + "com" 
					+ File.separator + "wande" + File.separator + "test" + File.separator + "store_id.txt");
			BufferedReader br = new BufferedReader(reader);
			String line = null;
			while((line = br.readLine()) != null){
				String[] storeIds = line.split(",");
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<storeIds.length;i++){
					Integer storeId = Integer.valueOf(storeIds[i]);
					sb.append(storeId + ",");
					if(i%count == 0){
						String url = "http://cda.intra.sit.ffan.com/cdaservice/stores/sync/es?key=142536&ids=" + sb;
						url = url.substring(0, url.length()-1);
						SendUtil.sendRequestWithParam(url, null, HttpMethod.GET);
						sb = new StringBuilder();
						TimeUnit.MILLISECONDS.sleep(1500);
					}
				}
				if(!StringUtils.isEmpty(sb.toString())){
					String url = "http://cda.intra.sit.ffan.com/cdaservice/stores/sync/es?key=142536&ids=" + sb;
					SendUtil.sendRequestWithParam(url, null, HttpMethod.GET);
					sb = null;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	/**
	 * 触发门店handlechange方法,把缓存,es,kafka,pubsub都刷/cdaservice/changeEventStores
	 */
	public static void refreshStoreAll(){
		int count = 5;
		
		try{
			Reader reader = new FileReader("src" + File.separator + "main" + File.separator + "java" + File.separator + "com" 
					+ File.separator + "wande" + File.separator + "test" + File.separator + "store_id.txt");
			BufferedReader br = new BufferedReader(reader);
			String line = null;
			while((line = br.readLine()) != null){
				String[] storeIds = line.split(",");
				StringBuilder sb = new StringBuilder();
				for(int i=0;i<storeIds.length;i++){
					Integer storeId = Integer.valueOf(storeIds[i]);
					sb.append(storeId + ",");
					if(i%count == 0){
						String url = "http://cda.intra.ffan.com/cdaservice/changeEventStores?key=142536&storeIds=" + sb;
						url = url.substring(0, url.length()-1);
						SendUtil.sendRequestWithParam(url, null, HttpMethod.GET);
						sb = new StringBuilder();
						TimeUnit.MILLISECONDS.sleep(1500);
					}
				}
				if(!StringUtils.isEmpty(sb.toString())){
					String url = "http://cda.intra.ffan.com/cdaservice/changeEventStores?key=142536&storeIds=" + sb;
					SendUtil.sendRequestWithParam(url, null, HttpMethod.GET);
					sb = null;
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	/**
	 * 根据key刷新memcache缓存
	 */
}
