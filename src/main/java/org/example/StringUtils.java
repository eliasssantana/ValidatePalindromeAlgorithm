package org.example;

import org.jetbrains.annotations.NotNull;

public class StringUtils {
    public static boolean isPalindrome(@NotNull String text){
        final int length = text.length();

        for (int idx = 0; idx < length / 2; idx++){
            if (text.charAt(idx) != text.charAt(length - 1 - idx)) return false;
        }
        return true;
    }
}
