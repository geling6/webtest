package com.geling.selfthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest {
	public static void main(String[] args) {
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++){
			exec.execute(new LiftOff(7));
		}
		exec.shutdown();
	}
}
