Feature: Login Function

  Scenario: Email and Password Input Test
    Given User navigate to login page
    When User enter invalid email address and password
      | test@techno.com    | 123456789   |
      | admin@techno.com   | asdfghjkl   |
      | teacher@techno.com | mnbvcxdrtyu |
    Then Error message should be displayed