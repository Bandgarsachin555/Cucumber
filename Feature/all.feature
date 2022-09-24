Feature: Analytical based lending

  Background: 
   Given open all browser
   
@Loan
  Scenario: test loan account creation
    Given user in on loan account creation page
    When enter customer details
    Then account got creation
 @OD
  Scenario: test od activation funcinality
    Given add Customer name
    When account got created
