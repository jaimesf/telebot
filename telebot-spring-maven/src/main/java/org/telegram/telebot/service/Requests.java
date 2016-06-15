package org.telegram.telebot.service;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class Requests {

	public static String requestPostJson(String urlQuery, Object jsonObject) throws IOException {

		// 1. URL
		URL url = new URL(urlQuery);

		// 2. Open connection
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		// 3. Specify POST method
		conn.setRequestMethod("POST");

		// 4. Set the headers
		conn.setRequestProperty("Content-Type", "application/json");

		conn.setDoOutput(true);

		// 5. Add JSON data into POST request body

		// `5.1 Use Jackson object mapper to convert Contnet object into
		// JSON
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);

		// 5.2 Get connection output stream
		DataOutputStream wr = new DataOutputStream(conn.getOutputStream());

		// 5.3 Copy Content "JSON" into
		mapper.writeValue(wr, jsonObject);

		// 5.4 Send the request
		wr.flush();

		// 5.5 close
		wr.close();

		// 6. Get the response
		int responseCode = conn.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// 7. Print result
		System.out.println(response.toString());

		printJsonParameters(jsonObject);

		return response.toString();

	}

	public static String requestGet(String urlQuery) throws IOException {

		// 1. URL
		URL url = new URL(urlQuery);

		// 2. Open connection
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		// 3. Specify POST method
		conn.setRequestMethod("GET");

		conn.setDoOutput(true);

		// 4. Get the response
		int responseCode = conn.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();

		// 5. Print result
		System.out.println(response.toString());

		return response.toString();

	}

	public static String requestMultiPart(String url, Map<String, Object> params) throws ClientProtocolException, IOException {

		MultipartEntityBuilder builder = MultipartEntityBuilder.create();

		for (String key : params.keySet()) {
			Object value = params.get(key);
			if (value instanceof File && value != null) {
				File toSend = (File) value;
				builder.addBinaryBody(key, (File) value, ContentType.create("application/octet-stream"), toSend.getName());
			} else if(value != null){
				builder.addTextBody(key, value.toString());
			}
		}

		HttpEntity entity = builder.build();
		HttpPost post = new HttpPost(url);
		post.setEntity(entity);
		try (CloseableHttpClient client = HttpClientBuilder.create().build()){
			
			HttpResponse response = client.execute(post);

			System.out.println("\nSending 'MULTIPART' request to URL : " + url);
			System.out.println("Response Code : " + response.getStatusLine().getStatusCode());

			InputStream ips = response.getEntity().getContent();
			BufferedReader buf = new BufferedReader(new InputStreamReader(ips, "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String s;
			while (true) {
				s = buf.readLine();
				if (s == null || s.length() == 0)
					break;
				sb.append(s);

			}
			buf.close();
			ips.close();
			return sb.toString();
		} 

	}

	private static void printJsonParameters(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		String jsonInString;
		try {
			jsonInString = mapper.writeValueAsString(object);
			System.out.println(jsonInString);
		} catch (JsonProcessingException e) {
			System.out.println("Fallo generando String del json de peticion");
		}

	}
}
