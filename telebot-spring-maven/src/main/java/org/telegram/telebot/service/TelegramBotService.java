package org.telegram.telebot.service;

import java.io.IOException;

import org.telegram.telebot.json.RequestJson;
import org.telegram.telebot.model.ForwardMessage;
import org.telegram.telebot.model.Message;
import org.telegram.telebot.model.methods.SendMessage;
import org.telegram.telebot.model.methods.results.MessageResult;
import org.telegram.telebot.model.methods.results.MethodResult;
import org.telegram.telebot.service.exceptions.FailResponseMethodException;
import org.telegram.telebot.utils.UtilsJson;

public abstract class TelegramBotService {

	private String BOT_TOKEN = getTokenBot();
	private final String BASE_URL_API_TELEGRAM = "https://api.telegram.org/bot";
	private final String BASE_URL_API_TELEGRAM_SHOUTIT = BASE_URL_API_TELEGRAM + BOT_TOKEN;
	private final String SEND_MESSAGE_URL = BASE_URL_API_TELEGRAM_SHOUTIT + "/sendMessage";
	private final String FORWARD_MESSAGE_URL = BASE_URL_API_TELEGRAM_SHOUTIT + "/forwardMessage";

	public abstract String getTokenBot();

	public Message sendMessage(SendMessage message) throws FailResponseMethodException {
		String response;
		try {
			response = RequestJson.requestPostJson(SEND_MESSAGE_URL, message);
			MessageResult msg = UtilsJson.convertJsonToObject(response, MessageResult.class);
			checkOkResponseRaiseException(msg, "sendMessage");
			return msg.getResult();
		} catch (IOException ioEx) {
			ioEx.printStackTrace();
			throw new FailResponseMethodException("sendMessage");
		}

	}

	public Message forwardMessage(ForwardMessage message) throws FailResponseMethodException {
		String response;
		try {
			response = RequestJson.requestPostJson(FORWARD_MESSAGE_URL, message);
			MessageResult msg = UtilsJson.convertJsonToObject(response, MessageResult.class);
			checkOkResponseRaiseException(msg, "forwardMessage");
			return msg.getResult();
		} catch (IOException e) {
			e.printStackTrace();
			throw new FailResponseMethodException("forwardMessage");
		}

	}

	private void checkOkResponseRaiseException(MethodResult result, String methodName)
			throws FailResponseMethodException {
		if (result == null || !result.getOk()) {
			throw new FailResponseMethodException(methodName);
		}
	}

}
