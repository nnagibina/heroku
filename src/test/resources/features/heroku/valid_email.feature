@heroku_project
Feature: Heroku Project

  @heroku_1
  Scenario: Verify a new user can register with a valid email address
    Given I am on Registration page
    When I  enter name as testuser email as "test@test.com" password as test12345
    And I click submit button
    Then I am signed-in as a new user