package com.company.leetcode.problems.easy.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.company.leetcode.problems.easy.problem771.NumJewelsInStones;

import org.junit.jupiter.api.Test;

public class NumJewelsInStonesTest {

    @Test
    public void numJewelsInStones() {
        assertEquals(NumJewelsInStones.AllStreamsNumJewelsInStones("aA", "aAAbbbb"), 3);
        assertEquals(NumJewelsInStones.AllStreamsNumJewelsInStones("z", "ZZ"), 0);
    }
}
