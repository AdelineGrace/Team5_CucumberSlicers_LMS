Feature: Delete multiple user

Background: Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks "User" from navigation bar

Scenario: Validate the delete icon below the header 
Given None of the checkboxes in data table are selected
Then The delete icon under the Manage User header should be disabled

Scenario Outline: Check for single row delete
Given One of the checkbox/ row is selected
When Click delete icon below Manage User header
Then The respective row from "<SheetName>" and <RowNumber> in the data table is deleted
Examples:
|SheetName|RowNumber|
|User|2|

Scenario Outline: Check for multi row delete
Given Two or more checkboxes row is selected
When Click delete icon below Manage User header
Then The respective row from "<SheetName>" and <RowNumber> in the data table is deleted
Examples:
|SheetName|RowNumber|
|User|2|