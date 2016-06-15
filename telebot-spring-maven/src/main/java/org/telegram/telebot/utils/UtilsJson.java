package org.telegram.telebot.utils;

import java.io.IOException;
import java.util.Map;

import org.telegram.telebot.service.exceptions.FailConvertJsonException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class UtilsJson {

	public static <T> T convertJsonToObject(String json, Class<T> classType) throws FailConvertJsonException{
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return mapper.readValue(json, classType);
		} catch (IOException ex) {
			throw new FailConvertJsonException(ex.getCause());
		} 
	}
	
	public static Map<String, Object> getKeyValuePropertiesFromObject(Object object){
		ObjectMapper m = new ObjectMapper();
		TypeReference<Map<String,Object>> typeRef = new TypeReference<Map<String,Object>>() {};
		Map<String,Object> props = m.convertValue(object, typeRef);
		return props;
	}
}
