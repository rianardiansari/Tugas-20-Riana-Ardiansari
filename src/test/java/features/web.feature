Feature: Web UI Automation

  @web
  Scenario: Test web login normal
    Given user go to login page
    And user input username "Admin"
    And user input pwd "admin123"
    And user click button login
    Then user is on homepage


  @web
  Scenario: Test web login failed
    Given user go to login page
    And user input username "Admin"
    And user input pwd "admin1234"
    And user click button login
    Then error message shows "Invalid credentials"

  @web
  Scenario: Add employee without creating login details
    Given user go to login page
    And user input username "Admin"
    And user input pwd "admin123"
    And user click button login
    Then user is on homepage
    And user click pim menu
    And user click add employee button
    And user input first name "Test"
    And user input last name "Riana"
    And user click save button
    Then successful message show
    And personal detail show

  @web
  Scenario: Add employee - first name and last name are empty
    Given user go to login page
    And user input username "Admin"
    And user input pwd "admin123"
    And user click button login
    Then user is on homepage
    And user click pim menu
    And user click add employee button
    And user click save button
    Then required message show

  @web
  Scenario: Add employee - first name is empty
    Given user go to login page
    And user input username "Admin"
    And user input pwd "admin123"
    And user click button login
    Then user is on homepage
    And user click pim menu
    And user click add employee button
    And user input last name "Riana"
    And user click save button
    Then error message shows "required"

  @web
  Scenario: Add employee - last name is empty
    Given user go to login page
    And user input username "Admin"
    And user input pwd "admin123"
    And user click button login
    Then user is on homepage
    And user click pim menu
    And user click add employee button
    And user input first name "Test"
    And user click save button
    Then error message shows "required"

