package com.tekizma.qa.testcases;
import java.util.HashMap;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.tekizma.qa.utils.PostRequest;
import io.restassured.response.Response;

public class CreateAirLineTest {

	
	@Test
	public void createAirLinetest()
	{
		String endURL="https://api.instantwebtools.net/v1/airlines";
		String requestPayload="{\r\n"
				+ "    \"id\": 9111845,\r\n"
				+ "    \"name\": \"Sri Lankan Airways\",\r\n"
				+ "    \"country\": \"Sri Lanka\",\r\n"
				+ "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\r\n"
				+ "    \"slogan\": \"From Sri Lanka\",\r\n"
				+ "    \"head_quaters\": \"Katunayake, Sri Lanka\",\r\n"
				+ "    \"website\": \"www.srilankaairways.com\",\r\n"
				+ "    \"established\": \"1990\"\r\n"
				+ "}";
		
		Response res= PostRequest.postRequest(endURL, requestPayload,new HashMap<String, String>()) ;
		Assert.assertEquals(res.statusCode(), 200);
	}
}
