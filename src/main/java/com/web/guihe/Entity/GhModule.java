package com.web.guihe.Entity;

import java.util.List;

public class GhModule {
    private Integer mId;

    private String mIcon;

    private String mTitle;

    private String mIndex;

    private String mSubs;

    private String mFather;

    private String mChild;

    private String mSun;

    private String mB1;

    private String mB2;

    private String mB3;

    private Integer mB4;

    private Integer mB5;

    private Integer mB6;

    private List<GhModule> subs;

    public List<GhModule> getSubs() { return subs; }

    public void setSubs(List<GhModule> subs) { this.subs = subs; }

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmIcon() {
        return mIcon;
    }

    public void setmIcon(String mIcon) {
        this.mIcon = mIcon == null ? null : mIcon.trim();
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle == null ? null : mTitle.trim();
    }

    public String getmIndex() {
        return mIndex;
    }

    public void setmIndex(String mIndex) {
        this.mIndex = mIndex == null ? null : mIndex.trim();
    }

    public String getmSubs() {
        return mSubs;
    }

    public void setmSubs(String mSubs) {
        this.mSubs = mSubs == null ? null : mSubs.trim();
    }

    public String getmFather() {
        return mFather;
    }

    public void setmFather(String mFather) {
        this.mFather = mFather == null ? null : mFather.trim();
    }

    public String getmChild() {
        return mChild;
    }

    public void setmChild(String mChild) {
        this.mChild = mChild == null ? null : mChild.trim();
    }

    public String getmSun() {
        return mSun;
    }

    public void setmSun(String mSun) {
        this.mSun = mSun == null ? null : mSun.trim();
    }

    public String getmB1() {
        return mB1;
    }

    public void setmB1(String mB1) {
        this.mB1 = mB1 == null ? null : mB1.trim();
    }

    public String getmB2() {
        return mB2;
    }

    public void setmB2(String mB2) {
        this.mB2 = mB2 == null ? null : mB2.trim();
    }

    public String getmB3() {
        return mB3;
    }

    public void setmB3(String mB3) {
        this.mB3 = mB3 == null ? null : mB3.trim();
    }

    public Integer getmB4() {
        return mB4;
    }

    public void setmB4(Integer mB4) {
        this.mB4 = mB4;
    }

    public Integer getmB5() {
        return mB5;
    }

    public void setmB5(Integer mB5) {
        this.mB5 = mB5;
    }

    public Integer getmB6() {
        return mB6;
    }

    public void setmB6(Integer mB6) {
        this.mB6 = mB6;
    }
}