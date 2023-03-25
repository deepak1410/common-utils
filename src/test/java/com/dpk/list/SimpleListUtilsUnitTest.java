package com.dpk.list;

import com.dpk.list.SimpleListUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleListUtilsUnitTest {

    private final List<Integer> numbers = Arrays.asList(6, 1, 2, 8, 4, 5);

    @Test
    void canFindLargest() {
        int largest = SimpleListUtils.findLargest(numbers);
        assertEquals(8, largest);
    }

    @Test
    @DisplayName("Find the largest number - Expecting this to fail")
    void canFindLargestNumber() {
        int largest = SimpleListUtils.findLargest(numbers);
        assertEquals(6, largest, "Fails to find largest.");
    }

    @Test
    void canFindSmallest() {
        int number = SimpleListUtils.findSmallest(numbers);
        assertEquals(1, number);
    }
}