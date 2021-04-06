package com.web.guihe.Entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data

public class GhCallSystem {
    @ExcelIgnore
    private Integer cId;

    @ExcelProperty(value = "使用人",index = 7)
    private String cUser;

    @ExcelProperty(value = "所属组",index = 8)
    private String cGroup;

    @ExcelProperty(value = "分机号",index = 1)
    private String cAccount;

    @ExcelProperty(value = "分机密码",index = 2)
    private String cPass;

    @ExcelProperty(value = "网页端账号",index = 9)
    private String cWebaccount;

    @ExcelProperty(value = "网页端密码",index = 10)
    private String cWebpass;

    @ExcelProperty(value = "号码1",index = 3)
    private String cPhone1;

    @ExcelProperty(value = "号码2",index = 4)
    private String cPhone2;

    @ExcelProperty(value = "号码3",index = 5)
    private String cPhone3;

    @ExcelProperty(value = "号码4",index = 6)
    private String cPhone4;

    @ExcelIgnore
    private Integer cOperator;

    @ExcelProperty(value = "呼叫中心编号",index = 0)
    private Integer cNum;

    @ExcelIgnore
    private Integer cState;

    @ExcelIgnore
    private String cB1;

    @ExcelIgnore
    private String cB2;

    @ExcelIgnore
    private String cB3;

    @ExcelIgnore
    private Integer cB4;

    @ExcelIgnore
    private Integer cB5;

    @ExcelIgnore
    private Integer cB6;

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    public String getcUser() {
        return cUser;
    }

    public void setcUser(String cUser) {
        this.cUser = cUser == null ? null : cUser.trim();
    }

    public String getcGroup() {
        return cGroup;
    }

    public void setcGroup(String cGroup) {
        this.cGroup = cGroup == null ? null : cGroup.trim();
    }

    public String getcAccount() {
        return cAccount;
    }

    public void setcAccount(String cAccount) {
        this.cAccount = cAccount == null ? null : cAccount.trim();
    }

    public String getcPass() {
        return cPass;
    }

    public void setcPass(String cPass) {
        this.cPass = cPass == null ? null : cPass.trim();
    }

    public String getcWebaccount() {
        return cWebaccount;
    }

    public void setcWebaccount(String cWebaccount) {
        this.cWebaccount = cWebaccount == null ? null : cWebaccount.trim();
    }

    public String getcWebpass() {
        return cWebpass;
    }

    public void setcWebpass(String cWebpass) {
        this.cWebpass = cWebpass == null ? null : cWebpass.trim();
    }

    public String getcPhone1() {
        return cPhone1;
    }

    public void setcPhone1(String cPhone1) {
        this.cPhone1 = cPhone1 == null ? null : cPhone1.trim();
    }

    public String getcPhone2() {
        return cPhone2;
    }

    public void setcPhone2(String cPhone2) {
        this.cPhone2 = cPhone2 == null ? null : cPhone2.trim();
    }

    public String getcPhone3() {
        return cPhone3;
    }

    public void setcPhone3(String cPhone3) {
        this.cPhone3 = cPhone3 == null ? null : cPhone3.trim();
    }

    public String getcPhone4() {
        return cPhone4;
    }

    public void setcPhone4(String cPhone4) {
        this.cPhone4 = cPhone4 == null ? null : cPhone4.trim();
    }

    public Integer getcOperator() {
        return cOperator;
    }

    public void setcOperator(Integer cOperator) {
        this.cOperator = cOperator;
    }

    public Integer getcNum() {
        return cNum;
    }

    public void setcNum(Integer cNum) {
        this.cNum = cNum;
    }

    public Integer getcState() {
        return cState;
    }

    public void setcState(Integer cState) {
        this.cState = cState;
    }

    public String getcB1() {
        return cB1;
    }

    public void setcB1(String cB1) {
        this.cB1 = cB1 == null ? null : cB1.trim();
    }

    public String getcB2() {
        return cB2;
    }

    public void setcB2(String cB2) {
        this.cB2 = cB2 == null ? null : cB2.trim();
    }

    public String getcB3() {
        return cB3;
    }

    public void setcB3(String cB3) {
        this.cB3 = cB3 == null ? null : cB3.trim();
    }

    public Integer getcB4() {
        return cB4;
    }

    public void setcB4(Integer cB4) {
        this.cB4 = cB4;
    }

    public Integer getcB5() {
        return cB5;
    }

    public void setcB5(Integer cB5) {
        this.cB5 = cB5;
    }

    public Integer getcB6() {
        return cB6;
    }

    public void setcB6(Integer cB6) {
        this.cB6 = cB6;
    }
}