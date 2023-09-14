Feature: Multiple Delete Program part2

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
Admin clicks delete button under header after selecting the check box in the data table



#1
 Scenario: Validate multiple program deletion by selecting Single checkbox
 Given Admin is on Confirm Deletion alert
 When Admin clicks <YES> button on the alert
 Then Admin should land on Manage Program page and can see the selected program is deleted from the data table
 
 #2
 Scenario: Validate multiple program deletion by selecting Single checkbox
 Given Admin is on Confirm Deletion alert
 When Admin clicks <NO> button on the alert
 Then Admin should land on Manage Program page and can see the selected program is not deleted from the data table
 

 