Feature: Navigation function validation from manage assignment page to other pages 

Background:Admin is manage assignment page after logged in

#1
Scenario: Verify admin is able to navigate from manage assignment to student page	
Given Admin is in manage assignment page	
When Admin clicks  Student button in the navigation bar	
Then Admin should able to land on student page

#2
Scenario: Verify admin is able to navigate from manage assignment to program page	
Given Admin is in manage assignment page
	When Admin clicks  Program button in the navigation bar	
	Then Admin should able to land on Program page

#3
Scenario: Verify admin is able to navigate from manage assignment to batch page
	Given Admin is in manage assignment page
		When Admin clicks  Batch button in the navigation bar
			Then Admin should able to land on Batch page
			
#4
Scenario: Verify admin is able to navigate from manage assignment to user page
	Given Admin is in manage assignment page	
	When Admin clicks  User button in the navigation bar	
	Then Admin should able to land on user page
	
#5
Scenario: Verify admin is able to navigate from manage assignment to assignment page
	Given Admin is in manage assignment page	
	When Admin clicks  Class button in the navigation bar
		Then Admin should able to land on class page
		
#6
Scenario: Verify admin is able to navigate from manage assignment to attendance page
	Given Admin is in manage assignment page
		When Admin clicks  Attendance button in the navigation bar
			Then Admin should able to land on Attendence page
			
#7
Scenario: Verify admin should able to do logout function from manage assignment	
Given Admin is in manage assignment page	
When Admin clicks Logout button in the navigation bar
	Then Admin should able to land on login page
	
