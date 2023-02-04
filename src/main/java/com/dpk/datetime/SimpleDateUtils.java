package com.dpk.datetime;

import java.time.Duration;
import java.util.Date;

public class SimpleDateUtils {

    public static long getTimeDiffInSeconds(Date from, Date to) {
        return Duration.between(from.toInstant(), to.toInstant()).toSeconds();
    }
}
