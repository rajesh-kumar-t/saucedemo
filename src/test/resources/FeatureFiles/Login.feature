Feature: To validate login functionality in Soucedemo web application

  Scenario Outline: 
    To validate login using different credentials

    Given User is in Sourcedemo login page through Chrome browser
    When User enter "<username>" and "<password>"
    And User clicks on login button
    Then User should receive invalid credentials error

    Examples: 
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
