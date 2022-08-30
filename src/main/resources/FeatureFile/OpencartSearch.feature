Feature: Opencart Search Functionality
  @Regression
  Scenario: Search for Mac
    Given User navigate to Opencart website
    When User search for "Mac" in Opencart
    Then All the results in Opencart should be related to "Mac"

  @Smoke
  Scenario: Search for Samsung
    Given User navigate to Opencart website
    When User search for "Samsung" in Opencart
    Then All the results in Opencart should be related to "Samsung"


  Scenario: Search for Samsung
    Given User navigate to Opencart website
    When User search for "Sony" in Opencart
    Then All the results in Opencart should be related to "Sony"