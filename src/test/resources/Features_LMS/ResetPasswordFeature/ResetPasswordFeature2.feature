@ResetPassword

Feature: Reset Password



  Background: Admin clicks reset password link after reaching in login page

  Scenario: verify text box is in enabled in new password field

    Given Admin reset password page

    When Admin clicks on type in new password field

    Then Admin should see text box is enabled state



  Scenario: verify text box is in enabled in retype password field

    Given Admin reset password page

    When Admin clicks on retype password field

    Then Admin should see text box is enabled state



  Scenario: Validate reset password with valid details

    Given Admin is in the login page

    When Admin enters same password on both field and clicks submit button

    Then Admin should recieve Your password has been reset Please click here to login



  Scenario: Validate reset password with invalid details

    Given Admin is in the login page

    When Admin enters same password on both field with invalid details and clicks submit button

    Then Error message Please try agin



  Scenario: Validate reset password with empty details

    Given Admin is in the login page

    When Admin enters  empty details on both fieldand clicks submit button

    Then Error message Please try agin



  Scenario: Validate reset password mismatch values

    Given Admin is in the login page

    When Admin enters  mismatch values and clicks submit button

    Then Error message Please try agin

