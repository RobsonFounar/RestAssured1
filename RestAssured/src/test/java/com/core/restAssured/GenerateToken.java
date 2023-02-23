package com.core.restAssured;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GenerateToken {

	@Test
	public void authToken() {

		String uri = "http://localhost:5000/api/login";

		RequestSpecification http_req = RestAssured.given()

				.auth().preemptive().basic("assured1@exemplo.com", "123456789");

		Response response = http_req.post(uri);

		int statuscode = response.getStatusCode();
		String body = response.asString();
		String token = response.jsonPath().getString("token");

		System.out.println("---------------Status Code---------------- ");
		System.out.println(statuscode);
		System.out.println("---------------Body response-------------- ");
		System.out.println(body);
		System.out.println("---------------Token response-------------- ");
		System.out.println(token);

	}

}
