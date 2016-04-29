package org.telegram.telebot.model;

import java.io.Serializable;

public class Voice implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1010462225912392965L;

	private String file_id;
	private Integer duration;
	private String mime_type;
	private Integer file_size;

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public String getMime_type() {
		return mime_type;
	}

	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	public Integer getFile_size() {
		return file_size;
	}

	public void setFile_size(Integer file_size) {
		this.file_size = file_size;
	}

}
