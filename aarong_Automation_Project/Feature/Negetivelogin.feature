Feature: aarong login functionality 
@regrassion
Scenario Outline: Negetive testing with invalid credentials 

Given User open the browser and navigate to the application
When User click on the sign in button on homepage
And User enter "<email>" 
And User click enter
And User type "<password>"
And User click on the login button
Then User is suppose to get an error message



Examples: 
|email                    |password   |
|abu.sayed2215@gmail.com  |Asmrasel11 |
|abu.sayed221500@gmail.com|Asmrasel11 |
|abu.sayed@gmail.com  		|Asmrasel110|


