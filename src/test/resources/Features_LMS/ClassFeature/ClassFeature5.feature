@tag
Feature: Edit class Validation
Background:  Admin logged into LMS portal and clicks class button on the navigation bar 
             Admin clicks Edit button in manage class after reaching manage class page
 #55           
Scenario: Verify Edit class popup window	
Given Admin is in Manage class page
When 	Admin clicks Edit button in data table
Then 	Edit popup window appears with heading Class Details
#56
Scenario: 	Verify values in popup window	
Given Admin is in Manage class page	
When  Admin clicks Edit button from one of the row in data table 
Then 	Edit popup window appears with same row values in the all fields
#57
Scenario Outline: 	Validate admin able to update class with valid data in mandatory fields
Given 	Admin is in  Edit class detail popup window
When  Admin enters all mandatory field values with valid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)from "<SheetName>" and <RowNumber> 
Then 	Admin should see particular class details is updated in the data table "<SheetName>" and <RowNumber> 
 Examples:
| SheetName | RowNumber |
| Class     |   1       |
#58
Scenario Outline: Validate admin able to  update class with invalid data in mandatory fields	
Given Admin is in  Edit class detail popup window	
When Admin enters all mandatory field values with invalid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id, )from "<SheetName>" and <RowNumber> 
Then 	Error message should appear in alert
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#59
Scenario Outline: Validate admin able to  update class with valid data  in all fields	
Given Admin is in  Edit class detail popup window	
When Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)from "<SheetName>" and <RowNumber> 	
Then Admin should see particular class details is updated in the data table "<SheetName>" and <RowNumber> 
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#60
Scenario Outline: Validate admin able to  update  class with invalid data  in all fields	
Given Admin is in  Edit class detail popup window
When 	Admin enters with invalid data in optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)from "<SheetName>" and <RowNumber> 	
Then Error message should appear in alert
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#61
Scenario Outline: Validate admin able to update class missing Batch Id	
Given Admin is in  Edit class detail popup window
When 	Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id)from "<SheetName>" and <RowNumber> 	
Then 	Batch Id is missing
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#62
Scenario Outline: 	Validate admin able to update  class missing No of Class	
Given Admin is in  Edit class detail popup window	
When Admin enters data missing value in No of class and clicks save button Batch ID ,Class Date, Staff Id from "<SheetName>" and <RowNumber> 		
Then No of classes is missing
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#63
Scenario Outline: Validate admin able to update class missing Class Date
Given 	Admin is in  Edit class detail popup window	
When Admin enters data missing value in  class date and clicks save button (Batch ID , No of Classes, Staff Id, )from "<SheetName>" and <RowNumber> 	
Then 	class date is missing
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#64
Scenario Outline: Validate admin able to update class missing staff id	
Given Admin is in  Edit class detail popup window	
When Admin enters data missing value in staff id and clicks save button (Batch ID , No of Classes, Class Date )from "<SheetName>" and <RowNumber> 	
Then staff id is missing
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#65
Scenario Outline: Validate  admin able to update class passing past date 	
Given Admin is in  Edit class detail popup window	
When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)from "<SheetName>" and <RowNumber> 
Then 	class cannot be updated for the passed date
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#66
Scenario Outline: Validate cancel button function in Edit class details popup window
Given 	Admin is in  Edit class detail popup window	
When Admin clicks Cancel button without entering values in the fields	
Then Admin should land on Manage Class page from "<SheetName>" and <RowNumber> 
Examples:
| SheetName | RowNumber |
| Class     |   1       |
#67
Scenario Outline: Validate cancel button function in Edit class details popup window with values in field	
Given Admin is in  Edit class detail popup window	
When Admin clicks Cancel button entering values in the fields	"<SheetName>" and <RowNumber> 
Then Admin should land on Manage Class Page and validate particular class details are not changed  in the data table from "<SheetName>" and <RowNumber>
Examples:
| SheetName | RowNumber |
| Class     |   1       |











             