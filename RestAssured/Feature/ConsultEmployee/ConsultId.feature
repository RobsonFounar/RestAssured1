#Author: robson.founar@gmail.com

Feature: Employee Search
  As an QA Tester
  I want to search for an employee by id

@tagbyID
 Scenario: Search for an employee by id
  Given I am on the employee search page
  When I enter the id employee: 5
  Then I should see this employee

@tagNotExist
 Scenario: Search for an employee that does not exist
  Given I am on the employee search page
  When I enter a non-existent employee id
  Then I should see a error message 