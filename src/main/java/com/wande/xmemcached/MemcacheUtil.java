package com.wande.xmemcached;

import java.util.concurrent.TimeoutException;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.utils.AddrUtil;

public class MemcacheUtil {
	private static MemcachedClientBuilder builder = new XMemcachedClientBuilder(
            AddrUtil.getAddresses("10.213.42.63:11212 10.213.42.64:11212"));
	
	public static void memcacheSet(String key,Integer expire,String value){
		MemcachedClient memcachedClient = null;
		try {
			memcachedClient = builder.build();
			memcachedClient.set(key, 0, value);
		} catch (MemcachedException e) {
			System.err.println("MemcachedClient operation fail");
			e.printStackTrace();
		} catch (TimeoutException e) {
			System.err.println("MemcachedClient operation timeout");
			e.printStackTrace();
		} catch (Exception e) {
		}
		try {
			if(memcachedClient != null){
				memcachedClient.shutdown();
			}
		} catch (Exception e) {
			System.err.println("Shutdown MemcachedClient fail");
			e.printStackTrace();
		}
	}
	public static Object memcacheGet(String key){
		try{
			MemcachedClient memcachedClient = builder.build();
			String value = memcachedClient.get(key);
			return value;			
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
}
