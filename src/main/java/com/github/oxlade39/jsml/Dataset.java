package com.github.oxlade39.jsml;

import java.util.List;

public class Dataset {
    private String uniqueName;
    private String objectType;
    private String label;
    private String description;
    private String connectionId;
    private String sql;
    private String table;
    private List<Column> columns;
    private List<Dialect> dialects;
    private boolean immutable;
    private Alternate alternate;
    private Incremental incremental;

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

    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public List<Dialect> getDialects() {
        return dialects;
    }

    public void setDialects(List<Dialect> dialects) {
        this.dialects = dialects;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Incremental getIncremental() {
        return incremental;
    }

    public void setIncremental(Incremental incremental) {
        this.incremental = incremental;
    }

    public boolean isImmutable() {
        return immutable;
    }

    public void setImmutable(boolean immutable) {
        this.immutable = immutable;
    }

    public Alternate getAlternate() {
        return alternate;
    }

    public void setAlternate(Alternate alternate) {
        this.alternate = alternate;
    }
}
