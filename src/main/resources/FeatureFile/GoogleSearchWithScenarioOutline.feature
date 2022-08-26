Feature: Google Search Function W Scenario Outline

  Scenario Outline: Search Function with different data
    Given User navigate to Google.com
    When User search for "<SearchItem>" in Google.com
    Then User should see results related to "<ResultItem>"

    Examples:
      | SearchItem | ResultItem |
      | Java       | Java       |
      | Cucumber   | Cucumber   |
      | Amazon     | Amazon     |