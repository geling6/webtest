package com.geling.eventbus;

import com.google.common.eventbus.EventBus;

public class EventPublisher {
	private EventBus eventBus;
	
	public EventPublisher(EventBus eventBus){
		this.eventBus = eventBus;
	}
	
	public void publish(){
		System.out.println("Event begin .");
		Event event = new Event();
		event.setId(1);
		event.setName("lili");
		event.setPassword("md5");
		
		eventBus.post(event);
		
		System.out.println("Event end .");
	}
}
