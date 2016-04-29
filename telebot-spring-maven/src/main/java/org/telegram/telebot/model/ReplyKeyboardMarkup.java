package org.telegram.telebot.model;

import java.io.Serializable;
import java.util.List;

public class ReplyKeyboardMarkup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2854629351177743590L;

	List<List<KeyboardButton>> keyboard;
	Boolean resize_keyboard;
	Boolean one_time_keyboard;
	Boolean selective;

	public List<List<KeyboardButton>> getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(List<List<KeyboardButton>> keyboard) {
		this.keyboard = keyboard;
	}

	public Boolean getResize_keyboard() {
		return resize_keyboard;
	}

	public void setResize_keyboard(Boolean resize_keyboard) {
		this.resize_keyboard = resize_keyboard;
	}

	public Boolean getOne_time_keyboard() {
		return one_time_keyboard;
	}

	public void setOne_time_keyboard(Boolean one_time_keyboard) {
		this.one_time_keyboard = one_time_keyboard;
	}

	public Boolean getSelective() {
		return selective;
	}

	public void setSelective(Boolean selective) {
		this.selective = selective;
	}

}
