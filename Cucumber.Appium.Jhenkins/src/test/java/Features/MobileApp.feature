#Author: your.email@your.domain.com
@appium
Feature: Logging in to a facebook website


  
  Scenario: Logging in to facebook
    Given open the browser
    Then  Enter username 
    And  Enter password
    And press the login button
    Then Quit the browser
    
  