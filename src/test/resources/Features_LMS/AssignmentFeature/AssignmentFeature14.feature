Feature:Pagination in manage assignment Part2

Background: Admin is manage assignment page after logged in
#1
Scenario Outline: Verify next page is enabled	
Given Admin is in add assignment details popup window
	When Admin creates six new assignment from "<SheetName>" and <RowNumber>
		Then  When total class entries above five next page is enabled ( On multiples of five new page will be enabled)
 Examples:
| SheetName | RowNumber |
| Assignment     |   1       |	
	
#2
Scenario Outline: verify next page is disabled
	Given Admin is in add assignment details popup window
		When Admin creates less than or equal to five new assignment	from "<SheetName>" and <RowNumber>
		Then When total class entries  five or below next page is disabled
 Examples:
| SheetName | RowNumber |
| Assignment     |   1       |		