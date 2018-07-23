package com.vivek.genericspring;

import java.util.Set;

import javax.management.monitor.Monitor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vivek.genericspring.events.MyEventPublisher;
import com.vivek.genericspring.utils.Monitoring;

public class AppEvents {
	private static Logger log = LoggerFactory.getLogger(AppEvents.class);

	public static void main(String args[]) {
		log.info("Hello World");
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigForEvents.class);
		
		MyEventPublisher eventP = ctx.getBean(MyEventPublisher.class);
		eventP.createOrder();
		
		Monitoring.showThreadStatistics();
		
		ctx.close();
	}
}
