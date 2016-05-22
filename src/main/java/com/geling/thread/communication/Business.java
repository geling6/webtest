package com.geling.thread.communication;

/**
 * �̵߳������̵߳�ͬ����ʽ���Ƿ�װ���߳�Ҫִ�еĴ�����
 */
class Business {
	boolean flag = true;
	public synchronized void sub(int i){
		while(!flag){//�˴���while����ֹ��α���ѡ�
			try{
				this.wait();//wait()һ��Ҫ�ŵ�synchronized����		
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
