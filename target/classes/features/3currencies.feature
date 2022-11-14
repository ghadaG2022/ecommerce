@smoke
Feature:currencies
  Scenario: Filter BY Euro showing Products in Euro
    Given user go to home page
    When user select euro
    Then 4 products in euro will be displayed
