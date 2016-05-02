package org.telegram.telebot.model.methods;

import java.io.Serializable;

import org.telegram.telebot.model.InputFile;

public class SetWebhook implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	private String url;
	private InputFile certificate;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public InputFile getCertificate() {
		return certificate;
	}

	public void setCertificate(InputFile certificate) {
		this.certificate = certificate;
	}

}