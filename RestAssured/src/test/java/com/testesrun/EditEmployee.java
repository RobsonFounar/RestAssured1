package com.testesrun;

import com.restAssured.EditEmployees;
import com.restAssured.IdEmployees;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditEmployee {

	EditEmployees edit = new EditEmployees();
	IdEmployees ids = new IdEmployees();
	
	
	
	@Given("I am on the employee management page")
	public void i_am_on_the_employee_management_page() {
	  
		System.out.println("                                         ");

	}

	@When("I wnat to Edit employee with FirstName {string} , LastName {string}, Email {string} and Id {int}")
	public void i_wnat_to_edit_employee_with_first_name_last_name_email_and_id(String first, String last, String mail, Integer id) {
	   
		edit.editEmployee(first, last, mail, id);
		
		System.out.println("---------------------Sucess---------------------\n");
		
	 
	}

	
	
	@Then("I should see a success message id {int}")
	public void i_should_see_a_success_message_id(Integer id) {
	 
		ids.idEmployee(id);
		
		System.out.println("---------------------Finish TEST---------------------\n");
	    throw new io.cucumber.java.PendingException();
	}

}
