package com.geling.datastructure.list.queue;

public class LinkedQueueTest {

	public static void main(String[] args) {
		LinkedQueue<Integer> queue = new LinkedQueue<Integer>();
		queue.initQueue();
		
		System.out.println(queue.length());
		
		queue.enQuequ(34);
		queue.enQuequ(6);
		queue.enQuequ(90);
		queue.traverse();
		
		queue.deQueue();
		queue.traverse();
		
		queue.clear();
		queue.traverse();
		
		queue.desctoryQueue();
		queue.traverse();
	}

}
