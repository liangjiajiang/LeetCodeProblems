package com.company.leetcode.problems.medium;

public class StringToInteger {

    public static int myAtoi(String str) {
        str = str.trim();

        if (str.length() != 0 && (Character.isDigit(str.charAt(0)) || '+' == str.charAt(0) || '-' == str.charAt(0))) {

            int counter = '-' == str.charAt(0) || '+' == str.charAt(0) ? 1 : 0;
            StringBuilder numbers = new StringBuilder();
            while (counter < str.length() && Character.isDigit(str.charAt(counter))) {
                if (str.charAt(counter) == '0' && numbers.length() == 0) {
                    counter++;
                } else {
                    numbers.append(str.charAt(counter++));

                }

            }
            if (numbers.length() == 0) {
                return 0;
            } else if (numbers.length() > 10) {
                return '-' == str.charAt(0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            long results = Long.valueOf(numbers.toString());
            if ('-' == str.charAt(0)) {
                return results * -1 < Integer.MIN_VALUE ? Integer.MIN_VALUE : (int) (results * -1);
            } else {
                return results > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (results);

            }
        } else {
            return 0;
        }

    }

}
