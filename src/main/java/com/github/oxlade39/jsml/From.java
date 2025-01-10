package com.github.oxlade39.jsml;

import java.util.List;

public class From {
    // NOT DOCUMENTED
    private String hierarchy;
    // NOT DOCUMENTED
    private String level;
    private String dataset;
    // NOT DOCUMENTED
    private List<String> joinColumns;
    private List<Column> columns;

    public String getDataset() {
        return dataset;
    }

    public void setDataset(String dataset) {
        this.dataset = dataset;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public String getHierarchy() {
        return hierarchy;
    }

    public void setHierarchy(String hierarchy) {
        this.hierarchy = hierarchy;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<String> getJoinColumns() {
        return joinColumns;
    }

    public void setJoinColumns(List<String> joinColumns) {
        this.joinColumns = joinColumns;
    }
}
