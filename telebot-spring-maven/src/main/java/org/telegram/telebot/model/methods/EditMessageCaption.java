package org.telegram.telebot.model.methods;

import java.io.Serializable;

import org.telegram.telebot.model.ReplyKeyboardMarkup;

public class EditMessageCaption implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	// TODO: See how to do with String and Integer
	private Integer chat_id;
	private Integer message_id;
	private String inline_message_id;
	private String caption;
	private ReplyKeyboardMarkup reply_markup;

	public Integer getChat_id() {
		return chat_id;
	}

	public void setChat_id(Integer chat_id) {
		this.chat_id = chat_id;
	}

	public Integer getMessage_id() {
		return message_id;
	}

	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}

	public String getInline_message_id() {
		return inline_message_id;
	}

	public void setInline_message_id(String inline_message_id) {
		this.inline_message_id = inline_message_id;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public ReplyKeyboardMarkup getReply_markup() {
		return reply_markup;
	}

	public void setReply_markup(ReplyKeyboardMarkup reply_markup) {
		this.reply_markup = reply_markup;
	}

}
