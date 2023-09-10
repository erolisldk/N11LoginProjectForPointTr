@N11
Feature: Search a Keyword
  Background: Login to N11
    Given User goes to "url"
    Then User waits 3 seconds
    Then User clicks to girisYap button
    Then User enters an username, password and then is logged in.
    And User waits 3 seconds

  @SuccesfulSearch
  Scenario: Succesfull search
    Then User cliks to searchBox and writes valid keyword
    Then User waits 3 seconds
    Then user checks whether the search process has been completed successfully.
    Then User takes screenshot of successfull search
    And User logs successful search process to results.txt

  @UnSuccesfulSearch
  Scenario: Unsuccesfull search
    Then User cliks to searchBox and writes invalid keyword
    Then User waits 3 seconds
    Then user checks whether the search process has been uncompleted
    Then User takes screenshot of unsuccessfull search
    And User logs unsuccessful search process to results.txt

