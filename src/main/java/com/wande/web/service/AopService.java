package com.wande.web.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Service;

@Service
public class AopService {
	
	public void MutilThreadMap(){
		Map<String,String> map = new HashMap<String,String>();
		
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<50;i++){
			exec.execute(new PutThread(map));
			exec.execute(new GetThread(map));
		}
	}
}

class PutThread implements Runnable{
	private static int count = 1;
	private final int id = count++;
	
	private Map<String,String> map;
	
	public PutThread(){
	}
	public PutThread(Map<String, String> map){
		this.map = map;
	}
	
	@Override
	public void run(){
		for(int i=0;i<10000;i++){
			map.put("Thread" + id + "-" + i, id + "" + i);
		}
	}
}
class GetThread implements Runnable{
	private static int count = 1;
	private final int id = count++;
	
	private Map<String,String> map;
	
	public GetThread(){
	}
	public GetThread(Map<String,String> map){
		this.map = map;
	}
	@Override
	public void run(){
		for(int i=0;i<10000;i++){
			String value = map.get("Thread" + id + "-" + i);
			System.out.println("Thread" + id + "-" + i + " : " + value);
		}
	}
}
