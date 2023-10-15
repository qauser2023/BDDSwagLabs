Feature: Swag Labs Landing page

  Scenario: Verify Swag Labs page title
    Given user launches the brower
    Then user should have page title as Swag Labs

  Scenario: Verify user is unable to login without username and password
    Given user launches the brower
    When user clicks on login button
    Then user should see error message

  
  Scenario: Verify registered user able to log in with valid credetials
    Given user launches the brower
    When user enters username and password
    When user clicks on login button
    Then user should be taken to Products page

@smoke
  Scenario: Verify total number items in Product page
    Given user launches the brower
    When user enters username and password
    When user clicks on login button
    Then user should be taken to Products page
    Then user should see total 6 items on Product page
