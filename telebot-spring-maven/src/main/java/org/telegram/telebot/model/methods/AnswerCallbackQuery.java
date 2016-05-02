package org.telegram.telebot.model.methods;

import java.io.Serializable;

public class AnswerCallbackQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	private String callback_query_id;
	private String text;
	private Boolean show_alert;

	public String getCallback_query_id() {
		return callback_query_id;
	}

	public void setCallback_query_id(String callback_query_id) {
		this.callback_query_id = callback_query_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getShow_alert() {
		return show_alert;
	}

	public void setShow_alert(Boolean show_alert) {
		this.show_alert = show_alert;
	}

}
