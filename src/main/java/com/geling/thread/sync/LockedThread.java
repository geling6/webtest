package com.geling.thread.sync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.springframework.util.StringUtils;

public class LockedThread {

	public static void main(String[] args) {
		final LockOutputer output = new LockOutputer();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try{
						TimeUnit.MILLISECONDS.sleep(200);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					output.output("fucktong");
				}
			}
		}).start();
		
		new Thread(new Runnable(){
			@Override
			public void run() {
				while(true){
					try{
						TimeUnit.MILLISECONDS.sleep(200);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					output.output("fuckhui");
				}
			}
		}).start();
	}

}

class LockOutputer{
	Lock lock = new ReentrantLock();
	public void output(String name){
		lock.lock();
		try{
			if(!StringUtils.isEmpty(name)){
				for(int i=0;i<name.length();i++){
					System.out.print(name.charAt(i));
				}
				System.out.println();
			}			
		}finally{
			lock.unlock();
		}
	}
}
