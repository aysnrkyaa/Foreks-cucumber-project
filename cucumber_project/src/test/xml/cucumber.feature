@FWT-596
Feature: Cucumber Test Execution

	@TEST_FWT-594
	Scenario: Vakıfbank Login 
		Given Open vakifbank login page
		    And Accept popup
		    When Click profile button
		    Then Check vakifbank username
		    And Quit page
	@TEST_FWT-593
	Scenario: Marbas Finansal Oranlar
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
	@TEST_FWT-592
	Scenario: Marbas Login 
		Given Open Marbas login page
		    And Write marbas username
		    And Write password
		    And Click login button
		    When Accept popup marbas
		    Then Check marbas username on that page
	@TEST_FWT-591
	Scenario: Foreks Tüm Pariteler
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
	@TEST_FWT-590
	Scenario: Foreks Özet İstatistik
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
	@TEST_FWT-589
	Scenario: Foreks Login 
		Given Open Foreks login page
		    And Write username
		    And Write password
		    And Click login button
		    And Accept popup
		    When Open bosekran
		    Then Check username on that page
		    And Quit page
