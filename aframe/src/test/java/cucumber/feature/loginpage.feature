
Feature: Test Login Page feature

  
  Scenario: Login test
    Given navigate to login page
    When enter password
    And enter username
    And click on login
    Then able to login to my account
