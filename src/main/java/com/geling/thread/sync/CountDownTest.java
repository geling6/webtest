package com.geling.thread.sync;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class CountDownTest {
	public static void main(String[] args) {
		
		final CountDownLatch countDown = new CountDownLatch(10);
		ExecutorService exec = Executors.newCachedThreadPool();
		
		//1个future
		Future<String> future1 = exec.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				TimeUnit.MILLISECONDS.sleep(5000);
				countDown.countDown();
				return "future1";
			}
		});
		
		//2个future
		Callable<String> callable2 = new Callable<String>(){
			@Override
			public String call() throws Exception{
				try{
					TimeUnit.MILLISECONDS.sleep(6000);
					return "future2";					
				}finally{
					countDown.countDown();					
				}
			}
		};
		Future<String> future2 = exec.submit(callable2);
		
		//3个future
		Future<String> future3 = exec.submit(new Callable<String>(){
			@Override
			public String call() throws Exception {
				try{
					TimeUnit.MILLISECONDS.sleep(2000);
					return "future3";					
				}finally{
					countDown.countDown();
				}
			}
		});
		
		//获取三个子线程的结果
		try {
			String str1 = future1.get();
			String str2 = future2.get();
			String str3 = future3.get();
			System.out.println(str1);
			System.out.println(str2);
			System.out.println(str3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		exec.shutdown();
		
	}
}
