Feature: abl

  Background: 
    Given FB url

  @FB
  Scenario Outline: test the facebook application
    Given user is on login page
    When user enter "<firstname>", "<Lastname>", "<mobOremailId>" and "<password>"
    Then user is on Home page

    Examples: 
      | firstname | Lastname | mobOremailId | password |
      | sachin1   | ok1      |          123 | done     |
      | sachin2   | ok2      |          123 | done     |
      | sachin3   | ok3      |          123 | done     |
      | sachin4   | ok4      |          123 | done     |
