Feature: My first feature

	@sanity @regression @ui
  Scenario: Myfirst scenario
    Given start my browser "https://www.google.com/"
    When I give "Alpesh" in google
    Then I should get linked in profile

	@regression
  Scenario: Myfirst scenario
    Given start my browser "https://www.google.com/"		
    When I give "AARVI" in google
    Then I should get linked in profile
    |"AlpeshVala profile"|
    
    	@dev
  Scenario: Myfirst scenario
    Then I should get linked in profile below
    |"AlpeshVala profile"|
    