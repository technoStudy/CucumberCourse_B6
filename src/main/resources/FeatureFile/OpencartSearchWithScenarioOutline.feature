Feature: Opencart Search Function

  Scenario Outline: Search items in Opencart
    Given User navigate to Opencart
    When User search for "<SearchItem>" in Opencart website
    Then User should see results related to "<ResultItem>" in Opencart

    Examples:
      | SearchItem | ResultItem |
      | Mac        | Mac        |
      | Sony       | Sony       |
      | Samsung    | Samsung    |