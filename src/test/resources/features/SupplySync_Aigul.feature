Feature: Create and Edit Branches Functionality
 // @branches
  Background: User is logged in "https://supplysync.us/login"
    When the user enters the username "loginBtn"
    And the user enters the password "passwordBtn"
    And the user clicks on the login button
    Then the user should be logged in

  Scenario: Verify create branches functionality
    Given the user is on the branches page
    When the user clicks on the create branch button
    And user enters the branch name "branchName"
    And user enters the email "email"
    And user enters the address "address"
    And user enters the phone number "phoneNumber"
    And user enters the location of the branch "location"
    And user select region "illinois"
    And user to choose companies "companies"
    And the user clicks on the create button
    Then the user should see the message "Branch successfully created"

  Scenario: Verify edit branch functionality
    Given the user is on the branches page
    And clicks on the edit button
    Then clicks on the email
    And add new email "aigul111@gmail.com"
    And add city "Chicago"
    Then clicks save button
    Then verify the message "Branch successfully changed"








