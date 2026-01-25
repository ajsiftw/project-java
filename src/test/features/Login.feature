Feature: Login

  @single
  Scenario: Successful login with valid credentials
    Given User launches chrome browser
    When User opens URL "https://demoqa.com/login"
    And User enters username as "ajsiftw" and password as "Password123!"
    And User clicks login
    Then Page title should be "DEMOQA"
    When User clicks on logout link
    Then Page title should be "DEMOQA"
    And User closes browser

  @driven
  Scenario Outline: Login Data Driven
    Given User launches chrome browser
    When User opens URL "https://demoqa.com/login"
    And User enters username as "<user>" and password as "<password>"
    And User clicks login
    Then Page title should be "DEMOQA"
    When User clicks on logout link
    Then Page title should be "DEMOQA"
    And User closes browser

    Examples:
    | user | password |
    |ajsiftl | Password123! |
    |ajsiftd | Password123! |