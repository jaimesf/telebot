package org.telegram.telebot.model;

import java.io.Serializable;
import java.util.List;

/**
 * This object represents a game. 
 * Use BotFather to create and edit games, their short names will act as unique identifiers
 * 
 * @author JaimeSF
 *
 */
public class Game implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3023740801279714040L;
	
	/**
	 * Title of the game
	 */
	private String title;
	
	/**
	 * Description of the game
	 */
	private String description;
	
	/**
	 * Photo that will be displayed in the game message in chats.
	 */
	private List<PhotoSize> photo;
	
	/**
	 * Optional. Brief description of the game or high scores included in the game message. 
	 * Can be automatically edited to include current high scores for the game when the bot calls setGameScore, 
	 * or manually edited using editMessageText. 0-4096 characters.
	 */
	private String text;
	
	
	/**
	 * Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
	 */
	private List<MessageEntity> text_entities;
	
	
	/**
	 * Optional. Animation that will be displayed in the game message in chats. Upload via BotFather
	 */
	private Animation animation;


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public List<PhotoSize> getPhoto() {
		return photo;
	}


	public void setPhoto(List<PhotoSize> photo) {
		this.photo = photo;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public List<MessageEntity> getText_entities() {
		return text_entities;
	}


	public void setText_entities(List<MessageEntity> text_entities) {
		this.text_entities = text_entities;
	}


	public Animation getAnimation() {
		return animation;
	}


	public void setAnimation(Animation animation) {
		this.animation = animation;
	}

}
