Feature: Navigation function validation from manage class page to other pages  
Background: Admin is manage class page after logged in

#92
Scenario:	Verify admin is able to navigate from manage class to student page	
Given Admin is in Manage class page	
When 	Admin clicks Student button in the navigation bar	
Then Admin should able to land on student page
#93
Scenario: Verify admin is able to navigate from manage class to program page	
Given Admin is in Manage class page
When 	Admin clicks  Program button in the navigation bar	
Then Admin should able to land on program page
#94
Scenario: Verify admin is able to navigate from manage class to batch page	
Given 	Admin is in Manage class page	
When Admin clicks Batch button in the navigation bar	
Then Admin should able to land on batch page
#95
Scenario: Verify admin is able to navigate from manage class to user page	
Given Admin is in Manage class page	
When Admin clicks User button in the navigation bar	
Then Admin should able to land on user page
#96
Scenario:	 Verify admin is able to navigate from manage class to assignment page	
Given 	Admin is in Manage class page	
When Admin clicks Assignment button in the navigation bar	
Then Admin should able to land on Assignment page
#97 
Scenario: Verify admin is able to navigate from manage class to attendance page
Given Admin is in Manage class page	
When Admin clicks Attendance button in the navigation bar
Then 	Admin should able to land on Attendance page
#98
Scenario: 	Verify adminshould able to do logout function from manage class		
Given Admin is in Manage class page	
When Admin clicks Logout button in the navigation bar	
Then Admin should able to land on login page






 