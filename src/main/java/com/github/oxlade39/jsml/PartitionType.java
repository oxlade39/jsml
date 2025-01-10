package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PartitionType {
    NAME("name"),
    KEY("key"),
    NAME_AND_KEY("name+key"),
    ;

    private final String type;

    PartitionType(String type) {
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return type;
    }

    @JsonCreator
    public static PartitionType fromValue(String value) {
        for (PartitionType s : PartitionType.values()) {
            if (s.type.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown partition type: " + value);
    }

}
