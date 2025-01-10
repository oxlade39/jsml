package com.github.oxlade39.jsml;

import java.util.List;

public class Level {
    private String uniqueName;
    private String description;
    private List<SecondaryAttribute> secondaryAttributes;
    private List<Alias> aliases;
    private List<MetricalAttribute> metrics;
    private String defaultMember;
    private Boolean isHidden;
    private List<Attribute> attributes;
    // NOT DOCUMENTED
    private List<ParallelPeriods> parallelPeriods;

    // Getters and setters
    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SecondaryAttribute> getSecondaryAttributes() {
        return secondaryAttributes;
    }

    public void setSecondaryAttributes(List<SecondaryAttribute> secondaryAttributes) {
        this.secondaryAttributes = secondaryAttributes;
    }

    public List<Alias> getAliases() {
        return aliases;
    }

    public void setAliases(List<Alias> aliases) {
        this.aliases = aliases;
    }

    public List<MetricalAttribute> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<MetricalAttribute> metrics) {
        this.metrics = metrics;
    }

    public String getDefaultMember() {
        return defaultMember;
    }

    public void setDefaultMember(String defaultMember) {
        this.defaultMember = defaultMember;
    }

    public Boolean getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Boolean hidden) {
        isHidden = hidden;
    }

    public List<ParallelPeriods> getParallelPeriods() {
        return parallelPeriods;
    }
}
