package com.geling.thread.pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 线程池里使用定时器,不太好用
 */
public class ThreadPoolTimer {

	public static void main(String[] args) {
		ScheduledExecutorService exec = Executors.newScheduledThreadPool(3);
		for(int i=0;i<10;i++){
			exec.scheduleAtFixedRate(new Runnable(){
				@Override
				public void run() {
					System.out.println(Thread.currentThread().getName() + " : fuck !");
				}
			}, 1000, 2000,TimeUnit.MILLISECONDS);			
		}
		
		//exec.shutdown();
	}
}
