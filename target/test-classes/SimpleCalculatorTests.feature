Feature: Simple Calculator Tests
  
  Note: the calculator has been written to return 0 if you divide by zero.
  Note:  the calculator does integer division.  (That is, it ignores any remainder)

  Scenario Outline: adding two numbers
    Given I have a calculator open
    When I enter <first integer> and <second integer>
    And I select add
    Then I get <answer>

    Examples: 
      | first integer | second integer | answer |
      |             1 |              2 |      3 |
      |             1 |             10 |     11 |
      |             5 |              0 |      5 |
      |             0 |              6 |      6 |
      
      
      Scenario Outline:  Subtract two numbers
