Feature: Login page validation

  Background: Admin in login page after clicking login button in home page

  Scenario: Validate login with valid credentials
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should land on dashboard page

  Scenario: Validate login with invalid credentials
    Given Admin is in login page
    When Admin enter invalid credentials  and clicks login button
    Then Error message please check username/password

  Scenario: Validate login with valid credentials in username
    Given Admin is in login page
    When Admin enter valid username  and clicks login button
    Then Error message please check password

  Scenario: Validate login with valid credentials in password
    Given Admin is in login page
    When Admin enter valid  password  and clicks login button
    Then Error message please check username

  Scenario: Validate login with blank username credentials
    Given Admin is in login page
    When Admin enter blank in username and clicks login button
    Then Error message please check username/password

  Scenario: Validate login with blank password credentials
    Given Admin is in login page
    When Admin enter blank in password  and clicks login button
    Then Error message please check username/password

  Scenario: validate login with empty values in both field
    Given Admin is in login page
    When Admin clicks Login button with empty values in both columns
    Then Error message please check username/password

  Scenario: verify login button action through keyboard
    Given Admin is in login page
    When Admin enter valid credentials and clicks login button through keyboard
    Then Admin should land on dashboard page

  Scenario: verify login button action through mouse
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button through mouse
    Then Admin should land on dashboard page
