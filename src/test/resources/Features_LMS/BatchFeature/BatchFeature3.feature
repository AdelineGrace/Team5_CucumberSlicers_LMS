@EditBatch
Feature: Validation of Edit Batch
Background: Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks &quot;Batch&quot; from navigation bar
@BatchModule_EditBatch1
Scenario: Validate row level edit icon
Given The edit icon on row level in data table is enabled
When Admin clicks the edit icon
Then A new pop up with Batch details appears
@BatchModule_EditBatch2
Scenario Outline: Check if the fields are updated
Given Admin clicks the edit icon
When Update the fields with valid values and click save
Then The updated batch details should appear on the data table from "<SheetName>" and <RowNumber>
Examples:
| SheetName | RowNumber |
| Batch     | 1 |
@BatchModule_EditBatch3
Scenario Outline: Check if the update throws error with invalid valued
Given Admin clicks the edit icon
When Update the fields with invalid values from "<SheetName>" and <RowNumber> and click save
Then Error message should appear
Examples:
| SheetName | RowNumber |
| Batch      | 1       |
@BatchModule_EditBatch4
Scenario Outline: Check if you get error message when mandatory fields are erased
Given Admin clicks the edit icon
When Erase data from mandatory field from "<SheetName>" and <RowNumber>
Then Error message should appear
Examples:
| SheetName | RowNumber |
| Batch      | 1        |
@BatchModule_EditBatch5
Scenario Outline: Check if description field is optional in update
Given Admin clicks the edit icon
When Erase data from description field from "<SheetName>" and <RowNumber>
Then The updated batch details should appear on the data table from "<SheetName>" and <RowNumber>
Examples:
| SheetName | RowNumber |
| Batch     | 1         |