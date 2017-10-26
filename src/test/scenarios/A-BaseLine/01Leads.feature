Feature: Scenarios based on registration

  @BaseLine
  Scenario: We will register a new user to the webshop application
    Given I open the browser and access webshop
    When I click on "Register"
    Then I am on the "Register" page
    And  I set the Gender field to "Male"
    And I fill the "First name:" field with "Tamas"
    And Close driver
 