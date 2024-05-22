Feature: Application Login

Scenario: Admin Page default login
    Given User is on banking login page
    When User logins into application with "admin" and password "1234"
    Then Homepage is displayed
    And User cards are displayed

Scenario: User Page default login
    Given User is on banking login page
    When User logins into application with customer and password 4321
    Then Homepage is displayed
    And User cards are displayed

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
