#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@DashBoard
Feature: Dashboard Page

  Background: Admin clicks Login butter after giving correct URL

  Scenario: Verify after login admin lands on manage program as dashboard page
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see manage program as header

  Scenario: Verify the response time
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Maximum navigation time in milliseconds, defaults to 30 seconds

  Scenario: Verify broken link
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then HTTP response >= 400.

  Scenario: Verify LMS title
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see LMS -Learning management system  as title

  Scenario: Verify LMS title alignment
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then LMS title should be on the top left corner of page

  Scenario: Validate navigation bar text
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see correct spelling in navigation bar text

  Scenario: Validate LMS title has correct spelling ang space
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see correct spelling and space in LMS title

  Scenario: Validate alignment for navigation bar
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see the navigation bar text on the top right side

  Scenario: Validate navigation bar order 1st Student
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see student in the 1st place

  Scenario: Validate navigation bar order 2nd Program
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see program in the 2nd place

  Scenario: Validate navigation bar order 3rd Batch
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see batch in the 3rd place

  Scenario: Validate navigation bar order 4th Class
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see class in the 4th place

  Scenario: Validate navigation bar order 5th User
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see User in the 5th place

  Scenario: Validate navigation bar order 6th Assignment
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see Assingment in the 6th place

  Scenario: Validate navigation bar order 7th Attendance
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see Attendance in the 7th place

  Scenario: Validate navigation bar order 8th Logout
    Given Admin is in login page
    When Admin enter valid credentials  and clicks login button
    Then Admin should see Logout in the 8th place

  Scenario: Verify Logout button function
    Given Admin is in dashboard page
    When Admin click Logout button on navigation bar
    Then Admin should land on login in page
