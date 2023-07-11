Feature: Marbas Analizler - Finansal Oranlar test
  Scenario: Go to marbas website and test login page
    Given Open Marbas login page
    And Write marbas username
    And Write password
    And Click login button
    And Accept popup marbas
    And Open bosekran
    And Click modul list
    And Click Analizler
    And Click Finansal Oranlar
    When Search hisse
    Then Check hisse on that page
    And Quit page


