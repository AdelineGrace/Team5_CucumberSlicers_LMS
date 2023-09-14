Feature: Validation of delete batch

Background:Logged on the LMS portal
	Admin is on dashboard page after Login
	Admin clicks "Batch" from navigation bar

@BatchModule_DeleteBatch1
Scenario: Validate row level delete icon
	Given The delete icon on row level in data table is enabled
	When Admin clicks the delete icon
	Then Alert appears with yes and No option

@BatchModule_DeleteBatch2
Scenario Outline: Validate accept alert
	Given Admin clicks the delete icon
	When You click yes option
	Then Batch deleted alert pops and batch is no more available in data table from "<SheetName>" and <RowNumber>
	Examples:
	|     SheetName    |  RowNumber     |
	|     Batch        |     1          |

@BatchModule_DeleteBatch3
Scenario Outline: Validate reject alert
	Given Admin clicks the delete icon
	When you click No option
	Then Batch is still listed in data table from "<SheetName>" and <RowNumber>
		Examples:
	|     SheetName    |  RowNumber     |
	|     Batch        |     1          |

@BatchModule_DeleteBatch4
Scenario: Validate the delete icon below the header
	Given None of the checkboxes in data table are selected
	Then The delete icon under "Manage Batch" header should be disabled

@BatchModule_DeleteBatch5
Scenario Outline: Check for single row delete
	Given One of the checkbox row is selected
	When Click delete icon below "Manage Batch" header
	Then The respective row in the data table is deleted from "<SheetName>" and <RowNumber>
	Examples:
	|     SheetName    |  RowNumber     |
	|     Batch        |     1          |

@BatchModule_DeleteBatch6
Scenario: Check for multi row delete
	Given Two or more checkboxes row is selected
	When Click delete icon below "Manage Batch" header
	Then The respective row in the data table is deleted  from "<SheetName>" and <RowNumber>