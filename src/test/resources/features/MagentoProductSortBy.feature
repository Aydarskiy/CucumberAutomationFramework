@productSortBy @magento @smoke @regression @ui
  Feature: Sorting products

    @sortByPriceLowHigh
    @TC-0006
Scenario: user logs in to account chooses women bottom shorts and sorts products by price from low to high
      Given user navigates to Magento website
      And user clicks on sign in button
      And user inputs valid user name and password
      When user hovers over woman drop-down menu
      And user hover over bottom menu
      And user selects shorts
      And user clicks on sort by drop-down and selects sort by price

      Then user validates product prices are listed from low to high
