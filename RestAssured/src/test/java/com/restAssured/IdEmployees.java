package com.restAssured;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class IdEmployees {

	// Before Setup
	String uril = "http://localhost:5000/api/login";
	RequestSpecification http_reql = RestAssured.given().auth().preemptive().basic("assured1@exemplo.com", "123456789");
	Response responsel = http_reql.post(uril);
	String token = responsel.jsonPath().getString("token");

	@Test
	public void idEmployee(int idEmployee) {
		int id = idEmployee;
		
		String uri = "http://localhost:5000/api/employees";

		RequestSpecification http_req = RestAssured.given()

				.header("AccessToken", token)
				.queryParam("id", id);

		Response response = http_req.get(uri);

		int statuscode = response.getStatusCode();
		String body = response.asString();

		System.out.println("---------------Status Code---------------- ");
		System.out.println(statuscode);
		System.out.println("---------------Body response-------------- ");
		System.out.println(body);

	}

}