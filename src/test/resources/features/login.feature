@Regression @smoke @login
Feature: Library app login functionality
  Agile story: As a user, I should be able to login with correct credentials to different accounts. And dashboard should be displayed.

  Accounts are: librarian, student, admin

  Background For the scenarios in login page, user is expected to be on login page
    Given user is on the library login page

  @librarian
  Scenario: Login as Librarian
    When user enters librarian username
    And user should be able to enter password
    Then user should see the dashboard

  @student
  Scenario: Login as student
    When user enters student username
    And user enters student password
    Then user should see the dashboard

  @admin
  Scenario: Login as admin
    When user enters admin username
    And user enters admin password
    Then user should see the dashboard



