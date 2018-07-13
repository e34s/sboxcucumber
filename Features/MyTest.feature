Feature: Selenium Box Cucumber Demo
  Scenario: Open Careers page and verify page title
    Given Open Chrome and go to the BMW Brilliance homepage
    When Click on the Careers link
    Then Verify page title
    Then Close browser