package org.telegram.telebot.model.methods.results;

import java.io.Serializable;

import org.telegram.telebot.model.File;

public class FileResult extends MethodResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4742566028620717334L;

	private File result;

	public File getResult() {
		return result;
	}

	public void setResult(File result) {
		this.result = result;
	}

}
