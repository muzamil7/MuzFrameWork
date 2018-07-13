@PracticeTest
Feature: Login Functionality

  Scenario: Login into Home page
    Given I am on the Google Page
    When  I enter user name and password
  	Then  I see page logged in
    