package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InputLocationMessageContent implements InputMessageContent, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6786421656115825328L;
	private Double latitude;
	private Double longitude;

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

}
