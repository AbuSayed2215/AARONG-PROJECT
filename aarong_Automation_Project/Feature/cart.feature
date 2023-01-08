Feature: User add item in the cart

Background: Login into aarong with valid credentials 

Given User navigates to "https://www.aarong.com/" 
When User clicks on the Sign In Button 
And User enters "<email>" into the email feild
And User able to click on submit button
And User enters "<password>" into the password feild
And User clicks on final sign In Button
Then User should be able to see username

Scenario: User should be able to add items in the cart
When User seach for "Panjabi"
And User click on the second iteam
And User select quantity 3
Then User click on the add to cart button
And Items quantity should be displayed in the cart