Feature: Delete user

Background: Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks "User" from navigation bar

Scenario: Validate row level delete icon
Given The delete icon on row level in data table is enabled
When Admin clicks the delete icon
Then Alert appears with yes and No option

Scenario Outline: Validate accept alert
Given Admin clicks the delete icon
When Admin click yes option
Then User deleted alert pops and user from "<SheetName>" and <RowNumber> is no more available in data table
Examples:
|SheetName|RowNumber|
|User|2|

Scenario Outline: Validate reject alert
Given Admin clicks the delete icon
When Admin click No option
Then User from "<SheetName>" and <RowNumber> is still listed in data table
Examples:
|SheetName|RowNumber|
|User|3|