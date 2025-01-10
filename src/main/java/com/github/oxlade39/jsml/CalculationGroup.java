package com.github.oxlade39.jsml;

import java.util.List;

public class CalculationGroup {
    private String uniqueName;
    private String label;
    private String description;
    private String folder;
    private List<CalculatedMember> calculatedMembers;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public List<CalculatedMember> getCalculatedMembers() {
        return calculatedMembers;
    }

    public void setCalculatedMembers(List<CalculatedMember> calculatedMembers) {
        this.calculatedMembers = calculatedMembers;
    }
}
