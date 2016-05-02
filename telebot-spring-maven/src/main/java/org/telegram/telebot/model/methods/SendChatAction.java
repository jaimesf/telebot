package org.telegram.telebot.model.methods;

import java.io.Serializable;

public class SendChatAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	// TODO: See how to do with String and Integer
	private Integer chat_id;
	private String action;

	public Integer getChat_id() {
		return chat_id;
	}

	public void setChat_id(Integer chat_id) {
		this.chat_id = chat_id;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

}
