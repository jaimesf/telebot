package org.telegram.telebot.model.methods;

import java.io.Serializable;

public class GetGameHighScores implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4386232235364285927L;

	/**
	 * User identifier 
	 * (Required)
	 */
	private Integer user_id;
	
	// TODO: See how to do with String and Integer
	/**
	 * Required if inline_message_id is not specified. 
	 * Unique identifier for the target chat (or username of the target channel in the format @channelusername)
	 */
	private Integer chat_id;
	
	/**
	 * 	Required if inline_message_id is not specified. Unique identifier of the sent message
	 */
	private Integer message_id;
	
	/**
	 * Required if chat_id and message_id are not specified. Identifier of the inline message
	 */
	private String inline_message_id;

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

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
}
