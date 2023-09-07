@US08
Feature: Vice Dean Lesson Create Process

  Background:
    Given User goes to "url"
    Then User waits 3 seconds
    Then User clicks to login button
    Then User enters an viceDeanUsername, password and then is logged in.
    Then User waits 3 seconds

@US08TC01
  Scenario: Create to lesson as a Vice Dean
    And User clicks to Lessons button
    And User writes a Lesson Name in Lesson Name Box
    And User clicks compulsory radio button
    And User asserts that if tne compulsory radio button is clicked
    And User writes a credit ccore in credit score box
    And User clicks submit button
    And User asserts that if tne lesson is created
    And User closes driver

  @US08TC02
  Scenario: Create to lesson as a Vice Dean without compulsory
    And User clicks to Lessons button
    And User writes a Lesson Name in Lesson Name Box
    And User clicks compulsory radio button as nonchecked
    And User asserts that if tne compulsory radio button is clicked
    And User writes a credit ccore in credit score box
    And User clicks submit button
    And User asserts that if tne lesson is created




