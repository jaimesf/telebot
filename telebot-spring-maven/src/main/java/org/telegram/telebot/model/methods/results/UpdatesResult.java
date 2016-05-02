package org.telegram.telebot.model.methods.results;

import java.io.Serializable;
import java.util.List;

import org.telegram.telebot.model.Update;

public class UpdatesResult extends MethodResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -632910807442518378L;

	private List<Update> result;

	public List<Update> getResult() {
		return result;
	}

	public void setResult(List<Update> result) {
		this.result = result;
	}

}
