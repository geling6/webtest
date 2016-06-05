package com.geling.thread;

/**
 * ThreadLocal类主要处理与线程绑定的数据
 */
public class ThreadLocalTest {

	
	private static ThreadLocal<Integer> local = new ThreadLocal<>();
	public static void main(String[] args) {
		new Thread(new Runnable(){
			@Override
			public void run() {
				local.set(12);//数据在当前线程的所有方法间共享
				getValue();
			}
		},"线程1").start();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				local.set(22);
				getValue();
			}
		},"线程2").start();
	}
	private static void getValue(){
		int value = local.get();
		System.out.println(Thread.currentThread().getName() + " : " + value);
	}
}
