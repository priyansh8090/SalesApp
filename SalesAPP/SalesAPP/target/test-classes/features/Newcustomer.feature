

Feature: Create an account
  I want to use this creating a new customer account


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


  @tag1
  Scenario: Create an account with valid information
    Given user select the market dropdown
    And select the market 
    Then user click Account box
    Then  I am on the create account page
    When I enter a valid first name "<firstName>"
    And I enter a valid last name "<lastName>"
    And I enter a valid company name "<companyName>"
    And I enter a valid phone number "123456789"
    And I enter a valid email "<email>"
    And I click on the Next button
    Then I should be redirected to the billing information Tab
    Then user select the Country dropdown
    And user select the value in Country dorpdown
    Then user select the state
    And user select state value 
    Then user select the Address 
    Then user enter the city 
    Then user enter the Zipcode 
    Then user click the checkbox
    Then user click the create Account
    
    
       Examples:
 | firstName | lastName | companyName | phoneNumber | email |
  | priyansh  | saxena   | TPHHHdddd  | 123456789 | priyansh12@gmail.com |
  
 
   
    
    

    
   

  
