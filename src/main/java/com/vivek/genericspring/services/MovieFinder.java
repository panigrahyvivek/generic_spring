package com.vivek.genericspring.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class MovieFinder
{
	private static Logger log = LoggerFactory.getLogger(MovieFinder.class);
	
	public MovieFinder() {
		log.info("MovieFinder Constructor");
	}

	public void listMovies(){
		log.info("Listing Movies: ");
	}

}
