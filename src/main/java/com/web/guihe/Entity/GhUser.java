package com.web.guihe.Entity;

public class GhUser {
    private Integer uId;

    private String uName;

    private String uUser;

    private String uPass;

    private String uSalt;

    private Integer uState;

    private Integer uNum;

    private Integer uErr;

    private Integer uRId;

    private String uB1;

    private String uB2;

    private String uB3;

    private Integer uB4;

    private Integer uB5;

    private Integer uB6;

    private GhRole ghRole;

    public GhRole getGhRole() { return ghRole; }

    public void setGhRole(GhRole ghRole) { this.ghRole = ghRole; }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName == null ? null : uName.trim();
    }

    public String getuUser() {
        return uUser;
    }

    public void setuUser(String uUser) {
        this.uUser = uUser == null ? null : uUser.trim();
    }

    public String getuPass() {
        return uPass;
    }

    public void setuPass(String uPass) {
        this.uPass = uPass == null ? null : uPass.trim();
    }

    public String getuSalt() {
        return uSalt;
    }

    public void setuSalt(String uSalt) {
        this.uSalt = uSalt == null ? null : uSalt.trim();
    }

    public Integer getuState() {
        return uState;
    }

    public void setuState(Integer uState) {
        this.uState = uState;
    }

    public Integer getuNum() {
        return uNum;
    }

    public void setuNum(Integer uNum) {
        this.uNum = uNum;
    }

    public Integer getuErr() {
        return uErr;
    }

    public void setuErr(Integer uErr) {
        this.uErr = uErr;
    }

    public Integer getuRId() {
        return uRId;
    }

    public void setuRId(Integer uRId) {
        this.uRId = uRId;
    }

    public String getuB1() {
        return uB1;
    }

    public void setuB1(String uB1) {
        this.uB1 = uB1 == null ? null : uB1.trim();
    }

    public String getuB2() {
        return uB2;
    }

    public void setuB2(String uB2) {
        this.uB2 = uB2 == null ? null : uB2.trim();
    }

    public String getuB3() {
        return uB3;
    }

    public void setuB3(String uB3) {
        this.uB3 = uB3 == null ? null : uB3.trim();
    }

    public Integer getuB4() {
        return uB4;
    }

    public void setuB4(Integer uB4) {
        this.uB4 = uB4;
    }

    public Integer getuB5() {
        return uB5;
    }

    public void setuB5(Integer uB5) {
        this.uB5 = uB5;
    }

    public Integer getuB6() {
        return uB6;
    }

    public void setuB6(Integer uB6) {
        this.uB6 = uB6;
    }
}