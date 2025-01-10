package com.github.oxlade39.jsml;

public class CalculatedMember {
    private String uniqueName;
    private String description;
    private String format;
    private String expression;
    private Boolean isDefault;
    private Boolean useInputMeasureFormat;

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getUseInputMeasureFormat() {
        return useInputMeasureFormat;
    }

    public void setUseInputMeasureFormat(Boolean useInputMeasureFormat) {
        this.useInputMeasureFormat = useInputMeasureFormat;
    }
}
