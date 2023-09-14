Feature: Validation of Batch Page
Background: User Logged on the LMS portal
@BatchPageMain1
Scenario Outline: Validate landing in Batch page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should see the Manage Batch from "<SheetName>" and <RowNumber> in the URL
Examples:
| SheetName | RowNumber |
| Batch | 1 |
@BatchPageMain2
Scenario Outline: Validate header in the Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should see header with Manage Batch from "<SheetName>" and <RowNumber> in the header
Examples:
| SheetName | RowNumber |
| Batch | 1 |
@BatchPageMain3
Scenario: Validate pagination in the Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should see the pagination controls under the data table
@BatchPageMain4
Scenario: Validate data table headers in the Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin Should see the data table with the following headers 
#(Batch name, Batch Description,Batch Status, No. of classes, Program Name,Edit Delete)
@BatchPageMain5
Scenario: Validate Delete button in Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should be able to see the Delete icon button that is disabled
@BatchPageMain6
Scenario: Validate &quot;+ A New batch&quot; in Batch Page
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Admin should be able to see the + Add New batch button
@BatchPageMain7
Scenario: Validate data rows
Given Admin is on dashboard page after Login

When Admin clicks "Batch" from navigation bar
Then Each row in the data table should have a checkbox
@BatchPageMain8
Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Each row in the data table should have a edit icon that is enabled
@BatchPageMain9
Scenario: Validate data rows
Given Admin is on dashboard page after Login
When Admin clicks "Batch" from navigation bar
Then Each row in the data table should have a delete icon that is enabled
@BatchPageMain10
Scenario: Validate pop up for adding batch
Given Admin is on dashboard page after Login
When Admin clicks + A New Batch button
Then A new pop up with Batch details appears