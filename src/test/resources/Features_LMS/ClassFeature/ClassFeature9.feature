Feature: Pagination in manage class
Background: Logged on the LMS portal as Admin
            Admin click +Add New Class button after reaching to Manage class page
#82
Scenario: Verify sheet one is displayed on default in data table	
Given  Admin is on dashboard page after Login
When  Admin clicks "Class" button on the navigation bar 
Then 	Data table should display 1 page  when entries available
#83
Scenario: Verify  right arrow is enable when sheet one is displayed in data table	
Given Admin is on dashboard page after Login	
When  Admin clicks "Class" button on the navigation bar	
Then  Right arrow should be enabled in page one  when entries are more than 5 available
#84
Scenario:	 Verify  left arrow is disable when sheet one is displayed in data table	
Given 	Admin is on dashboard page after Login	
When Admin clicks "Class" button on the navigation bar	
Then Left arrow should be disabled in page one  when entries are more than 5 available
#85
Scenario: Verify  right arrow is enable when sheet two is displayed in data table when entries are more than 10		
Given Admin is on dashboard page after Login
When 	Admin clicks "Class" button on the navigation bar
Then 	Right arrow should be enabled in page two when entries are more than 10 available
#86
Scenario: Verify  left arrow is enable when sheet two is displayed in data table	
Given 	Admin is on dashboard page after Login	
When Admin clicks "Class" button on the navigation bar	
Then Left arrow should be enabled in page two 
#87
Scenario: Verify  right arrow is disable when sheet two is displayed in data table when entries are less than 10		
Given Admin is on dashboard page after Login	
When Admin clicks "Class" button on the navigation bar	
Then Data table should display  page 1  when entries are available
#88
Scenario: Verify pagination controls enabled		
Given Admin is on dashboard page after Login	
When Admin clicks "Class" button on the navigation bar	
Then When entries are more than 5 in data table pagination controls enabled
#89
Scenario: 	Verify pagination controls disabled		
Given Admin is on dashboard page after Login	
When Admin clicks "Class" button on the navigation bar	
Then When entries are less than 5 in data table pagination controls disabled
#90
Scenario Outline: Verify next page is enabled
Given 	Admin is in add class details popup window	
When Admin creates six new class from "<SheetName>" and <RowNumber>  
Then 	When total class entries above 5 next page is enabled ( On multiples of 5 new page will be enabled)
 Examples:
| SheetName | RowNumber |
| Class     |   1       |
#91
Scenario Outline: Verify next page is disabled		
Given Admin is in add class details popup window
When 	Admin creates less than or equal to five new class from "<SheetName>" and <RowNumber>  
Then 	When total class entries  5 or below next page is disabled
 Examples:
| SheetName | RowNumber |
| Class     |   1       |





