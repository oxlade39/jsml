package com.github.oxlade39.jsml;

public class Connection {
    private String uniqueName;
    private String objectType;
    private String label;
    private String asConnection;
    private String database;
    private String schema;

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

    public String getAsConnection() {
        return asConnection;
    }

    public void setAsConnection(String asConnection) {
        this.asConnection = asConnection;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }
}
