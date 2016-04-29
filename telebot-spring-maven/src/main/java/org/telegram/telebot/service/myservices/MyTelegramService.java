package org.telegram.telebot.service.myservices;

import org.springframework.stereotype.Service;
import org.telegram.telebot.service.TelegramBotService;

@Service
public class MyTelegramService extends TelegramBotService{

	@Override
	public String getTokenBot() {
		String myBotToken = "<Here comes my bot token>";
		return myBotToken;
	}

}
