package com.geling.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExcutorTest {

	public static void main(String[] args) {
		
		//ExecutorService exec = Executors.newFixedThreadPool(3);//开启了有3个线程的线程池
		//ExecutorService exec = Executors.newCachedThreadPool(); //需要几个就开启几个线程
		ExecutorService exec = Executors.newSingleThreadExecutor(); //就一个线程
		for(int i=0;i<10;i++){//往线程池里放了10个任务
			exec.execute(new Runnable(){
				@Override
				public void run() {
					//每个任务是在打印名字
					try{
						TimeUnit.MILLISECONDS.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " : " );
				}
			});			
		}
		
		exec.shutdown();//执行完任务后结束掉线程池;shutdownNow():代码执行到这儿行就结束掉线程池
	}

}
