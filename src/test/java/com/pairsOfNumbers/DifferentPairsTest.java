package com.pairsOfNumbers;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class DifferentPairsTest {
    @Test
    public void findPairsSumPositive() {
        final int[] array = {6, 7, 1, 9, 1, 1, 0, 1, 9, 2, 3};
        final int sum = 12;

        final Map<Integer, Integer> pairs = DifferentPairs.findPairs(array, sum);

        assertTrue(pairs.containsKey(6));
        assertTrue(pairs.containsValue(6));
    }

    @Test
    public void findPairsSumNegative() {
        final int[] array = {6, 7, 1, 9, 1, 1, 0, 1, 9, 2, 3};
        final int sum = 12;

        final Map<Integer, Integer> pairs = DifferentPairs.findPairs(array, sum);

        assertFalse(pairs.containsKey(1));
    }
}