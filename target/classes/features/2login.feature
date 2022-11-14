@smoke
Feature: F02_Login | users could use login functionality to use their accounts

  Scenario: user could not login with valid email and password
    Given user go to login page
    When user login with invalid email and password and click login button
    Then user should not be able to login

  Scenario: user could login with valid email and password
    Given user go to login page
    When user login with valid email and password and click login button
    Then user should be able to login
