Feature: User is able to search for an item use search ico
Background: Login into Hotwire with valid credentials 

Given User navigates to "https://www.aarong.com/" 
When User clicks on the Sign In Button 
And User enters "<email>" into the email feild
And User able to click on submit button
And User enters "<password>" into the password feild
And User clicks on final sign In Button
Then User should be able to see username

Scenario: User search for an item
When User able to click on the search icon
And Use enter the keywords "panjabi"
And Item will appear in the landing page
And User is able to click on the iteam
Then User should be able to see more about the price