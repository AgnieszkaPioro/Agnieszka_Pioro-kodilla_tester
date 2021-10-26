Feature: Is this number is divisible by another number?
  FizzBuzz game

  Scenario Outline: The number is divisible by 3 or by 5, or by 3 and 5, or is not divisible by 3 nor 5
    Given There is number <number>
    When I ask whether it's fizz or buzz
    Then I should be given <answer>
    Examples:
      | number | answer     |
      | 9      | "fizz"     |
      | 5     | "buzz"     |
      | 15     | "fizzbuzz" |
      | 7      | "none"     |
      | 3      | "fizz"     |
      | 100     | "buzz"     |
      | 45     | "fizzbuzz" |
      | 0      | "fizzbuzz"     |
