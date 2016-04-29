package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultVideo extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2794312224804541372L;

	private String video_url;
	private String mime_type;
	private String thumb_url;
	private String title;
	private String caption;
	private Integer video_width;
	private Integer video_height;
	private Integer video_duration;
	private String description;

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String video_url) {
		this.video_url = video_url;
	}

	public String getMime_type() {
		return mime_type;
	}

	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	public String getThumb_url() {
		return thumb_url;
	}

	public void setThumb_url(String thumb_url) {
		this.thumb_url = thumb_url;
	}

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

	public Integer getVideo_width() {
		return video_width;
	}

	public void setVideo_width(Integer video_width) {
		this.video_width = video_width;
	}

	public Integer getVideo_height() {
		return video_height;
	}

	public void setVideo_height(Integer video_height) {
		this.video_height = video_height;
	}

	public Integer getVideo_duration() {
		return video_duration;
	}

	public void setVideo_duration(Integer video_duration) {
		this.video_duration = video_duration;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
