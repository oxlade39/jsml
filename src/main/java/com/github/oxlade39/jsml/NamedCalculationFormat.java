package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NamedCalculationFormat {
    FIXED("fixed"),
    GENERAL_NUMBER("general number"),
    NONE("none"),
    PERCENT("percent"),
    SCIENTIFIC("scientific"),
    STANDARD("standard"),
    ;

    private final String format;

    NamedCalculationFormat(String format) {
        this.format = format;
    }

    @JsonValue
    public String getFormat() {
        return format;
    }

    @JsonCreator
    public static NamedCalculationFormat fromValue(String value) {
        for (NamedCalculationFormat s : NamedCalculationFormat.values()) {
            if (s.format.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown status: " + value);
    }
}
