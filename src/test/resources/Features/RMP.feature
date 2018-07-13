@RMPTest
Feature: Login Functionality for RMP

  Scenario: Login into RMP Home page
    Given I am on the RMP Page
    When I enter user name and1 password
    Then I see page logged1 in
