@Admin
Feature: Page Employee

  Background:
    Given I in home page OrangeHRM

  @AddUser
  Scenario: Successfully add new user employee
    When I input username and password
    And I click login
    When I add new user PIM
    And I input First Name, Midle Name, Last Name
    And I set Username and Password
    Then Get get the result user

  @EditInfo
  Scenario: Successfully update data employee
    When I input new username and password
    And I click my info
    And I input Nationality, marital status gender
    Then Get the result user Punc out



