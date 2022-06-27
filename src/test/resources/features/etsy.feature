@Regression
Feature: Etsy Landing Page Validation

  Scenario: Validate Etsy main navigation header items
    Given user navigates to "https://www.etsy.com/"
    Then user should see below menu item links
      |  | Jewelry & Accessories | Clothing & Shoes | Home & Living | Wedding & Party | Toys & Entertainment | Art & Collectibles | Craft Supplies | Gifts & Gift Cards |