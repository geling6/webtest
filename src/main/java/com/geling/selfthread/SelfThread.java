package com.geling.selfthread;

/**
 * 继承子Thread类
 */
class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	@Override
	public void run(){
		while(true){
			try{
				Thread.sleep(3000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

/**
 * 实现Runnable接口
 */
class MyRunnable implements Runnable{
	
	@Override
	public void run(){
		while(true){
			try{
				Thread.sleep(7000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}
}

public class SelfThread {

	public static void main(String[] args) {
		//继承自Thread类的启动
		MyThread myThread = new MyThread("线程1");
		myThread.start();
		
		//实现Runnable接口的启动
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable,"线程2");
		thread.start();
		
		//主线程
		while(true){
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
	}

}
