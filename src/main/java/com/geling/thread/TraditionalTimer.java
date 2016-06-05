package com.geling.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TraditionalTimer {
	public static void main(String[] args) {
		
		//10秒后执行的任务,以后每隔3秒执行一次
		new Timer().schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println("fuck you !");
			}
		}, 10000,3000);
		
		//主方法执行
		while(true){
			System.out.println(new Date().getSeconds());
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
