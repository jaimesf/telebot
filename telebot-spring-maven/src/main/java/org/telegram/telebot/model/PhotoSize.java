package org.telegram.telebot.model;

import java.io.Serializable;

public class PhotoSize implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5954745935770394430L;

	private String file_id;
	private Integer width;
	private Integer height;
	private Integer file_size;

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getFile_size() {
		return file_size;
	}

	public void setFile_size(Integer file_size) {
		this.file_size = file_size;
	}

}
