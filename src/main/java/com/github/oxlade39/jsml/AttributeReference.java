package com.github.oxlade39.jsml;

import java.util.List;

public class AttributeReference {
    private String name;
    private String dimension;
    private String partition;
    private String distribution;
    // NOT DOCUMENTED
    private List<String> relationshipsPath;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getPartition() {
        return partition;
    }

    public void setPartition(String partition) {
        this.partition = partition;
    }

    public String getDistribution() {
        return distribution;
    }

    public void setDistribution(String distribution) {
        this.distribution = distribution;
    }

    public List<String> getRelationshipsPath() {
        return relationshipsPath;
    }

    public void setRelationshipsPath(List<String> relationshipsPath) {
        this.relationshipsPath = relationshipsPath;
    }
}
