Feature: Navigation Validation from Manage Program to other Pages

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

#1
Scenario Outline: Student link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Student link on Manage Program page
Then Admin is re-directed to Student page on "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|2|

#2
Scenario Outline: Batch link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Batch link on Manage Program page
Then Admin is re-directed to Batch page on "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|2|

#3
Scenario Outline: Class link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Class link on Manage Program page
 Then Admin is re-directed to Class page on "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|2|

#4
Scenario Outline: User link on navigation bar
Given Admin is on Manage Program page
 When Admin clicks on User link on Manage Program page
Then Admin is re-directed to User page on "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|2|

#5
Scenario Outline: Assignment link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Assignment link on Manage Program page
Then Admin is re-directed to Assignment page on "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|2|

#6
Scenario Outline: Attendance link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Attendance link on Manage Program page
Then Admin is re-directed to Attendance page on "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|2|

#7
Scenario Outline: Logout link on navigation bar 
Given Admin is on Manage Program page
When Admin clicks on Logout link on Manage Program page
Then Admin is re-directed to Login page on "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|2|