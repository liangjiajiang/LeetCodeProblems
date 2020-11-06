package com.company.leetcode.problems.easy.test;

import com.company.leetcode.problems.easy.NumJewelsInStones;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumJewelsInStonesTest {


    @Test
    public void numJewelsInStones() {
        Assert.assertEquals(NumJewelsInStones.AllStreamsNumJewelsInStones("aA", "aAAbbbb"), 3);
        assertEquals(NumJewelsInStones.AllStreamsNumJewelsInStones("z", "ZZ"), 0);
    }
}
