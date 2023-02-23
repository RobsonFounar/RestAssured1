#Author: robson.founar@gmail.com


Feature: Employee Management

@tagDelete
Scenario: Delete an employee
  Given I am logged in as an administrator
  When I want to Delete a employee with ID 12
  Then I should see a success message