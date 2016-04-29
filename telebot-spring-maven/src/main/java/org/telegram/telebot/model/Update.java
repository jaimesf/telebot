package org.telegram.telebot.model;

import java.io.Serializable;

import org.telegram.telebot.model.inline.ChosenInlineResult;
import org.telegram.telebot.model.inline.InlineQuery;

public class Update implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2847654470225645677L;

	private Integer update_id;
	private Message message;
	private InlineQuery inline_query;
	private ChosenInlineResult chosen_inline_result;
	private CallbackQuery callback_query;

	public Integer getUpdate_id() {
		return update_id;
	}

	public void setUpdate_id(Integer update_id) {
		this.update_id = update_id;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public InlineQuery getInline_query() {
		return inline_query;
	}

	public void setInline_query(InlineQuery inline_query) {
		this.inline_query = inline_query;
	}

	public ChosenInlineResult getChosen_inline_result() {
		return chosen_inline_result;
	}

	public void setChosen_inline_result(ChosenInlineResult chosen_inline_result) {
		this.chosen_inline_result = chosen_inline_result;
	}

	public CallbackQuery getCallback_query() {
		return callback_query;
	}

	public void setCallback_query(CallbackQuery callback_query) {
		this.callback_query = callback_query;
	}

	public Boolean isLocationUpdate() {
		return message.isLocationMessage();
	}

	public Boolean isStartUpdate() {
		return message.isStartMessage();
	}

}
