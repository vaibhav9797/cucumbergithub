Feature: Test Calculator
    This is calculator feature file
    
    Scenario: add two number
    Given i entered number 50 in calculator
    And i press add
    And i have entred number 50 in calculator
    When i press equal
    Then result 100 should be display
    
