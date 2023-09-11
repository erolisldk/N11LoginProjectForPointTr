@N11
Feature: Login to N11

  Background: Login to N11
    Given User goes to "url"
    Then User waits 3 seconds
    Then User clicks to girisYap button
    And User waits 3 seconds

  @SuccesfulLogin
  Scenario: Succesfully login and logout to N11
    Then User enters an username, password and then is logged in.
    Then User waits 3 seconds
    Then The user checks if the login has been completed successfully.
    And User takes screenshot of full screen
    Then User logouts the page
    Then User waits 2 seconds
    Then The user checks if the logout has been completed successfully.
    And User takes screenshot of full screen for successful logout
    And User closes driver

  @UnSuccesfulLogin
  Scenario: Unsuccesful login to N11
    Then User enters an false username, password and then is logged in
    Then User waits 3 seconds
    Then User takes screenshot of error message as full screen
    And User logs unsuccessful login attempt and logs error message to loginerror.txt
    And User closes driver

