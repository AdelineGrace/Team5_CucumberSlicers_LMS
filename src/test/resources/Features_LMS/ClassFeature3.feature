Feature: Class detail Popup window verification 
Background: Admin logged into LMS portal and clicks class button on the navigation bar 
 #28 
   Scenario: Verify class details popup window
   Given  Admin is on Manage Class Page
   When 	Admin click +Add New Class button
   Then 	Admin should see a popup  with  heading class details
 #29
    Scenario: 	Verify input fields in class details popup window
    Given Admin is on Manage Class Page
    When 	Admin click +Add New Class button
    Then 	Admin should see input fields Text 
    				#(Batch ID , No of Classes, Class Date, Class Topic, Staff Id, Class description, Comments, Notes, Recordings)
    
   #30
   Scenario Outline: 	Verify text box present in class details popup window
   Given 	Admin is on Manage Class Page
   When 	Admin click +Add New Class button
   Then  <NoofTextBoxes> textbox should be  present in Class details popup window
   Examples:
   | NoofTextBoxes   |
   | 6               |
   #31
   Scenario: 	Verify drop down in Batch Id  in class details popup window
   Given 	Admin is on Manage Class Page
   When 	Admin click +Add New Class button
   Then 	Admin should see  dropdown option for Batch ID
   #32
   Scenario: 	Verify drop down in Staff Id  in class details popup window
   Given 	Admin is on Manage Class Page
   When 	Admin click +Add New Class button	
   Then  Admin should see  dropdown option for Staff Id
   #33
   Scenario: 	Verify calendar icon in class date  in class details popup window
   Given 	Admin is on Manage Class Page
   When 	Admin click +Add New Class button
   Then 	Admin should see  calendar icon for class date
   #34
   Scenario: 	Verify save button is present	
   Given 	Admin is on Manage Class Page	
   When   Admin click +Add New Class button
   Then 	Admin should see  save button in the class detail popup window
   #35
   Scenario: 	Verify cancel button is present	
   Given 	Admin is on Manage Class Page
   When 	Admin click +Add New Class button	
   Then   Admin should see  cancel button in the class detail popup window
   #36
   Scenario: 	Verify close button   in class details popup window	
   Given Admin is on Manage Class Page	
   When  Admin click +Add New Class button
   Then  Admin should see  close button on the class details popup window
   
   
   
   
   
   
   
   
   
   