package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.easy.PalindromeNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {


    @Test
    public void reverseIntegerTest() {
        assertEquals(true, PalindromeNumber.isPalindrome(101));
        assertEquals(false, PalindromeNumber.isPalindrome(-1234));
        assertEquals(true, PalindromeNumber.isPalindrome(1100011));
        assertEquals(false, PalindromeNumber.isPalindrome(1234567899));
    }
}
