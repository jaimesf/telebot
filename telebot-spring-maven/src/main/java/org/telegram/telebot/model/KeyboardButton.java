package org.telegram.telebot.model;

import java.io.Serializable;

public class KeyboardButton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 894127195689001398L;

	private String text;
	private Boolean request_contact;
	private Boolean request_location;

	public KeyboardButton(String text, Boolean request_contact, Boolean request_location) {
		this.text = text;
		this.request_contact = request_contact;
		this.request_location = request_location;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Boolean getRequest_contact() {
		return request_contact;
	}

	public void setRequest_contact(Boolean request_contact) {
		this.request_contact = request_contact;
	}

	public Boolean getRequest_location() {
		return request_location;
	}

	public void setRequest_location(Boolean request_location) {
		this.request_location = request_location;
	}

}
