Feature: Is it Friday yet?
  Everybody wants to know when it's Friday



  Scenario: Search a word in google
    Given Go to Google Web Search
    When I say a word "Barcelona"
    Then I should be getting "Barcelona" results