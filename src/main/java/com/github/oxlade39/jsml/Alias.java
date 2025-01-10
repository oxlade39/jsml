package com.github.oxlade39.jsml;

import java.util.List;

public class Alias {
    private String uniqueName;
    private String label;
    private String description;
    private String dataset;
    private String nameColumn;
    private String sortColumn;
    private String folder;
    private Boolean isHidden;
    private Boolean excludeFromDimAgg;
    private Boolean excludeFromFactAgg;
    private List<CustomEmptyMember> customEmptyMember;
    private List<String> allowedCalcsFromDma;

    // this one seems to be missing from the docs!
    private Object role;

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

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public String getNameColumn() {
        return nameColumn;
    }

    public void setNameColumn(String nameColumn) {
        this.nameColumn = nameColumn;
    }

    public String getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(String sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Boolean getHidden() {
        return isHidden;
    }

    public void setHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public Boolean getExcludeFromDimAgg() {
        return excludeFromDimAgg;
    }

    public void setExcludeFromDimAgg(Boolean excludeFromDimAgg) {
        this.excludeFromDimAgg = excludeFromDimAgg;
    }

    public Boolean getExcludeFromFactAgg() {
        return excludeFromFactAgg;
    }

    public void setExcludeFromFactAgg(Boolean excludeFromFactAgg) {
        this.excludeFromFactAgg = excludeFromFactAgg;
    }

    public List<CustomEmptyMember> getCustomEmptyMember() {
        return customEmptyMember;
    }

    public void setCustomEmptyMember(List<CustomEmptyMember> customEmptyMember) {
        this.customEmptyMember = customEmptyMember;
    }

    public List<String> getAllowedCalcsFromDma() {
        return allowedCalcsFromDma;
    }

    public void setAllowedCalcsFromDma(List<String> allowedCalcsFromDma) {
        this.allowedCalcsFromDma = allowedCalcsFromDma;
    }

    public Object getRole() {
        return role;
    }

    public void setRole(Object role) {
        this.role = role;
    }
}
