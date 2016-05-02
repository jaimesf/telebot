package org.telegram.telebot.json;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RequestJson {

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

}
