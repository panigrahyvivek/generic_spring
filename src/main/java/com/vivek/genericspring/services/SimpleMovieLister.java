package com.vivek.genericspring.services;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

@Service
public class SimpleMovieLister
{
	private static Logger log;
	
	public SimpleMovieLister(Logger logger) {
		this.log = logger;
	}

	private MovieFinder movieFinder;
	
	@Autowired
    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
	
	@PostConstruct
	public void init() {
		log.info("init method of SimpleMovieLister");
	}
	
	public void findMovies() {
		movieFinder.listMovies();
	}

	

}
