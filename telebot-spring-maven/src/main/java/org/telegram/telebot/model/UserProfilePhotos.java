package org.telegram.telebot.model;

import java.io.Serializable;
import java.util.List;

public class UserProfilePhotos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5735273955175983170L;

	private Integer total_count;
	private List<List<PhotoSize>> photos;

	public Integer getTotal_count() {
		return total_count;
	}

	public void setTotal_count(Integer total_count) {
		this.total_count = total_count;
	}

	public List<List<PhotoSize>> getPhotos() {
		return photos;
	}

	public void setPhotos(List<List<PhotoSize>> photos) {
		this.photos = photos;
	}

}
