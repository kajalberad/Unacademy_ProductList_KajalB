Feature: Product list

 Scenario Outline: Validate search functionality with valid data
    Given Chrome is opened and Unacademy app is opened
    When User clicks on login button
    Then User Navigates onto login page
    When User enters mobile number "7841019238" 
    And Clicks on login button
    And User enter the OTP
    And User click on verify otp button
    Then User navigates onto Home Page
    And User Clicks on search box
    When User Enters "<searchkeyword>" in search box
    Then Relevant search result is displayed
   
   Examples:

      | searchkeyword |
      |  JEE   |
    

 Scenario Outline: Validate search fucntionality with invalid data
    Given Chrome is opened and Unacademy app is opened
    When User clicks on login button
    Then User Navigates onto login page
    When User enters mobile number "7841019238"
    And Clicks on login button
    And User enter the OTP
    And User click on verify otp button
    Then User navigates onto Home Page
    And User Clicks on search box
    When User Enters "<searchkeyword>" in   search box
    Then Relevant search result is not displayed
    
   Examples:
   
      | searchkeyword |
      |   @@@   |
