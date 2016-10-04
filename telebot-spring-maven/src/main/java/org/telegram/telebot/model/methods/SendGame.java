package org.telegram.telebot.model.methods;

import java.io.Serializable;

import org.telegram.telebot.model.ReplyKeyboardMarkup;

public class SendGame implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4566762745628131151L;
	
	// TODO: See how to do with String and Integer
	/**
	 * Unique identifier for the target chat or username of the target channel (in the format @channelusername)
	 * (Required)
	 */
	private Integer chat_id;
	
	/**
	 * Short name of the game, serves as the unique identifier for the game. Set up your games via Botfather.
	 * (Required)
	 */
	private String game_short_name;
	
	/**
	 * Sends the message silently. iOS users will not receive a notification, Android users will receive a notification with no sound
	 */
	private Boolean disable_notification = false;
	
	/**
	 * If the message is a reply, ID of the original message
	 */
	private Integer reply_to_message_id;
	
	/**
	 * Additional interface options. 
	 * A JSON-serialized object for an inline keyboard, custom reply keyboard, instructions to hide reply keyboard or to force a reply from the user.
	 */
	private ReplyKeyboardMarkup reply_markup;
	
	public Integer getChat_id() {
		return chat_id;
	}
	public void setChat_id(Integer chat_id) {
		this.chat_id = chat_id;
	}
	public String getGame_short_name() {
		return game_short_name;
	}
	public void setGame_short_name(String game_short_name) {
		this.game_short_name = game_short_name;
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
