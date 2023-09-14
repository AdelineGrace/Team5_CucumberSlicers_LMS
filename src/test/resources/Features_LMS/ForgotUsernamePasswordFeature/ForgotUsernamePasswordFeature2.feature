Feature: Forgot usernamePassword2

Background: Admin Clicks forgot username and password after reaching login page

Scenario: Verify forgot username or password link

Given Admin is in forgot username and password page

When Admin enters valid email id and clicks send link button

Then Admin should receive link in mail for reset username / password

Scenario: Validate email sent for forgot password with invalid email if

Given Admin is in forgot username and password page

When Admin enters invalid email id and clicks send link button

Then Admin should not receive link in mail for reset username / password

