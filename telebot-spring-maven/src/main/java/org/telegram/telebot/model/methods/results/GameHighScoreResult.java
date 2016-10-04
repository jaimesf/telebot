package org.telegram.telebot.model.methods.results;

import java.io.Serializable;
import java.util.List;

import org.telegram.telebot.model.GameHighScore;

public class GameHighScoreResult extends MethodResult implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 132452220880769992L;
	
	private List<GameHighScore> result;

	public List<GameHighScore> getResult() {
		return result;
	}

	public void setResult(List<GameHighScore> result) {
		this.result = result;
	}
}
