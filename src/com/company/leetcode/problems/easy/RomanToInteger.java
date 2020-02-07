package com.company.leetcode.problems.easy;

public class RomanToInteger {

    public static int romanToInt(String s) {
        int len = s.length();
        char previous = s.charAt(0);
        int result = convertValue(previous);
        for (int i = 1; i < len; i++) {
            if (convertValue(previous) < convertValue(s.charAt(i))) {
                result += -convertValue(previous) * 2;
            }
            result += convertValue(s.charAt(i));
            previous = s.charAt(i);
        }

        return result;
    }

    static int convertValue(char roman) {
        switch (roman) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
