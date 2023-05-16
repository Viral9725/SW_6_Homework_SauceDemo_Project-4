

  Feature:Product page
    Scenario: Verify that six products are displayed on the product page
      Given I am on Homepage
      And I enter Username "standard_user"
      And I enter Password "secret_sauce"
      And I Click On Login
      Then I should be able login successfully and see "Products"
      Then Verify that six products are displayed on the product page