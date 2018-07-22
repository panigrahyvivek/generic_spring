package com.vivek.genericspring.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChatRoom {
	private static Logger log = LoggerFactory.getLogger(ChatRoom.class);
	private String message;
	private String defaultTitle;
	

	public void init() {
		log.info("Chat Room Bean initialized");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	public String getDefaultTitle() {
		return defaultTitle;
	}

	public void setDefaultTitle(String defaultTitle) {
		this.defaultTitle = defaultTitle;
	}

	
	public void destroy() {
		log.info("Chat Room Bean destroyed");
	}
}