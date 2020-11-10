package com.company.leetcode.problems.easy.problem771;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NumJewelsInStones {

    public static int numJewelsInStoneUsingHashSet(String J, String S) {
        HashSet<Character> jewels = new HashSet<>();
        int answer = 0;
        for (Character jewel : J.toCharArray()) {
            jewels.add(jewel);
        }
        for (Character stone : S.toCharArray()) {
            if (jewels.contains(stone)) {
                answer++;
            }
        }
        return answer;
    }

    public static int numJewelsInStonesUsingHashMap(String J, String S) {

        Map<Character, Integer> occurrence = new HashMap<>();

        for (char value : S.toCharArray()) {
            occurrence.merge(value, 1, Integer::sum);
        }

        int result = 0;
        for (char value : J.toCharArray()) {
            if (occurrence.get(value) != null) {
                result += occurrence.get(value);
            }
        }

        return result;
    }


    public static int AllStreamsNumJewelsInStones(String J, String S) {
        return (int) S.chars().mapToObj(x -> (char) x).filter(x -> J.contains(String.valueOf(x))).count();
    }
}
