Feature: Delete multiple Attendance Validation

  Background: Admin logged into LMS portal and clicks attendance button on the navigation bar

  Scenario: Verify delete multiple class  button is enabled
    Given Admin is in manage attendance page
    When Admin clicks single  rowlevel check box in the data table
    Then Admin should see deleteicon below the header is enabled

  Scenario: verify tick mark is visible after clicking on check box for single data
    Given Admin is in manage attendance page
    When Admin clicks single  row level checkbox in the data table
    Then Admin should see tick mark in check box

  Scenario: verify admin able to click multiple check box
    Given Admin is in manage attendance page
    When Admin clicks multiple row level check box in the data table
    Then Admin should see tickmark in check box  of the selectedrows
