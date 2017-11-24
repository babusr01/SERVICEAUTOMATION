Feature: Login Feature
  This Feature is used to validated login Functionality

  Scenario Outline: : Login with given Scenario Outlined
    Given I navigate to the login Page
    And I enter "<UserName>" and "<PassWord>" for Scenario Outlined
    And I click the login Button
    Then I should see the landing page

    Examples:
      |UserName|PassWord|
      |admin   |admin   |
      |admin   |        |
      |apple   |apple   |