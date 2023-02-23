package com.restAssured;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ConsultEmployees {

	// Before Setup
	String uril = "http://localhost:5000/api/login";
	RequestSpecification http_reql = RestAssured.given().auth().preemptive().basic("assured1@exemplo.com", "123456789");
	Response responsel = http_reql.post(uril);
	String token = responsel.jsonPath().getString("token");

	@Test
	public void consultEmployee() {

		String token = responsel.jsonPath().getString("token");
		String uri = "http://localhost:5000/api/employees/all";
		RequestSpecification http_req = RestAssured.given().header("Content-Type", "application/json")
				.header("AccessToken", token);

		Response response = http_req.get(uri);
		int statuscode = response.getStatusCode();
		String body = response.asString();

		System.out.println("---------------Status Code---------------- ");
		System.out.println(statuscode);
		System.out.println("---------------Body response-------------- ");
		System.out.println(body);

	}

}