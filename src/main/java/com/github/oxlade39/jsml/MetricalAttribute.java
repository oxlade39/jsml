package com.github.oxlade39.jsml;

import java.util.List;

public class MetricalAttribute {
    private String uniqueName;
    private String label;
    private String description;
    private String folder;
    private String format;
    private String calculationMethod;
    private String dataset;
    private String column;
    private Boolean isHidden;
    private Boolean excludeFromDimAgg;
    private Boolean excludeFromFactAgg;
    private CustomEmptyMember customEmptyMember;
    private UnrelatedDimensionsHandling unrelatedDimensionsHandling;
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

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(String calculationMethod) {
        this.calculationMethod = calculationMethod;
    }

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public String getColumn() {
        return column;
    }

    public void setColumn(String column) {
        this.column = column;
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

    public CustomEmptyMember getCustomEmptyMember() {
        return customEmptyMember;
    }

    public void setCustomEmptyMember(CustomEmptyMember customEmptyMember) {
        this.customEmptyMember = customEmptyMember;
    }

    public UnrelatedDimensionsHandling getUnrelatedDimensionsHandling() {
        return unrelatedDimensionsHandling;
    }

    public void setUnrelatedDimensionsHandling(UnrelatedDimensionsHandling unrelatedDimensionsHandling) {
        this.unrelatedDimensionsHandling = unrelatedDimensionsHandling;
    }

    public List<String> getAllowedCalcsForDma() {
        return allowedCalcsForDma;
    }

    public void setAllowedCalcsForDma(List<String> allowedCalcsForDma) {
        this.allowedCalcsForDma = allowedCalcsForDma;
    }
}
