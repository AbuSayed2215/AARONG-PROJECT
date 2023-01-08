Feature: aarong Login Functionality 
@smoke 
Scenario: Login into aarong with valid credentials 

Given User navigates to "https://www.aarong.com/" 
When User clicks on the Sign In Button 
And User enters "<email>" into the email feild
And User able to click on submit button
And User enters "<password>" into the password feild
And User clicks on final sign In Button
Then User should be able to see username

