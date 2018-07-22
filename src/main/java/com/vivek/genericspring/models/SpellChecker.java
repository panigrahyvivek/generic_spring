package com.vivek.genericspring.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpellChecker {
	private static Logger log = LoggerFactory.getLogger(SpellChecker.class);
	
	private Boolean spellCheckOk;
	

	public Boolean getSpellCheckOk() {
		log.info("Inside Spell Checker");
		return spellCheckOk;
	}

	public void setSpellCheckOk(Boolean spellCheckOk) {
		this.spellCheckOk = spellCheckOk;
	}

	public void init() {
		this.spellCheckOk = false;
		log.info("Bean Spell Checker created");
	}

	public void destroy() {
		log.info("Bean Spell Checker detsroyed");
	}
}
