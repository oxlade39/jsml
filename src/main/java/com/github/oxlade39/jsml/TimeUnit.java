package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TimeUnit {
    YEAR("year"),
    HALF_YEAR("halfyear"),
    TRIMESTER("trimester"),
    QUARTER("quarter"),
    MONTH("month"),
    WEEK("week"),
    DAY("day"),
    HOUR("hour"),
    MINUTE("minute"),
    SECOND("second"),
    UNDEFINED("undefined"),
    ;

    private final String timeunit;

    TimeUnit(String timeunit) {
        this.timeunit = timeunit;
    }

    @JsonValue
    public String getTimeunit() {
        return timeunit;
    }

    @JsonCreator
    public static TimeUnit fromValue(String value) {
        for (TimeUnit s : TimeUnit.values()) {
            if (s.timeunit.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown timeunit type: " + value);
    }

}
