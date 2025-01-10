package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum UnrelatedDimensionsHandling {
    ERROR("error"),
    EMPTY("empty"),
    REPEAT("repeat"),
    ;


    private final String unrelatedDimensionsHandling;

    UnrelatedDimensionsHandling(String unrelatedDimensionsHandling) {
        this.unrelatedDimensionsHandling = unrelatedDimensionsHandling;
    }

    @JsonValue
    public String getUnrelatedDimensionsHandling() {
        return unrelatedDimensionsHandling;
    }

    @JsonCreator
    public static UnrelatedDimensionsHandling fromValue(String value) {
        for (UnrelatedDimensionsHandling s : UnrelatedDimensionsHandling.values()) {
            if (s.unrelatedDimensionsHandling.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown unrelated dimensions handling type: " + value);
    }

}
