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
    When User fills the data from given sheetname "<SheetName>" and rownumber <RowNumber> in search box
    Then Relevant search result is displayed
   
   Examples:

      | SheetName | RowNumber |
      | Sheet1    |     0     |
     