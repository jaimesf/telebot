package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultPhoto extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2549311864181293867L;
	private String photo_url;
	private String thumb_url;
	private Integer photo_width;
	private Integer photo_height;
	private String title;
	private String description;
	private String caption;

	public String getPhoto_url() {
		return photo_url;
	}

	public void setPhoto_url(String photo_url) {
		this.photo_url = photo_url;
	}

	public String getThumb_url() {
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}

	public Integer getPhoto_width() {
		return photo_width;
	}

	public void setPhoto_width(Integer photo_width) {
		this.photo_width = photo_width;
	}

	public Integer getPhoto_height() {
		return photo_height;
	}

	public void setPhoto_height(Integer photo_height) {
		this.photo_height = photo_height;
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
