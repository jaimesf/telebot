package org.telegram.telebot.model;

import java.io.Serializable;

/**
 * This object represents one row of the high scores table for a game.
 * 
 * @author JaimeSF
 *
 */
public class GameHighScore implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5827960228185384686L;
	
	/**
	 * Position in high score table for the game
	 */
	private Integer position;
	
	/**
	 * User
	 */
	private User user;
	
	/**
	 * Score
	 */
	private Integer score;

}
