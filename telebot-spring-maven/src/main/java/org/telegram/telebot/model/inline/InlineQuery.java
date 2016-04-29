package org.telegram.telebot.model.inline;

import java.io.Serializable;

import org.telegram.telebot.model.Location;
import org.telegram.telebot.model.User;

public class InlineQuery implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8784541591515848923L;

	private String id;
	private User from;
	private Location location;
	private String query;
	private String offset;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}

	public String getOffset() {
		return offset;
	}

	public void setOffset(String offset) {
		this.offset = offset;
	}

}
