package org.telegram.telebot.model;

import java.io.Serializable;

public class File implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 544325136121658789L;

	private String file_id;
	private Integer file_size;
	private String file_path;

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public Integer getFile_size() {
		return file_size;
	}

	public void setFile_size(Integer file_size) {
		this.file_size = file_size;
	}

	public String getFile_path() {
		return file_path;
	}

	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}

}
