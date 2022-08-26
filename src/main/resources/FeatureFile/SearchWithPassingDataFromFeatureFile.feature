Feature: Search Function

  Scenario: User search for Sony
    Given User navigate to website
    And User go to Search page
#   When User search for ""   ---> this is our step and we can pass any data between double quotes
    When User search for "Sony"
    Then All the results should be displayed for "Sony"


  Scenario: User search for Samsung
    Given User navigate to website
    And User go to Search page
    When User search for "Samsung"
    Then All the results should be displayed for "Samsung"


  Scenario: User search for HP
    Given User navigate to website
    And User go to Search page
    When User search for "HP"
    Then All the results should be displayed for "HP"