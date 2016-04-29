package org.telegram.telebot.model;

import java.io.Serializable;

public class MessageEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2260741504485245210L;

	private String type;
	private Integer offset;
	private Integer length;
	private String url;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
