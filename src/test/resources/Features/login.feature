Feature: Login functionality
@smoke
  Scenario: I want to login to my Account
    Given the user is on the homepage
    When user clicks on MyAccount
    And user click on login
    And user enters '<sadatsayedibrahim@gmail.com>'  and '<test123>'
    And user clicks login button
    Then user is navigated to the login page
