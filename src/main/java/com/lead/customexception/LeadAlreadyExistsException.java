package com.lead.customexception;

public class LeadAlreadyExistsException extends RuntimeException {
	
	 public LeadAlreadyExistsException(String message) {
	        super(message);
	    }
	}

