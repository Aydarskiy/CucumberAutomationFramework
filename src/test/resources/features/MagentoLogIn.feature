@login @magento @smoke @regression @ui
  Feature: Magento account login

    @TC-0005
    @accountLoginPositive
      Scenario: user navigates to magento website nad logs in with valid login data
      Given user navigates to Magento website
      When user clicks on sign in button
      And user inputs valid user name and password
      Then user validates greeting text "Welcome, Amira Yata!"