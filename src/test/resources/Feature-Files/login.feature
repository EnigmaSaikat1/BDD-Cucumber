Feature: Logging in User View
  Scenario: Validate user is able to view after Login
    Given User navigates to the Login page
    When User successfully enters the Login details
    Then User Should able to view the product category page