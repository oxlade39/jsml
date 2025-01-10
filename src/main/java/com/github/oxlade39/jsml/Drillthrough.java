package com.github.oxlade39.jsml;

import java.util.List;

public class Drillthrough {
    private String uniqueName;
    private String notes;
    private List<String> metrics;
    private List<AttributeReference> attributes;

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public List<String> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<String> metrics) {
        this.metrics = metrics;
    }

    public List<AttributeReference> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<AttributeReference> attributes) {
        this.attributes = attributes;
    }
}
