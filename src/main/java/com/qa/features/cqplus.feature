Feature: CqPlus application Test 

Scenario Outline: Validiate CQPlus Home Page 

	Given User Opens the Browser 
	Then User is on login page 
	Then User enter "<username>" and "<password>" 
	Then click on News and Anyalze
	Then click on More link to see more news
	Then Close the Browser 
	
	
	Examples: 
	
		|username                       | |password  |
		|abhishek.goyal2@globallogic.com| |Welcome@12|