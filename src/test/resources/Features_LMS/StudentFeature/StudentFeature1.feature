Feature: Student Page verification

Background: Logged on the LMS portal as Admin

@StudentModule_Main1
Scenario: Validate the title of the page
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see the Student details Page Title

@StudentModule_Main2
Scenario: Validate response time from dashboard page to student page
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Maximum navigation time in milliseconds, defaults to 30 seconds

@StudentModule_Main3
Scenario: Validate the broken link
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then HTTP response >= 400 Then the link is broken

@StudentModule_Main4
Scenario: Verify LMS title
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see LMS -Learning management system as title Verify LMS title

@StudentModule_Main5
Scenario: Verify the alignment of the Student detail title
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Student Detail title should be in centre of the page

@StudentModule_Main6
Scenario: Validate drop down is present in the page
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then 2 dropdowns should be present in the page

@StudentModule_Main7
Scenario: Validate search bar in select student name drop down
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see search box inside the drop down

@StudentModule_Main8
Scenario: Validate search bar in select batch id drop down
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see search box inside batch id drop down

@StudentModule_Main9
Scenario: Validate text spelling student name
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see correct spelling select student name

@StudentModule_Main10
Scenario: Validate text spelling select batch id
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see correct spelling select batch id text

@StudentModule_Main11
Scenario: Validate only numbers inside select batch id
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see only numbers inside batch id drop down

@StudentModule_Main12
Scenario: Validate gray color in student name drop down
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see select student name in gray color

@StudentModule_Main13
Scenario: Validate gray color in student name (batch ID) drop down
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see select batch ID in gray color

@StudentModule_Main14
Scenario: Validate first drop down label is select student name
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see select student name in first

@StudentModule_Main15
Scenario: Validate second drop down label is select batch id
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should see select batch id in second

@StudentModule_Main16
Scenario: Validate scroll down inside student name dropdown
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should able to scroll down to select the name

@StudentModule_Main17
Scenario: Validate scroll down inside batch id dropdown
	Given Admin is on dashboard page after Login
	When Admin clicks Student on the navigation bar
	Then Admin should able to scroll down to select the batch id
