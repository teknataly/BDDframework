@TekSchoolTest @alltest
Feature: Tek School Test

Background:
Given User go to Tek School page
And  User click on test environment

@loginTest @smoketest
Scenario: Login to test environment
When User see test environment page
Then User verify test environment title

@LoginPage
Scenario: Login to My Account
When User click on My Account
And User select login from dropdown
Then User should see login page

@tek
Scenario Outline: Testing login with different

When User enter username <userName>
And User enter password <password> 
And Click continue button
Then User should be logged in successfully

Examples:

|userName|password|
|test@test.com|test001|
|test@test.com|test002|
|test@test.com|test003|














