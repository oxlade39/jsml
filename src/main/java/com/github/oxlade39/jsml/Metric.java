package com.github.oxlade39.jsml;

import java.util.List;

public class Metric {
    private String uniqueName;
    private String label;
    private String objectType;
    private String description;
    // UNDOCUMENTED
    private String folder;
    private CalculationMethod calculationMethod;
    private String dataset;
    private String column;
    private SemiAdditive semiAdditive;
    private Integer compression;
    private String nameQuantile;
    private List<Double> customQuantiles;
    private String format;
    private UnrelatedDimensionsHandling unrelatedDimensionsHandling;
    private Boolean isHidden;

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

    public CalculationMethod getCalculationMethod() {
        return calculationMethod;
    }

    public void setCalculationMethod(CalculationMethod calculationMethod) {
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

    public SemiAdditive getSemiAdditive() {
        return semiAdditive;
    }

    public void setSemiAdditive(SemiAdditive semiAdditive) {
        this.semiAdditive = semiAdditive;
    }

    public Integer getCompression() {
        return compression;
    }

    public void setCompression(Integer compression) {
        this.compression = compression;
    }

    public String getNameQuantile() {
        return nameQuantile;
    }

    public void setNameQuantile(String nameQuantile) {
        this.nameQuantile = nameQuantile;
    }

    public List<Double> getCustomQuantiles() {
        return customQuantiles;
    }

    public void setCustomQuantiles(List<Double> customQuantiles) {
        this.customQuantiles = customQuantiles;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public UnrelatedDimensionsHandling getUnrelatedDimensionsHandling() {
        return unrelatedDimensionsHandling;
    }

    public void setUnrelatedDimensionsHandling(UnrelatedDimensionsHandling unrelatedDimensionsHandling) {
        this.unrelatedDimensionsHandling = unrelatedDimensionsHandling;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }
}
