package org.telegram.telebot.model.inline;

import java.io.Serializable;

public class InputVenueMessageContent implements InputMessageContent, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6786421656115825328L;
	private Double latitude;
	private Double longitude;
	private String title;
	private String address;
	private String foursquare_id;

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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFoursquare_id() {
		return foursquare_id;
	}

	public void setFoursquare_id(String foursquare_id) {
		this.foursquare_id = foursquare_id;
	}

}
