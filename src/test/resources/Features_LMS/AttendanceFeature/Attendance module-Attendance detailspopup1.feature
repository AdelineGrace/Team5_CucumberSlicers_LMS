Feature: Attendance details popup window  verification

  Background: Admin click +Add New Attendance button after reaching to Manage attendance page

  Scenario: Validate all Program name  is reflecting in the dropdown
    Given Admin is in  attendance details popup window
    When Admin clicks  program name dropdown
    Then Program Name in the drop down should match with  program name in  manage program page table

  Scenario: Validate all class name  is reflecting in the dropdown
    Given Admin is in  attendance details popup window
    When Admin clicks class name dropdown
    Then Class Name in the drop down should match with  class name in  manage classpage table

  Scenario: Validate attendance field dropdown all mandatory keywords
    Given Admin is in  attendance details popup window
    When Admin clicks  Attendance dropdown
    Then Attendance field should have keywords such as - present, absent, late, excused

  Scenario: Verify spellings in the attendance field drop down
    Given Admin is in  attendance details popup window
    When Admin clicks  Attendance dropdown
    Then Admin should see correct spellings in dropdown text

  Scenario: validate date picker
    Given Admin is in  attendance details popup window
    When Admin clicks date from date picker
    Then selected date should be their in class date text box

  Scenario: validate date picker should be correct format
    Given Admin is in  attendance details popup window
    When Admin clicks date from date picker
    Then selected date should be in  mm/dd/yyyy format

  Scenario: Validate right arrow in data picker to navigate to next month
    Given Admin is in  attendance details popup window
    When Admin clicks right arrow in the date picker near month
    Then Next month calender should visible

  Scenario: Validate left arrow in data picker to navigate to previous month
    Given Admin is in  attendance details popup window
    When Admin clicks left arrow in the date picker near month
    Then previous month calender should visible

  Scenario: Validate current date is highlighted in the date picker
    Given Admin is in  attendance details popup window
    When Admin clicks date picker button
    Then Admin should see current date is highled in the date picker

  Scenario: Validate selected date is highlighted in the date picker
    Given Admin is in  attendance details popup window
    When Admin clicks date picker button and selects future date
    Then Admin should see selected date is highled in the date picker
