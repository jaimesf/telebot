package org.telegram.telebot.model;

import java.io.Serializable;

public class ForceReply implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3832015467580581365L;

	private Boolean force_reply;
	private Boolean selective;

	public Boolean getForce_reply() {
		return force_reply;
	}

	public void setForce_reply(Boolean force_reply) {
		this.force_reply = force_reply;
	}

	public Boolean getSelective() {
		return selective;
	}

	public void setSelective(Boolean selective) {
		this.selective = selective;
	}

}
