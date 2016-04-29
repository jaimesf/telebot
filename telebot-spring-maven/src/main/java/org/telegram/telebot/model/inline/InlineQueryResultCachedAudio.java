package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultCachedAudio extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8018274643752340244L;
	private String audio_file_id;

	public String getAudio_file_id() {
		return audio_file_id;
	}

	public void setAudio_file_id(String audio_file_id) {
		this.audio_file_id = audio_file_id;
	}

}
