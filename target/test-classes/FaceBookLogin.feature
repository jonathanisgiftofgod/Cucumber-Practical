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
Feature: Automate FaceBook Webpage
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Validate the webpage of FaceBook
    Given User must open the browser and launch the facebook url
    When User must enter the "<username>" and "<password>" Login Details
    
    And User must click the login button
         Then User must verify the homepage
    Examples:
      |username|password|
      |jonathan|12345|
      |britto|12345|
      |joseph|67890|
      |nancy|12345|

