package com.github.oxlade39.jsml;

import java.util.List;

public class Hierarchy {
    private String uniqueName;
    private String label;
    // UNDOCUMENTED!
    private String description;
    private String folder;
    private FilterEmpty filterEmpty;
    private List<Level> levels;

    // Getters and setters
    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public FilterEmpty getFilterEmpty() {
        return filterEmpty;
    }

    public void setFilterEmpty(FilterEmpty filterEmpty) {
        this.filterEmpty = filterEmpty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
