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
Feature: This is the automation of OpenOrange webpage 
  I want to use this template for my feature file

  @tag1
  Scenario: This is the scenario for OpenOrange
    Given User is on the OpenOrange WebPage
    When User enter the below credentials
		|Admin|admin123|    
    And user click the login action
    Then User can enter into the homepage
