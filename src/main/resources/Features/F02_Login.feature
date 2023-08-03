@smoke

Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could login with valid email and password
    When user go to login page
    And user login with email "test@example.com"
    And user login with password "P@ssw0rd"
    And user press on login button

  Scenario: user couldn't login with invalid email and password
    When user go to login page
    And user login with email "test@exabbmple.com"
    And user login with password "P@ssggw0rd"
    And user press on login button





