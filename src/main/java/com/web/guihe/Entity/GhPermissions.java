package com.web.guihe.Entity;

public class GhPermissions {
    private Integer pId;

    private String pName;

    private String pRemarks;

    private String pB1;

    private String pB2;

    private String pB3;

    private String pB4;

    private String pB5;

    private Integer pB6;

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName == null ? null : pName.trim();
    }

    public String getpRemarks() {
        return pRemarks;
    }

    public void setpRemarks(String pRemarks) {
        this.pRemarks = pRemarks == null ? null : pRemarks.trim();
    }

    public String getpB1() {
        return pB1;
    }

    public void setpB1(String pB1) {
        this.pB1 = pB1 == null ? null : pB1.trim();
    }

    public String getpB2() {
        return pB2;
    }

    public void setpB2(String pB2) {
        this.pB2 = pB2 == null ? null : pB2.trim();
    }

    public String getpB3() {
        return pB3;
    }

    public void setpB3(String pB3) {
        this.pB3 = pB3 == null ? null : pB3.trim();
    }

    public String getpB4() {
        return pB4;
    }

    public void setpB4(String pB4) {
        this.pB4 = pB4 == null ? null : pB4.trim();
    }

    public String getpB5() {
        return pB5;
    }

    public void setpB5(String pB5) {
        this.pB5 = pB5 == null ? null : pB5.trim();
    }

    public Integer getpB6() {
        return pB6;
    }

    public void setpB6(Integer pB6) {
        this.pB6 = pB6;
    }
}