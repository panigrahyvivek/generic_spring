package com.vivek.genericspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vivek.genericspring.services.SimpleMovieLister;

public class AppAnnotationBeans
{
	private static Logger log = LoggerFactory.getLogger(AppAnnotationBeans.class);
    public static void main(String args[]){
        log.info( "Hello World!" );
        
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        
        SimpleMovieLister sml = ctx.getBean(SimpleMovieLister.class);
        sml.findMovies();
        
        ctx.close();
    }
}
