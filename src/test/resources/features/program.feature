Feature: Application Login

  Background:
    Given Setup entries in DB
    When Launch the browser
    And Hit the URL for the application

  @regression
Scenario: Admin Page default login
    Given User is on banking login page
    When User logins into application with "admin" and password "1234"
    Then Homepage is displayed
    And User cards are displayed

  @exception
Scenario: User Page default login
    Given User is on banking login page
    When User logins into application with customer and password 4321
    Then Homepage is displayed
    And User cards are displayed

  @smoke  @regression
Scenario Outline: User Page default login
        Given User is on banking login page
        When User logins into application with <Username> and password "<Password>"
        Then Homepage is displayed
        And User cards are displayed

Examples:
    | Username | Password |
    | customer 1 | 1235 |
    | customer 2 | 4321 |
    | customer 3 | 9090 |

    @smoke
  Scenario: User page default signup
    Given User is on Practice landing page
    When User signup into application
    | Princely |
    | Philip |
    | email@email.com |
    | 098765432 |
    Then Homepage is displayed
    And User cards are displayed