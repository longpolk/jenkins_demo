Feature: I want to go to Google website and check the title
  @e2e
  Scenario: As a user I want to navigate to and check the title of Google website
    Given I am on Google homepage
    Then I see the title is displayed correctly