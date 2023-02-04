package com.dpk.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleStringUtilsUnitTest {

    @Test
    void canReverseString() {
        String testString = "Just testing";
        String expectedString = "gnitset tsuJ";
        String reversed = SimpleStringUtils.reverse(testString);
        assertEquals(expectedString, reversed);
    }
}