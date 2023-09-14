Feature:Delete Assignment Validation Part1

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 
#1
Scenario: Verify Delete Assignment alert
	Given Admin is in manage assignment page
		When Admin clicks delete button in data table row level	
		Then Admin should see dialog box
#2
Scenario: Verify accept enabled in alert
	Given Admin is in manage assignment page
		When Admin clicks delete button in data table row level
			Then Alert should have "Yes" button to accept 
			
#3
Scenario: Verify reject enabled in alert
	Given Admin is in manage assignment page
	When Admin clicks delete button in data table row level
	Then Alert should have "No" button to accept 