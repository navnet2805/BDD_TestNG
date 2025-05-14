Feature: OrangeHRM Login Feature

  #pre-condition
  Background:
    Given user should be in OrangeHRM login page

  Scenario Outline: Verify user is able to login using valid credentials
    When user enters valid "<valid_username>" and "<valid_password>"
    And user clicks on Login button
    Then Verify user is navigated to Dashboard page

    Examples:
      | valid_username | valid_password |
      | Admin          | Hacker@4321    |
      | admin          | Hacker@4321    |

  Scenario: Verify user is not able to login using invalid credentials
    When user enters invalid username and invalid password
    And user clicks on Login button
    Then Verify user is not navigated to Dashboard page