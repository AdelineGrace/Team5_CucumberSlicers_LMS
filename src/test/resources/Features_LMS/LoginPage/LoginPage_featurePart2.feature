#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Login page validation 

Background: Admin in login page after clicking login button in home page

Scenario: Verify the login page
Given Admin is in home page
When Admin enter valid credentials  and clicks login button 
Then Admin should land on dashboard page
 
 


Scenario: Validate login with invalid credentials

Given Admin is in home page
When Admin enter invalid credentials and clicks login button 
Then Error message please check username/password
 
 

Scenario: Validate login with valid credentials in username

Given Admin is in home page
When Admin enter valid username and clicks login button 
Then Error message please check password

 

Scenario: Validate login with valid credentials in password

Given Admin is in home page
When Admin enter valid  password and clicks login button 
Then Error message please check username

Scenario: Validate login with blank username credentials

Given Admin is in home page
When Admin enter blank in username and clicks login button  
Then Error message please check username/password


 
 
Scenario: Validate login with blank password credentials

Given Admin is in home page
When Admin enter blank in password and clicks login button 
 Then Error message please check username/password


 
Scenario: validate login with empty values in both field


Given Admin is in home page
When Admin enter valid  password and clicks login button 
Then Error message please check username

 
Scenario: Validate login with valid credentials in password

Given Admin is in home page
When Admin clicks Login button with empty values in both columns 
Then Error message please check username/password


 
Scenario: verify login button action through keyboard

Given Admin is in home page
When Admin enter valid credentials and clicks login button through keyboard
Then Admin should land on dashboard page


 
Scenario: verify login button action through mouse


Given Admin is in home page
When Admin enter valid credentials and clicks login button through mouse
Then Admin should land on dashboard page


 
 