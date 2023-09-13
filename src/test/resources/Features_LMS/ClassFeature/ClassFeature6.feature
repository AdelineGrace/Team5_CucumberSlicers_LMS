Feature: Delete class validation
Background: Admin logged into LMS portal and clicks class button on the navigation bar 
            Admin clicks row level delete button after landing to manage class page
#68 
Scenario: Verify Delete class alert	
Given Admin is in Manage class page
When 	Admin clicks delete button in data table row level
Then Admin should see alert
#69
Scenario: 	Verify  accept enabled in alert	
Given Admin is in Manage class page	
When Admin clicks delete button in data table row level	
Then Alert should have "yes" button to accept 
#70
Scenario: 	Verify reject enabled in alert	
Given Admin is in Manage class page
When 	Admin clicks delete button in data table row level	
Then Alert should have "No" button to reject
#71
Scenario Outline: Validate accept in alert	
Given Admin is in delete alert	
When Admin clicks yes button	
Then Success message and validate particular class details are deleted from the data table from "<SheetName>" and <RowNumber>
Examples:
| SheetName | RowNumber |
| Class     |   1       | 
#72
Scenario Outline: Validate reject in alert	
Given Admin is in delete alert	
When Admin clicks no button	
Then Admin should land on manage class page and validate particular class details are not deleted from the data table from "<SheetName>" and <RowNumber>
Examples:
| SheetName | RowNumber |
| Class     |   1       | 


            
