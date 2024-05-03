
  Feature: Palindrome Detection

    As a user of the StringUtils class
    I want to ensure it correctly identifies palindromes
    So that I can process text accurately

    Scenario: Successful Palindrome Identification
      Given I provide a palindrome string
      When the isPalindrome static method is executed
      Then the result should be true

    Scenario: Failed Palindrome Identification
      Given I provide a non-palindromic string
      When is executed the isPalindrome static method
      Then the result should be false
