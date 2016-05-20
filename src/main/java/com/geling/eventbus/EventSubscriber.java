package com.geling.eventbus;


import com.google.common.eventbus.Subscribe;

/**
 * @author yangyang
 * @desc 订阅者
 */
public class EventSubscriber {
	
	@Subscribe
	public void recordCustomerChange(Event event) {
		System.out.println(event.getId() + ", " + event.getName() + ", " + event.getPassword());
	}

}
