Feature: Manage Program Validation part2

Background: Logged on the portal as Admin
          Admin is on dashboard page after Login and clicks Program on the navigation bar

#1
Scenario: Search Program By Name
Given Admin is on Manage Program Page
When Admin enters <Program name phrase> into search box.
Then Admin should see the Programs displayed based on the Program Name

#2
Scenario: Search Program By Description
Given Admin is on Manage Program Page
When Admin enters <Program description phrase> into search box.
Then Admin should see the Programs displayed based on the Program Description

#3
Scenario: Search Program By Status
Given Admin is on Manage Program Page
When Admin enters <Program status phrase> into search box.
Then Admin should see the Programs displayed based on the Program Status

#4
Scenario: Validating the Search with unrelated keyword
Given Admin is on Manage Program Page
When Admin enters the keywords not present in the data table on the Search box 
Then Admin should see zero entries on the data table
 
 #5
 Scenario: Validate Program Details Popup window
 Given Admin is on Manage Program Page
 When Admin clicks <A New Program>button
 Then Admin should see a popup open for Program details with empty form along with <SAVE> and <CANCEL> button and Close(X) Icon on the top right corner of the window

 #6
 Scenario: Validate input fields and their text boxes in Program details form 
 Given Admin is on Manage Program Page
 When Admin clicks <A New Program>button
 Then Admin should see two input fields and their respective text boxes in the program details window
 
 #7
 Scenario: Validate radio button for Program Status 
 Given Admin is on Manage Program Page
 When Admin clicks <A New Program>button
 Then Admin should see two radio button for Program Status
 
 