package com.core.restAssured;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateAuth {

	@Test
	public void createUser(String email, String password, String role) {
		String mail = email;
		String pass = password;
		String rol = role;
		
		String uri = "http://localhost:5000/api/register";
		
		RequestSpecification http_req = RestAssured.given()
		.formParam("email", mail).formParam("password", pass).formParam("role", rol);
		
		Response response = http_req.post(uri);
		
		int statuscode = response.getStatusCode();
		String body = response.asString();
		
		System.out.println("---------------Status Code---------------- ");
		System.out.println(statuscode);
		System.out.println("---------------Body response-------------- ");
		System.out.println(body);
		
		
		
	}
	
}
