package org.telegram.telebot.model.methods;

import java.io.Serializable;
import java.util.List;

import org.telegram.telebot.model.inline.InlineQueryResult;

public class EditMessageReplyMarkup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -647797927452274549L;

	private String inline_query_id;
	private List<InlineQueryResult> results;
	private Integer cache_time;
	private Boolean is_personal;
	private String next_offset;
	private String switch_pm_text;
	private String switch_pm_parameter;

	public String getInline_query_id() {
		return inline_query_id;
	}

	public void setInline_query_id(String inline_query_id) {
		this.inline_query_id = inline_query_id;
	}

	public List<InlineQueryResult> getResults() {
		return results;
	}

	public void setResults(List<InlineQueryResult> results) {
		this.results = results;
	}

	public Integer getCache_time() {
		return cache_time;
	}

	public void setCache_time(Integer cache_time) {
		this.cache_time = cache_time;
	}

	public Boolean getIs_personal() {
		return is_personal;
	}

	public void setIs_personal(Boolean is_personal) {
		this.is_personal = is_personal;
	}

	public String getNext_offset() {
		return next_offset;
	}

	public void setNext_offset(String next_offset) {
		this.next_offset = next_offset;
	}

	public String getSwitch_pm_text() {
		return switch_pm_text;
	}

	public void setSwitch_pm_text(String switch_pm_text) {
		this.switch_pm_text = switch_pm_text;
	}

	public String getSwitch_pm_parameter() {
		return switch_pm_parameter;
	}

	public void setSwitch_pm_parameter(String switch_pm_parameter) {
		this.switch_pm_parameter = switch_pm_parameter;
	}

}
