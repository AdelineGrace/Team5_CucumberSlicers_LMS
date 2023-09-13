
@tag
Feature: Manage Class Page Verification 
Background:  Logged on the LMS portal as Admin
    
  #1 
  @Class1
  Scenario Outline: Verify landing in class page
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar 
    Then Admin should see URL with Manage Class from "<SheetName>" and <RowNumber>
    Examples:
| SheetName | RowNumber |
| Class     |   1       |
    
    #2
    @Class1
  Scenario: Capture the response time to navigate to manage class page
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Get the response time for navigation from dashboard page to manage class page
    #3
    @Class1
  Scenario Outline: Verify Manage Class Page Header
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see header with Manage Class from "<SheetName>" and <RowNumber>
     Examples:
| SheetName | RowNumber |
| Class     |   1       |
    #4
    @Class1
   Scenario Outline: Validate text in manage class page
    Given Admin is on dashboard page after Login
    When Admin clicks Class button on the navigation bar and get all text from the portal page "<SheetName>" and <RowNumber>
    Then Admin should see correct spelling for the all the fields from "<SheetName>" and <RowNumber>
     Examples:
| SheetName | RowNumber |
| Class     |   1       |
    #5
    Scenario: Verify delete icon below the header
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see disabled delete icon below the Manage Class
    #6  
  Scenario: Verify search bar on the class page
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see search bar on the class page
    #7
    Scenario: Verify add new class button  on class page
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see +Add New Class button on the class page
    #8
    Scenario: Verify data table on the class page
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see data table on the Manage Class Page With following column headers
           #(Check box symbol,Batch Id,   Class No,Class Date, Class Topic, Staff Id, Description, Comments, Notes, Recording, Edit Delete)
    #9
   Scenario: Verify Edit icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Edit Icon in each row of data table only  when entries are available
   #10
   Scenario: Verify Edit icon when no data in the table
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Edit Icon will not be present in data table
   #11
   Scenario: Verify delete icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Delete Icon in each row of data table only  when entries are available
     #12
   Scenario: Verify delete icon when no data in the table
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin cant see delete  Icon in data table
     #13
   Scenario: Verify sort icon in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see sort icon near the column headers except for Edit and Delete
    #14
   Scenario: Verify check box in the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see check box in the all rows  of data table 
    #15
   Scenario: Validate the number entries displaying
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Above the footer Admin should see the text as ""Showing x to y of z entries"" below the table. 
        # x- starting record number on that page
        #y-ending record number on that page
        # z-Total number of records  Note: with or without entries"
     #16
   Scenario: Verify Pagination control below the data table
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see the pagination controls under the data table
     #17
   Scenario: Validate footer  text
    Given Admin is on dashboard page after Login
    When Admin clicks "Class" button on the navigation bar
    Then Admin should see the text with total number classes in the data table 
        # ( " In total there are number of classes")
        

     