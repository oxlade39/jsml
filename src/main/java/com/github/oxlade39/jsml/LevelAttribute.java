package com.github.oxlade39.jsml;

import java.util.List;

public class LevelAttribute {
    private String uniqueName;
    private String label;
    private String description;
    private String dataset;
    private String nameColumn;
    private String sortColumn;
    private List<String> keyColumns;
    private Boolean containsUniqueNames;
    private Boolean isHidden;
    private Boolean isUniqueKey;
    private Boolean excludeFromDimAgg;
    private Boolean excludeFromFactAgg;
    private TimeUnit timeUnit;
    private List<String> allowedCalcsForDma;

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

    public List<String> getKeyColumns() {
        return keyColumns;
    }

    public void setKeyColumns(List<String> keyColumns) {
        this.keyColumns = keyColumns;
    }

    public Boolean getContainsUniqueNames() {
        return containsUniqueNames;
    }

    public void setContainsUniqueNames(Boolean containsUniqueNames) {
        this.containsUniqueNames = containsUniqueNames;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public Boolean getIsUniqueKey() {
        return isUniqueKey;
    }

    public void setIsUniqueKey(Boolean uniqueKey) {
        isUniqueKey = uniqueKey;
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

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public List<String> getAllowedCalcsForDma() {
        return allowedCalcsForDma;
    }

    public void setAllowedCalcsForDma(List<String> allowedCalcsForDma) {
        this.allowedCalcsForDma = allowedCalcsForDma;
    }
}
