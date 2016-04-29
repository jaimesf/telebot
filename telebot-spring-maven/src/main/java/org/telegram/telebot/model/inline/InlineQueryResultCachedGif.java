package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultCachedGif extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2549311864181293867L;
	private String gif_file_id;
	private String title;
	private String caption;

	public String getGif_file_id() {
		return gif_file_id;
	}

	public void setGif_file_id(String gif_file_id) {
		this.gif_file_id = gif_file_id;
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

}
