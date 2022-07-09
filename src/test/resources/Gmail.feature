@GmailTest
Feature: To validate the functionality of Gmail page

Scenario: To verify the login using given valid credentials
Given User will launch the browser and hit the url
When User will enter the username and click next button
And User will enter the password and click next button
Then User will verify the successful login by user profile icon in top right corner
But User should verify if sign in text in title is not displayed

