Feature:Delete Multiple Class Validation Part1

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 
#1
Scenario: Verify delete multiple class button is enabled
	Given Admin is in manage assignment page
		When Admin clicks single row level check box in the data table
			Then Admin should see delete icon below the header is enabled
			

