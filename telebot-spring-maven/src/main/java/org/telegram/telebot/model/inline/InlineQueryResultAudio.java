package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultAudio extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8665815278778425001L;
	private String audio_url;
	private String title;
	private String performer;
	private Integer audio_duration;

	public String getAudio_url() {
		return audio_url;
	}

	public void setAudio_url(String audio_url) {
		this.audio_url = audio_url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPerformer() {
		return performer;
	}

	public void setPerformer(String performer) {
		this.performer = performer;
	}

	public Integer getAudio_duration() {
		return audio_duration;
	}

	public void setAudio_duration(Integer audio_duration) {
		this.audio_duration = audio_duration;
	}

}
