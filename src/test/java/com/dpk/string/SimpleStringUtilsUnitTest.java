package com.dpk.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleStringUtilsUnitTest {

    @Test
    void canReverseString() {
        String testString = "Just testing";
        String expectedString = "gnitset tsuJ";
        String reversed = SimpleStringUtils.reverse(testString);
        assertEquals(expectedString, reversed);
    }

    @Test
    void canReverseNumericText() {
        String testString = "1234";
        String expectedString = "4321";
        String reversed = SimpleStringUtils.reverse(testString);
        assertEquals(expectedString, reversed);
    }
}