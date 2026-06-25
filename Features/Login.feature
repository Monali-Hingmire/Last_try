Feature: FB login  feature
We need validate the login test cases

@reg
Scenario: Validate the login test cases with Valid username and password

Given user should be login page
When user enters Valid username"Tester1@gmail.com"
And User enters valid password"P23323"
Then clicks on submit button

@dropdown_input
Scenario Outline: Select country from dropdown

Given user should be login page
When User enters Fname"<Fname>" Lname"<Lname>"
And User selects "<SelectionType>" from country dropdown using "<Country>"


Examples:
|Fname| Lname|SelectionType | Country |
|Sonali |Ghejji|visibletext | INDIA |

@radiobutton
Scenario: Select Radio Button
	Given user should be login page
	When User selects radio button "Option 1"
	And User selects checkbox 1
	