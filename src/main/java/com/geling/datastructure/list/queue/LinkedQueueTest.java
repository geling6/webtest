package com.geling.datastructure.list.queue;

public class LinkedQueueTest {

	public static void main(String[] args) {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
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
