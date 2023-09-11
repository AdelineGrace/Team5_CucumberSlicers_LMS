Feature: Add New Class
Background: Admin logged into LMS portal and clicks class button on the navigation bar 
            Admin click +Add New Class button after reaching to Manage class page 
  
  #37
  Scenario: Validate all batch id is reflecting in the dropdown	
  Given Admin is in  class detail popup window
  When  Admin clicks  Batch ID dropdown	
  Then 	Batch id in the drop down should match with Batch id manage batch page table
  #38
  Scenario Outline:	 Validate admin able to add new class with valid data in mandatory fields
  Given Admin is in  class detail popup window
  When Admin enters all mandatory field values with valid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)from "<SheetName>" and <RowNumber> 	
  Then Admin should see new class details is added in the data table from "<SheetName>" and <RowNumber>
   Examples:
| SheetName | RowNumber |
| Class     |   1       |
  #39
  Scenario Outline: 	Validate admin able to add new class with invalid data in mandatory fields	
  Given Admin is in  class detail popup window	
  When Admin enters all mandatory field values with invalid data and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id, )from "<SheetName>" and <RowNumber>	
  Then Error message should appear in alert
  Examples:
| SheetName | RowNumber |
| Class     |   1       |
  #40
  Scenario Outline: 	Validate admin able to add new class with valid data  in all fields
  Given Admin is in  class detail popup window
  When 	Admin enters values in all fields with valid data and clicks save button (Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)from "<SheetName>" and <RowNumber>	
  Then Admin should see new class details is added in the data table from "<SheetName>" and <RowNumber>
   Examples:
| SheetName | RowNumber |
| Class     |   1       |
  #41
  Scenario Outline: 	Validate admin able to add new class with invalid data  in optional fields	
  Given Admin is in  class detail popup window
  When 	Admin enters with invalid data in optional fields and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)from "<SheetName>" and <RowNumber>
  Then 	Error message should appear in alert
   Examples:
| SheetName | RowNumber |
| Class     |   1       |
  #42
  Scenario Outline: Validate admin able to add new class missing Batch Id	
  Given 	Admin is in  class detail popup window
  When 	Admin enters  data missing value in Batch ID and clicks save button (No of Classes, Class Date, Staff Id)from "<SheetName>" and <RowNumber>
  Then 	Batch Id is missing
   Examples:
| SheetName | RowNumber |
| Class     |   1       |
  #43
  Scenario: 	Validate admin able to add new class missing No of Class	
  Given 	Admin is in  class detail popup window	
  When Admin enters data missing value in No of class and clicks save button (Batch ID ,Class Date, Staff Id, )	
  Then No of classes is missing
  #44
  Scenario: Validate admin able to add new class missing Class Date	
  Given Admin is in  class detail popup window	
  When Admin enters data missing value in  class date and clicks save button (Batch ID , No of Classes, Staff Id, )	
  Then class date is missing
  #45
  Scenario: Validate admin able to add new class missing staff id	
  Given Admin is in  class detail popup window
  When 	Admin enters data missing value in staff id and clicks save button (Batch ID , No of Classes, Class Date )	
  Then staff id is missing
  #46
  Scenario: 	Validate  admin able to add new class passing past date 	
  Given Admin is in  class detail popup window	
  When Admin enters passed date in the class date field and clicks save button ( Batch ID , No of Classes, Class Date, Staff Id)
  Then 	class cannot be  created for the passed date
  #47
  Scenario: Validate date picker
  Given Admin is in  class detail popup window	
  When Admin clicks date from date picker
  Then 	selected date should be their in class date text box
  #48 
  Scenario: Validate date picker should be correct format	
  Given Admin is in  class detail popup window	
  When Admin clicks date from date picker
  Then 	selected date should be in  mm/dd/yyyy format
  #49
  Scenario: Validate right arrow in data picker to navigate to next month
  Given Admin is in  class detail popup window	
  When Admin clicks right arrow in the date picker near month
  Then Next month calender should visible
  #50
  Scenario: 	Validate left arrow in data picker to navigate to previous month	
  Given Admin is in  class detail popup window	
  When Admin clicks left arrow in the date picker near month	
  Then previous month calender should visible
  #51
  Scenario: 	Validate current date is highlighted in the date picker	
  Given Admin is in class details popup window	
  When Admin clicks date picker button
  Then 	Admin should see current date is highled in the date picker
  #52
  Scenario: Validate selected date is highlighted in the date picker
  Given 	Admin is in class details popup window
  When 	Admin clicks date picker button and selects future date
  Then 	Admin should see selected date is highled in the date picker
  #53
  Scenario: Validate cancel button function in class details popup window	
  Given Admin is in  class detail popup window	
  When Admin clicks Cancel button without entering values in the fields	
  Then Admin should land on Manage Class page
  #54
  Scenario: Validate cancel button function in class details popup window with values in field
  Given 	Admin is in  class detail popup window	
  When Admin clicks Cancel button entering values in the fields	
  Then Admin should land on Manage Class Page and validate new class is not created in the data table
 
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  
  
  
  
            