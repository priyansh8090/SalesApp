
Feature: Registration funtionality 
  I want to use this registration funtionality 
  
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
  Scenario: Registration users 
   Then user click top on vertical line
   Then user click the registration user
   Then user enter the first name "<firstName>"
   Then user enter the last name "<lastName>"
   Then user enter the email "<Email>"
   Then user enter the new password "<Password>"
   Then user enter the Phone number Number "123456789123"
   Then user enter the designation "<Designation>"
   Then user select the role in dropdown
   Then user the enter the select the role
   Then user enter the manager name "<MangerName>"
   Then user enter the companay name dropdown
   Then user select the company name 
   Then user click submit button
   
          Examples:
 | firstName  | lastName | Email                  | Passoword       | phonenumber  | Designation|ManagerName|
  | priyansh  | saxena   | priyansh12@gmail.com   |  Rishu          | 123456789123 |  Software  | Shubham   |
  
  