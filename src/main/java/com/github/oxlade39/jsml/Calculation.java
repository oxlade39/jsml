package com.github.oxlade39.jsml;

public class Calculation {
    private String expression;
    private String uniqueName;
    private String objectType;
    private String label;
    private String description;
    private String format;
    private boolean isHidden;
    private MdxAggregationFunction mdxAggregationFunction;

    // Getters and setters
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

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

    public boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(boolean hidden) {
        isHidden = hidden;
    }

    public MdxAggregationFunction getMdxAggregationFunction() {
        return mdxAggregationFunction;
    }

    public void setMdxAggregationFunction(MdxAggregationFunction mdxAggregationFunction) {
        this.mdxAggregationFunction = mdxAggregationFunction;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
