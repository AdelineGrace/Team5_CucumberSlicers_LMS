Feature: Sorting(Data Ordering) Validation

Background: Admin is on Manage Program Page after clicks Program on the navigation bar

#1
Scenario: Validates Sorting(data ordering) on the Program Data table
Given Admin is on Manage Program page
When Admin clicks the sort icon of program name column
Then The data get sorted on the table based on the program name column values in ascending order

#2
Scenario: Validates Sorting(data ordering) on the Program Data table
Given The data is in the ascending order on the table based on Program Name column
When Admin clicks the sort icon of program name column
Then The data get sorted on the table based on the program name column values in descending order

#3
Scenario: Validates Sorting(data ordering) on the Program Data table
Given Admin is on Manage Program page
When Admin clicks the sort icon of program Desc column
Then The data get sorted on the table based on the program description column values in ascending order

#4
Scenario: Validates Sorting(data ordering) on the Program Data table
Given The data is in the ascending order on the table based on Program Description column
When Admin clicks the sort icon of program Desc column
Then The data get sorted on the table based on the program description column values in descending order

#5
Scenario: Validates Sorting(data ordering) on the Program Data table
Given Admin is on Manage Program page
When Admin clicks the sort icon of program Status column
Then The data get sorted on the table based on the program status column values in ascending order

#6
Scenario: Validates Sorting(data ordering) on the Program Data table
Given The data is in the ascending order on the table based on Program Status column
When Admin clicks the sort icon of program Status column
Then The data get sorted on the table based on the program status column values in descending order