@tag
Feature: Attendance details popup window  verification

  Background: Admin is Manage attendance page after login

  @Attendancedetail0
  Scenario: Verify all label text
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see correct spellings in the label from "Attendance sheet" and 2

  @Attendancedetail1
  Scenario: Verify dropdown box is present
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then 4 dropdown should be present

  @Attendancedetail2
  Scenario: Verify close button   in attendance details popup window
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see  close button on the attendance details popup window

  @Attendancedetail3
  Scenario: Verify the alignment of the close button
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Close button should on the top right corner

  @Attendancedetail4
  Scenario: Verify the text on first dropdown select a program name
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then First dropdown box "select a program name" text  should be present

  @Attendancedetail5
  Scenario: Verify the text on second dropdown select class  name
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Second dropdown box "select class name" text  should be present

  @Attendancedetail6
  Scenario: Verify the text on third dropdown select students
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Third dropdown box "select students" text  should be present

  @Attendancedetail7
  Scenario: Verify the text on fourth dropdown select attendance
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Fourth dropdown box "select attendance" text  should be present

  @Attendancedetail8
  Scenario: Verify all the text inside the dropdown box is gray color
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin  should text in gray color

  @Attendancedetail9
  Scenario: Verify save button is present
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see  save button in the class detail popup window

  @Attendancedetail10
  Scenario: Verify cancel button is present
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Admin should see  cancel button in the class detail popup window

  @Attendancedetail1
  Scenario: Verify order of the label in attendance details page
    Given Admin is in manage attendance page
    When Admin clicks + a new attendance button
    Then Order of the label should be Program name, Class Name, Student Name, Attendance, Attendance Date.
