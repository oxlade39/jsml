package com.github.oxlade39.jsml;

import java.util.List;

public class Perspective {
    private String uniqueName;
    private List<String> metrics;
    private List<PerspectiveDimension> dimensions;

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public List<PerspectiveDimension> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<PerspectiveDimension> dimensions) {
        this.dimensions = dimensions;
    }
}
