package com.web.guihe.Entity;

import java.util.List;

public class GhRole {
    private Integer rId;

    private String rName;

    private String rRemarks;

    private String rB1;

    private String rB2;

    private String rB3;

    private Integer rB4;

    private Integer rB5;

    private Integer rB6;

    private String ghPermissions;

    public String getGhPermissions() { return ghPermissions; }

    public void setGhPermissions(String ghPermissions) { this.ghPermissions = ghPermissions; }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public String getrRemarks() {
        return rRemarks;
    }

    public void setrRemarks(String rRemarks) {
        this.rRemarks = rRemarks == null ? null : rRemarks.trim();
    }

    public String getrB1() {
        return rB1;
    }

    public void setrB1(String rB1) {
        this.rB1 = rB1 == null ? null : rB1.trim();
    }

    public String getrB2() {
        return rB2;
    }

    public void setrB2(String rB2) {
        this.rB2 = rB2 == null ? null : rB2.trim();
    }

    public String getrB3() {
        return rB3;
    }

    public void setrB3(String rB3) {
        this.rB3 = rB3 == null ? null : rB3.trim();
    }

    public Integer getrB4() {
        return rB4;
    }

    public void setrB4(Integer rB4) {
        this.rB4 = rB4;
    }

    public Integer getrB5() {
        return rB5;
    }

    public void setrB5(Integer rB5) {
        this.rB5 = rB5;
    }

    public Integer getrB6() {
        return rB6;
    }

    public void setrB6(Integer rB6) {
        this.rB6 = rB6;
    }
}