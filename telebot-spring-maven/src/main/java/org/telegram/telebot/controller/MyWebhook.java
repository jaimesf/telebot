package org.telegram.telebot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.telegram.telebot.model.Update;
import org.telegram.telebot.service.TelegramBotService;

@Controller
public class MyWebhook {

	@Autowired
	TelegramBotService service;
	
	@RequestMapping(value = "/webhook", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void myWebhook(@RequestBody Update update) {
		

	}
	
	/**
	 * From this JSP you can register webhooks on telegram
	 * @return
	 */
	@RequestMapping(value = "/registerbot", method = RequestMethod.GET)
	public String registerBot() {
		return "register";
	}
	
}
