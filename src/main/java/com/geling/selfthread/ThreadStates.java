package com.geling.selfthread;

import java.util.concurrent.TimeUnit;

public class ThreadStates {
	public static void main(String[] args) {
		new Thread(new TimeWaiting(), "TimeWaitingThread").start();
		new Thread(new Waiting(), "WaitingThread").start();
		new Thread(new Blocked(), "BlockedThread-1").start();
		new Thread(new Blocked(), "BlockedThread-2").start();
	}
}

class TimeWaiting implements Runnable{
	@Override
	public void run() {
		while(true) {
			try {				
				TimeUnit.SECONDS.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Waiting implements Runnable{
	@Override
	public void run() {
		while(true) {
			synchronized(Waiting.class){
				try {
					Waiting.class.wait();
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

class Blocked implements Runnable{
	@Override
	public void run() {
		synchronized(Blocked.class) {
			while(true) {
				try {
					TimeUnit.SECONDS.sleep(10);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}