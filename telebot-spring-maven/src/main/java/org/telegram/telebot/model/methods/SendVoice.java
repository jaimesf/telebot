package org.telegram.telebot.model.methods;

import java.io.Serializable;

import org.telegram.telebot.model.InputFile;
import org.telegram.telebot.model.ReplyKeyboardMarkup;

public class SendVoice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	// TODO: See how to do with String and Integer
	private Integer chat_id;
	// TODO: See how to do with InputFile and Integer
	private InputFile voice;
	private Integer duration;
	private Boolean disable_notification = false;
	private Integer reply_to_message_id;
	private ReplyKeyboardMarkup reply_markup;

	public Integer getChat_id() {
		return chat_id;
	}

	public void setChat_id(Integer chat_id) {
		this.chat_id = chat_id;
	}

	public InputFile getVoice() {
		return voice;
	}

	public void setVoice(InputFile voice) {
		this.voice = voice;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
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