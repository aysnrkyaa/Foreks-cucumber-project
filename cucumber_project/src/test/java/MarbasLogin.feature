Feature: Marbas Login test
  Scenario: Go to marbas website and test login page
    Given Open Marbas login page
    And Write marbas username
    And Write password
    And Click login button
    When Accept popup marbas
    Then Check marbas username on that page

