Feature: Login

Scenario: Valid Login
	Given User nagigated to Login Page
	When User enter "kazbek" in the "username" field
	And User enter "kazbek" in the "password" field 
	When User clicks Login button
	Then User Successfully Logs In
	