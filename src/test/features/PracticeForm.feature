Feature: Practice Form

  Scenario: Submit Student Registration Form
    Given User launches chrome browser
    When User opens URL "https://demoqa.com/login"
    And User enters username as "ajsiftw" and password as "Password123!"
    And User clicks login
    Then Page title should be "DEMOQA"
    When User clicks on forms
    And User clicks on practice form
    Then Page contains text "Student Registration Form"
    When  User enters first name as "George" and last name as "Radu"
    And User enters email as "super_email@gmail.com"
    And User selects a gender as "male"
    And User enters his phone number as "0777123456"
    And User select his birth date as year "1986" month "December" day 23rd
    And User adds his subjects as "Physics"
    And User selects his hobbies as "sports"
    And User uploads a picture
    And User adds his address as "Super Street 1, Building 2, Ap 3"
    And User selects a state as "NCR" and a city as "Delhi"
    And User clicks submit
    Then Page contains text "Thanks for submitting the form"
    And User closes browser