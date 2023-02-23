#Author: robson.founar@gmail.com

Feature: All Employee Search
  As an QA Tester
  I want to search all employee

@tagbyall
 Scenario: Search for all employee
  Given I am on the employee search page
  When I click the search button
  Then I should see a list of employees
