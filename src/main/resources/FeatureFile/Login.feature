# Feature keyword represents the functionality we're testing
Feature: Login Functionality

  # Scenario is about how and what we're testing (test scenario - test case)
  Scenario: Login with valid username and password
    Given User navigate to website
    When User enter valid username and password
    Then User should login successfully

  @Regression
  Scenario: Login with valid username and invalid password
    Given User navigate to website
    When User enter valid username and invalid password
    Then Login should fail