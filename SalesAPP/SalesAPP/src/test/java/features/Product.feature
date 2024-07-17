
Feature: user search the product
  I want to use this search the product 
  
  
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
  

  @tag1
  Scenario: User the search the product UPC number text and id
    Then user select the product tab
    Then user enter the any text
    Then user scroll the up page 
    Then user enter the UPC number 
    Then user enter the ID of product
    
    
 