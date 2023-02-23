package com.testesrun;

import com.restAssured.ConsultEmployees;
import com.restAssured.CreateEmployees;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateEmployee {

	CreateEmployees employee = new CreateEmployees();
	ConsultEmployees consult = new ConsultEmployees();
	
	
	@Given("I am on the employee registration page")
	public void i_am_on_the_employee_registration_page() {
	 
		System.out.println("\n");
	}

	@When("I enter the employees informatiom: {string} {string} {string}")
	public void i_enter_the_employees_informatiom(String name, String last, String mail) {
	   
		employee.createEmployee(name, last, mail);
		
		System.out.println("\n");
	}
	
	
	@When("I click the submit button")
	public void i_click_the_submit_button() {
		
		consult.consultEmployee();
		
		System.out.println("\n");
	
	}

	@Then("the employee profile with the first name, last name, and email should be saved in the system")
	public void the_employee_profile_with_the_first_name_last_name_and_email_should_be_saved_in_the_system() {
	    
		
		
		System.out.println("---------------------Finish TEST---------------------\n");
		
	    throw new io.cucumber.java.PendingException();
	}

}
