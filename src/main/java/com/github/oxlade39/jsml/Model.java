package com.github.oxlade39.jsml;

import java.util.List;

public class Model {
    private String uniqueName;
    private String objectType;
    private String label;
    private String description;
    private List<Relationship> relationships;
    private List<String> dimensions;
    private List<MetricReference> metrics;
    private List<Aggregate> aggregates;
    private List<Perspective> perspectives;
    private List<Drillthrough> drillthroughs;
    private List<Partition> partitions;
    private Boolean includeDefaultDrillthrough;
    // NOT DOCUMENTED
    private Boolean visible;

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public List<String> getDimensions() {
        return dimensions;
    }

    public void setDimensions(List<String> dimensions) {
        this.dimensions = dimensions;
    }

    public List<MetricReference> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricReference> metrics) {
        this.metrics = metrics;
    }

    public List<Aggregate> getAggregates() {
        return aggregates;
    }

    public void setAggregates(List<Aggregate> aggregates) {
        this.aggregates = aggregates;
    }

    public List<Perspective> getPerspectives() {
        return perspectives;
    }

    public void setPerspectives(List<Perspective> perspectives) {
        this.perspectives = perspectives;
    }

    public List<Drillthrough> getDrillthroughs() {
        return drillthroughs;
    }

    public void setDrillthroughs(List<Drillthrough> drillthroughs) {
        this.drillthroughs = drillthroughs;
    }

    public List<Partition> getPartitions() {
        return partitions;
    }

    public void setPartitions(List<Partition> partitions) {
        this.partitions = partitions;
    }

    public Boolean getIncludeDefaultDrillthrough() {
        return includeDefaultDrillthrough;
    }

    public void setIncludeDefaultDrillthrough(Boolean includeDefaultDrillthrough) {
        this.includeDefaultDrillthrough = includeDefaultDrillthrough;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
