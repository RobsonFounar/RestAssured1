package com.testesrun;

import com.restAssured.DeleteEmployees;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class DeleteEmployee {

	DeleteEmployees delete = new DeleteEmployees();

	@Given("I am logged in as an administrator")
	public void i_am_logged_in_as_an_administrator() {

		System.out.println("                                         ");

	}

	@When("I want to Delete a employee with ID {int}")
	public void i_want_to_delete_a_employee_with_id(Integer id) {

		delete.deleteEmployee(id);

		System.out.println("---------------------Finish TEST---------------------");
		throw new io.cucumber.java.PendingException();
	}

}
