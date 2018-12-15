@heroku_project
Feature: Heroku Project

  @heroku_1
  Scenario Outline: Verify invalid email on registration
    Given I am on Registration page
    When I enter name as testuser email as "<email>" password as test12345
    And I click submit button
    Then I verify invalid email address

    Examples:
     | email |
     | test.com |
#     | test@test@test.com |
