@smoke
Feature: HomePage
  As user I want to login on sauce demo homepage

  Scenario: As a user I should Login successfully with valid credentials
    Given I am on Homepage
    And I enter Username "standard_user"
    And I enter Password "secret_sauce"
    And I Click On Login
    Then I should be able login successfully and see "Products"