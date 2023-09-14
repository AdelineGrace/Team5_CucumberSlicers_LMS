Feature: Edit assignment Validation Part1

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 
#1
Scenario: Verify Edit assignment popup window
	Given Admin is in manage assignment page	
	When Admin clicks Edit button in data table	
	Then Edit popup window appears with heading Assignment Details
	
#2	
Scenario: Verify values in popup window
	Given Admin is in manage assignment page
		When Admin clicks Edit button from one of the row in data table	
		Then Edit popup window appears with same row values in the all fields
