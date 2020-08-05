Feature: Zoom Car


	
	Scenario: Start Journey 
	Given  Launch the ZoomCar Instance
	And  load the URL
	When user click on start your wonderful journey 
	And user click on the popular pickup point as Porur 
	And user click on NEXT
	Then NEXT should success  
	When user select start date as tomorrow 
	And user click on next button 
	Then next button should success  
	And user click on the last day 
	And click on DONE
	Then DONE should success 
	And user find no of cars available 
	And find the highest car price and car name 
	
	
	