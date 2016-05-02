package org.telegram.telebot.model.methods;

import java.io.Serializable;

import org.telegram.telebot.model.ReplyKeyboardMarkup;

public class EditMessageText implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	// TODO: See how to do with String and Integer
	private Integer chat_id;
	private Integer message_id;
	private String inline_message_id;
	private String text;
	private String parse_mode;
	private Boolean disable_web_page_preview = false;
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

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getParse_mode() {
		return parse_mode;
	}

	public void setParse_mode(String parse_mode) {
		this.parse_mode = parse_mode;
	}

	public void setParse_mode(ParseMode parse_mode) {
		this.parse_mode = parse_mode.getParseMode();
	}

	public Boolean getDisable_web_page_preview() {
		return disable_web_page_preview;
	}

	public void setDisable_web_page_preview(Boolean disable_web_page_preview) {
		this.disable_web_page_preview = disable_web_page_preview;
	}

	public ReplyKeyboardMarkup getReply_markup() {
		return reply_markup;
	}

	public void setReply_markup(ReplyKeyboardMarkup reply_markup) {
		this.reply_markup = reply_markup;
	}

}
