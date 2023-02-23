#Author: robson.founar@gmail.com

Feature: Employee Management

@tagEdit
Scenario: Edit an employee
  Given I am logged in as an administrator
  And I am on the employee management page
  When I wnat to Edit employee with FirstName "first" , LastName "last", Email "mail" and Id 5
  Then I should see a success message id 7
