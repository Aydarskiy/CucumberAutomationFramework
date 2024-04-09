@accountRegistration @magento @smoke @regression @ui
Feature: Account registration functionality

  Background:
    Given user navigates to Magento website
    And user clicks on Create an Account Button


  @TC-0001
  @accountRegistrationPositive
  Scenario Outline: Validating registration of new account with valid user data
    When user creates account with data
      | First Name | <First Name>      |
      | Last Name  | <Last Name>       |
      | Email      | random            |
      | Password   | ValidPassword123$ |
    Then user validates title "My Account"
    And user validates contact information matches with given user name and email
    Examples:
      | First Name                                                                   | Last Name                                                         |
      | J                                                                            | Johnson                                                           |
      | David                                                                        | Kim                                                               |
      | Dazdrapermaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa | Ivanova                                                           |
      | Julia                                                                        | Z                                                                 |
      | Rakesh                                                                       | Patel                                                             |
      | Anna                                                                         | Wolfeschlegelsteinhausenbergerdorffffffffffffffffffffffffffffffff |
@TC-0002
@accountRegistrationNegative
 Scenario: Validating first name required field error message
  When user creates account with data and skips first name field
    | Last Name  | Chen              |
    | Email      | random            |
    | Password   | ValidPassword123$ |
  Then user validates "This is a required field." error message under first name field.

  @TC-0003
  @accountRegistrationNegative
  Scenario: Validating last name required field error message
    When user creates account with data and skips last name field
      | First Name | Lily              |
      | Email      | random            |
      | Password   | ValidPassword123$ |
    Then user validates "This is a required field." error message under last name field.


    @TC-0004
    @accountRegistrationNegative
    Scenario: Validating email required field error message
      When user creates account with data and skips email field
        | First Name | Lily              |
        | Last Name  | Chen              |
        | Password   | ValidPassword123$ |
      Then user validates "This is a required field." error message under email field.






