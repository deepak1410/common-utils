package com.dpk.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class SimpleDateUtils {

    public static long getTimeDiffInSeconds(Date from, Date to) {
        return Duration.between(from.toInstant(), to.toInstant()).toSeconds();
    }

    public static String getTimeInUTC(ZonedDateTime zonedDateTime) {
        return ZonedDateTime.ofInstant(zonedDateTime.toInstant(), ZoneId.of("UTC")).toString();
    }
}
