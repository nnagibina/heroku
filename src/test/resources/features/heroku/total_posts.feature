@heroku_project
Feature: Heroku Project

  @heroku_1
  Scenario: Verify total number of posts on home page
    Given I am on home page of heroku
    Then I verify 94 total post is displayed
    And I verify all post has price tag
    And I verify all post has title
    And I verify all post has displayed image