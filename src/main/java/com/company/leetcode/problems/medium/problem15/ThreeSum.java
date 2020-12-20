package com.company.leetcode.problems.medium.problem15;

public class ThreeSum {

    public static String intToRoman(int num) {
        if (num - 1000 >= 0) {
            return "M" + intToRoman(num - 1000);
        }
        if (num - 900 >= 0) {
            return "CM" + intToRoman(num - 900);
        }
        if (num - 500 >= 0) {
            return "D" + intToRoman(num - 500);
        }
        if (num - 400 >= 0) {
            return "CD" + intToRoman(num - 400);
        }
        if (num - 100 >= 0) {
            return "C" + intToRoman(num - 100);
        }
        if (num - 90 >= 0) {
            return "XC" + intToRoman(num - 90);
        }
        if (num - 50 >= 0) {
            return "L" + intToRoman(num - 50);
        }
        if (num - 40 >=0) {
            return "XL" + intToRoman(num - 40);
        }
        if (num - 10 >= 0) {
            return "X" + intToRoman(num - 10);
        }
        if (num - 9 >= 0) {
            return "IX" + intToRoman(num - 9);
        }
        if (num - 5 >= 0) {
            return "V" + intToRoman(num - 5);
        }
        if (num - 4 >= 0) {
            return "IV" + intToRoman(num - 4);
        }
        if (num - 1 >= 0) {
            return "I" + intToRoman(num - 1);
        }
        return "";
    }

}
