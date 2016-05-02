package org.telegram.telebot.model.methods.results;

import java.io.Serializable;

public abstract class MethodResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6760339269695549159L;
	
	private Boolean ok;
	
	//Propiedades de error
	private String error_code;
	private String description;
	
	
	public Boolean getOk() {
		return ok;
	}

	public void setOk(Boolean ok) {
		this.ok = ok;
	}

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
