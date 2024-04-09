@accountRegistration @magento @smoke @regression @ui
Feature: Account registration functionality
  @TC-0001
  @accountRegistrationPositive
  Scenario Outline: Validating registration of new account with valid user data.
    Given user navigates to Magento website
    And user clicks on Create an Account Button
    When user creates account with data
      | First Name | <First Name>      |
      | Last Name  | <Last Name>       |
      | Email      | random            |
      | Password   | ValidPassword123$ |
    Then user validates title "My Account"
    And user validates contact information matches with given user name and email
    Examples:
      | First Name                                                                   | Last Name                                                         |
      | I                                                                            | Johnson                                                           |
      | David                                                                        | Kim                                                               |
      | Dazdrapermaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Ivanova                                                           |
      | Julia                                                                        | B                                                                 |
      | Rakesh                                                                       | Patel                                                             |
      | Anna                                                                         | Wolfeschlegelsteinhausenbergerdorffffffffffffffffffffffffffffffff |

