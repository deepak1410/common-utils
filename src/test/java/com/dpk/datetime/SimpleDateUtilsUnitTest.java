package com.dpk.datetime;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class SimpleDateUtilsUnitTest {

    @Test
    void getTimeDiffInSeconds() throws InterruptedException {

        Long fromTime = 1675364621999L;
        Long toTime = 1675364624003L;

        Date from = new Date();
        Date to = new Date();

        from.setTime(fromTime);
        to.setTime(toTime);

        long duration = SimpleDateUtils.getTimeDiffInSeconds(from, to);
        assertEquals(2, duration, "Time difference didn't match");
    }

    @Test
    void getTimeDiffInSecondsFails() throws InterruptedException {

        Long fromTime = 1675364621999L;
        Long toTime = 1675364624003L;

        Date from = new Date();
        Date to = new Date();

        from.setTime(fromTime);
        to.setTime(toTime);

        long duration = SimpleDateUtils.getTimeDiffInSeconds(from, to);
        assertEquals(4, duration, "Time difference didn't match");
    }
}