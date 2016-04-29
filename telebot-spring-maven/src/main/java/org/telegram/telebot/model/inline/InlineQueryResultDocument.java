package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultDocument extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7835249701512575910L;
	private String title;
	private String caption;
	private String document_url;
	private String mime_type;
	private String description;
	private String thumb_url;
	private Integer thumb_width;
	private Integer thumb_height;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getDocument_url() {
		return document_url;
	}

	public void setDocument_url(String document_url) {
		this.document_url = document_url;
	}

	public String getMime_type() {
		return mime_type;
	}

	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getThumb_url() {
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}

	public Integer getThumb_width() {
		return thumb_width;
	}

	public void setThumb_width(Integer thumb_width) {
		this.thumb_width = thumb_width;
	}

	public Integer getThumb_height() {
		return thumb_height;
	}

	public void setThumb_height(Integer thumb_height) {
		this.thumb_height = thumb_height;
	}

}
