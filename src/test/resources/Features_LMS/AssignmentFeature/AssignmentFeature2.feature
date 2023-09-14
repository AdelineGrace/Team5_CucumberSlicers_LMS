Feature: Manage Program Validation part2

Background: Admin logged into LMS portal and clicks assignment button on the navigation bar 

#1
Scenario Outline: Validate search box function
Given Admin is on manage assignment page
 When Admin enters assignment  name into search box from "<SheetName>" and <RowNumber>  
    Then Displays entries with that assignment  name from "<SheetName>" and <RowNumber>
    Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#2
Scenario Outline: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment name which is not existing the table into search box from "<SheetName>" and <RowNumber>    
    Then Displays empty details in the data table
     Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#3
Scenario Outline: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment description into search box from "<SheetName>" and <RowNumber>    
    Then Displays entries with that assignment  description from "<SheetName>" and <RowNumber>
     Examples:
| SheetName | RowNumber |
| Assignment     |   1       |


#4
Scenario Outline: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment description which is not existing the table into search box from "<SheetName>" and <RowNumber>    
    Then Displays empty details in the data table
     Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#5
Scenario Outline: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment due date into search box from "<SheetName>" and <RowNumber>    
    Then Displays entries with that assignment  due date from "<SheetName>" and <RowNumber>
     Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#6
Scenario Outline: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment due date which is not existing the table into search box from "<SheetName>" and <RowNumber>    
    Then Displays empty details in the data table
     Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#7
Scenario Outline: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment grade into search box from "<SheetName>" and <RowNumber>    
    Then Displays entries with that assignment grade from "<SheetName>" and <RowNumber>
     Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

#8
Scenario Outline: Validate search box function
Given Admin is on manage assignment page
When Admin enters assignment grade which is not existing the table into search box from "<SheetName>" and <RowNumber>    
    Then Displays empty details in the data table
     Examples:
| SheetName | RowNumber |
| Assignment     |   1       |

