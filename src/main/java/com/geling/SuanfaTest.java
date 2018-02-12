package com.geling;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


class Producer implements Runnable{
	
	private BlockingQueue<Integer> queue;
	private Random random = new Random();
	
	public Producer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}
	@Override
	public void run(){
		while(true){
			Integer i = random.nextInt();
			try{
				TimeUnit.SECONDS.sleep(random.nextInt(10));
				queue.put(i);
				System.out.println(Thread.currentThread().getName() + " 生产: " + i);
			}catch(Exception e){
				e.printStackTrace();
			}			
		}
	}
}

class Consumer implements Runnable{
	private BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue){
		this.queue = queue;
	}
	
	public void run(){
		while(true){
			try{
				TimeUnit.SECONDS.sleep(5);
				Integer i = queue.take();
				System.out.println(Thread.currentThread().getName() + " 消费: " + i);
			}catch(InterruptedException e){
				e.printStackTrace();
			}			
		}
		
	}
}

public class SuanfaTest {
	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
		
		Producer producer1 = new Producer(queue);
		Producer producer2 = new Producer(queue);
		
		Consumer consumer1 = new Consumer(queue);
		Consumer consumer2 = new Consumer(queue);
		
		ExecutorService exec = Executors.newCachedThreadPool();
		
		exec.execute(producer1);
		exec.execute(producer2);
		exec.execute(consumer1);
		exec.execute(consumer2);
	}	
}
