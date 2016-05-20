package com.geling.eventbus;

import com.google.common.eventbus.EventBus;

public class EventBusTest {

	/**
	 * http://ifeve.com/google-guava-eventbus/
	 * @param args
	 */
	public static void main(String[] args) {
		EventBus eventBus = new EventBus();//同步方式，异步的话ansyEventBus = new AsyncEventBus(Excutor);
		
		eventBus.register(new EventSubscriber());
		
		EventPublisher publisher = new EventPublisher(eventBus);//此处的eventbus必须为同一个
		
		publisher.publish();
	}

}
