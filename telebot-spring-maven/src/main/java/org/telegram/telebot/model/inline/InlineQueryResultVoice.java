package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultVoice extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7835249701512575910L;
	private String voice_url;
	private String title;
	private Integer voice_duration;

	public String getVoice_url() {
		return voice_url;
	}

	public void setVoice_url(String voice_url) {
		this.voice_url = voice_url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getVoice_duration() {
		return voice_duration;
	}

	public void setVoice_duration(Integer voice_duration) {
		this.voice_duration = voice_duration;
	}

}
