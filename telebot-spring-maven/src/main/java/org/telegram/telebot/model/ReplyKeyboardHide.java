package org.telegram.telebot.model;

import java.io.Serializable;

public class ReplyKeyboardHide implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4547782533083237513L;

	private Boolean hide_keyboard;
	private Boolean selective;

	public Boolean getHide_keyboard() {
		return hide_keyboard;
	}

	public void setHide_keyboard(Boolean hide_keyboard) {
		this.hide_keyboard = hide_keyboard;
	}

	public Boolean getSelective() {
		return selective;
	}

	public void setSelective(Boolean selective) {
		this.selective = selective;
	}

}
