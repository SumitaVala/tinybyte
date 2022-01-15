
Feature: Title of your feature

  @tag2 @regression
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step
		And  I verify <value> and <status> both in steps

    Examples: 
      | name  | value | status  |
      | "name1" |     5 | "Success" |
      | "name2" |     7 | "Fail"    |

      
       @tag2 @regression
  Scenario: Title of your scenario outline
    Given I want to write a step with "Alpesh"
    Then I verify the blow values in step
			|"Alpesh"|Kodinar|362720|

    