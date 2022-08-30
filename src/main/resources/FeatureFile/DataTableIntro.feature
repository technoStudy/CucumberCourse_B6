Feature: Login example scenario with Data Table

  # Data Tables:
  #   We use Data Tables to run a step in a scenario multiple times with different data
  #   We use Scenario Outline to run the whole scenario multiple times with different data

  Scenario: Email input Test
    Given Navigate to website
    When User enter email address
      | asdfghjkjhgfds    |
      | 1234567898765     |
      | dksjhhfkjdshk7378 |
    Then Close App