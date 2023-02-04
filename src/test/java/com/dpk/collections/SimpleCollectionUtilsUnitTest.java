package com.dpk.collections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleCollectionUtilsUnitTest {

    private final List<Integer> numbers = Arrays.asList(6, 1, 2, 8, 4, 5);

    @Test
    void canFindLargest() {
        int largest = SimpleCollectionUtils.findLargest(numbers);
        assertEquals(8, largest);
    }

    @Test
    void canFindLargestFails() {
        int largest = SimpleCollectionUtils.findLargest(numbers);
        assertEquals(6, largest, "Fails to find largest.");
    }

    @Test
    void canFindSmallest() {
        int number = SimpleCollectionUtils.findSmallest(numbers);
        assertEquals(1, number);
    }
}