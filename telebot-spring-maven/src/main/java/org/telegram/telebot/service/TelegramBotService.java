package org.telegram.telebot.service;

import java.io.IOException;
import java.util.List;

import org.telegram.telebot.json.RequestJson;
import org.telegram.telebot.model.File;
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
import org.telegram.telebot.model.methods.GetUpdates;
import org.telegram.telebot.model.methods.GetUserProfilePhotos;
import org.telegram.telebot.model.methods.Methods;
import org.telegram.telebot.model.methods.SendAudio;
import org.telegram.telebot.model.methods.SendChatAction;
import org.telegram.telebot.model.methods.SendContact;
import org.telegram.telebot.model.methods.SendDocument;
import org.telegram.telebot.model.methods.SendLocation;
import org.telegram.telebot.model.methods.SendMessage;
import org.telegram.telebot.model.methods.SendPhoto;
import org.telegram.telebot.model.methods.SendSticker;
import org.telegram.telebot.model.methods.SendVenue;
import org.telegram.telebot.model.methods.SendVideo;
import org.telegram.telebot.model.methods.SendVoice;
import org.telegram.telebot.model.methods.SetWebhook;
import org.telegram.telebot.model.methods.results.BooleanResult;
import org.telegram.telebot.model.methods.results.FileResult;
import org.telegram.telebot.model.methods.results.MessageResult;
import org.telegram.telebot.model.methods.results.MethodResult;
import org.telegram.telebot.model.methods.results.UpdatesResult;
import org.telegram.telebot.model.methods.results.UserProfilePhotosResult;
import org.telegram.telebot.model.methods.results.UserResult;
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

		// TODO: See how send files
		return false;

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

		// TODO: See how send files
		return null;

	}

	public Message sendAudio(SendAudio audio) throws FailResponseMethodException {

		// TODO: See how send files
		return null;

	}

	public Message sendDocument(SendDocument document) throws FailResponseMethodException {

		// TODO: See how send files
		return null;

	}

	public Message sendSticker(SendSticker sticker) throws FailResponseMethodException {

		// TODO: See how send files
		return null;

	}

	public Message sendVideo(SendVideo video) throws FailResponseMethodException {

		// TODO: See how send files
		return null;

	}

	public Message sendVoice(SendVoice voice) throws FailResponseMethodException {

		// TODO: See how send files
		return null;

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
			response = RequestJson.requestGet(BASE_URL_API_TELEGRAM_BOT + method.getMethodName());
			T result = UtilsJson.convertJsonToObject(response, classType);
			checkOkResponseRaiseException((MethodResult) result, method.getMethodName());
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			throw new FailResponseMethodException(method.getMethodName());
		}
	}

	private <T> T executeMethod(Methods method, Class<T> classType, Object params) throws FailResponseMethodException {
		String response;
		try {
			response = RequestJson.requestPostJson(BASE_URL_API_TELEGRAM_BOT + method.getMethodName(), params);
			T result = UtilsJson.convertJsonToObject(response, classType);
			checkOkResponseRaiseException((MethodResult) result, method.getMethodName());
			return result;
		} catch (IOException e) {
			e.printStackTrace();
			throw new FailResponseMethodException(method.getMethodName());
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