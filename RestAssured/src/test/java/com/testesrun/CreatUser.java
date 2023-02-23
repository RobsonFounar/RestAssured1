package com.testesrun;

import com.core.restAssured.CreateAuth;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

	
public class CreatUser {

	CreateAuth create = new CreateAuth();
	
	@Given("I am on the registration page")
	public void i_am_on_the_registration_page() {
		System.out.println("\n");
	}

	@When("I enter with a {string}, {string} and a {string}")
	public void i_enter_with_a_and_a(String mail, String password, String role) {
	 create.createUser(mail , password, role);
	 System.out.println("\n");
	}

	@When("I send to register a user")
	public void i_send_to_register_a_user() {
		System.out.println("\n");
	
	}

	@Then("I should see a success message or wrong message")
	public void i_should_see_a_success_message_or_wrong_message() {
		System.out.println("------------------Finish teste with sucefull register------------------\n");
	    throw new io.cucumber.java.PendingException();
	}
}