Feature: Homepage operations


  @verify_empty_cart
  Scenario: Searching for a term
    Given user is on homepage
    When he click on his cart
    Then user sees that his cart is empty

