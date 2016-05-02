package org.telegram.telebot.model.methods;

public enum ParseMode {

	NONE(null), MARKDOWN("Markdown"), HTML("HTML");

	private String parseMode;

	ParseMode(String parseMode) {
		this.parseMode = parseMode;
	}

	public String getParseMode() {
		return this.parseMode;
	}
}
