package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultGif extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 588603218962422204L;
	private String gif_url;
	private Integer gif_width;
	private Integer gif_height;
	private String thumb_url;
	private String title;
	private String caption;

	public String getGif_url() {
		return gif_url;
	}

	public void setGif_url(String gif_url) {
		this.gif_url = gif_url;
	}

	public Integer getGif_width() {
		return gif_width;
	}

	public void setGif_width(Integer gif_width) {
		this.gif_width = gif_width;
	}

	public Integer getGif_height() {
		return gif_height;
	}

	public void setGif_height(Integer gif_height) {
		this.gif_height = gif_height;
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
