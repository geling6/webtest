package com.geling.thread.communication;

/**
 * 线程的锁，线程的同步方式都是封装在线程要执行的代码里
 */
class Business {
	boolean flag = true;
	public synchronized void sub(int i){
		while(!flag){//此处用while，防止“伪唤醒”
			try{
				this.wait();//wait()一定要放到synchronized里面		
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		for(int j=0;j<10;j++){
			System.out.println(Thread.currentThread().getName() + " in " + i + " : " + j);
		}
		
		flag = false;
		this.notify();
	}
	
	public synchronized void main(int i){
		while(flag){
			try{
				this.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		for(int j=0;j<20;j++){
			System.out.println(Thread.currentThread().getName() + " in " + i + " : " + j);
		}
		
		flag = true;
		this.notify();
	}
}
