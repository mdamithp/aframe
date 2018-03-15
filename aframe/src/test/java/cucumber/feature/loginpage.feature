@featureTeat
Feature: Test Login Page feature

  @Scenario1
  Scenario: Test valid user able to login to account
    Given Navigate to login page
    When Sign in to account with username as "mdamithp@gmail.com" and password as "12345"
    Then Verify my account page as title "My account - My Store"
    And Close the browser

  @Scenario2
  Scenario: Test user able to serch using search funtionality
    Given Navigate to home page
    When Insert search text as "T Shirt" in search box
    Then Verify search page as title "Search - My Store"
    And Close the browser
