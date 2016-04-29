package org.telegram.telebot.model.methods.results;

import java.io.Serializable;

public abstract class MethodResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6760339269695549159L;
	
	private Boolean ok;

	public Boolean getOk() {
		return ok;
	}

	public void setOk(Boolean ok) {
		this.ok = ok;
	}

}
