package org.telegram.telebot.model.methods;

import java.io.Serializable;

public class ChatMember implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	// TODO: See how to do with String and Integer
	private String chat_id;
	private Integer user_id;

	public String getChat_id() {
		return chat_id;
	}

	public void setChat_id(String chat_id) {
		this.chat_id = chat_id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

}