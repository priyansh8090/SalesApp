
Feature:  Reset Password
  I want to use this feature on Reset password

  @Reset
  Scenario: Reset Password
    Given user navigate to the Application
    And user click the Reset password link
    When user enter the Email
    And enter the new password
    And user click on the Reset Password
    And OTP screen are visible
    Then user enter the OTP
    And user click the verify button
    Then Pop-up message will show
    Then click the pop-up message ok button
    Then user back to the login page
    And user enter the email
    And user enter the password
    Then user click the login button
    Then user enter the login otp
    Then user click the login verify button

