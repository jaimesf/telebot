package org.telegram.telebot.model;

import java.io.Serializable;

public class Chat implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 252319335159865169L;
	
	private Integer id;
	private String type;
	private String title;
	private String username;
	private String first_name;
	private String last_name;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirts_name() {
		return first_name;
	}
	public void setFirts_name(String firts_name) {
		this.first_name = firts_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	
}
