package org.telegram.telebot.model.methods;

import java.io.Serializable;

import org.telegram.telebot.model.ReplyKeyboardMarkup;

public class SendMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1895526091436126522L;

	private Integer chat_id;
	private String text;
	private String parse_mode;
	private Boolean disable_web_page_preview = false;
	private Boolean disable_notification = false;
	private Integer reply_to_message_id;
	private ReplyKeyboardMarkup reply_markup;

	public Integer getChat_id() {
		return chat_id;
	}

	public void setChat_id(Integer chat_id) {
		this.chat_id = chat_id;
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

	public Boolean getDisable_notification() {
		return disable_notification;
	}

	public void setDisable_notification(Boolean disable_notification) {
		this.disable_notification = disable_notification;
	}

	public Integer getReply_to_message_id() {
		return reply_to_message_id;
	}

	public void setReply_to_message_id(Integer reply_to_message_id) {
		this.reply_to_message_id = reply_to_message_id;
	}

	public ReplyKeyboardMarkup getReply_markup() {
		return reply_markup;
	}

	public void setReply_markup(ReplyKeyboardMarkup reply_markup) {
		this.reply_markup = reply_markup;
	}

}
