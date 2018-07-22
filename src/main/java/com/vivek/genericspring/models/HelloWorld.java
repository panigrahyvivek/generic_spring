package com.vivek.genericspring.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	private static Logger log = LoggerFactory.getLogger(HelloWorld.class);

	private String message;
	private String defaultTitle;

	public String getDefaultTitle() {
		return defaultTitle;
	}

	public void setDefaultTitle(String defaultTitle) {
		this.defaultTitle = defaultTitle;
	}

	public void init() {
		log.info("Hello World Bean initialized");
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void destroy() {
		log.info("Bean Hello World detsroyed");
	}
}