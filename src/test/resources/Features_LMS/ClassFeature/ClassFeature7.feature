Feature: Delete multiple class validation
Background: Admin logged into LMS portal and clicks class button on the navigation bar 
            Admin clicks delete button under header after selecting the check box in the data table
            Admin clicks delete button under header after selecting the multiple check box in the data table
#73
Scenario: Verify delete multiple class  button is enabled	
Given  Admin is in Manage class page
When 	Admin clicks single  row level check box in the data table	
Then Admin should see delete icon below the header is enabled
#74
Scenario: verify tick mark is visible after clicking on check box	
Given 	Admin is in Manage class page	
When Admin clicks single  row level check box in the data table	
Then Admin should see tick mark in check box 
#75
Scenario: verify admin able to click multiple check box		
Given Admin is in Manage class page	
When Admin clicks multiple row level check box in the data table	
Then Admin should see tick mark in check box  of the selected rows
#76
Scenario Outline: Verify accept alert in delete multiple class function by selecting single checkbox	
Given Admin is in delete alert
When 	Admin clicks yes button	
Then 	Success message and validate particular class details are deleted from the data table from "<SheetName>" and <RowNumber>
    Examples:
| SheetName | RowNumber |
| Class     |   1       |
#77
Scenario Outline: Verify reject alert in delete multiple class function by selecting single checkbox	
Given Admin is in delete alert	
When  Admin clicks no button	
Then  Admin should land on manage class page and validate particular class details are not deleted from the data table from "<SheetName>" and <RowNumber>
    Examples:
| SheetName | RowNumber |
| Class     |   1       |
#78
Scenario Outline: 	Verify accept alert in delete multiple class function by selecting multiple checkbox	
Given Admin is in delete alert	
When Admin clicks yes button	
Then Admin should land on manage class page and validate particular classes details are deleted from the data table from "<SheetName>" and <RowNumber>
    Examples:
| SheetName | RowNumber |
| Class     |   1       |
#79
Scenario Outline: Verify reject alert in delete multiple class function by selecting multiple checkbox
Given 	Admin is in delete alert	
When    Admin clicks no button	
Then    Admin should land on manage class page and validate particular classes details are not deleted from the data table from "<SheetName>" and <RowNumber>
    Examples:
| SheetName | RowNumber |
| Class     |   1       |






            