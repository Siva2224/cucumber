
Feature: Title of your feature
 
  Scenario: login TestMeApp
  
    Given launch chrome and load TestMeApp
    And navigate to signin
    And enter the username and password
      | username  | password |
      | AlexUser  | Alex@123 | 
      Then click on login
    
