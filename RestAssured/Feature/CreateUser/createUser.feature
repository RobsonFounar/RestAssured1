#Author: robson.founar@gmail.com


Feature: User Registration
  As a user
  I want to create an account with a username and password
  So that I can access the system

  @validEmail
  Scenario: User registration with valid credentials
   Given I am on the registration page
  When I enter with a "email@email.com", "password" and a "admin"
  Then I should see a success message or wrong message

 