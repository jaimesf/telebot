package org.telegram.telebot.model.methods;

import java.io.Serializable;

public class GetUpdates implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	private Integer offset;
	private Integer limit;
	private Integer timeout;

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public Integer getLimit() {
		return limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
	}

	public Integer getTimeout() {
		return timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

}