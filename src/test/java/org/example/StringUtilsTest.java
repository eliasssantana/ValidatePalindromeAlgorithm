package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {

    @Test
    public void isNotPalindrome(){

        assertFalse(StringUtils.isPalindrome("2f1"));
        assertFalse(StringUtils.isPalindrome("-101"));
    }

    @Test
    public void isPalindrome(){
        assertTrue(StringUtils.isPalindrome("2f1f2"));
        assertTrue(StringUtils.isPalindrome("-101-"));
        assertTrue(StringUtils.isPalindrome("9"));
        assertTrue(StringUtils.isPalindrome("99"));
        assertTrue(StringUtils.isPalindrome("madam"));
    }
}
