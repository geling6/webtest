package com.geling.thread.pool;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;


/**
 * 执行一个任务，再在下边等待它执行的结果
 */
public class CallableAndFuture {
	public static void main(String[] args) {
		
		//单个任务
		ExecutorService exec = Executors.newCachedThreadPool();
		Future<String> future = exec.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("I am in callable.");
				TimeUnit.MILLISECONDS.sleep(1000);
				return "fuck";
			}
		});
		System.out.println("wait for thread pool ...");
		try{
			System.out.println(future.get());
		}catch(Exception e){
			e.printStackTrace();
		}
		exec.shutdown();
		//批量任务
		ExecutorService exec2 = Executors.newFixedThreadPool(3);
		CompletionService<Integer> completionService = new ExecutorCompletionService<Integer>(exec2);
		for(int i=0;i<10;i++){
			completionService.submit(new Callable<Integer>(){
				@Override
				public Integer call() throws Exception {
					int random = new Random().nextInt(5000);
					TimeUnit.MILLISECONDS.sleep(random);
					return random;
				}
			});			
		}
		for(int i=0;i<10;i++){
			try {
				System.out.println(completionService.take().get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		exec2.shutdown();
	}
}
