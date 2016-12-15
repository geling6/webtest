package com.geling.selfthread;

public class LiftOff implements Runnable {

	private static int taskCount = 0;
	private final int id = taskCount++;
	
	protected int countDown = 10;
	
	public LiftOff(){
	}
	
	public LiftOff(int countDown){
		this.countDown = countDown;
	}
	public String status(){
		return "#" + id + "(" + (countDown>0?countDown:"Lift Off !") + ")";
	}
	@Override
	public void run() {
		while(countDown-- > 0){
			System.out.print(status());
			Thread.yield();
		}
		System.out.println();
	}

}
