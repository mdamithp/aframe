Feature: Test Login Page feature

  Scenario: Login test
    Given navigateLoginPage
    When signInAccount
    Then able to login to my account
