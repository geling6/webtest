package com.geling.thread.sync;

public class SynchroizedThread {

	public static void main(String[] args) {
		
		//Ҫִ�еĶ���
		final Outputer output = new Outputer();
		
		//��һ���߳�
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
		},"�߳�1").start();
		
		//�ڶ����߳�
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
