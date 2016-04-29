package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultCachedSticker extends InlineQueryResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8018274643752340244L;
	private String sticker_file_id;

	public String getSticker_file_id() {
		return sticker_file_id;
	}

	public void setSticker_file_id(String sticker_file_id) {
		this.sticker_file_id = sticker_file_id;
	}

}
