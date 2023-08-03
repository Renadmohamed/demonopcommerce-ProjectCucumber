@smoke
Feature: F01_Register | users could register with new accounts

  Scenario: guest user could register with valid data successfully
    When  user go to register page
    And  user select gender type
    And  user enter first name "automation"
    And  last name "tester"
    And  user enter date of birth
    And  user enter email "test@example.com" field
    And  user fills Password fields "P@ssw0rd"
    And  user fills Confirm Password fields "P@ssw0rd"
    Then user clicks on register button