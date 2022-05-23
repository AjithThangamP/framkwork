Feature: feature to test E2E functionality 

Scenario: Check login is successfull with vaild credentials 

	Given user is on login page 
	When user enter email and password
	And click on login button 
	Then user is navigated to the home page 
