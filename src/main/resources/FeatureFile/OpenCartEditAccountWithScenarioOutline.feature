Feature: Edit Account Function

  Scenario Outline: Edit first name in my profile
    Given Navigate to Opencart app
    And Login to your account
    When User navigate to edit account page
    And Update "<firstName>"
    Then User should see success message

    Examples:
      | firstName |
      | Frank     |
      | Joe       |
      | Steven    |