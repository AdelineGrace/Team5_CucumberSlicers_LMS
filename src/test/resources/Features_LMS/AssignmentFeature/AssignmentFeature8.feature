Feature:Delete  Assignment Validation Part2

Background: Admin clicks row level delete button after landing to manage assignment page

#4
Scenario: Validate accept in alert	
Given Admin is in delete alert	
When Admin clicks yes button	
Then Redirected to assignment page and selected assignment details are deleted from the data table

#5
Scenario: Validate reject in alert
	Given Admin is in delete alert	
	When Admin clicks no button	
	Then Redirected to assignment page and selected assignment details are not deleted from the data table
