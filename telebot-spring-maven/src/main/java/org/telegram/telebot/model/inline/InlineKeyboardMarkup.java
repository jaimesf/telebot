package org.telegram.telebot.model.inline;

import java.io.Serializable;
import java.util.List;

public class InlineKeyboardMarkup implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 882106426195883995L;

	private List<List<InlineKeyboardButton>> inline_keyboard;

	public List<List<InlineKeyboardButton>> getInline_keyboard() {
		return inline_keyboard;
	}

	public void setInline_keyboard(List<List<InlineKeyboardButton>> inline_keyboard) {
		this.inline_keyboard = inline_keyboard;
	}
}
