Feature:Pagination in manage assignment Part1

Background: Admin is manage assignment page after logged in
#1
Scenario: Verify sheet one is displayed on default in data table	
Given Admin is on dashboard page after Login	
When Admin clicks "Assignment" button on the navigation bar	
Then  Data table should display 1 page when entries available

#2
Scenario: Verify right arrow is enable when sheet one is displayed in data table	
Given Admin is on dashboard page after Login	
When Admin clicks "Assignment" button on the navigation bar	
Then Right arrow should be enabled in page one when entries are more than 5 available

#3
Scenario: Verify left arrow is disable when sheet one is displayed in data table
	Given Admin is on dashboard page after Login
		When Admin clicks "Assignment" button on the navigation bar	
		Then Left arrow should be disabled in page one when entries are more than 5 available
		
#4
Scenario: Verify right arrow is enable when sheet two is displayed in data table when entries are more than 10	
Given Admin is on dashboard page after Login	
When Admin clicks "Assignment" button on the navigation bar	
Then Right arrow should be enabled in page two when entries are more than 10 available

#5
Scenario: Verify left arrow is enable when sheet two is displayed in data table
	Given Admin is on dashboard page after Login	
	When Admin clicks "Assignment" button on the navigation bar	
	Then Left arrow should be enabled in page two
	
#6
Scenario: Verify right arrow is disable when sheet two is displayed in data table when entries are less than 10	
Given Admin is on dashboard page after Login	
When Admin clicks "Assignment" button on the navigation bar
Then Data table should display  page 1  when entries available
	
#7
Scenario Outline: Verify pagination controls enabled
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" button on the navigation barfrom "<SheetName>" and <RowNumber>
Then When entries are more than 5 in data table pagination controls enabled
 Examples:
| SheetName | RowNumber |
| Assignment     |   1       |	

#8
Scenario Outline: Verify pagination controls disabled	
Given Admin is on dashboard page after Login	
When Admin clicks "Assignment" button on the navigation bar	from "<SheetName>" and <RowNumber>
Then When entries are less than 5 in data table pagination controls disabled
 Examples:
| SheetName | RowNumber |
| Assignment     |   1       |	


