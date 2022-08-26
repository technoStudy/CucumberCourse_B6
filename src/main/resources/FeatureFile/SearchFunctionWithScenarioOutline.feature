Feature: Search Function with Scenario Outline

  # Scenario Outline will execute the same scenario with different data
  Scenario Outline: Search items in Website
    Given User navigate to Test website
    When User search for "<Item>" in test website
    Then User should see results for "<ResultItem>" in test website

    Examples:
      | Item   | ResultItem   |
      | LG     | LG TVs       |
      | Iphone | Apple Phones |
      | Sony   | Sony Cameras |