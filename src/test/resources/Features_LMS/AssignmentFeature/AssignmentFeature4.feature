Feature:Add new Assignment

Background: Admin click +Add new assignment button after reaching to manage assignment page
#1
Scenario Outline: Validate admin able to add new assignment with valid data in mandatory fields
Given Admin is in assignment details popup window	
When Admin enters all mandatory field values with valid data and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment due date)from "<SheetName>" and <RowNumber>
Then Admin should see new class details is added in the data table from "<SheetName>" and <RowNumber>
   Examples:
| SheetName | RowNumber |
| Assignment    |   1       |

#2
Scenario Outline: Validate admin able to add new assignment with invalid data in mandatory fields	
 Given Admin is in assignment details popup window
	When Admin enters all mandatory field values with invalid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date )from "<SheetName>" and <RowNumber>
	Then Error message should appear in alert
	  Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
	
#3	
Scenario Outline: Validate admin able to add new assignment with valid data in all fields	
Given Admin is in assignment details popup window	
When Admin enters values in all fields with valid data and clicks save button Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file2, Assignment file3, Assignment file4, Assignment file5 from "<SheetName>" and <RowNumber>	
Then Admin should see new class details is added in the data table from "<SheetName>" and <RowNumber>
  Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#4
Scenario Outline: Validate admin able to add new assignment with invalid data in optional fields
Given Admin is in assignment details popup window
When Admin enters with invalid data in optional fields and clicks save button Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5 from "<SheetName>" and <RowNumber>	
Then  Error message should appear in alert
	  Examples:
| SheetName     | RowNumber |
| Assignment    |   1       |	
#5		
Scenario Outline: Validate admin able to add new assignment missing program name
Given Admin is in assignment details popup window	
When Admin enters data missing value in program name and clicks save button batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5	from "<SheetName>" and <RowNumber>
Then Program Name is missing
 Examples:
| SheetName | RowNumber |
|Assignment    |   1       |		
#6

Scenario Outline: Validate admin able to add new assignment missing batch number	
Given Admin is in assignment details popup window
When Admin enters data missing value in Batch number and clicks save button Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5 from "<SheetName>" and <RowNumber>	
Then Batch number is missing
 Examples:
| SheetName | RowNumber |
| Assignment    |   1       |	

#7
Scenario Outline: Validate admin able to add new assignment missing assignment name
	Given Admin is in assignment details popup window	
	When Admin enters data missing value in Assignment name and clicks save button Program name, batch number,Assignment Name, grade by, Assignment Due date from "<SheetName>" and <RowNumber>
	Then Assignment name is missing
	 Examples:
	| SheetName | RowNumber |
| Assignment    |   1       |	

#8
Scenario Outline: Validate admin able to add new assignment missing due date
	Given Admin is in assignment details popup window
		When Admin enters data missing value in Assignment due date and clicks save button Program name, batch number,Assignment Name, grade by	from "<SheetName>" and <RowNumber>
		Then  Assignment Due date is missing
 Examples:
| SheetName     | RowNumber |
| Assignment    |   1       |	

#9
Scenario Outline: Validate admin able to add new assignment missing grade by	
Given Admin is in assignment details popup window
	When Admin enters data missing value in  grade by and clicks save button Program name, batch number,Assignment Name, Assignment due date from "<SheetName>" and <RowNumber>
	Then grade byis missing
	 Examples:
| SheetName     | RowNumber |
| Assignment    |   1       |	

#10
Scenario Outline: Validate admin able to add new assignment passing past date	
Given Admin is in assignment details popup window
	When Admin enters passed date in the due date field and clicks save button Program name, batch number,Assignment Name, grade by, Assignment Due date from "<SheetName>" and <RowNumber>	
	Then Assignment cannot be created for the passed date
	 Examples:
	| SheetName | RowNumber |
| Assignment    |   1       |	
	
#11
Scenario Outline: Validate date picker	
Given Admin is in assignment details popup window
	When Admin clicks date from date picker	from "<SheetName>" and <RowNumber>
	Then selected date should be their in class date text box
	 Examples:
	| SheetName | RowNumber |
| Assignment    |   1       |	
#12
Scenario Outline: validate date picker should be correct format
	Given Admin is in assignment details popup window	
	When Admin clicks date from date picker	from "<SheetName>" and <RowNumber>
	Then selected date should be in  mm/dd/yyyy format
	 Examples:
	| SheetName | RowNumber |
| Assignment    |   1       |	
	
#13
Scenario: Validate right arrow in data picker to navigate to next month
	Given Admin is in assignment details popup window	
	When Admin clicks right arrow in the date picker near month	
	Then Next month calender should visible
	 

#14
Scenario: Validate left arrow in data picker to navigate to previous month
	Given Admin is in assignment details popup window	
	When Admin clicks left arrow in the date picker near month	
	Then previous month calender should visible
	
#15
Scenario: Validate current date is highlighted in the date picker
	Given Admin is in assignment details popup window	
	When Admin clicks date picker button
		Then Admin should see current date is highlighted in the date picker
		
#16
Scenario: Validate selected date is highlighted in the date picker
	Given Admin is in assignment details popup window	
	When Admin clicks date picker button and selects future date	
	Then Admin should see selected date is highlighted in the date picker
	
#17
Scenario Outline: Validate cancel button function in assignment details popup window
	Given Admin is in assignment details popup window
		When Admin clicks Cancel button without entering values in the fields 
		Then Admin should land on manage assignment page "<SheetName>" and <RowNumber>
		 Examples:
| SheetName     | RowNumber |
| Assignment    |   1       |	
#18
Scenario Outline: Validate cancel button function in assignment details popup window with values in field	
Given Admin is in assignment details popup window	
When Admin clicks Cancel button entering values in the fields from "<SheetName>" and <RowNumber>
	Then Admin should land on manage assignment Page and validate new assignment is not created in the data table from "<SheetName>" and <RowNumber>
	 Examples:
| SheetName | RowNumber |
| Assignment    |   1       |	
