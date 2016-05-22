package com.geling.thread.communication;

public class CommunicationThread {
	public static void main(String[] args) {
		final Business business = new Business();
		new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<20;i++){
					business.sub(i);
				}
			}
		},"线程1").start();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i=0;i<20;i++){
					business.main(i);
				}
			}
		},"线程2").start();
	}
}
