Feature: Welcome Page
  As a user 
  I need to provide my personal details 
  So that I can navigate to the next page

  @home
  Scenario: Single Field error validation
    Given I am on the Welcome page
    When I enter following values in welcome screen
      | Field               | Value         |
      | FirstName           | BGL           |
      | Surname             | Pegasus       |
      | DateOfBirthDay      |            01 |
      | DateOfBirthMonth    |            01 |
      | DateOfBirthYear     |          1970 |
      | HouseName           | Pegasus House |
      | PostCode            | PE2 6YS       |
      | VehicleRegistration | MV05LPU       |
    And I click continue button
    Then I should see error message "1 Questions have not been completed or have been filled incorrectly"

  Scenario: Multiple Field error validation
    Given I am on the Welcome page
    When I click continue button
    Then I should see the following validation message
      | Field                   | Value                                                                                                 |
      | TitleErrorMessage       | "Please select an option"                                                                             |
      | FirstNameErrorMessage   | "Please enter your first name in letters only between 2 and 15 characters in length"                  |
      | SurnameErrorMessage     | "Please enter your surname in letters only between 2 and 20 characters in length"                     |
      | DateOfBirthErrorMessage | "Please enter a valid date of birth"                                                                  |
      | HouseNameErrorMessage   | "Please enter your house number or name. House names should be between 2 and 40 characters in length" |
      | PostCodeErrorMessage    | "Postcode is required"                                                                                |

  Scenario: Verify page content
    Given I am on the Welcome page
    Then I should see "It is important that the information you provide throughout the quote and duration of the policy is accurate. Failure to disclose correct and complete information to the best of your knowledge and belief may result in increased premiums, refusal of a claim or not being fully paid, your policy being cancelled or being made null & void and treated as if it never existed."

  Scenario: Click on retrieve a saved quote
    Given I am on the Welcome page
    When I click retrieve a saved quote
    Then I should see the "Retrieve Quote" page

  Scenario: Complete Welcome Page
    Given I am on the Welcome page
    When I complete the welcome page
      | Field               | Value         |
      | Title               | MR            |
      | FirstName           | BGL           |
      | Surname             | Pegasus       |
      | DateOfBirthDay      |            01 |
      | DateOfBirthMonth    |            01 |
      | DateOfBirthYear     |          1970 |
      | HouseName           | Pegasus House |
      | PostCode            | PE2 6YS       |
      | VehicleRegistration | MV05LPU       |
    And I click continue button
    Then I should see the "AboutYou" page
    And I should see "About you"
