package org.telegram.telebot.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.telegram.telebot.model.File;
import org.telegram.telebot.model.GameHighScore;
import org.telegram.telebot.model.Message;
import org.telegram.telebot.model.Update;
import org.telegram.telebot.model.User;
import org.telegram.telebot.model.UserProfilePhotos;
import org.telegram.telebot.model.methods.AnswerCallbackQuery;
import org.telegram.telebot.model.methods.AnswerInlineQuery;
import org.telegram.telebot.model.methods.ChatMember;
import org.telegram.telebot.model.methods.EditMessageCaption;
import org.telegram.telebot.model.methods.EditMessageReplyMarkup;
import org.telegram.telebot.model.methods.EditMessageText;
import org.telegram.telebot.model.methods.ForwardMessage;
import org.telegram.telebot.model.methods.GetFile;
import org.telegram.telebot.model.methods.GetGameHighScores;
import org.telegram.telebot.model.methods.GetUpdates;
import org.telegram.telebot.model.methods.GetUserProfilePhotos;
import org.telegram.telebot.model.methods.Methods;
import org.telegram.telebot.model.methods.SendAudio;
import org.telegram.telebot.model.methods.SendChatAction;
import org.telegram.telebot.model.methods.SendContact;
import org.telegram.telebot.model.methods.SendDocument;
import org.telegram.telebot.model.methods.SendGame;
import org.telegram.telebot.model.methods.SendLocation;
import org.telegram.telebot.model.methods.SendMessage;
import org.telegram.telebot.model.methods.SendPhoto;
import org.telegram.telebot.model.methods.SendSticker;
import org.telegram.telebot.model.methods.SendVenue;
import org.telegram.telebot.model.methods.SendVideo;
import org.telegram.telebot.model.methods.SendVoice;
import org.telegram.telebot.model.methods.SetGameScore;
import org.telegram.telebot.model.methods.SetWebhook;
import org.telegram.telebot.model.methods.results.BooleanResult;
import org.telegram.telebot.model.methods.results.FileResult;
import org.telegram.telebot.model.methods.results.GameHighScoreResult;
import org.telegram.telebot.model.methods.results.MessageResult;
import org.telegram.telebot.model.methods.results.MethodResult;
import org.telegram.telebot.model.methods.results.UpdatesResult;
import org.telegram.telebot.model.methods.results.UserProfilePhotosResult;
import org.telegram.telebot.model.methods.results.UserResult;
import org.telegram.telebot.service.exceptions.FailConvertJsonException;
import org.telegram.telebot.service.exceptions.FailResponseMethodException;
import org.telegram.telebot.utils.UtilsJson;



public abstract class TelegramBotService {

	private String BOT_TOKEN = getTokenBot();
	private final String BASE_URL_API_TELEGRAM = "https://api.telegram.org/bot";
	private final String BASE_URL_API_TELEGRAM_BOT = BASE_URL_API_TELEGRAM + BOT_TOKEN + "/";

	public abstract String getTokenBot();

	public User getMe() throws FailResponseMethodException {

		UserResult user = this.executeMethod(Methods.GET_ME, UserResult.class);
		return user.getResult();

	}
	
	public List<Update> getUpdates(GetUpdates updates) throws FailResponseMethodException {

		UpdatesResult result = this.executeMethod(Methods.GET_UPDATES, UpdatesResult.class);
		return result.getResult();

	}
	public Boolean setWebhook(SetWebhook webhook) throws FailResponseMethodException {

		Boolean result = null;
		if(webhook.getCertificate()!=null){
			Map<String, Object> mapParameters = UtilsJson.getKeyValuePropertiesFromObject(webhook);
			mapParameters.put("certificate", webhook.getCertificate());
			result = this.executeMethodMultipart(Methods.SET_WEBHOOK, BooleanResult.class, mapParameters).getResult();
		}else{
			result = this.executeMethod(Methods.SET_WEBHOOK, BooleanResult.class, webhook).getResult();
		}
		return result;

	}

	public Message sendMessage(SendMessage message) throws FailResponseMethodException {

		MessageResult result = this.executeMethod(Methods.SEND_MESSAGE, MessageResult.class, message);
		return result.getResult();

	}

	public Message forwardMessage(ForwardMessage message) throws FailResponseMethodException {

		MessageResult result = this.executeMethod(Methods.FORWARD_MESSAGE, MessageResult.class, message);
		return result.getResult();

	}

	public Message sendPhoto(SendPhoto photo) throws FailResponseMethodException {
		Message result = null;
		if(photo.getFileToSend()!=null){
			Map<String, Object> mapParameters = UtilsJson.getKeyValuePropertiesFromObject(photo);
			mapParameters.put("photo", photo.getFileToSend());
			result = this.executeMethodMultipart(Methods.SEND_PHOTO, MessageResult.class, mapParameters).getResult();
		}else{
			result = this.executeMethod(Methods.SEND_PHOTO, MessageResult.class, photo).getResult();
		}
		
		return result;

	}

	public Message sendAudio(SendAudio audio) throws FailResponseMethodException {
		Message result = null;
		if(audio.getFileToSend()!=null){
			Map<String, Object> mapParameters = UtilsJson.getKeyValuePropertiesFromObject(audio);
			mapParameters.put("audio", audio.getFileToSend());
			result = this.executeMethodMultipart(Methods.SEND_AUDIO, MessageResult.class, mapParameters).getResult();
		}else{
			result = this.executeMethod(Methods.SEND_AUDIO, MessageResult.class, audio).getResult();
		}
		return result;

	}

	public Message sendDocument(SendDocument document) throws FailResponseMethodException {

		Message result = null;
		if(document.getFileToSend()!=null){
			Map<String, Object> mapParameters = UtilsJson.getKeyValuePropertiesFromObject(document);
			mapParameters.put("document", document.getFileToSend());
			result = this.executeMethodMultipart(Methods.SEND_DOCUMENT, MessageResult.class, mapParameters).getResult();
		}else{
			result = this.executeMethod(Methods.SEND_DOCUMENT, MessageResult.class, document).getResult();
		}
		return result;

	}

	public Message sendSticker(SendSticker sticker) throws FailResponseMethodException {

		Message result = null;
		if(sticker.getFileToSend()!=null){
			Map<String, Object> mapParameters = UtilsJson.getKeyValuePropertiesFromObject(sticker);
			mapParameters.put("sticker", sticker.getFileToSend());
			result = this.executeMethodMultipart(Methods.SEND_STICKER, MessageResult.class, mapParameters).getResult();
		}else{
			result = this.executeMethod(Methods.SEND_STICKER, MessageResult.class, sticker).getResult();
		}
		return result;

	}

	public Message sendVideo(SendVideo video) throws FailResponseMethodException {

		Message result = null;
		if(video.getFileToSend()!=null){
			Map<String, Object> mapParameters = UtilsJson.getKeyValuePropertiesFromObject(video);
			mapParameters.put("video", video.getFileToSend());
			result = this.executeMethodMultipart(Methods.SEND_VIDEO, MessageResult.class, mapParameters).getResult();
		}else{
			result = this.executeMethod(Methods.SEND_VIDEO, MessageResult.class, video).getResult();
		}
		return result;

	}

	public Message sendVoice(SendVoice voice) throws FailResponseMethodException {

		Message result = null;
		if(voice.getFileToSend()!=null){
			Map<String, Object> mapParameters = UtilsJson.getKeyValuePropertiesFromObject(voice);
			mapParameters.put("voice", voice.getFileToSend());
			result = this.executeMethodMultipart(Methods.SEND_VOICE, MessageResult.class, mapParameters).getResult();
		}else{
			result = this.executeMethod(Methods.SEND_VOICE, MessageResult.class, voice).getResult();
		}
		return result;

	}

	public Message sendLocation(SendLocation location) throws FailResponseMethodException {

		MessageResult result = this.executeMethod(Methods.SEND_LOCATION, MessageResult.class, location);
		return result.getResult();

	}

	public Message sendVenue(SendVenue venue) throws FailResponseMethodException {

		MessageResult result = this.executeMethod(Methods.SEND_VENUE, MessageResult.class, venue);
		return result.getResult();

	}

	public Message sendContact(SendContact contact) throws FailResponseMethodException {

		MessageResult result = this.executeMethod(Methods.SEND_CONTACT, MessageResult.class, contact);
		return result.getResult();

	}

	public Boolean sendChatAction(SendChatAction chatAction) throws FailResponseMethodException {

		BooleanResult result = this.executeMethod(Methods.SEND_CHAT_ACTION, BooleanResult.class, chatAction);
		return result.getResult();

	}

	public UserProfilePhotos getUserProfilePhotos(GetUserProfilePhotos userProfilePhotos)
			throws FailResponseMethodException {

		UserProfilePhotosResult result = this.executeMethod(Methods.GET_USER_PROFILE_PHOTOS,
				UserProfilePhotosResult.class, userProfilePhotos);
		return result.getResult();

	}

	public File getFile(GetFile file) throws FailResponseMethodException {

		FileResult result = this.executeMethod(Methods.GET_FILE, FileResult.class, file);
		return result.getResult();

	}
	
	public Message sendGame(SendGame game) throws FailResponseMethodException{
		MessageResult result = this.executeMethod(Methods.SEND_GAME, MessageResult.class, game);
		return result.getResult();
	}
	
	public Message setGameScore(SetGameScore gameScore) throws FailResponseMethodException{
		MessageResult result = this.executeMethod(Methods.SET_GAME_SCORE, MessageResult.class, gameScore);
		return result.getResult();
	}
	
	public List<GameHighScore> getGameHighScores(GetGameHighScores setGameHighScore) throws FailResponseMethodException{
		GameHighScoreResult result = this.executeMethod(Methods.GET_GAME_HIGH_SCORES, GameHighScoreResult.class, setGameHighScore);
		return result.getResult();
	}

	public Boolean kickChatMember(ChatMember chatMember) throws FailResponseMethodException {

		BooleanResult result = this.executeMethod(Methods.KICK_CHAT_MEMBER, BooleanResult.class, chatMember);
		return result.getResult();

	}

	public Boolean unbanChatMember(ChatMember chatMember) throws FailResponseMethodException {

		BooleanResult result = this.executeMethod(Methods.UNBAN_CHAT_MEMBER, BooleanResult.class, chatMember);
		return result.getResult();

	}

	public Boolean answerCallbackQuery(AnswerCallbackQuery answerCallbackQuery) throws FailResponseMethodException {

		BooleanResult result = this.executeMethod(Methods.ANSWER_CALLBACK_QUERY, BooleanResult.class,
				answerCallbackQuery);
		return result.getResult();

	}

	public Message editMessageText(EditMessageText messageText) throws FailResponseMethodException {

		MessageResult result = this.executeMethod(Methods.EDIT_MESSAGE_TEXT, MessageResult.class, messageText);
		return result.getResult();

	}

	public Message editMessageCaption(EditMessageCaption messageCaption) throws FailResponseMethodException {

		MessageResult result = this.executeMethod(Methods.EDIT_MESSAGE_CAPTION, MessageResult.class, messageCaption);
		return result.getResult();

	}

	public Message editMessageReplyMarkup(EditMessageReplyMarkup messageReplyMarkup)
			throws FailResponseMethodException {

		MessageResult result = this.executeMethod(Methods.EDIT_MESSAGE_REPLY_MARKUP, MessageResult.class,
				messageReplyMarkup);
		return result.getResult();

	}

	public Boolean answerInlineQuery(AnswerInlineQuery answerInlineQuery) throws FailResponseMethodException {

		BooleanResult result = this.executeMethod(Methods.ANSWER_INLINE_QUERY, BooleanResult.class, answerInlineQuery);
		return result.getResult();

	}

	private <T> T executeMethod(Methods method, Class<T> classType) throws FailResponseMethodException {
		String response;
		try {
			response = Requests.requestGet(BASE_URL_API_TELEGRAM_BOT + method.getMethodName());
			T result = UtilsJson.convertJsonToObject(response, classType);
			checkOkResponseRaiseException((MethodResult) result, method.getMethodName());
			return result;
		} catch (IOException | FailConvertJsonException e) {
			throw new FailResponseMethodException(method.getMethodName(), e.getCause());
		}
	}

	private <T> T executeMethod(Methods method, Class<T> classType, Object params) throws FailResponseMethodException {
		String response;
		try {
			response = Requests.requestPostJson(BASE_URL_API_TELEGRAM_BOT + method.getMethodName(), params);
			T result = UtilsJson.convertJsonToObject(response, classType);
			checkOkResponseRaiseException((MethodResult) result, method.getMethodName());
			return result;
		} catch (IOException | FailConvertJsonException e) {
			throw new FailResponseMethodException(method.getMethodName(), e.getCause());
		}
	}
	
	private <T> T executeMethodMultipart(Methods method, Class<T> classType, Map<String, Object> mapParameters) throws FailResponseMethodException {
		String response;
		try {
			response = Requests.requestMultiPart(BASE_URL_API_TELEGRAM_BOT + method.getMethodName(), mapParameters);
			T result = UtilsJson.convertJsonToObject(response, classType);
			checkOkResponseRaiseException((MethodResult) result, method.getMethodName());
			return result;
		} catch (IOException | FailConvertJsonException e) {
			throw new FailResponseMethodException(method.getMethodName(), e.getCause());
		}
	}

	private void checkOkResponseRaiseException(MethodResult result, String methodName)
			throws FailResponseMethodException {
		if (result == null || !result.getOk()) {
			System.out.println("Error code: " + result.getError_code());
			System.out.println("Error description: " + result.getDescription());
			throw new FailResponseMethodException(methodName);
		}
	}

}
