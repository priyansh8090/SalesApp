
Feature: search order funtionality 
  I want to use this template search order 
  
      Background:  
    Given User Navigate to the Application
     When User Enter the "Priyansh.jauhari@innoage.in"
     When User enter the "Rishu@8090"
     And  user click on the Login Button
     And  Otp screen should open
     And Enter otp from email 
     And  user click Submit
    Then User should be able to login 
    And Home Page should be shown
    Then user select the global views
    Given user select the market dropdown
     And select the market 

  @tag
  Scenario: order search fuctionality
    Given user click the order page
    Then user click the owner
    And user select the owner dropdown value
    Then user click the order writer name
    And user select the order  
 

