@smoke
Feature: wishlist
  Scenario: add o wish list
    Given user in home page3
    When user click add to wishlist
    Then sucsmessage should be showing

  Scenario: add o wish list
    Given user in home page3
    When user click add to wishlist
    Then sucsmessage should be showing
    And quantity bigger than zero


