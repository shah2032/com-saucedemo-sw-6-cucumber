Feature: Login Test
  Background: I am on login page
  @sanity @regression
  Scenario: User should login successful with valid credentials
    When I enter email id in email field
    And I enter password in password field
    And I click on login button
    Then I should see text Products

  @smoke @regression
  Scenario: User should see six products are displayed on homepage
    When I enter email id in email field
    And I enter password in password field
    And I click on login button
    Then I should see six products are displayed on home page