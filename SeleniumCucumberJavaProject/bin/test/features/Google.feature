Feature: Test Google search functionality

Scenario: As a user i enter a search criteria in Google
    Given I am on the Google search page
    When I enter a search criteria
    And Click on the search button
    Then The result march the criteria

    