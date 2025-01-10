package com.github.oxlade39.jsml;

import java.util.List;

public class Dimension {
    private String uniqueName;
    private String label;
    private String objectType;
    private String description;
    private DimensionType type;
    private Boolean isDegenerate;
    private List<Hierarchy> hierarchies;
    private List<LevelAttribute> levelAttributes;
    private List<Relationship> relationships;
    private List<CalculationGroup> calculationGroups;
    private ModelerMetadata modelerMetadata;

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

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DimensionType getType() {
        return type;
    }

    public void setType(DimensionType type) {
        this.type = type;
    }

    public Boolean getIsDegenerate() {
        return isDegenerate;
    }

    public void setIsDegenerate(Boolean degenerate) {
        isDegenerate = degenerate;
    }

    public List<Hierarchy> getHierarchies() {
        return hierarchies;
    }

    public void setHierarchies(List<Hierarchy> hierarchies) {
        this.hierarchies = hierarchies;
    }

    public List<LevelAttribute> getLevelAttributes() {
        return levelAttributes;
    }

    public void setLevelAttributes(List<LevelAttribute> levelAttributes) {
        this.levelAttributes = levelAttributes;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public List<CalculationGroup> getCalculationGroups() {
        return calculationGroups;
    }

    public void setCalculationGroups(List<CalculationGroup> calculationGroups) {
        this.calculationGroups = calculationGroups;
    }

    public Boolean getDegenerate() {
        return isDegenerate;
    }

    public void setDegenerate(Boolean degenerate) {
        isDegenerate = degenerate;
    }

    public ModelerMetadata getModelerMetadata() {
        return modelerMetadata;
    }

    public void setModelerMetadata(ModelerMetadata modelerMetadata) {
        this.modelerMetadata = modelerMetadata;
    }
}
