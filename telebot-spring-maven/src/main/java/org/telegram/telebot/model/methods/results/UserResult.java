package org.telegram.telebot.model.methods.results;

import java.io.Serializable;

import org.telegram.telebot.model.User;

public class UserResult extends MethodResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1735146338573399853L;

	private User result;

	public User getResult() {
		return result;
	}

	public void setResult(User result) {
		this.result = result;
	}

}
