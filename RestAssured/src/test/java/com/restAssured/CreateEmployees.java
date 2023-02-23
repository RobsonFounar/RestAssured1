package com.restAssured;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateEmployees {

	// Before Setup
	String uril = "http://localhost:5000/api/login";
	RequestSpecification http_reql = RestAssured.given().auth().preemptive().basic("assured1@exemplo.com", "123456789");
	Response responsel = http_reql.post(uril);
	String token = responsel.jsonPath().getString("token");

	@Test
	public void createEmployee(String name, String lastName, String email) {
		String names = name;
		String last = lastName;
		String mail = email ;
		
		String uri = "http://localhost:5000/api/employees";

		RequestSpecification http_req = RestAssured.given()

				.header("Content-Type", "application/json").header("AccessToken", token)
				.body("[{ \"firstname\": \"" + names + "\", \"lastname\": \"" + last + "\", \"email\": \"" + mail + "\" }]");
		
		Response response = http_req.post(uri);

		int statuscode = response.getStatusCode();
		String body = response.asString();

		System.out.println("---------------Status Code---------------- ");
		System.out.println(statuscode);
		System.out.println("---------------Body response-------------- ");
		System.out.println(body);

	}

}