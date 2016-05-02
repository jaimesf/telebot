# telebot
###A Telegram architecture for build Telegram bots quickly with Spring MVC

To create your own bot:

1. Extends your own service from *TelegramBotService* to return your bot token (Example on _org.telegram.telebot.service.myservices.MyTelegramService_).

2. Create a Spring MVC controller like *org.telegram.telebot.controller.MyWebhook* 

3. Your request mapping must be consume JSON via _"consumes = MediaType.APPLICATION_JSON_VALUE"_

4. Your request mapping must receive an *Update* with _@RequestBody_ tag

5. On this moment your controller must have a *@ResponseStatus(HttpStatus.NO_CONTENT)* tag. In the future you can respond directly from this request to clients.

6. Inject your service in the controller.

7. Implents your Bot.

8. Open url /registerbot to register your webhook on telegram.

9. Enjoy your bot

