package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultMpeg4Gif extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7179799449095091834L;
	private String mpeg4_url;
	private Integer mpeg4_width;
	private Integer mpeg4_height;
	private String thumb_url;
	private String title;
	private String caption;

	public String getMpeg4_url() {
		return mpeg4_url;
	}

	public void setMpeg4_url(String mpeg4_url) {
		this.mpeg4_url = mpeg4_url;
	}

	public Integer getMpeg4_width() {
		return mpeg4_width;
	}

	public void setMpeg4_width(Integer mpeg4_width) {
		this.mpeg4_width = mpeg4_width;
	}

	public Integer getMpeg4_height() {
		return mpeg4_height;
	}

	public void setMpeg4_height(Integer mpeg4_height) {
		this.mpeg4_height = mpeg4_height;
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

}
