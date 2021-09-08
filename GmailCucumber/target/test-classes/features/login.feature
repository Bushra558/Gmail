Feature: Feature to test login function

  Scenario Outline: Check login is successful with valid credentials
    Given user is on the Google search page
    When user opens Gmail
    And user provides "<email id>" 
    And user provides "<password>"
    Then login should be successfull

    Examples: 
      | email id                   | password   |
      | bushra.zafar306@gmail.com  | Bushr@0897 |
      | bushrazafar.2111@gmail.com | Bush@0896  |
