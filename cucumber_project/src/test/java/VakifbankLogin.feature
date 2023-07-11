Feature: Vakıfbank Login test

  Scenario: Go to vakıfbank website and test login page
    Given Open vakifbank login page
    And Accept popup
    When Click profile button
    Then Check vakifbank username
    And Quit page
