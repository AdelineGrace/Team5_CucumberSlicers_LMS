Feature: Student Page verification2

Background: Admin is logged in and on the student Details page

@StudentModule_Main2_1
Scenario: Validate select student name is fading
	Given Admin is on student details page
	When Admin select student name from the drop down
	Then Admin should not see select student name text

@StudentModule_Main2_2
Scenario: Validate select batch id is fading
	Given Admin is on student details page
	When Admin select batch id from the drop down
	Then Admin should not see select batch id text

@StudentModule_Main2_3
Scenario: Validate select student name using search box
	Given Admin is on student details page
	When Admin clicks select student name and enters x alphabet in the search box
	Then Admin should see student name start with x is listed below

@StudentModule_Main2_4
Scenario: Validate select batch id using search box
	Given Admin is on student details page
	When Admin clicks select batch id and enter x number in the search box
	Then Admin should see batch id start with x is listed below

@StudentModule_Main2_5
Scenario Outline: Validate selecting only student name will not display any details
	Given Admin is on student details page
	When Admin selects only student name from "<SheetName>" and <RowNumber>
	Then Student details should not be displayed
Examples:
| SheetName | RowNumber |
| Student     |   1       | 
@StudentModule_Main2_6
Scenario Outline: Validate selecting only batch id will not display any details 
	Given Admin is on student details page
	When Admin selects only batch id from "<SheetName>" and <RowNumber> 
	Then Student details should not be displayed
Examples:
| SheetName | RowNumber |
| Student     |   1       | 
@StudentModule_Main2_7
Scenario Outline: Validate selecting student name and batch id
	Given Admin is on student details page
	When Admin selects student name and batch id from "<SheetName>" and <RowNumber> 
	Then Particular student informations should be display
	Examples:
| SheetName | RowNumber |
| Student     |   1       | 
