package com.tekizma.qa.utils;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class PostRequest {

	
	public static Response postRequest(String endURL, String requestPayload,Map<String, String> headers) {
		return 	RestAssured.given()
				.baseUri(endURL)
				.contentType(ContentType.JSON)
				.body(requestPayload)
				.when().post()
				.then()
				.extract()
				.response();
		
	}
}
