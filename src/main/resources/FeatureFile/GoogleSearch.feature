Feature: Google Search Functionality

  Scenario: Search for Cucumber in Google
    Given User navigate to Google
    When User search for Cucumber in Google
    Then User should see Cucumber results in Google