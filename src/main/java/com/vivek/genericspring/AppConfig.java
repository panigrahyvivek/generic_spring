package com.vivek.genericspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InjectionPoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
@ComponentScan(basePackages = "com.vivek.genericspring.services")
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	Logger logger(InjectionPoint injectionPoint) {
		return LoggerFactory.getLogger(injectionPoint.getMethodParameter().getContainingClass());
	}
	
	/*@Bean(name="simpleMovieLister", initMethod="init")
	public SimpleMovieLister simpleMovieLister(){
		return new SimpleMovieLister();
	}*/
	
	/*@Bean(name="movieFinder")
	public MovieFinder movieFinder(){
		return new MovieFinder();
	}*/
}