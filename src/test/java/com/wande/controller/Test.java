package com.wande.controller;

import java.util.concurrent.TimeUnit;


public class Test {

	public static void main(String[] args) {
		final Loop loop = new Loop();
		new Thread(new Runnable(){
			@Override
			public void run(){
				loop.loops(10);
			}
		}).start();
		
		new Thread(new Runnable(){
			@Override
			public void run(){
				loop.loops(20);
			}
		}).start();
	}	
}

class Loop{
	ThreadLocal local = new ThreadLocal();
	public synchronized void loops(int count){
		for(int i=0;i<count;i++){
			try{
				TimeUnit.MILLISECONDS.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.print(i + " \t");
		}
		System.out.println();
	}
}
