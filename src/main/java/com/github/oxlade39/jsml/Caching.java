package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Caching {
    ENGINE_MEMORY("engine-memory"),
    ;

    private final String caching;

    Caching(String caching) {
        this.caching = caching;
    }

    @JsonValue
    public String getCaching() {
        return caching;
    }

    @JsonCreator
    public static Caching fromValue(String value) {
        for (Caching s : Caching.values()) {
            if (s.caching.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown filter empty type: " + value);
    }

}
