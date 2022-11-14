@smoke
Feature: search
  Scenario Outline: search name
    When insert product "<Link>" insearch
    Then url contains "<Link>" after submit
      And all products contain "<Link>"



    Examples:
      | Link     | Title                  |
      | book    | xx               |
      | laptop        | xx |
      | nike        | xx         |


  Scenario Outline: search sku
    When insert productsku "<Link2>" insearch
    And click link
    Then product contains in description "<Link2>"


    Examples:
      | Link2     | Title                  |
      | SCI_FAITH    | xx               |
      | APPLE_CAM        | xx |
      | SF_PRO_11        | xx          |