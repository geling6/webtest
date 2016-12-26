package com.geling.datastructure.list.queue;

public class SqQueueTest {

	public static void main(String[] args) {
		SqQueue<Integer> queue = new SqQueue<>();
		queue.initQueue();
		
		System.out.println(queue.length());
		
		queue.enQueue(34);
		queue.enQueue(6);
		queue.enQueue(90);
		queue.traverse();
		
		queue.deQueue();
		queue.traverse();
		
		queue.clear();
		queue.traverse();
		
		queue.destroyQueue();
		queue.traverse();
	}

}
