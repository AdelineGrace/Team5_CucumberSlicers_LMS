Feature: Validation of add new batch
Background:Logged on the LMS portal
Admin is on dashboard page after Login
Admin clicks &quot;Batch&quot; from navigation bar
Admin clicks &quot;+ A New Batch&quot; button
@BatchModule_AddNewBatch1
Scenario: Check if the fields exist in pop
When A new pop up with Batch details appears
Then The pop up should include the fields Name, Number of classes and Description as text box,Program Name as drop down,Status as radio button, Number of classes as text box
@BatchModule_AddNewBatch2
Scenario Outline: Check if description is optional field
Given A new pop up with Batch details appears
When Fill in all the fields except description with valid values from "<SheetName>" and <RowNumber> and click save
Then The newly added batch should be present in the data table from "<SheetName>" and <RowNumber> in Manage Batch page
Examples:
| SheetName | RowNumber |
| Batch | 1 |
@BatchModule_AddNewBatch3
Scenario Outline: Check if the program details are added in data table
Given A new pop up with Batch details appears
When Fill in all the fields with valid values from "<SheetName>" and <RowNumber> and click save
Then The newly added batch should be present in the data table from "<SheetName>" and <RowNumber> in Manage Batch page
Examples:
| SheetName | RowNumber |
| Batch | 1 |
@BatchModule_AddNewBatch4
Scenario Outline: Check for error messages for invalid fields
Given A new pop up with Batch details appears
When Any of the fields have invalid values "<SheetName>" and <RowNumber>;
Then Error message should appear
@BatchModule_AddNewBatch5
Scenario Outline: Check for error messages for mandatory fields
Given A new pop up with Batch details appears
When Any of the mandatory fields are blank from "<SheetName>" and <RowNumber>
Then Error message should appear
Examples:
| SheetName | RowNumber |
| Batch | 1 |