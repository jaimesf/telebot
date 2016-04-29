package org.telegram.telebot.model.methods.results;

import java.io.Serializable;

public class BooleanResult extends MethodResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5008224483329476384L;

	private Boolean result;
	private String description;

	public Boolean getResult() {
		return result;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
