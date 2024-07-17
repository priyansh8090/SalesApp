

Feature: create order functionality 
    I want to use this create order functionality 
    
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
    
  
  
@Createorder
  Scenario: create order functionality 
    Then user select the market dropdown
    And select the market 
    Then user click Account box
    And user enter the search box
    And user search the any three option
    Then user click the search icon
    And user select the name 
    Then user click the create order
    Then user search the product
    Then user click the product
    Then user select the product AddtoCard
    And user search the again product 
    Then user click the product and check the deatils
    And user click the product Add to card
    Then user click the details button
    Then user select the order type dropdown
    And user select the valu in ordertype dropdown
    And user select the ship date
    And user select the ship completed radio button
    Then user select the Shipping Address 
    Then user Select the first Address
    Then user click the Freight dropdown
    Then user select Freight dropdown valu
    Then user clik summary page
    Then user scroll up the summary page
    Then user click Email customer tongle
    Then user again scroll up the page 
    Then user click the Email Rep
    Then user scoll up the summary page screen
    Then user enter the email "Priyansh.jauhari@innoage.in"
    Then user click the Sumbit button
    Then click the Print button
    
    
    
    

    