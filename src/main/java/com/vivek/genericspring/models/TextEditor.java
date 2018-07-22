package com.vivek.genericspring.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	private static Logger log = LoggerFactory.getLogger(TextEditor.class);
	
	private SpellChecker spellChecker;
	
	public TextEditor() {
		
	}
	
	public TextEditor(SpellChecker sc) {
		log.info("Calling constructor with parameters");
		this.spellChecker = sc;
	}
	

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}

	
	public Boolean doSpellCheck() {
		return spellChecker.getSpellCheckOk();
	} 
	
	
	public void init() {
		log.info("Bean Text Editor created");
	}

	public void destroy() {
		log.info("Bean Text Editor detsroyed");
	}
}