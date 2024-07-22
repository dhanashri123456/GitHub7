Feature: Test Orange HRM Appliction

  Scenario: Validate login Page
    Given user is on login page
    When user enter username and password
    Then user clickon login button
    
Scenario: validate home page 
When user is on home page and validate home page title
Then validate home page url
