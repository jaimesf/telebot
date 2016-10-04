package org.telegram.telebot.model;

import java.io.Serializable;

/**
 * You can provide an animation for your game so that it looks stylish in chats (check out Lumberjack for an example). 
 * This object represents an animation file to be displayed in the message containing a game.
 * 
 * @author JaimeSF
 * @see <a href="https://telegram.me/gamebot">Lumberjack example</a>
 *
 */
public class Animation implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 589451131606389213L;

	/**
	 * Unique file identifier
	 */
	private String file_id;
	
	/**
	 * Optional. Animation thumbnail as defined by sender
	 */
	private PhotoSize thumb;
	
	/**
	 * Optional. Original animation filename as defined by sender
	 */
	private String file_name;
	
	/**
	 * Optional. MIME type of the file as defined by sender
	 */
	private String mime_type;
	
	/**
	 * Optional. File size
	 */
	private Integer file_size;

	public String getFile_id() {
		return file_id;
	}

	public void setFile_id(String file_id) {
		this.file_id = file_id;
	}

	public PhotoSize getThumb() {
		return thumb;
	}

	public void setThumb(PhotoSize thumb) {
		this.thumb = thumb;
	}

	public String getFile_name() {
		return file_name;
	}

	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	public String getMime_type() {
		return mime_type;
	}

	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	public Integer getFile_size() {
		return file_size;
	}

	public void setFile_size(Integer file_size) {
		this.file_size = file_size;
	}
}
