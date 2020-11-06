package com.company.leetcode.problems.easy;

import java.util.*;
import java.util.stream.Collectors;

public class LongestSubstringWithoutRepeat {

    public static int lengthOfLongestSubstring(String val) {
        int result = 0;
        Map<Character, Integer> subStringLength = new HashMap<>();
        Queue<Character> subStringQueue = new LinkedList<>();
        Character current;
        for (int i = 0; i < val.length(); i++) {
            if (subStringLength.containsKey(val.charAt(i))) {
                result = Math.max(subStringLength.values().stream().max(Comparator.comparing(Integer::valueOf)).get(), result);
                while ((current = subStringQueue.poll()) != val.charAt(i)) {
                    subStringLength.remove(current);
                }
            }
            subStringQueue.add(val.charAt(i));
            subStringLength.put(val.charAt(i), 0);
            subStringLength.keySet().stream().forEach((x) -> {
                subStringLength.put(x, subStringLength.get(x) + 1);
            });
        }
        return Math.max(subStringLength.values().stream().max(Comparator.comparing(Integer::valueOf)).get(), result);
    }

    public static int lengthOfLongestSubStringIteration2(String val) {
        Map<Character, Integer> characterPositionMap = new HashMap<>();
        int result = 0;
        if (val.isEmpty()) {
            return 0;
        }
        for (int i = 0; i < val.length(); i++) {
            if (characterPositionMap.containsKey(val.charAt(i))) {
                result = Math.max(result, i - characterPositionMap.values().stream().min(Comparator.comparing(Integer::valueOf)).get());
                int removeFrom = characterPositionMap.get(val.charAt(i));

                characterPositionMap = characterPositionMap.entrySet().stream().filter(x -> x.getValue() > removeFrom).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
            }
            characterPositionMap.put(val.charAt(i), i);
        }
        return Math.max(result, val.length() - characterPositionMap.values().stream().min(Comparator.comparing(Integer::valueOf)).get());
    }

    public static int lengthOfLongestSubStringIteration3(String val) {
        Queue<Character> answerQueue = new LinkedList<>();
        int result = 0;
        for (Character x : val.toCharArray()) {
            if (answerQueue.contains(x)) {
                result = Math.max(result, answerQueue.size());
                while (answerQueue.peek() != x) {
                    answerQueue.poll();
                }
                answerQueue.poll();
                answerQueue.add(x);
            } else {
                answerQueue.add(x);
            }
        }
        return Math.max(result, answerQueue.size());
    }

}
