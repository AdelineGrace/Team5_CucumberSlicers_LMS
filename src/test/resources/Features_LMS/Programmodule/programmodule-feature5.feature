Feature: Edit program details part2

Background: Admin is on dashboard page after Login and clicks Program on the navigation bar
Admin is on Manage Program Page after clicks Program on the navigation bar


 
 
 #1
 Scenario: Edit Program Name
 Given Admin is on Program Details Popup window to Edit
 When Admin edits the Name column and clicks save button
 Then Admin gets a message "Successful Program Updated" alert and able to see the updated name in the table for the particular program
 
 #2
 Scenario: Edit Program description
 Given Admin is on Program Details Popup window to Edit
 When Admin edits the Description column and clicks save button
 Then Admin gets a message "Successful Program Updated" alert and able to see the updated description in the table for the particular program
 
 #3
 Scenario: Change Program Status
 Given Admin is on Program Details Popup window to Edit
 When Admin changes the Status and clicks save button
 Then Admin gets a message "Successful Program Updated" alert and able to see the updated status in the table for the particular program
 
 #4
 Scenario: Validate invalid values on the text column
 Given Admin is on Program Details Popup window to Edit
 When Admin enters only numbers or special char in name and desc column
 Then Admin gets a Error message alert 
 
 #5
 Scenario: Validate Cancel button on Edit popup
 Given Admin is on Program Details Popup window to Edit
 When Admin clicks <Cancel>button on edit popup
 Then Admin can see the Program details popup disappears and can see nothing changed for particular program
 
 #6
 Scenario: Validate Save button on Edit popup
 Given Admin is on Program Details Popup window to Edit
 When Admin clicks <Save>button on edit popup
 Then Admin gets a message "Successful Program Updated" alert and able to see the updated details in the table for the particular program
 
