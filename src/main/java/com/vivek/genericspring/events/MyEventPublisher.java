package com.vivek.genericspring.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class MyEventPublisher{
	private static Logger log = LoggerFactory.getLogger(MyEventPublisher.class);
	private final ApplicationEventPublisher publisher;
	
	public MyEventPublisher(ApplicationEventPublisher p){
		this.publisher = p;
	}
	
	public void createOrder() {
		this.publisher.publishEvent("hello");
		log.info("Event published in Publisher");
	}
	
}