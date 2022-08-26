Feature: Google Search

  Scenario: Google Search for Cucumber
    Given User navigate to Google website
    When User search for "Cucumber" in Google
    Then User should see results "Cucumber" related in Google


  Scenario: Google Search for Apple
    Given User navigate to Google website
    When User search for "Apple" in Google
    Then User should see results "Apple" related in Google


  Scenario: Google Search for Java
    Given User navigate to Google website
    When User search for "Java" in Google
    Then User should see results "Java" related in Google