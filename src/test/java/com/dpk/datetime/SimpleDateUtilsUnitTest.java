package com.dpk.datetime;

import org.junit.jupiter.api.Test;

import java.time.ZonedDateTime;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void getTimeInUTC() throws InterruptedException {
        ZonedDateTime zonedDateTime = ZonedDateTime.now().minusHours(4);
        System.out.println("Input Date =" + zonedDateTime);
        String dateInUTC = SimpleDateUtils.getTimeInUTC(zonedDateTime);
        System.out.println(dateInUTC);
    }
}