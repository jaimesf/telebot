package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultCachedPhoto extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2549311864181293867L;
	private String photo_file_id;
	private String title;
	private String description;
	private String caption;

	public String getPhoto_file_id() {
		return photo_file_id;
	}

	public void setPhoto_file_id(String photo_file_id) {
		this.photo_file_id = photo_file_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
