Feature: Wikipedia search functionality and verifications


  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "Bill Gates" in the wiki search box
    And User clicks wiki search button
    Then User sees "Bill Gates" is in the wiki title


  Scenario: Wikipedia Search Functionality Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the main header


  Scenario: Wikipedia Search Functionality Image Header Verification
    Given User is on Wikipedia home page
    When User types "Steve Jobs" in the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in the image header

    @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Title Verification
    Given User is on Wikipedia home page
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in the wiki title
    Then User sees "<expectedMainHeader>" is in the main header


    Examples: search values we are going to use in this scenario are as below

      | searchValue | expectedTitle | expectedMainHeader |
      | Steve Jobs  | Steve Jobs    | Steve Jobs         |
      | Bob Marley  | Bob Marley    | Bob Marley         |
      | Marie Curie | Marie Curie   | Marie Curie        |
      | Lady Gaga   | Lady Gaga     | Lady Gaga          |

