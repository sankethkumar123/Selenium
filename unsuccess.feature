Feature: feature to test unsuccessful login functionality

  Background: 

  Scenario: Verify that login incorrect message displayed on screen.
    Given user is on login page
    When user enters invalid username and password
    And clicks on login button
    Then user should not navigate to the home page
