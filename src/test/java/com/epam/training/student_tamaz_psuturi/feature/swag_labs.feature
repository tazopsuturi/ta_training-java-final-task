Feature: User Login

  Scenario: Successful login with valid credentials
    Given I open the login page
    When I enter valid username and password
    And I click on the login button
    Then I should be logged in successfully

  Scenario: Login attempt with an empty username
    Given I open the login page
    When I enter an empty username and a valid password
    And I click on the login button
    Then I should see an error message "Username is required"

  Scenario: Login attempt with an empty password
    Given I open the login page
    When I enter a valid username and an empty password
    And I click on the login button
    Then I should see an error message "Password is required"
