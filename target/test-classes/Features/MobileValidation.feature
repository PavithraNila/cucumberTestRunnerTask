@sanity
Feature: realme mobile validation

  Background: 
  
    And user login by entering valid credetials

  @tag1 @map
  Scenario: HardCoded Values
    When user Search mobile
    And user click on the mobile name
    Then user validate the mobile name

  @map @iphones
  Scenario: Data Table values
    When user Search mobile by one dim List
      | realme | SAMSUNG | iphones |
    And user click on the mobile name
    Then user validate the mobile name

  Scenario: Data Table values
    When user Search mobile by one dim Map
      | 1 | realme  |
      | 2 | SAMSUNG |
      | 3 | iphones |
    And user click on the mobile name
    Then user validate the mobile name

  Scenario Outline: 
    And user login by entering valid credetials
    When user Search mobile "<phone>"
    And user click on the mobile name
    Then user validate the mobile name

    Examples: 
      | phone   |
      | realme  |
      | SAMSUNG |
      | iphone  |
