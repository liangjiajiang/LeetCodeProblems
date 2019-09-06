package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.easy.NumJewelsInStones;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumJewelsInStonesTest {


    @Test
    public void numJewelsInStones() {
        assertEquals(NumJewelsInStones.numJewelsInStones("aA", "aAAbbbb"),3);
        assertEquals(NumJewelsInStones.numJewelsInStones("z", "ZZ"),0);
    }
}
