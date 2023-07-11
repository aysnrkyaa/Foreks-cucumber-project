Feature: Foreks Analizler - Özet İstatistik test
  Scenario: Go to foreks website and test Özet İstatistik page
    Given Open Foreks login page
    And Write username
    And Write password
    And Click login button
    And Accept popup
    And Open bosekran
    And Click modul list
    And Click Analizler
    And Click Özet İstatistik
    When Search hisse
    Then Check hisse on that page
    And Quit page

