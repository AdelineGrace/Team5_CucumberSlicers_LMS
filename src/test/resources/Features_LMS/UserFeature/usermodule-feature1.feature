Feature: User page validation

Background: Logged on the LMS portal

#1
Scenario Outline: Validate landing in User page
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Admin should see the Manage User in the URL from "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|User|2|
#2
Scenario: Validate header in the User Page
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Admin should see the "Manage User" in the header
#3
Scenario Outline: Validate pagination in the User Page
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Admin should see the pagination controls under the data table as"<Sheetname>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|4|
#4
Scenario: Validate data table headers in the User Page
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Admin Should see the data table with headers Id, Name, location, Phone Number, Edit/Delete
#5
Scenario: Validate Delete button in User Page
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Admin should be able to see the "Delete" icon button that is disabled
#6
Scenario: Validate "+ A New user" button in User Page
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Admin should be able to see the "+ A New User" button
#7
Scenario: Validate "+ Assign staff"  button in User page
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Admin should be able to see the "+ Assign staff" button
#8
Scenario: Validate search box in User page
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Admin should be able to see the search text box
#9
Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks User from navigation bar
Then Each row in the data table should have a checkbox
#10
Scenario: Validate pop up for adding user
Given Admin is on dashboard page after Login and Admin clicks "User" from navigation bar
When Admin clicks "+ A New User" button
Then A new pop up with User details appears

