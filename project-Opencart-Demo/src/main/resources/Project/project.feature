#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Title of your feature
  I want to use this template for my feature file

 @tc01_RegisterandLogin
Scenario Outline: To check with valid credentails
Given the user launch the chrome application      
When the user creates a new account
Then the user enters "<username>" and "<password>" and clicks 

Examples:  

|            username                |    password        |
|  lakshmichowdary440a@gmail.com     |    Glucky@196      |

@tc02_search
Scenario: search the product
Given the user launch chrome application
When click on the search button select the product
And close the website


@tc03_sitemap
Scenario: search for the special offers
Given user launches the chrome application
When the user click on the sitemap
And select special offers

@tc04_AddtoCart
Scenario: go to wishlist and add to cart
Given user launch the chrome application
Then user login using username and password
Then go to wishlist
And add the product to cart 


@tc05_EditAcnt
Scenario: edit account details
Given user launch the chrome app
When user login using un and pw
And click on edit your accont details






