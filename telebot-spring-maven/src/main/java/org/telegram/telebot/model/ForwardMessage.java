package org.telegram.telebot.model;

import java.io.Serializable;

public class ForwardMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1986163559343316638L;

	private Integer chat_id;
	private Integer from_chat_id;
	private Boolean disable_notification;
	private Integer message_id;

	public Integer getChat_id() {
		return chat_id;
	}

	public void setChat_id(Integer chat_id) {
		this.chat_id = chat_id;
	}

	public Integer getFrom_chat_id() {
		return from_chat_id;
	}

	public void setFrom_chat_id(Integer from_chat_id) {
		this.from_chat_id = from_chat_id;
	}

	public Boolean getDisable_notification() {
		return disable_notification;
	}

	public void setDisable_notification(Boolean disable_notification) {
		this.disable_notification = disable_notification;
	}

	public Integer getMessage_id() {
		return message_id;
	}

	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}

}
