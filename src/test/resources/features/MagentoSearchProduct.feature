@magento @regression @smoke @ui @magentoSearch
Feature: Magento search functionality

  @TC-0007
  @magentoSearchPositive
  Scenario: Validating search result contains searched item
    Given user navigates to Magento website
    When user searches fri keyword "t shirt"
    Then user validates search result contains
      | tee     |
      | top     |
      | tank    |


