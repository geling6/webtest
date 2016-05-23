package com.geling.thread;

/**
 * ThreadLocal����Ҫ�������̰߳󶨵�����
 */
public class ThreadLocalTest {

	
	private static ThreadLocal<Integer> local = new ThreadLocal<>();
	public static void main(String[] args) {
		new Thread(new Runnable(){
			@Override
			public void run() {
				local.set(12);//�����ڵ�ǰ�̵߳����з����乲��
				getValue();
			}
		},"�߳�1").start();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				local.set(22);
				getValue();
			}
		},"�߳�2").start();
	}
	private static void getValue(){
		int value = local.get();
		System.out.println(Thread.currentThread().getName() + " : " + value);
	}
}
