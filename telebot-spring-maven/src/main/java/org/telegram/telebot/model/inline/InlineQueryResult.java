package org.telegram.telebot.model.inline;

import java.io.Serializable;

public abstract class InlineQueryResult implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -294514881646246739L;

	protected String type;
	protected String id;
	protected InputMessageContent input_message_content;
	protected InlineKeyboardMarkup reply_markup;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public InputMessageContent getInput_message_content() {
		return input_message_content;
	}

	public void setInput_message_content(InputMessageContent input_message_content) {
		this.input_message_content = input_message_content;
	}

	public InlineKeyboardMarkup getReply_markup() {
		return reply_markup;
	}

	public void setReply_markup(InlineKeyboardMarkup reply_markup) {
		this.reply_markup = reply_markup;
	}

}
