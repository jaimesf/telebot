package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultCachedDocument extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8018274643752340244L;
	private String title;
	private String document_file_id;
	private String description;
	private String caption;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDocument_file_id() {
		return document_file_id;
	}

	public void setDocument_file_id(String document_file_id) {
		this.document_file_id = document_file_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

}
