package com.vivek.genericspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor{
	private static Logger log = LoggerFactory.getLogger(BeanPostProcessorImpl.class);
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		//log.info("BeforeInitialization: "+ beanName);
		return bean;
	}
	
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		//log.info("AfterInitialization: "+ beanName);
		return bean;
	}
}