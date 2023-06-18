@exeter_homepage
Feature: Validate functionality of exeter sign in page
  This feature is to verify sign in page functionalities


  Scenario: Validate home page of exeter app
    Given User launches the exeter application
    When  User clicks on privacy policy hyperlink
    Then User navigates to privacy notices tab
    And User closes current tab
    And User switches to previous tab
    Then User clicks on Accept button
    And User clicks on terms and conditions hyperlink
    And User clicks on Data protection and privacy policy link
    Then User navigates to privacy notices tab
    And User closes current tab
    And User switches to previous tab
    Then User clicks on back button in terms on conditions page
    And User clicks on accept terms and continue checkbox
    Then User clicks University of Exeter email button
    And User clicks on AzureAD button
    
    