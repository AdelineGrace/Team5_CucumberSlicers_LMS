Feature: Add new user

Background: Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks "User" from navigation bar
Admin clicks "+ A New User" button

#1
Scenario: Check if the fields exist in pop
Given A new pop up with user details appears
Then The pop up should include the fields First Name,Middle name, Last Name, Location phone, email,linkedin Url,Undergraduate,postgraduate,time zone and user comments as text box User Role, Role status, visa status as drop down


#2
Scenario Outline: Check if Middle name, linkedIn url, email, user comments.under graduate,post graduate,time zone are optional 
Given A new pop up with user details appears
When Fill in all the fields except optional fields with valid values from "<SheetName>" <RowNumber> and click submit
Then The newly added user should be present in the data table in Manage User page
Examples:
|SheetName|RowNumber|
|User|2|

#3
Scenario: Check if the program details are added in data table
Given A new pop up with user details appears
When Fill in all the fields with valid values and click submit
Then The newly added user should be present in the data table in Manage User page

#4
Scenario Outline: Check for error messages for invalid fields
Given A new pop up with user details appears
When any of the fields have invalid values from "<SheetName>" and <RowNumber>
Then Error message should appear
Examples:
|SheetName|RowNumber|
|User|2|

#5
Scenario: Check for error messages for mandatory fields
Given A new pop up with user details appears
When Any of the mandatory fields are blank
Then Error message should appear