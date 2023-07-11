Feature: Foreks Login test
  Scenario: Go to foreks website and test login page
    Given Open Foreks login page
    And Write username
    And Write password
    And Click login button
    And Accept popup
    When Open bosekran
    Then Check username on that page
    And Quit page
