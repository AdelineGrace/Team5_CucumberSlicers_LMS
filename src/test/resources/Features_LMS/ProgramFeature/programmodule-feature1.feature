Feature: Manage Program Validation part1

Background: Logged on the portal as Admin

#1
Scenario Outline: Validate landing in Program page
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see URL with Manage Class from "<SheetName>" and <RowNumber>
Examples:
|SheetName|RowNumber|
|Program|2|


#2
Scenario: Validate the heading
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see a heading with text "Manage Program" on the page

#3
Scenario Outline: Validate the text and pagination icon below the data table
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the text as"<Sheetname>" and <RowNumber> along with Pagination icon below the table
Examples:
|Sheetname|RowNumber|
|Program|2|


#4
Scenario Outline: Validate the footer
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the footer as on "<Sheetname>" and <RowNumber>
Examples:
|Sheetname|RowNumber|
|Program|2|

#5
Scenario: Validating the default state of Delete button
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see a Delete button on the top left hand side as Disabled

#6
Scenario: Validate Add New Program 
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see a "+ A New Program" button on the program page above the data table

#7
Scenario: Validate that number of records (rows of data in the table) displayed
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the number of records displayed on the page are 5

#8
Scenario Outline: Verify data table on the Program page
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see data table on the Manage Program Page with following column headers

#9
Scenario: Verify Sort arrow icon on the data table
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the sort arrow icon beside to each column header except Edit and Delete 

#10
Scenario: Verify Check box on the data table
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see check box on the left side in all rows of the data table 

#11
Scenario: Verify Edit and Delete buttons
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see the Edit and Delete buttons on each row of the data table

#12
Scenario: Verify Search bar on the Program page
Given Admin is on dashboard page after Login
When Admin clicks "Program" on the navigation bar
Then Admin should see Search bar on program page












