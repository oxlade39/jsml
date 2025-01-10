package com.github.oxlade39.jsml;

import java.util.List;

public class Partition {
    private String uniqueName;
    private String dimension;
    private String attribute;
    private PartitionType type;
    // NOT DOCUMENTED
    private List<String> relationshipsPath;

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public PartitionType getType() {
        return type;
    }

    public void setType(PartitionType type) {
        this.type = type;
    }

    public List<String> getRelationshipsPath() {
        return relationshipsPath;
    }

    public void setRelationshipsPath(List<String> relationshipsPath) {
        this.relationshipsPath = relationshipsPath;
    }
}
