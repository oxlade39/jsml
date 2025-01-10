package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum DimensionType {
    STANDARD("standard"),
    TIME("time"),
    ;

    private final String type;

    DimensionType(String type) {
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return type;
    }

    @JsonCreator
    public static DimensionType fromValue(String value) {
        for (DimensionType s : DimensionType.values()) {
            if (s.type.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown dimension type: " + value);
    }
}
