package org.telegram.telebot.model;

import java.io.Serializable;
import java.util.List;

public class Message implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4002449132027060670L;

	private Integer message_id;
	private User from;
	private Integer date;
	private Chat chat;
	private User forward_from;
	private Integer forward_date;
	private Message reply_to_message;
	private String text;
	private List<MessageEntity> entities;
	private Audio audio;
	private Document document;
	private List<PhotoSize> photo;
	private Sticker sticker;
	private Video video;
	private Voice voice;
	private String caption;
	private Contact contact;
	private Location location;
	private Venue venue;
	private User new_chat_member;
	private User left_chat_member;
	private String new_chat_title;
	private List<PhotoSize> new_chat_photo;
	private Boolean delete_chat_photo;
	private Boolean group_chat_created;
	private Boolean supergroup_chat_created;
	private Boolean channel_chat_created;
	private Integer migrate_to_chat_id;
	private Integer migrate_from_chat_id;
	private Message pinned_message;

	public Boolean isLocationMessage() {
		return location != null;
	}

	public Boolean isStartMessage() {
		return (text != null && text.equalsIgnoreCase("/start"));
	}

	public Integer getMessage_id() {
		return message_id;
	}

	public void setMessage_id(Integer message_id) {
		this.message_id = message_id;
	}

	public User getFrom() {
		return from;
	}

	public void setFrom(User from) {
		this.from = from;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public Chat getChat() {
		return chat;
	}

	public void setChat(Chat chat) {
		this.chat = chat;
	}

	public User getForward_from() {
		return forward_from;
	}

	public void setForward_from(User forward_from) {
		this.forward_from = forward_from;
	}

	public Integer getForward_date() {
		return forward_date;
	}

	public void setForward_date(Integer forward_date) {
		this.forward_date = forward_date;
	}

	public Message getReply_to_message() {
		return reply_to_message;
	}

	public void setReply_to_message(Message reply_to_message) {
		this.reply_to_message = reply_to_message;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<MessageEntity> getEntities() {
		return entities;
	}

	public void setEntities(List<MessageEntity> entities) {
		this.entities = entities;
	}

	public Audio getAudio() {
		return audio;
	}

	public void setAudio(Audio audio) {
		this.audio = audio;
	}

	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public List<PhotoSize> getPhoto() {
		return photo;
	}

	public void setPhoto(List<PhotoSize> photo) {
		this.photo = photo;
	}

	public Sticker getSticker() {
		return sticker;
	}

	public void setSticker(Sticker sticker) {
		this.sticker = sticker;
	}

	public Video getVideo() {
		return video;
	}

	public void setVideo(Video video) {
		this.video = video;
	}

	public Voice getVoice() {
		return voice;
	}

	public void setVoice(Voice voice) {
		this.voice = voice;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Venue getVenue() {
		return venue;
	}

	public void setVenue(Venue venue) {
		this.venue = venue;
	}

	public User getNew_chat_member() {
		return new_chat_member;
	}

	public void setNew_chat_member(User new_chat_member) {
		this.new_chat_member = new_chat_member;
	}

	public User getLeft_chat_member() {
		return left_chat_member;
	}

	public void setLeft_chat_member(User left_chat_member) {
		this.left_chat_member = left_chat_member;
	}

	public String getNew_chat_title() {
		return new_chat_title;
	}

	public void setNew_chat_title(String new_chat_title) {
		this.new_chat_title = new_chat_title;
	}

	public List<PhotoSize> getNew_chat_photo() {
		return new_chat_photo;
	}

	public void setNew_chat_photo(List<PhotoSize> new_chat_photo) {
		this.new_chat_photo = new_chat_photo;
	}

	public Boolean getDelete_chat_photo() {
		return delete_chat_photo;
	}

	public void setDelete_chat_photo(Boolean delete_chat_photo) {
		this.delete_chat_photo = delete_chat_photo;
	}

	public Boolean getGroup_chat_created() {
		return group_chat_created;
	}

	public void setGroup_chat_created(Boolean group_chat_created) {
		this.group_chat_created = group_chat_created;
	}

	public Boolean getSupergroup_chat_created() {
		return supergroup_chat_created;
	}

	public void setSupergroup_chat_created(Boolean supergroup_chat_created) {
		this.supergroup_chat_created = supergroup_chat_created;
	}

	public Boolean getChannel_chat_created() {
		return channel_chat_created;
	}

	public void setChannel_chat_created(Boolean channel_chat_created) {
		this.channel_chat_created = channel_chat_created;
	}

	public Integer getMigrate_to_chat_id() {
		return migrate_to_chat_id;
	}

	public void setMigrate_to_chat_id(Integer migrate_to_chat_id) {
		this.migrate_to_chat_id = migrate_to_chat_id;
	}

	public Integer getMigrate_from_chat_id() {
		return migrate_from_chat_id;
	}

	public void setMigrate_from_chat_id(Integer migrate_from_chat_id) {
		this.migrate_from_chat_id = migrate_from_chat_id;
	}

	public Message getPinned_message() {
		return pinned_message;
	}

	public void setPinned_message(Message pinned_message) {
		this.pinned_message = pinned_message;
	}

}
