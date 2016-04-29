package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultLocation extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7835249701512575910L;
	private Double latitude;
	private Double longitude;
	private String title;
	private String thumb_url;
	private Integer thumb_width;
	private Integer thumb_height;

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
