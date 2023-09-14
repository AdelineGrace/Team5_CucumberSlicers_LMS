Feature:Edit assignment Validation Part2

Background: Admin clicks Edit button in manage assignment after reaching manage assignment page
#1
Scenario Outline: Validate admin able to update assignment with valid data in mandatory fields
Given Admin is in Edit assignment detail popup window	
When Admin enters all mandatory field values with valid data and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment due date)from "<SheetName>" and <RowNumber>
Then Admin should see updated assignment details is added in the data table "<SheetName>" and <RowNumber>
Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#2		
Scenario Outline: Validate admin able to update assignment with invalid data in mandatory fields
Given Admin is in Edit assignment detail popup window	
	When Admin enters all mandatory field values with invalid data and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment due date )from "<SheetName>" and <RowNumber>
	Then Error message should appear in alert
	Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
	
#3
Scenario Outline: Validate admin able to update assignment with valid data in all fields
	Given Admin is in Edit assignment detail popup window	
	When Admin enters values in all fields with valid data and clicks save button (Program name, batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)from "<SheetName>" and <RowNumber>	
	Then Admin should see updated assignment details is added in the data table "<SheetName>" and <RowNumber>
	Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
	
#4
Scenario Outline: Validate admin able to update assignment with invalid data in optional fields
	Given Admin is in Edit assignment detail popup window
		When Admin enters with invalid data in optional fields and clicks save button (Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)	
		Then Error message should appear in alert
		Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
		
#5
Scenario Outline: Validate admin able to update assignment missing program name	
Given Admin is in Edit assignment detail popup window	
When Admin enters data missing value in program name and clicks save button (batch number,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)	from "<SheetName>" and <RowNumber>
Then  Program Name is missing
Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#6
Scenario Outline: Validate admin able to update assignment missing batch number	
Given Admin is in Edit assignment detail popup window	
When Admin enters data missing value in Batch number and clicks save button (Program name,Assignment Name, Assignment Description, grade by, Assignment due date, Assignment File1, Assignment file 2, Assignment file 3, Assignment file 4, Assignment file 5)from "<SheetName>" and <RowNumber>	
Then  Batch number is missing
Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#7
Scenario Outline: Validate admin able to update assignment missing assignment name	
Given Admin is in Edit assignment detail popup window
	When Admin enters data missing value in Assignment name and clicks save button (Program name, batch number,Assignment Name, grade by, Assignment Due date )from "<SheetName>" and <RowNumber>
		Then Assignment name is missing
		Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
		
#8
Scenario Outline: Validate admin able to update assignment missing due date	
Given Admin is in Edit assignment detail popup window
	When Admin enters data missing value in Assignment due date and clicks save button ( Program name, batch number,Assignment Name, grade by)	from "<SheetName>" and <RowNumber>
Then  Assignment Due date is missing
	Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
	
#9
Scenario Outline: Validate admin able to update assignment missing grade by	
Given Admin is in Edit assignment detail popup window
	When Admin enters data missing value in  grade by and clicks save button (Program name, batch number,Assignment Name, Assignment due date)	from "<SheetName>" and <RowNumber>
	Then grade byis missing
	Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
	
#10
Scenario Outline: Validate admin able to update assignment passing past date	
Given Admin is in Edit assignment detail popup window
	When Admin enters passed date in the due date field and clicks save button ( Program name, batch number,Assignment Name, grade by, Assignment Due date )	from "<SheetName>" and <RowNumber>
	Then Assignment cannot be created for the passed date
	Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
	
#11
Scenario Outline: Validate cancel button function in assignment details popup window
	Given Admin is in Edit assignment detail popup window
		When Admin clicks Cancel button without entering values in the fieldsfrom "<SheetName>" and <RowNumber>
			Then Admin should land on manage assignment page"<SheetName>" and <RowNumber>
			Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
			
#12
Scenario Outline: Validate cancel button function in assignment details popup window with values in field	
Given Admin is in Edit assignment detail popup window	
When Admin clicks Cancel button entering values in the fields	from "<SheetName>" and <RowNumber>
Then Admin should land on manage assignment Page and validate new assignment is not created in the data table "<SheetName>" and <RowNumber>
Examples:
| SheetName | RowNumber |
| Assignment     |   1       |
