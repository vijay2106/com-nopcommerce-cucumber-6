@regression
Feature: Login Test of Nopcommerce
  As a user I want to check Login functionality

  @sanity
  Scenario: User should navigate to login page successfully
    Given I am on home page
    When I click on login link
    Then I should see the Welcome text "Welcome, Please Sign In!"

  @smoke
  Scenario: User should verify The Error Message With InValid Credentials
    Given I am on home page
    When I click on login link
    And I enter Invalid email ID "Vijay@gmail.com"
    And I enter Invalid password "Bha143"
    And I click on login button
    Then I should see the error message "Login was unsuccessful. Please correct the errors and try again.\nNo customer account found"

  @smoke
  Scenario: User Should LogIn SuccessFully With Valid Credentials
    Given I am on home page
    When I click on login link
    And I enter valid email ID "Vijay@gmail.com"
    And I enter valid password "Vijay@143"
    And I click on login button
    Then I should see the Logout link is displayed "Log out"

  @sanity
  Scenario: User Should Logout SuccessFully
    Given I am on home page
    When I click on login link
    And I enter valid email ID "Vijay@gmail.com"
    And I enter valid password "Vijay@143"
    And I click on login button
    And I click on logout button
    Then I should see the Login link is displayed "Log in"