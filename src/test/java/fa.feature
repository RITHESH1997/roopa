Feature: Login
Scenario: login
Given the user launches the browser and opens the app 
When the user enters the credentials
	|username|password   |
	|Lalitha |Password123|
	|lallii  |paassss    |
Then the user clicks on login 