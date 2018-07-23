package com.vivek.genericspring.utils;

import java.util.Set;

public class Monitoring{
	
	public static void showThreadStatistics(){
		Set<Thread> threads = Thread.getAllStackTraces().keySet();
		 
		for (Thread t : threads) {
		    String name = t.getName();
		    Thread.State state = t.getState();
		    int priority = t.getPriority();
		    String type = t.isDaemon() ? "Daemon" : "Normal";
		    System.out.printf("%-20s \t %s \t %d \t %s\n", name, state, priority, type);
		}
	}
}