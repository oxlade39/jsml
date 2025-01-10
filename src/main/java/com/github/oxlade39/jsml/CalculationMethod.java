package com.github.oxlade39.jsml;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import static java.lang.String.format;

public enum CalculationMethod {
    AVERAGE("average"),
    COUNT_DISTINCT("count distinct"),
    COUNT_NOT_NULL("count non-null"),
    ESTIMATED_COUNT_DISTINCT("estimated count distinct"),
    MAXIMUM("maximum"),
    MINIMUM("minimum"),
    PERCENTILE("percentile"),
    STDDEV_POP("stddev_pop"),
    STDDEV_SAMP("stddev_samp"),
    SUM("sum"),
    SUM_DISTINCT("sum distinct"),
    VAR_POP("var_pop"),
    VAR_SAMP("var_samp"),
    ;

    private final String calculationMethod;

    CalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    @JsonValue
    public String getCalculationMethod() {
        return calculationMethod;
    }

    @JsonCreator
    public static CalculationMethod fromValue(String value) {
        for (CalculationMethod s : CalculationMethod.values()) {
            if (s.calculationMethod.equals(value)) {
                return s;
            }
        }
        throw new IllegalArgumentException(format("Unknown calculation method type: '%s'", value));
    }

}
