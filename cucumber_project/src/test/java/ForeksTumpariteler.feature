Feature: Foreks Para Piyasaları - Tüm Pariteler test
  Scenario: Go to foreks website and test Tüm Pariteler page
    Given Open Foreks login page
    And Write username
    And Write password
    And Click login button
    And Accept popup
    And Open bosekran
    And Click modul list
    And Click para piyasalari
    And Click tum pariteler
    And Add column
    And Check column
    And Delete column
    And Close widget
    And Click modul list
    And Click para piyasalari
    And Click tum pariteler
    And Check data
    When Search sembol
    Then Click sembol detay
    And Quit page
