package com.geling.thread.newlibrary.cyclicbarrier;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Horse implements Runnable{

	private static int counter = 0;
	private final int id = counter++;
	private int strides = 0;
	private static Random random = new Random(47);
	private static CyclicBarrier barrier;
	public Horse(CyclicBarrier barrier){
		this.barrier = barrier;
	}
	public synchronized int getStrides(){
		return strides;
	}
	
	@Override
	public void run(){
		try{
			while(!Thread.interrupted()){
				synchronized(this){
					strides += random.nextInt(3);
				}
				barrier.await();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}catch(BrokenBarrierException e){
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString(){
		return "Horse " + id + " ";
	}
	
	public String tracks(){
		StringBuilder s = new StringBuilder();
		for(int i=0;i<getStrides();i++){
			s.append("*");
		}
		s.append(id);
		return s.toString();
	}
}
