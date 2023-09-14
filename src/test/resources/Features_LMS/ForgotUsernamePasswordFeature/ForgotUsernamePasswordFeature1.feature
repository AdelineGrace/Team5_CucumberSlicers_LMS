Feature: Forgot usernamPassword
Background: Admin in login page after clicking login button in home page

Scenario: Verify forgot username or password link

Given Admin is in loginpage

When Admin clicks forgot username or password link

Then Admin should land on forgot username or password page 

Scenario: verify broken link

Given Admin is in loginpage

When Admin clicks forgot username or password link

Then HTTP response >= 400 the link is broken

Scenario: verify input descriptive text for Email

Given Admin is in loginpage

When Admin clicks forgot username or password link

Then Admin should see "Email" text in gray color

Scenario: Verify email text in text field

Given Admin is in loginpage

When Admin clicks forgot username or password link

Then Admin should see "Email" in text field

Scenario: Verify send link button is present

Given Admin is in loginpage

When Admin clicks forgot username or password link

Then Admin should see "send Link"  button

Scenario: Verify asterik near Email text

Given Admin is in loginpage

When Admin clicks forgot username or password link

Then Admin should see asterik symbol need Email

Scenario: Verify text spelling 

Given Admin is in loginpage

When Admin clicks forgot username or password link

Then Admin should see correct spellings in every fields 

Scenario: Verify the alignment of the send link button

Given Admin is in loginpage

When Admin clicks forgot username or password link

Then Admin should see send link button in center of the page

