Feature: User Authentication

  @Test-1
  Scenario: Successful Sign Up
    Given User is on the Home page
    And I click on Get Started
    When User enters a new valid email and password
    And Clicks on Sign Up button
    Then User should be registered successfully

#  Scenario: Sign Up with existing email
#    Given User is on the Sign Up page
#    When User enters an already registered email and password
#    And Clicks on Sign Up button
#    Then An error message should be displayed for existing email
#
#  Scenario: Successful Sign In
#    Given User is on the Sign In page
#    When User enters valid email and password
#    And Clicks on Sign In button
#    Then User should be logged in successfully
#
#  Scenario: Sign In with incorrect password
#    Given User is on the Sign In page
#    When User enters valid email and incorrect password
#    And Clicks on Sign In button
#    Then An error message should be displayed for incorrect credentials
#
#  Scenario: Successful Sign Out
#    Given User is signed in
#    When User clicks on Sign Out
#    Then User should be redirected to the login page