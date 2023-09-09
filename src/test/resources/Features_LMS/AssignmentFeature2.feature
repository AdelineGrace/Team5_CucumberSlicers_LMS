Feature: Manage Program Validation part2

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 

#1
Scenario: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment name into search box  
Then Displays entries with that assignment name

#2
Scenario: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment  name is not existing the table into search box 
Then Displays empty details in the data table

#3
Scenario: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment description into search box 
Then Displays entries with that assignment description

#4
Scenario: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment description which is not existing the table into search box 
Then Displays empty details in the data table

#5
Scenario: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment due date into search box  
Then Displays entries with that assignment due date

#6
Scenario: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment due date which is not existing the table into search box
Then  Displays empty details in the data table

#7
Scenario: Validate search box function
Given Admin is on manage assignment page
When Admin enters grade value  into search box 
Then Displays entries with that assignment  grade

#8
Scenario: Validate search box function
Given Admin is on manage assignment page
When Admin enters grade value which is not existing the table into search box 
Then Displays empty details in the data table