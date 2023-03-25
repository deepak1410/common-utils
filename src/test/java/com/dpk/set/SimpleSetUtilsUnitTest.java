package com.dpk.set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleSetUtilsUnitTest {

    private static final Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
    private static final Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8));


    @Test
    void canGetUnion() {
        Set<Integer> result = SimpleSetUtils.union(set1, set2);
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        assertEquals(expectedResult, result);
    }

    @Test
    void canGetIntersection() {
        Set<Integer> result = SimpleSetUtils.intersection(set1, set2);
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(4, 5));
        assertEquals(expectedResult, result);
    }

    @Test
    void canGetDifference() {
        Set<Integer> result = SimpleSetUtils.minus(set1, set2);
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(1, 2, 3));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Test to get unique items. Expecting this to fail.")
    void canGetUnique() {
        Set<Integer> result = SimpleSetUtils.minus(set1, set2);
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(6, 7, 8));
        assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Test to get combined result. Expecting this to fail.")
    void canGetMergeItems() {
        Set<Integer> result = SimpleSetUtils.union(set1, set2);
        Set<Integer> expectedResult = new HashSet<>(Arrays.asList(1, 2, 3, 6, 7, 8));
        assertEquals(expectedResult, result);
    }
}