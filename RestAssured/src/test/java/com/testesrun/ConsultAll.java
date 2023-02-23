package com.testesrun;

import com.restAssured.ConsultEmployees;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsultAll {

	ConsultEmployees consult = new ConsultEmployees();
	
	@Given("I am on the employee search page")
	public void i_am_on_the_employee_search_page() {
	   
		System.out.println("\n");
		
	}

	@When("I click the search button")
	public void i_click_the_search_button() {
	   
		consult.consultEmployee();
		
		System.out.println("\n");
	}

	@Then("I should see a list of employees")
	public void i_should_see_a_list_of_employees() {
	  
		System.out.println("----------------------Finish Test----------------------\n");
		
	    throw new io.cucumber.java.PendingException();
	}
}
