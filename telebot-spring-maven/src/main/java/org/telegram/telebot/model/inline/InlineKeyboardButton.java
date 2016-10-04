package org.telegram.telebot.model.inline;

import java.io.Serializable;

import org.telegram.telebot.model.CallbackGame;

public class InlineKeyboardButton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8294811855959203357L;
	
	private String text;
	private String url;
	private String callback_data;
	private String switch_inline_query;
	private String switch_inline_query_current_chat;
	private CallbackGame callback_game;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getCallback_data() {
		return callback_data;
	}
	public void setCallback_data(String callback_data) {
		this.callback_data = callback_data;
	}
	public String getSwitch_inline_query() {
		return switch_inline_query;
	}
	public void setSwitch_inline_query(String switch_inline_query) {
		this.switch_inline_query = switch_inline_query;
	}
	public String getSwitch_inline_query_current_chat() {
		return switch_inline_query_current_chat;
	}
	public void setSwitch_inline_query_current_chat(String switch_inline_query_current_chat) {
		this.switch_inline_query_current_chat = switch_inline_query_current_chat;
	}
	public CallbackGame getCallback_game() {
		return callback_game;
	}
	public void setCallback_game(CallbackGame callback_game) {
		this.callback_game = callback_game;
	}

}
