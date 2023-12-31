@tag
Feature: Edit Attendance

  Background: Admin click +Add New Attendance button after reaching to Manage attendance page

  @Attendance1
  Scenario: Validate admin able to update  attendance data
    Given Admin is in  attendance details popup window
    When Admin fills all the values from "Attendance Detais" and row number 1 click save
    Then Admin should see success message in popup window and sees new attendance details in manage attendance details DB

  Scenario: Validate admin able to update attendance data without program name
    Given Admin is in  attendance details popup window
    When Admin fills values missing program name from "Attendance Detais" and row number 2 click save
    Then Program name is missing

  Scenario: Validate admin able to update attendance data without class name
    Given Admin is in  attendance details popup window
    When Admin fills values missing class name from "Attendance Detais" and row number 2 click save
    Then class name is missing

  Scenario: Validate admin able to create new attendance data without student name
    Given Admin is in  attendance details popup window
    When Admin fills values missing student name from "Attendance Detais" and row number 2 click save
    Then student name is missing

  Scenario: Validate admin able to create new attendance data without attendances
    Given Admin is in  attendance details popup window
    When Admin fills values missing attendance from "Attendance Detais" and row number 2 click save
    Then Attendance is missing

  Scenario: Validate admin able to create new attendance data without attendance date
    Given Admin is in  attendance details popup window
    When Admin fills values missing attendance date from "Attendance Detais" and row number 2 click save
    Then Attendance date is missing

  Scenario: Validate admin able to create new attendance by selecting future date
    Given Admin is in  attendance details popup window
    When Admin fills values with future date from "Attendance Detais" and row number 2 click save
    Then Invalidate attendance date
