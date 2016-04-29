package org.telegram.telebot.model.methods.results;

import java.io.Serializable;

import org.telegram.telebot.model.Message;

public class MessageResult extends MethodResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3800025221160895799L;

	private Message result;

	public Message getResult() {
		return result;
	}

	public void setResult(Message result) {
		this.result = result;
	}

}
