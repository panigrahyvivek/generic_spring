package com.vivek.genericspring.events;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;


@Component
public class MyEventListener{
	private static Logger log = LoggerFactory.getLogger(MyEventListener.class);
	@Async
	@EventListener
	public void handleOrderCreation(String str) {
		log.info("Event Listen: "+ str);
			
	}
	
}