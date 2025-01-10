package com.github.oxlade39.jsml;

import java.util.List;
import java.util.Map;

public class Column {
    private String name;
    private String dataType;
    private String sql;
    private List<Dialect> dialects;
    private Map<String, String> map;
    private String parentColumn;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
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

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public String getParentColumn() {
        return parentColumn;
    }

    public void setParentColumn(String parentColumn) {
        this.parentColumn = parentColumn;
    }
}
