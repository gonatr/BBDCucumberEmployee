@LoginTestEmployee
Feature: Login test

  Background:
    Given User on page employee sdcillsy

  @TestValid @PositiveCase
  Scenario Outline: User successfully login with valid credentialssad

    When User fill form <username> and <password>
    And User click on loginad
    Then Get user Valid login resource

    Examples:
      | username  | password  |
      | tonnyUV   | Te$la1234 |

  @TestLogout @PositiveCase
  Scenario Outline: User successfully logout
    When User insert fill form <username> and <password>
    And User click btm login
    And User in home page Dasboard
    When User click name on right top
    And User click logout
    Then User get resource Logout

    Examples:
      | username | password  |
      | tonnyUV  | Te$la1234 |


  @TestInvalid @NegativeCase
  Scenario Outline: User Unsuccessfully login with invalid credentialssad

    When User filll form <username> and <password>
    And User click button loginad
    Then Get Valid login resource

    Examples:
      | username | password    |
      | adf      |             |
      |          | hfd         |
      |          |             |
      | Admin    | adsfsadfdsf |