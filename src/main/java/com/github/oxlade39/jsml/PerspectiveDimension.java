package com.github.oxlade39.jsml;

import java.util.List;

public class PerspectiveDimension {
    private String name;
    private Boolean visible;
    private List<PerspectiveHierarchy> hierarchies;
    private List<String> secondaryattributes;
    private List<String> metrics;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public List<PerspectiveHierarchy> getHierarchies() {
        return hierarchies;
    }

    public void setHierarchies(List<PerspectiveHierarchy> hierarchies) {
        this.hierarchies = hierarchies;
    }

    public List<String> getSecondaryattributes() {
        return secondaryattributes;
    }

    public void setSecondaryattributes(List<String> secondaryattributes) {
        this.secondaryattributes = secondaryattributes;
    }

    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }
}
