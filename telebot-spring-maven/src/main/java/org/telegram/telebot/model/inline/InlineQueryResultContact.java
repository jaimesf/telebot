package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultContact extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7835249701512575910L;
	private String phone_number;
	private String first_name;
	private String last_name;
	private String thumb_url;
	private Integer thumb_width;
	private Integer thumb_height;

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
