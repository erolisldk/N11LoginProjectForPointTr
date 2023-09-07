@US07
Feature: US07 Dean's Message Process

  Background:
    Given User goes to "url"
    Then User waits 3 seconds
    Then User clicks to login button
    Then User enters an adminUsername, password and then is logged in.
    Then User waits 3 seconds

  Scenario: Check to Contact Message
    And User clicks to menu button
    And User clicks to Contact get all button
    And User asserts that if tne name column is visible
    And User asserts that if tne email column is visible
    And User asserts that if tne date column is visible
    And User asserts that if tne subject column is visible
    And User asserts that if tne message column is visible




