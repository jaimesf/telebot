package org.telegram.telebot.model.methods.results;

import java.io.Serializable;

import org.telegram.telebot.model.UserProfilePhotos;

public class UserProfilePhotosResult extends MethodResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4742566028620717334L;

	private UserProfilePhotos result;

	public UserProfilePhotos getResult() {
		return result;
	}

	public void setResult(UserProfilePhotos result) {
		this.result = result;
	}

}
