Feature: Reset Password

Background: Admin in login page after clicking login button in home page

Scenario: Verify reset password link

Given Admin is in login page

When Admin clicks reset password link

Then Admin should land on reset password page 

Scenario: Verify text in the page

Given Admin is in login page

When Admin clicks reset password link

Then Admin should see correct spellings in all fields 


Scenario: Verify submit button is present

Given Admin is in login page

When Admin clicks reset password link

Then Admin should see "submit" button

Scenario: Verify the alignment of the submit button

Given Admin is in login page

When Admin clicks reset password link

Then Admin should see submit button in center of the page

 
Scenario:Verify text box is present is the page

Given Admin is in login page

When Admin clicks reset password link

Then Admin should see two text box


Scenario: Verify first label text

Given Admin is in login page

When Admin clicks reset password link

Then Admin should see "Type in new password" in the first label text

 Scenario: Verify second label text

Given Admin is in login page

When Admin clicks reset password link

Then Admin should see "Retype password" in the second label text


Scenario: verify text box is in disabled


Given Admin is in login page

When Admin clicks reset password link

Then Admin should see text box in disabled state