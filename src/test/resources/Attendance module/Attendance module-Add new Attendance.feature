Feature: Add new Attendance

  Background: Admin click +Add New Attendance button after reaching to Manage attendance page

  Scenario Outline: Validate admin able to create new attendance
    Given Admin is in  attendance details popup window
    When Admin fills values Programname ,classname,studentname,Attendance,attendancedate and click save "sheetname" from"<Sheetname>" and <Rownumber>2
    Then Status is from "Sheetname" and 2

  Scenario Outline: Validate admin able to create new attendance data without program name
    Given Admin is in  attendance details popup window
    When Admin fills values and click save without program name "sheetname" from"<Sheetname>" and <Rownumber> 2
    Then Status is status Program name is missing from "Sheetname" and 2

  Scenario Outline: Validate admin able to create new attendance data without class name
    Given Admin is in  attendance details popup window
    When Admin fills values  and click save  without class name "sheetname" from"<Sheetname>" and <Rownumber> 2
    Then Status is status  Class name is missing from "Sheetname" and 2

  Scenario Outline: Validate admin able to create new attendance data without student name
    Given Admin is in  attendance details popup window
    When Admin fills values and click save without student name "sheetname" from"<Sheetname>" and <Rownumber>  2
    Then Status is status  Student name is missing from "Sheetname" and 2

  Scenario Outline: Validate admin able to create new attendance data without attendances
    Given Admin is in  attendance details popup window
    When Admin fills values and click save without attendances "sheetname" from"<Sheetname>" and <Rownumber>2
    Then Status is status Attendance is missing from "Sheetname" and 2

  Scenario Outline: Validate admin able to create new attendance data without attendance date
    Given Admin is in  attendance details popup window
    When Admin fillsvalues and click save without attendancedate "sheetname" from"<Sheetname>" and <Rownumber>
    Then Status is  Attendancedateis missing from "Sheetname" and 2

    Examples: 
      | Sheetname         | Rownumber |
      | Attendance Detais |         2 |
