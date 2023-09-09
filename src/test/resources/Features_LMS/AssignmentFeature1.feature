Feature: Manage Program Validation part1

Background: Logged on the portal as Admin

#1
Scenario: Validate landing in Program page
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see URL with "Manage Assignment"

#2
Scenario: Capture the response time to navigate to manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see  the response time for navigation from dashboard page to manage assignment page

#3
Scenario: Validate the header
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see a heading with text "Manage Assignment" on the page

#4
Scenario: Validate the text in header
Given Admin is on dashboard page after Login
When Admin clicks "assignment" button on the navigation bar and get all text from the portal page
Then Admin should see correct spelling for the all the fields

#5
Scenario: Verify delete icon below the header
Given Admin is on dashboard page after Login
When Admin clicks "assignment" button on the navigation bar
Then Admin should see disabled delete icon below the "Manage assignment"

#6
Scenario: Verify search bar on the manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see search bar on the manage assignment page

#7
Scenario: Verify add new assignment button  on manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks "Assignment"on the navigation bar
Then Admin should see +Add New assignment button on the manage assignment page

#8
Scenario: Verify data table on the manage assignment page
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see data table on the manage assignment page With following column headers. (check box symbol ,Assignment name, Assignment description, Assignment Date, Assignment Grade, Edit Delete)

#9
Scenario:Verify Edit icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Edit Icon in each row of data table only  when entries are available

#10
Scenario: Verify Edit icon when no data in the table
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Edit Icon will not be present in data table

#11
Scenario: Verify delete icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Delete Icon in each row of data table only  when entries are available

#12
Scenario: Verify delete icon when no data in the table
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Delete Icon will not be present in data table

#13
Scenario: Verify sort icon in the data table
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see sort icon near the column headers except for Edit and Delete

#14
Scenario: Verify check box in the data table
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see check box in the all rows  of data table when entries available

#15
Scenario: Validate the number entries displaying
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Above the footer Admin should see the text as "Showing x to y of z entries" below the table. 
#x- starting record number on that page
#y-ending record number on that page
#z-Total number of records
#Note: with or without entries   

#16
Scenario: Verify Pagination control below the data table
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see the pagination controls under the data table

#17
Scenario: Validate footer  text
Given Admin is on dashboard page after Login
When Admin clicks "Assignment" on the navigation bar
Then Admin should see the text with total number assignments in the data table. ( " In total there are number of assignments")




                                                                                        