package com.geling.thread.sync;

public class SynchroizedThread {

	public static void main(String[] args) {
		
		//要执行的对象
		final Outputer output = new Outputer();
		
		//第一个线程
		new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					output.output("tongleiyan");
				}
			}
		},"线程1").start();
		
		//第二个线程
		new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try{
						Thread.sleep(100);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					output.output("zhanghui");
				}
			}
		}).start();
	}

}
