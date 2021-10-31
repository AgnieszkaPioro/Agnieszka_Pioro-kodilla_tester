Feature: Cash Withdrawal
  Scenario: Succesful withdrawal from a wallet credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Unsuccesful withdrawal from a wallet credit
    Given I have deposited $100 in my wallet
    When I request $120
    Then I should get 0

  Scenario: No withdrawal from a wallet credit
    Given I have deposited $100 in my wallet
    When I don't have withdrawal
    Then $0 should be dispensed
