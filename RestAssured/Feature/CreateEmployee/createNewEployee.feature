#Author:robson.founar@gmail.com


Feature: Employee Registration
  As an QA tester
  I want to create an employee profile with first name, last name, and email
  So that I can keep track of employee information

  @registrationvalid
 Scenario: Employee registration with valid information
  Given I am on the employee registration page
  When I enter the employees informatiom: "firstName" "lastName" "email" 
  And I click the submit button
  Then I should see a success message
  And the employee profile with the first name, last name, and email should be saved in the system


