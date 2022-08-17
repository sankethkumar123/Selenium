Feature: feature to test login functionality
Background:
  Scenario: Verify that user should taken to the successful login page
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user should be taken to the successful login page

  Scenario: Verify that successfully navigated to Search bus page.
    Given user should navigate to book your tickets now
    When user enters Leaving From
    And user Enter Going to
    And user select Date of Departure
    And user Select Date of return
    Then clicks on search for bus
    

  