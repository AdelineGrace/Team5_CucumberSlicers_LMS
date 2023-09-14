Feature: Multiple Delete Program part3


Background:Admin is on dashboard page after Login and clicks Program on the navigation bar
Admin clicks delete button under header after selecting the check box in the data table
 Admin clicks delete button under header after selecting multiple checkboxes in the data table

 #1
 Scenario: Validate multiple program deletion by selecting multiple check boxes
 Given Admin is on Confirm Deletion alert
 When Admin clicks <YES> button on the alert
 Then Admin should land on Manage Program page and can see the selected programs are deleted from the data table
 
 #2
 Scenario: Validate multiple program deletion by selecting multiple check boxes
 Given Admin is on Confirm Deletion alert
 When Admin clicks <NO> button on the alert 
 Then Admin should land on Manage Program page and can see the selected programs are not deleted from the data table