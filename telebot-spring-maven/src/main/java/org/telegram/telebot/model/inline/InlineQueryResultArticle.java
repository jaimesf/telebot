package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultArticle extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7676425402727799839L;

	private String title;
	private String url;
	private Boolean hide_url;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Boolean getHide_url() {
		return hide_url;
	}

	public void setHide_url(Boolean hide_url) {
		this.hide_url = hide_url;
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
