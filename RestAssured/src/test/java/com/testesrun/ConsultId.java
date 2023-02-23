package com.testesrun;

import com.restAssured.IdEmployees;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsultId {

	IdEmployees id = new IdEmployees();
	
	@When("I enter the id employee: {int}")
	public void i_enter_the_id_employee(Integer idEmployee) {
		
		id.idEmployee(idEmployee);

		System.out.println("\n");
	}


	@Then("I should see this employee")
	public void i_should_see_this_employee() {

		System.out.println("\n");

	}

	@When("I enter a non-existent employee id")
	public void i_enter_a_non_existent_employee_id() {

		System.out.println("\n");

	}

	@Then("I should see a error message")
	public void i_should_see_a_error_message() {

		System.out.println("----------------------Finish Test----------------------\n");
		throw new io.cucumber.java.PendingException();
	}

}
