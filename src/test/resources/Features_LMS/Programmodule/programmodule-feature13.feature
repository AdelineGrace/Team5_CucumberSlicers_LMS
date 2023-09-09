Feature: Navigation Validation from Manage Program to other Pages

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar

#1
Scenario: Student link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Student link on Manage Program page
Then Admin is re-directed to Student page

#2
Scenario: Batch link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Batch link on Manage Program page
Then Admin is re-directed to Batch page

#3
Scenario: Class link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Class link on Manage Program page
 Then Admin is re-directed to Class page

#4
Scenario: User link on navigation bar
Given Admin is on Manage Program page
 When Admin clicks on User link on Manage Program page
Then Admin is re-directed to User page

#5
Scenario: Assignment link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Assignment link on Manage Program page
Then Admin is re-directed to Assignment page

#6
Scenario: Attendance link on navigation bar
Given Admin is on Manage Program page
When Admin clicks on Attendance link on Manage Program page
Then Admin is re-directed to Attendance page

#7
Scenario: Logout link on navigation bar 
Given Admin is on Manage Program page
When Admin clicks on Logout link on Manage Program page
Then Admin is re-directed to Login page