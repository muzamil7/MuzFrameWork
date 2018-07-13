@RMPTest
Feature: Create booking

  Scenario: Login into RMP2 Home page
    Given I am on the RMP2 Page
    When I enter user name and2 password start booking
    Then I see booking created