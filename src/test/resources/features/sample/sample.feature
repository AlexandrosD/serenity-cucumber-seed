Feature: Search on google
  In order to find what I look for
  As a user
  I want to be able to search on google

  Scenario: Search google
    Given I am on google
    When I search for 'cucumber serenity'
    Then I should see 'The Serenity Reference Manual'

  Scenario: Search google - nested
    Given I am on google
    When I search for 'cucumber serenity'
    Then I should see 'The Serenity Reference Manual'
    And I should see 'serenity-bdd/serenity-cucumber'
    When I search for 'Dan North'
    Then I should see 'Dan North & Associates'
    And I should see 'Blog | Dan North & Associates'

  Scenario Outline: Search google - parameterized
    Given I am on google
    When I search for '<search_term>'
    Then I should see '<search_result>'
  Examples:
    | search_term        | search_result                 |
    | cucumber serenity  | The Serenity Reference Manual |
    | Dan North          | Dan North & Associates        |
