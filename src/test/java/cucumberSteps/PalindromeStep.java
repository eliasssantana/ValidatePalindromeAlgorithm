package cucumberSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.StringUtils;

import static org.junit.Assert.*;



public class PalindromeStep {

    String inputString;
    boolean result;

    @Given("I provide a palindrome string")
    public void i_provide_a_palindrome_string() {
        inputString = "radar";
    };

//    @When("the isPalindrome static method is executed")
//    public void the_is_palindrome_static_method_is_executed() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the result should be true")
//    public void the_result_should_be_true() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Given("I provide a non-palindromic string")
//    public void i_provide_a_non_palindromic_string() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("is executed the isPalindrome static method")
//    public void is_executed_the_is_palindrome_static_method() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the result should be false")
//    public void the_result_should_be_false() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    String inputString;
//    boolean result;
//
//    @Given("I provide a palindrome string")
//    public void i_provide_a_palindrome_string() {
//        inputString = "ada";
//    }
//
//    @When("the isPalindrome static method is executed")
//    public void the_is_palindrome_static_method_is_executed() {
//        result = StringUtils.isPalindrome(inputString);
//    }
//
//    @Then("the result should be true")
//    public void the_result_should_be_true() {
//        assertTrue(result);
//    }
//
//
//    @Given("I provide a non-palindromic string")
//    public void i_provide_a_non_palindromic_string() {
//        inputString = "hello";
//    }
//
//    @When("is executed the isPalindrome static method")
//    public void is_executed_the_is_palindrome_static_method() {
//        result = StringUtils.isPalindrome(inputString);
//    }
//
//    @Then("the result should be false")
//    public void the_result_should_be_false() {
//        assertFalse(result);
//    }

}
