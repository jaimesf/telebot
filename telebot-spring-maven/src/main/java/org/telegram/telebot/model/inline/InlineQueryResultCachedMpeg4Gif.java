package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultCachedMpeg4Gif extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2549311864181293867L;
	private String mpeg4_file_id;
	private String title;
	private String caption;

	public String getMpeg4_file_id() {
		return mpeg4_file_id;
	}

	public void setMpeg4_file_id(String mpeg4_file_id) {
		this.mpeg4_file_id = mpeg4_file_id;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
