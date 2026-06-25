Feature: FB login  feature
We need validate the login test cases

Scenario Outline: Validate the login test cases with Valid username and password

Given user should be login 
When user enters Valid mltipleusernames"<username>"
And User enters valid multiplepasswords"<password>"
Then clicks on submit 

Examples:
| username | password |
| Vikram@gmail.com | vikey4567 |
| Sonali@gmail.com | sona4567 |