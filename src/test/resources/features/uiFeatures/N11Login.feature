@N11Login
Feature: Succesfully login to N11

  @N11SuccesfulLogin
  Scenario: Succesfully login to N11
    Given User goes to "url"
    Then User waits 3 seconds
    Then User clicks to girisYap button
    Then User enters an username, password and then is logged in.
    Then User waits 3 seconds
    Then The user checks if the login has been completed successfully.
    And User takes screenshot of full screen

  @N11UnSuccesfulLogin
  Scenario: Unsuccesful login to N11
    Given User goes to "url"
    Then User waits 3 seconds
    Then User clicks to girisYap button
    Then User enters an false username, password and then is logged in
    And User takes screenshot of error message and full screen

