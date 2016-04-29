package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultCachedVoice extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8018274643752340244L;
	private String voice_file_id;
	private String title;

	public String getVoice_file_id() {
		return voice_file_id;
	}

	public void setVoice_file_id(String voice_file_id) {
		this.voice_file_id = voice_file_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
