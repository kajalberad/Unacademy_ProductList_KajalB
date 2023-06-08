Feature: Product list

Scenario: Valiate user navigates on product list page 
    Given Chrome is opened and Unacademy app is opened
    When User clicks on login button
    Then User Navigates onto login page
    When User enters mobile number "7841019238"
    And Clicks on login button
    And User enter the OTP
    And User click on verify otp button
    Then User navigates onto Home Page
    And User Clicks on search box
    When User search the course "Software Testing"
    Then User click on particular course
    Then User navigates on to the course list page
   

Scenario: Validate the product list page UI
    Given Chrome is opened and Unacademy app is opened
    When User clicks on login button
    Then User Navigates onto login page
    When User enters mobile number "7841019238" 
    And Clicks on login button
    And User enter the OTP
    And User click on verify otp button
    Then User navigates onto Home Page
    And User Clicks on search box
    When User search the course "Software Testing"
    Then User click on particular course
    Then User navigates on to the course list page
    And CourseListPage title is visible to the user
    And User is able see the Logo
    And User is able to see call logo
   

Scenario: Validate product list field( SEE ALL link is clickable)
    Given Chrome is opened and Unacademy app is opened
    When User clicks on login button
    Then User Navigates onto login page
    When User enters mobile number "7841019238" 
    And Clicks on login button
    And User enter the OTP
    And User click on verify otp button
    Then User navigates onto Home Page
    And User Clicks on search box
    When User search the course "Software Testing"
    Then User click on particular course
    Then User navigates on to the course list page
    When User clicks on "SEE ALL" link
    Then  "SEE ALL" link should clickable
    
