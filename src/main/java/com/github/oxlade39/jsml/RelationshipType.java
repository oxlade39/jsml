package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum RelationshipType {
    EMBEDDED("embedded"),
    SNOWFLAKE("snowflake"),
    ;


    private final String type;

    RelationshipType(String type) {
        this.type = type;
    }

    @JsonValue
    public String getType() {
        return type;
    }

    @JsonCreator
    public static RelationshipType fromValue(String value) {
        for (RelationshipType s : RelationshipType.values()) {
            if (s.type.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown filter empty type: " + value);
    }
}
