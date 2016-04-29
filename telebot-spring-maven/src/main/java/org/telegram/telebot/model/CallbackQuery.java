package org.telegram.telebot.model;

import java.io.Serializable;

public class CallbackQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4565411560571987333L;

	private Integer String;
	private User from;
	private Message message;
	private String inline_message_id;
	private String data;

	public Integer getString() {
		return String;
	}

	public void setString(Integer string) {
		String = string;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public String getInline_message_id() {
		return inline_message_id;
	}

	public void setInline_message_id(String inline_message_id) {
		this.inline_message_id = inline_message_id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

}
