Feature:Delete Multiple Class Validation Part3

Background: Admin clicks delete button under header after selecting the multiple check box in the data table
#1
Scenario Outline: Verify accept alert in delete multiple class function by selecting multiple checkbox
	Given Admin is in delete alert
		When Admin clicks yes button	
		Then Redirected to assignment page and selected assignment details are deleted from the data tablefrom "<SheetName>" and <RowNumber>
		 Examples:
    | SheetName | RowNumber |
| Assignment    |   1       |
		
#2
Scenario Outline: Verify reject alert in delete multiple class function by selecting multiple checkbox
	Given Admin is in delete alert
		When Admin clicks no button	
		Then Redirected to assignment page and selected assignment details are not deleted from the data table from "<SheetName>" and <RowNumber>
		 Examples:
    | SheetName | RowNumber |
| Assignment    |   1       |
		