Feature: Search a product feature
  Scenario: verify that the user can able to search a product
    Given the user navigates to the home page
    When  the user enter the product name
    Then the product result should be displayed

  Scenario: verify that the user can sort the product by price low to high
    Given the user navigates to the home page
    When  the user enter the product name
    And   the user should display the page
    Then user should able to sort the product by price

  Scenario: verify that user can able to open a product
    Given the user navigates to the home page
    When  the user enter the product name
    And   the user see the page
    Then  the product open should be displayed


  Scenario: verify that the user can able to sort the product by price high to low
    Given the user navigates to the home page
    When  the user enter the product name
    And   the user should see the page
    Then  user should able to sort the product by price high to low

  Scenario: verify that the user can search the product is not in database
    Given the user navigates to the home page
    When the user  write the product name
    Then the result should displayed

  Scenario Outline:
    Given the user navigates to the home page
    When  the user enters "<product1>"
    Then user display the message
    Examples:
      |product1|
      |jeans   |
      |bags    |

