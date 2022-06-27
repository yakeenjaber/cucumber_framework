@Smoke
Feature: Hero App Login Functionality

  Scenario Outline: Validate form authentication page
    Given user navigates to "http://the-internet.herokuapp.com/"
    When user clicks on "Form Authentication" link
    And user enters username as "<username>" and password as "<password>"
    And user clicks on "Login" button
    Then user should see a message starts with "<message>"
    Examples:
      | username | password             | message                        |
      |          |                      | Your username is invalid!      |
      | johndoe  | abcd1234             | Your username is invalid!      |
      | tomsmith | 12345                | Your password is invalid!      |
      | tomsmith | SuperSecretPassword  | Your password is invalid!      |
      | tomsmith | SuperSecretPassword! | You logged into a secure area! |