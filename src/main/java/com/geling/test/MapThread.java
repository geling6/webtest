package com.geling.test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class MapThread {
	public static void main(String[] args) {
		final Map<String,String> map = new HashMap<String,String>();
		
		new Thread("threada"){
			@Override
			public void run() {
				for(int i=1;i<=1000;i++){
					map.put("threada" + i, "a" + i);
				}
			}
		}.start();
		
		new Thread("Threadb"){
			@Override
			public void run() {
				for(int i=1;i<=1000;i++){
					map.put("threadb" + i, "b" + i);
				}
			};
		}.start();
		
		new Thread("threadc"){
			@Override
			public void run() {
				for(int i=1;i<=1000;i++){
					map.put("threadc" + i, "c"+ i);
				}
			};
		}.start();
		
		new Thread("threadd"){
			@Override
			public void run() {
				for(int i=1;i<=1000;i++){
					map.put("threadd" + i, "d"+ i);
				}
			};
		}.start();
		
		new Thread("threade"){
			@Override
			public void run() {
				for(int i=1;i<=1000;i++){
					map.put("threade" + i, "e"+ i);
				}
			};
		}.start();
		
		new Thread("threadf"){
			@Override
			public void run() {
				for(int i=0;i<100;i++){
					System.out.println(map.get("threada" + i));
				}
			};
		}.start();
		
		try{
			TimeUnit.SECONDS.sleep(10);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(map.size());
		System.out.println(map);
	}
}
