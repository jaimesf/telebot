package org.telegram.telebot.service.exceptions;

public class FailResponseMethodException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4056407819935100300L;

	public FailResponseMethodException(String methodName, Throwable cause) {
		super("Method " + methodName + " fail on the execution", cause);
	}
	
	public FailResponseMethodException(String methodName) {
		super("Method " + methodName + " fail on the execution");
	}

}
