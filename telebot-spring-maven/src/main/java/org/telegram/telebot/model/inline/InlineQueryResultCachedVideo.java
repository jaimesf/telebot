package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultCachedVideo extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8018274643752340244L;
	private String video_file_id;
	private String title;
	private String description;
	private String caption;

	public String getVideo_file_id() {
		return video_file_id;
	}

	public void setVideo_file_id(String video_file_id) {
		this.video_file_id = video_file_id;
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
