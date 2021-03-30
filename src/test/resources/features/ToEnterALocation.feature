Feature: Enter Location Tests

  Scenario: Go to website and test the location

    Given navigate to Website
    And click on input area
    And type your location
    When click on search button
    Then verify the lowest and highest temperature
