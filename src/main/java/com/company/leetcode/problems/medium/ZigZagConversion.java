package com.company.leetcode.problems.medium;

public class ZigZagConversion {

    private static final int EDGES = 2;
    private static final int SIDES = 2;

    public static String convert(String s, int numRows) {
        if (numRows <= 1) {
            return s;
        }
        char[] conversion = new char[s.length()];
        int counter = 0;
        final int maxHops = (numRows - EDGES) * SIDES + EDGES;
        int startingHops = maxHops;
        int hops = startingHops;
        for (int i = 0; i < numRows; i++) {
            int multiplier = i;
            while (multiplier < s.length()) {
                conversion[counter++] = s.charAt(multiplier);
                multiplier += hops;
                if (hops != maxHops) {
                    hops = (maxHops - hops);
                }
            }
            startingHops -= EDGES;
            hops = startingHops;
            if (hops == 0) {
                hops = maxHops;
            }
        }
        return new String(conversion);
    }

}
//                                                  2 +2              = 2
//    0|4 |8 |12|1 |3 |5 |7 |9 |11|13|2 |6 |10      3 +4     x-2*2+2 = 4
//    0|+4|+4|+4|0 |+2|+2|+2|+2|+2|+2|0 |+4|+4
//
//    0|6 |12|1 |5 |7 |11|13|2 |4 |8 |10|3 |9       4 +6    (x-2)*2+2 = 6
//    0|+6|+6|0 |+4|+2|+4|+2|0 |+2|+4|+2|0 |+6

//    0|8 |1 |7 |9 |2 |6 |10|3 |5 |11|13|4 |12      5 +8   (x-2)*2+2 = 8
//    0|+8|0 |+6|+2|0 |+4|+4|0 |+2|+6|+2|0 |+8

//0      8          16
//1    7 9      15 17
//2   6  10    14   18
//3 5    11 13      19
//4      12         20