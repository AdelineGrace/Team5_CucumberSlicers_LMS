@tag
Feature: Manage Attendance Page verification

  Background: Logged on the LMS portal as Admin

  @Attendance0
  Scenario: Validate the header of the page
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see the Manage attendance from "AttendanceSheet" and 2

  @Attendance1
  Scenario: Validate response time from dashboard page to attendance page
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Maximum navigation time in milliseconds, defaults to 30 seconds

  @Attendance2
  Scenario: Validate the broken link
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then HTTP response >= 400 after the link is broken from "Attendance" and row 11

  @Attendance3
  Scenario: Verify LMS title
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see LMS -Learning management system  as title from "Attendancesheet" and row 2

  @Attendance3
  Scenario: Verify the alignment of the Manage Attendance header
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Manage attendance header should be in left side of the page

  @Attendance4
  Scenario: Validate text in manage attendancepage
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see correct spelling for the all the fields from "Attendancesheet" and 2

  @Attendance5
  Scenario: Verify delete icon below the header
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see disabled delete icon below the "Manage Attendance"

  @Attendance6
  Scenario: Verify search bar on the class page
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see search bar on the attendance page

  @Attendance7
  Scenario: Verify add new Attendance button  on Attendance page
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see +Add New Attendance button on the attendance page

  @Attendance8
  Scenario: Verify data table on the attendance page
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see data table on the Manage Attendance Page With following column headers "Check box symbol,Class ID, Student Id,Preasent, Edit Delete"

  @Attendance9
  Scenario: Verify Edit icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Edit Icon in each row of data table only  when entries are available

  @Attendance10
  Scenario: Verify Edit icon when no data in the table
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Edit Icon will not be present in data table

  @Attendance11
  Scenario: Verify delete icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Delete Icon in each row of data table only  when entries are available

  @Attendance12
  Scenario: Verify delete icon when no data in the table
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin cant see delete  Icon in data table

  @Attendance13
  Scenario: Verify sort icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see sort icon near the column headers except for Edit and Delete

  @Attendance14
  Scenario: Verify check box in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see check box in the all rows  of data table

  @Attendance15
  Scenario: Validate the number entries displaying
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Above the footer Admin should see the text as "Showing x to y of z entries" from "Attendancesheet" and 2

  @Attendance16
  Scenario: Verify Pagination control below the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see the pagination controls under the data table

  @Attendance17
  Scenario: Validate footer  text
    Given Admin is on dashboard page after Login
    When Admin clicks "Attendance" on the navigation bar
    Then Admin should see the text with total number classes in the data table. ( " In total there are 2 Atendance") from "Attendancesheet" and 2
