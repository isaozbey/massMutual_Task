Feature: Promlem #1

  Scenario:
    Given User is on the landing page
    Then Verify the right count of values appear on the screen
    Then Verify the values on the screen are greater than 0
    Then Verify the values are formatted as currencies
    Then verify the total balances matches the sum of values