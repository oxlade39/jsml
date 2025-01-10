package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FilterEmpty {
    YES("yes"),
    NO("no"),
    ALWAYS("always"),
    ;

    private final String filterEmpty;

    FilterEmpty(String filterEmpty) {
        this.filterEmpty = filterEmpty;
    }

    @JsonValue
    public String getFilterEmpty() {
        return filterEmpty;
    }

    @JsonCreator
    public static FilterEmpty fromValue(String value) {
        for (FilterEmpty s : FilterEmpty.values()) {
            if (s.filterEmpty.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException("Unknown filter empty type: " + value);
    }

}
