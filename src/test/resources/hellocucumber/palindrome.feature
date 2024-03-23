
  Feature: Palindrome Detection

    As a user of the StringUtils class
    I want to ensure it correctly identifies polindromes
    So that I can process text accurately

    Scenario: Successful Polindrome Identification
      Given I provide a polindrome string
      When the isPolindrome method is executed
      Then the result should be true

    Scenario: Failed Palindrome Identification
      Given I provide a non-palindromic string
      When the isPolindrom method is executed
      Then the result should be false
