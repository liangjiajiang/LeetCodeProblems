package com.company.leetcode.problems.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.easy.PalindromeNumber;

import org.junit.jupiter.api.Test;


public class PalindromeNumberTest {


    @Test
    public void reverseIntegerTest() {
        assertEquals(true, PalindromeNumber.isPalindrome(101));
        assertEquals(false, PalindromeNumber.isPalindrome(-1234));
        assertEquals(true, PalindromeNumber.isPalindrome(1100011));
        assertEquals(false, PalindromeNumber.isPalindrome(1234567899));
    }
}
