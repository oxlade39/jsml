package com.github.oxlade39.jsml;

import java.util.List;

public class Aggregate {
    private String uniqueName;
    private String label;
    private String targetConnection;
    private Caching caching;
    private List<String> metrics;
    private List<AttributeReference> attributes;

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getTargetConnection() {
        return targetConnection;
    }

    public void setTargetConnection(String targetConnection) {
        this.targetConnection = targetConnection;
    }

    public Caching getCaching() {
        return caching;
    }

    public void setCaching(Caching caching) {
        this.caching = caching;
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
