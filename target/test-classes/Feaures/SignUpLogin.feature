Feature: Test the sign up flow

  Scenario: User successfully registers an account
    Given user on the home page 
    When User navigate to the sign-up page
    Then user fill out the sign-up form with valid details
    

  Scenario: User logs in with valid credentials
    Given User on the login page
    When User enter  registered email and password
    Then User should be logged in successfully and see my account page
