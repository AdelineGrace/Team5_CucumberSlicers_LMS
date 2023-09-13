Feature: Navigation Validation from student page to other Pages

Background: Admin is logged in and on the student Details page

@StudentModule_Navigation1
Scenario: Program link on navigation bar
	Given Admin is on student details page
	When Admin clicks on program link on student page
	Then Admin is redirected to Program page

@StudentModule_Navigation2
Scenario: Batch link on navigation bar
	Given Admin is on student details page
	When Admin clicks on Batch link on student page
	Then Admin is redirected to Batch page

@StudentModule_Navigation3
Scenario: Class link on navigation bar
	Given Admin is on student details page
	When Admin clicks on Class link on student page
	Then Admin is redirected to Class page

@StudentModule_Navigation4
Scenario: User link on navigation bar
	Given Admin is on student details page
	When Admin clicks on User link on student page
	Then Admin is redirected to User page

@StudentModule_Navigation5
Scenario: Assignment link on navigation bar
	Given Admin is on student details page
	When Admin clicks on Assignment link on student page
	Then Admin is redirected to Assignment page

@StudentModule_Navigation6
Scenario: Attendance link on navigation bar
	Given Admin is on student details page
	When Admin clicks on Attendance link on student page
	Then Admin is redirected to Attendance page

@StudentModule_Navigation7
Scenario: Logout link on navigation bar
	Given Admin is on student details page
	When Admin clicks on Logout link on student page
  Then Admin is redirected to Login page
  