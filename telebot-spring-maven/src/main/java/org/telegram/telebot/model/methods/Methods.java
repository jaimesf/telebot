package org.telegram.telebot.model.methods;

public enum Methods {

	GET_UPDATES("getUpdates"), SET_WEBHOOK("setWebhook"), 
	SEND_MESSAGE("sendMessage"), FORWARD_MESSAGE("forwardMessage"),	HTML("HTML"), GET_ME("getMe"), 
	SEND_PHOTO("sendPhoto"), SEND_AUDIO("sendAudio"), SEND_DOCUMENT("sendDocument"), 
	SEND_STICKER("sendSticker"), SEND_VIDEO("sendVideo"), SEND_VOICE("sendVoice"), 
	SEND_LOCATION("sendVoice"), SEND_VENUE("sendVenue"), SEND_CONTACT("sendContact"), 
	SEND_CHAT_ACTION("sendChatAction"), SEND_GAME("sendGame"), SET_GAME_SCORE("setGameScore"),
	GET_GAME_HIGH_SCORES("getGameHighScores"), GET_USER_PROFILE_PHOTOS("getUserProfilePhotos"), 
	GET_FILE("getFile"), KICK_CHAT_MEMBER("kickChatMember"), UNBAN_CHAT_MEMBER("unbanChatMember"), 
	ANSWER_CALLBACK_QUERY("answerCallbackQuery"), EDIT_MESSAGE_TEXT("editMessageText"), 
	EDIT_MESSAGE_CAPTION("editMessageCaption"), EDIT_MESSAGE_REPLY_MARKUP("editMessageReplyMarkup"), 
	ANSWER_INLINE_QUERY("answerInlineQuery");

	private String methodName;

	Methods(String methodName) {
		this.methodName = methodName;
	}

	public String getMethodName() {
		return this.methodName;
	}

}
