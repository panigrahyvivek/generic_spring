package com.vivek.genericspring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "com.vivek.genericspring.events")
public class AppConfigForEvents {
	
}