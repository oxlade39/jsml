package com.github.oxlade39.jsml;

public class Relationship {
    private String uniqueName;
    private From from;
    private To to;
    private String rolePlay;
    private RelationshipType type;
    private Boolean m2m;

    public String getUniqueName() {
        return uniqueName;
    }

    public void setUniqueName(String uniqueName) {
        this.uniqueName = uniqueName;
    }

    public From getFrom() {
        return from;
    }

    public void setFrom(From from) {
        this.from = from;
    }

    public To getTo() {
        return to;
    }

    public void setTo(To to) {
        this.to = to;
    }

    public String getRolePlay() {
        return rolePlay;
    }

    public void setRolePlay(String rolePlay) {
        this.rolePlay = rolePlay;
    }

    public RelationshipType getType() {
        return type;
    }

    public void setType(RelationshipType type) {
        this.type = type;
    }

    public Boolean getM2m() {
        return m2m;
    }

    public void setM2m(Boolean m2m) {
        this.m2m = m2m;
    }
}
