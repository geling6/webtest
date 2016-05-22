package com.geling.selfthread;

/**
 * �̳���Thread��
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
 * ʵ��Runnable�ӿ�
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
		//�̳���Thread�������
		MyThread myThread = new MyThread("���߳�1");
		myThread.start();
		
		//ʵ��Runnable�ӿڵ�����
		MyRunnable myRunnable = new MyRunnable();
		Thread thread = new Thread(myRunnable,"���߳�2");
		thread.start();
		
		//���߳�
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
