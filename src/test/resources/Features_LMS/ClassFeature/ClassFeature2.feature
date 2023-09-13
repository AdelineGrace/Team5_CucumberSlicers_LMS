 Feature: Manage Class Page Verification 
Background: Admin logged into LMS portal and clicks class button on the navigation bar 
 #18 
   Scenario Outline: Validate search box function
    Given Admin is on Manage Class Page
    When Admin enters batch id into search box from "<SheetName>" and <RowNumber>  
    Then Displays entries with that batch Id from "<SheetName>" and <RowNumber>
    Examples:
| SheetName | RowNumber |
| Class     |   1       |
    #19
   Scenario Outline: Validate search box function
    Given Admin is on Manage Class Page
    When Admin enters batch id which is not existing the table into search box from "<SheetName>" and <RowNumber>    
    Then Displays empty details in the data table
     Examples:
| SheetName | RowNumber |
| Class     |   1       |
    #20
   Scenario Outline: Validate search box function
    Given Admin is on Manage Class Page
    When Admin enters class no into search box from "<SheetName>" and <RowNumber>      
    Then Displays entries with that class no from "<SheetName>" and <RowNumber> 
    Examples:
| SheetName | RowNumber |
| Class     |   1       |
    #21
   Scenario Outline: Validate search box function
    Given Admin is on Manage Class Page
    When Admin enters class no which is not existing the table into search box from "<SheetName>" and <RowNumber>   
    Then Displays empty details in the data table 
Examples:
| SheetName | RowNumber |
| Class     |   1       |
  #22
   Scenario Outline: Validate search box function
    Given Admin is on Manage Class Page
    When Admin enters class topic into search box from "<SheetName>" and <RowNumber>    
    Then Displays entries with that  class topic
    Examples:
| SheetName | RowNumber |
| Class     |   1       |
    
  #23
   Scenario Outline: Validate search box function
    Given Admin is on Manage Class Page	
    When Admin enters class topic which is not existing the table into search box from "<SheetName>" and <RowNumber>    
    Then Displays empty details in the data table
    Examples:
| SheetName | RowNumber |
| Class     |   1       |

  #24
   Scenario Outline: Validate search box function
  Given Admin is on Manage Class Page
   When 	Admin enters staff id into search box from "<SheetName>" and <RowNumber>   
   Then 	Displays entries with that staff id from "<SheetName>" and <RowNumber>   
   Examples:
| SheetName | RowNumber |
| Class     |   1       |
   #25
   Scenario Outline: Validate search box function
  Given Admin is on Manage Class Page	
  When  Admin enters staff id which is not existing the table into search box from "<SheetName>" and <RowNumber>  
  Then 	Displays empty details in the data table
 Examples:
| SheetName | RowNumber |
| Class     |   1       |
 #26
   Scenario Outline: Validate search box function
  Given   Admin is on Manage Class Page	
  When   Admin enters class date into search box from "<SheetName>" and <RowNumber>  
  Then   Displays entries with that  class date from "<SheetName>" and <RowNumber> 
  Examples:
| SheetName | RowNumber |
| Class     |   1       |
 #27
   Scenario Outline: Validate search box function
  Given Admin is on Manage Class Page	
  When Admin enters invalid class date into search box from "<SheetName>" and <RowNumber>  	
  Then Displays empty details in the data table
   Examples:
| SheetName | RowNumber |
| Class     |   1       |

 
    
         


  


  
    

