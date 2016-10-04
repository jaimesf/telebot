package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InlineQueryResultGame extends InlineQueryResult implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9148522669844897586L;
	
	/**
	 * 	Short name of the game
	 */
	private String game_short_name;

	public String getGame_short_name() {
		return game_short_name;
	}

	public void setGame_short_name(String game_short_name) {
		this.game_short_name = game_short_name;
	}

}
