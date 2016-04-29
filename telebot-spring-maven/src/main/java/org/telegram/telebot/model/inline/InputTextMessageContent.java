package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InputTextMessageContent implements InputMessageContent, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1837512089026415985L;

	private String message_text;
	private String parse_mode;
	private Boolean disable_web_page_preview;

	public String getMessage_text() {
		return message_text;
	}

	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}

	public String getParse_mode() {
		return parse_mode;
	}

	public void setParse_mode(String parse_mode) {
		this.parse_mode = parse_mode;
	}

	public Boolean getDisable_web_page_preview() {
		return disable_web_page_preview;
	}

	public void setDisable_web_page_preview(Boolean disable_web_page_preview) {
		this.disable_web_page_preview = disable_web_page_preview;
	}

}
