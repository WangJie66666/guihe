package com.web.guihe.Entity;

import java.util.ArrayList;
import java.util.List;

public class GhCallSystemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhCallSystemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCIdIsNull() {
            addCriterion("c_id is null");
            return (Criteria) this;
        }

        public Criteria andCIdIsNotNull() {
            addCriterion("c_id is not null");
            return (Criteria) this;
        }

        public Criteria andCIdEqualTo(Integer value) {
            addCriterion("c_id =", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotEqualTo(Integer value) {
            addCriterion("c_id <>", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThan(Integer value) {
            addCriterion("c_id >", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_id >=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThan(Integer value) {
            addCriterion("c_id <", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdLessThanOrEqualTo(Integer value) {
            addCriterion("c_id <=", value, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdIn(List<Integer> values) {
            addCriterion("c_id in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotIn(List<Integer> values) {
            addCriterion("c_id not in", values, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdBetween(Integer value1, Integer value2) {
            addCriterion("c_id between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCIdNotBetween(Integer value1, Integer value2) {
            addCriterion("c_id not between", value1, value2, "cId");
            return (Criteria) this;
        }

        public Criteria andCUserIsNull() {
            addCriterion("c_user is null");
            return (Criteria) this;
        }

        public Criteria andCUserIsNotNull() {
            addCriterion("c_user is not null");
            return (Criteria) this;
        }

        public Criteria andCUserEqualTo(String value) {
            addCriterion("c_user =", value, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserNotEqualTo(String value) {
            addCriterion("c_user <>", value, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserGreaterThan(String value) {
            addCriterion("c_user >", value, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserGreaterThanOrEqualTo(String value) {
            addCriterion("c_user >=", value, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserLessThan(String value) {
            addCriterion("c_user <", value, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserLessThanOrEqualTo(String value) {
            addCriterion("c_user <=", value, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserLike(String value) {
            addCriterion("c_user like", value, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserNotLike(String value) {
            addCriterion("c_user not like", value, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserIn(List<String> values) {
            addCriterion("c_user in", values, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserNotIn(List<String> values) {
            addCriterion("c_user not in", values, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserBetween(String value1, String value2) {
            addCriterion("c_user between", value1, value2, "cUser");
            return (Criteria) this;
        }

        public Criteria andCUserNotBetween(String value1, String value2) {
            addCriterion("c_user not between", value1, value2, "cUser");
            return (Criteria) this;
        }

        public Criteria andCGroupIsNull() {
            addCriterion("c_group is null");
            return (Criteria) this;
        }

        public Criteria andCGroupIsNotNull() {
            addCriterion("c_group is not null");
            return (Criteria) this;
        }

        public Criteria andCGroupEqualTo(String value) {
            addCriterion("c_group =", value, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupNotEqualTo(String value) {
            addCriterion("c_group <>", value, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupGreaterThan(String value) {
            addCriterion("c_group >", value, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupGreaterThanOrEqualTo(String value) {
            addCriterion("c_group >=", value, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupLessThan(String value) {
            addCriterion("c_group <", value, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupLessThanOrEqualTo(String value) {
            addCriterion("c_group <=", value, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupLike(String value) {
            addCriterion("c_group like", value, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupNotLike(String value) {
            addCriterion("c_group not like", value, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupIn(List<String> values) {
            addCriterion("c_group in", values, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupNotIn(List<String> values) {
            addCriterion("c_group not in", values, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupBetween(String value1, String value2) {
            addCriterion("c_group between", value1, value2, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCGroupNotBetween(String value1, String value2) {
            addCriterion("c_group not between", value1, value2, "cGroup");
            return (Criteria) this;
        }

        public Criteria andCAccountIsNull() {
            addCriterion("c_account is null");
            return (Criteria) this;
        }

        public Criteria andCAccountIsNotNull() {
            addCriterion("c_account is not null");
            return (Criteria) this;
        }

        public Criteria andCAccountEqualTo(String value) {
            addCriterion("c_account =", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountNotEqualTo(String value) {
            addCriterion("c_account <>", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountGreaterThan(String value) {
            addCriterion("c_account >", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountGreaterThanOrEqualTo(String value) {
            addCriterion("c_account >=", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountLessThan(String value) {
            addCriterion("c_account <", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountLessThanOrEqualTo(String value) {
            addCriterion("c_account <=", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountLike(String value) {
            addCriterion("c_account like", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountNotLike(String value) {
            addCriterion("c_account not like", value, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountIn(List<String> values) {
            addCriterion("c_account in", values, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountNotIn(List<String> values) {
            addCriterion("c_account not in", values, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountBetween(String value1, String value2) {
            addCriterion("c_account between", value1, value2, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCAccountNotBetween(String value1, String value2) {
            addCriterion("c_account not between", value1, value2, "cAccount");
            return (Criteria) this;
        }

        public Criteria andCPassIsNull() {
            addCriterion("c_pass is null");
            return (Criteria) this;
        }

        public Criteria andCPassIsNotNull() {
            addCriterion("c_pass is not null");
            return (Criteria) this;
        }

        public Criteria andCPassEqualTo(String value) {
            addCriterion("c_pass =", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassNotEqualTo(String value) {
            addCriterion("c_pass <>", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassGreaterThan(String value) {
            addCriterion("c_pass >", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassGreaterThanOrEqualTo(String value) {
            addCriterion("c_pass >=", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassLessThan(String value) {
            addCriterion("c_pass <", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassLessThanOrEqualTo(String value) {
            addCriterion("c_pass <=", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassLike(String value) {
            addCriterion("c_pass like", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassNotLike(String value) {
            addCriterion("c_pass not like", value, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassIn(List<String> values) {
            addCriterion("c_pass in", values, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassNotIn(List<String> values) {
            addCriterion("c_pass not in", values, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassBetween(String value1, String value2) {
            addCriterion("c_pass between", value1, value2, "cPass");
            return (Criteria) this;
        }

        public Criteria andCPassNotBetween(String value1, String value2) {
            addCriterion("c_pass not between", value1, value2, "cPass");
            return (Criteria) this;
        }

        public Criteria andCWebaccountIsNull() {
            addCriterion("c_webaccount is null");
            return (Criteria) this;
        }

        public Criteria andCWebaccountIsNotNull() {
            addCriterion("c_webaccount is not null");
            return (Criteria) this;
        }

        public Criteria andCWebaccountEqualTo(String value) {
            addCriterion("c_webaccount =", value, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountNotEqualTo(String value) {
            addCriterion("c_webaccount <>", value, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountGreaterThan(String value) {
            addCriterion("c_webaccount >", value, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountGreaterThanOrEqualTo(String value) {
            addCriterion("c_webaccount >=", value, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountLessThan(String value) {
            addCriterion("c_webaccount <", value, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountLessThanOrEqualTo(String value) {
            addCriterion("c_webaccount <=", value, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountLike(String value) {
            addCriterion("c_webaccount like", value, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountNotLike(String value) {
            addCriterion("c_webaccount not like", value, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountIn(List<String> values) {
            addCriterion("c_webaccount in", values, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountNotIn(List<String> values) {
            addCriterion("c_webaccount not in", values, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountBetween(String value1, String value2) {
            addCriterion("c_webaccount between", value1, value2, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebaccountNotBetween(String value1, String value2) {
            addCriterion("c_webaccount not between", value1, value2, "cWebaccount");
            return (Criteria) this;
        }

        public Criteria andCWebpassIsNull() {
            addCriterion("c_webpass is null");
            return (Criteria) this;
        }

        public Criteria andCWebpassIsNotNull() {
            addCriterion("c_webpass is not null");
            return (Criteria) this;
        }

        public Criteria andCWebpassEqualTo(String value) {
            addCriterion("c_webpass =", value, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassNotEqualTo(String value) {
            addCriterion("c_webpass <>", value, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassGreaterThan(String value) {
            addCriterion("c_webpass >", value, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassGreaterThanOrEqualTo(String value) {
            addCriterion("c_webpass >=", value, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassLessThan(String value) {
            addCriterion("c_webpass <", value, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassLessThanOrEqualTo(String value) {
            addCriterion("c_webpass <=", value, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassLike(String value) {
            addCriterion("c_webpass like", value, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassNotLike(String value) {
            addCriterion("c_webpass not like", value, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassIn(List<String> values) {
            addCriterion("c_webpass in", values, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassNotIn(List<String> values) {
            addCriterion("c_webpass not in", values, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassBetween(String value1, String value2) {
            addCriterion("c_webpass between", value1, value2, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCWebpassNotBetween(String value1, String value2) {
            addCriterion("c_webpass not between", value1, value2, "cWebpass");
            return (Criteria) this;
        }

        public Criteria andCPhone1IsNull() {
            addCriterion("c_phone1 is null");
            return (Criteria) this;
        }

        public Criteria andCPhone1IsNotNull() {
            addCriterion("c_phone1 is not null");
            return (Criteria) this;
        }

        public Criteria andCPhone1EqualTo(String value) {
            addCriterion("c_phone1 =", value, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1NotEqualTo(String value) {
            addCriterion("c_phone1 <>", value, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1GreaterThan(String value) {
            addCriterion("c_phone1 >", value, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1GreaterThanOrEqualTo(String value) {
            addCriterion("c_phone1 >=", value, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1LessThan(String value) {
            addCriterion("c_phone1 <", value, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1LessThanOrEqualTo(String value) {
            addCriterion("c_phone1 <=", value, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1Like(String value) {
            addCriterion("c_phone1 like", value, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1NotLike(String value) {
            addCriterion("c_phone1 not like", value, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1In(List<String> values) {
            addCriterion("c_phone1 in", values, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1NotIn(List<String> values) {
            addCriterion("c_phone1 not in", values, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1Between(String value1, String value2) {
            addCriterion("c_phone1 between", value1, value2, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone1NotBetween(String value1, String value2) {
            addCriterion("c_phone1 not between", value1, value2, "cPhone1");
            return (Criteria) this;
        }

        public Criteria andCPhone2IsNull() {
            addCriterion("c_phone2 is null");
            return (Criteria) this;
        }

        public Criteria andCPhone2IsNotNull() {
            addCriterion("c_phone2 is not null");
            return (Criteria) this;
        }

        public Criteria andCPhone2EqualTo(String value) {
            addCriterion("c_phone2 =", value, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2NotEqualTo(String value) {
            addCriterion("c_phone2 <>", value, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2GreaterThan(String value) {
            addCriterion("c_phone2 >", value, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("c_phone2 >=", value, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2LessThan(String value) {
            addCriterion("c_phone2 <", value, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2LessThanOrEqualTo(String value) {
            addCriterion("c_phone2 <=", value, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2Like(String value) {
            addCriterion("c_phone2 like", value, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2NotLike(String value) {
            addCriterion("c_phone2 not like", value, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2In(List<String> values) {
            addCriterion("c_phone2 in", values, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2NotIn(List<String> values) {
            addCriterion("c_phone2 not in", values, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2Between(String value1, String value2) {
            addCriterion("c_phone2 between", value1, value2, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone2NotBetween(String value1, String value2) {
            addCriterion("c_phone2 not between", value1, value2, "cPhone2");
            return (Criteria) this;
        }

        public Criteria andCPhone3IsNull() {
            addCriterion("c_phone3 is null");
            return (Criteria) this;
        }

        public Criteria andCPhone3IsNotNull() {
            addCriterion("c_phone3 is not null");
            return (Criteria) this;
        }

        public Criteria andCPhone3EqualTo(String value) {
            addCriterion("c_phone3 =", value, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3NotEqualTo(String value) {
            addCriterion("c_phone3 <>", value, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3GreaterThan(String value) {
            addCriterion("c_phone3 >", value, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3GreaterThanOrEqualTo(String value) {
            addCriterion("c_phone3 >=", value, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3LessThan(String value) {
            addCriterion("c_phone3 <", value, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3LessThanOrEqualTo(String value) {
            addCriterion("c_phone3 <=", value, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3Like(String value) {
            addCriterion("c_phone3 like", value, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3NotLike(String value) {
            addCriterion("c_phone3 not like", value, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3In(List<String> values) {
            addCriterion("c_phone3 in", values, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3NotIn(List<String> values) {
            addCriterion("c_phone3 not in", values, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3Between(String value1, String value2) {
            addCriterion("c_phone3 between", value1, value2, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone3NotBetween(String value1, String value2) {
            addCriterion("c_phone3 not between", value1, value2, "cPhone3");
            return (Criteria) this;
        }

        public Criteria andCPhone4IsNull() {
            addCriterion("c_phone4 is null");
            return (Criteria) this;
        }

        public Criteria andCPhone4IsNotNull() {
            addCriterion("c_phone4 is not null");
            return (Criteria) this;
        }

        public Criteria andCPhone4EqualTo(String value) {
            addCriterion("c_phone4 =", value, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4NotEqualTo(String value) {
            addCriterion("c_phone4 <>", value, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4GreaterThan(String value) {
            addCriterion("c_phone4 >", value, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4GreaterThanOrEqualTo(String value) {
            addCriterion("c_phone4 >=", value, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4LessThan(String value) {
            addCriterion("c_phone4 <", value, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4LessThanOrEqualTo(String value) {
            addCriterion("c_phone4 <=", value, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4Like(String value) {
            addCriterion("c_phone4 like", value, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4NotLike(String value) {
            addCriterion("c_phone4 not like", value, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4In(List<String> values) {
            addCriterion("c_phone4 in", values, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4NotIn(List<String> values) {
            addCriterion("c_phone4 not in", values, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4Between(String value1, String value2) {
            addCriterion("c_phone4 between", value1, value2, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCPhone4NotBetween(String value1, String value2) {
            addCriterion("c_phone4 not between", value1, value2, "cPhone4");
            return (Criteria) this;
        }

        public Criteria andCOperatorIsNull() {
            addCriterion("c_operator is null");
            return (Criteria) this;
        }

        public Criteria andCOperatorIsNotNull() {
            addCriterion("c_operator is not null");
            return (Criteria) this;
        }

        public Criteria andCOperatorEqualTo(Integer value) {
            addCriterion("c_operator =", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorNotEqualTo(Integer value) {
            addCriterion("c_operator <>", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorGreaterThan(Integer value) {
            addCriterion("c_operator >", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_operator >=", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorLessThan(Integer value) {
            addCriterion("c_operator <", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorLessThanOrEqualTo(Integer value) {
            addCriterion("c_operator <=", value, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorIn(List<Integer> values) {
            addCriterion("c_operator in", values, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorNotIn(List<Integer> values) {
            addCriterion("c_operator not in", values, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorBetween(Integer value1, Integer value2) {
            addCriterion("c_operator between", value1, value2, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCOperatorNotBetween(Integer value1, Integer value2) {
            addCriterion("c_operator not between", value1, value2, "cOperator");
            return (Criteria) this;
        }

        public Criteria andCNumIsNull() {
            addCriterion("c_num is null");
            return (Criteria) this;
        }

        public Criteria andCNumIsNotNull() {
            addCriterion("c_num is not null");
            return (Criteria) this;
        }

        public Criteria andCNumEqualTo(Integer value) {
            addCriterion("c_num =", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotEqualTo(Integer value) {
            addCriterion("c_num <>", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumGreaterThan(Integer value) {
            addCriterion("c_num >", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_num >=", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLessThan(Integer value) {
            addCriterion("c_num <", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLessThanOrEqualTo(Integer value) {
            addCriterion("c_num <=", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumIn(List<Integer> values) {
            addCriterion("c_num in", values, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotIn(List<Integer> values) {
            addCriterion("c_num not in", values, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumBetween(Integer value1, Integer value2) {
            addCriterion("c_num between", value1, value2, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotBetween(Integer value1, Integer value2) {
            addCriterion("c_num not between", value1, value2, "cNum");
            return (Criteria) this;
        }

        public Criteria andCStateIsNull() {
            addCriterion("c_state is null");
            return (Criteria) this;
        }

        public Criteria andCStateIsNotNull() {
            addCriterion("c_state is not null");
            return (Criteria) this;
        }

        public Criteria andCStateEqualTo(Integer value) {
            addCriterion("c_state =", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotEqualTo(Integer value) {
            addCriterion("c_state <>", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThan(Integer value) {
            addCriterion("c_state >", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_state >=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThan(Integer value) {
            addCriterion("c_state <", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateLessThanOrEqualTo(Integer value) {
            addCriterion("c_state <=", value, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateIn(List<Integer> values) {
            addCriterion("c_state in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotIn(List<Integer> values) {
            addCriterion("c_state not in", values, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateBetween(Integer value1, Integer value2) {
            addCriterion("c_state between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCStateNotBetween(Integer value1, Integer value2) {
            addCriterion("c_state not between", value1, value2, "cState");
            return (Criteria) this;
        }

        public Criteria andCB1IsNull() {
            addCriterion("c_b1 is null");
            return (Criteria) this;
        }

        public Criteria andCB1IsNotNull() {
            addCriterion("c_b1 is not null");
            return (Criteria) this;
        }

        public Criteria andCB1EqualTo(String value) {
            addCriterion("c_b1 =", value, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1NotEqualTo(String value) {
            addCriterion("c_b1 <>", value, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1GreaterThan(String value) {
            addCriterion("c_b1 >", value, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1GreaterThanOrEqualTo(String value) {
            addCriterion("c_b1 >=", value, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1LessThan(String value) {
            addCriterion("c_b1 <", value, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1LessThanOrEqualTo(String value) {
            addCriterion("c_b1 <=", value, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1Like(String value) {
            addCriterion("c_b1 like", value, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1NotLike(String value) {
            addCriterion("c_b1 not like", value, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1In(List<String> values) {
            addCriterion("c_b1 in", values, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1NotIn(List<String> values) {
            addCriterion("c_b1 not in", values, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1Between(String value1, String value2) {
            addCriterion("c_b1 between", value1, value2, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB1NotBetween(String value1, String value2) {
            addCriterion("c_b1 not between", value1, value2, "cB1");
            return (Criteria) this;
        }

        public Criteria andCB2IsNull() {
            addCriterion("c_b2 is null");
            return (Criteria) this;
        }

        public Criteria andCB2IsNotNull() {
            addCriterion("c_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andCB2EqualTo(String value) {
            addCriterion("c_b2 =", value, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2NotEqualTo(String value) {
            addCriterion("c_b2 <>", value, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2GreaterThan(String value) {
            addCriterion("c_b2 >", value, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2GreaterThanOrEqualTo(String value) {
            addCriterion("c_b2 >=", value, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2LessThan(String value) {
            addCriterion("c_b2 <", value, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2LessThanOrEqualTo(String value) {
            addCriterion("c_b2 <=", value, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2Like(String value) {
            addCriterion("c_b2 like", value, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2NotLike(String value) {
            addCriterion("c_b2 not like", value, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2In(List<String> values) {
            addCriterion("c_b2 in", values, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2NotIn(List<String> values) {
            addCriterion("c_b2 not in", values, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2Between(String value1, String value2) {
            addCriterion("c_b2 between", value1, value2, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB2NotBetween(String value1, String value2) {
            addCriterion("c_b2 not between", value1, value2, "cB2");
            return (Criteria) this;
        }

        public Criteria andCB3IsNull() {
            addCriterion("c_b3 is null");
            return (Criteria) this;
        }

        public Criteria andCB3IsNotNull() {
            addCriterion("c_b3 is not null");
            return (Criteria) this;
        }

        public Criteria andCB3EqualTo(String value) {
            addCriterion("c_b3 =", value, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3NotEqualTo(String value) {
            addCriterion("c_b3 <>", value, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3GreaterThan(String value) {
            addCriterion("c_b3 >", value, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3GreaterThanOrEqualTo(String value) {
            addCriterion("c_b3 >=", value, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3LessThan(String value) {
            addCriterion("c_b3 <", value, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3LessThanOrEqualTo(String value) {
            addCriterion("c_b3 <=", value, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3Like(String value) {
            addCriterion("c_b3 like", value, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3NotLike(String value) {
            addCriterion("c_b3 not like", value, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3In(List<String> values) {
            addCriterion("c_b3 in", values, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3NotIn(List<String> values) {
            addCriterion("c_b3 not in", values, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3Between(String value1, String value2) {
            addCriterion("c_b3 between", value1, value2, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB3NotBetween(String value1, String value2) {
            addCriterion("c_b3 not between", value1, value2, "cB3");
            return (Criteria) this;
        }

        public Criteria andCB4IsNull() {
            addCriterion("c_b4 is null");
            return (Criteria) this;
        }

        public Criteria andCB4IsNotNull() {
            addCriterion("c_b4 is not null");
            return (Criteria) this;
        }

        public Criteria andCB4EqualTo(Integer value) {
            addCriterion("c_b4 =", value, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4NotEqualTo(Integer value) {
            addCriterion("c_b4 <>", value, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4GreaterThan(Integer value) {
            addCriterion("c_b4 >", value, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4GreaterThanOrEqualTo(Integer value) {
            addCriterion("c_b4 >=", value, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4LessThan(Integer value) {
            addCriterion("c_b4 <", value, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4LessThanOrEqualTo(Integer value) {
            addCriterion("c_b4 <=", value, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4In(List<Integer> values) {
            addCriterion("c_b4 in", values, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4NotIn(List<Integer> values) {
            addCriterion("c_b4 not in", values, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4Between(Integer value1, Integer value2) {
            addCriterion("c_b4 between", value1, value2, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB4NotBetween(Integer value1, Integer value2) {
            addCriterion("c_b4 not between", value1, value2, "cB4");
            return (Criteria) this;
        }

        public Criteria andCB5IsNull() {
            addCriterion("c_b5 is null");
            return (Criteria) this;
        }

        public Criteria andCB5IsNotNull() {
            addCriterion("c_b5 is not null");
            return (Criteria) this;
        }

        public Criteria andCB5EqualTo(Integer value) {
            addCriterion("c_b5 =", value, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5NotEqualTo(Integer value) {
            addCriterion("c_b5 <>", value, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5GreaterThan(Integer value) {
            addCriterion("c_b5 >", value, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5GreaterThanOrEqualTo(Integer value) {
            addCriterion("c_b5 >=", value, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5LessThan(Integer value) {
            addCriterion("c_b5 <", value, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5LessThanOrEqualTo(Integer value) {
            addCriterion("c_b5 <=", value, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5In(List<Integer> values) {
            addCriterion("c_b5 in", values, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5NotIn(List<Integer> values) {
            addCriterion("c_b5 not in", values, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5Between(Integer value1, Integer value2) {
            addCriterion("c_b5 between", value1, value2, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB5NotBetween(Integer value1, Integer value2) {
            addCriterion("c_b5 not between", value1, value2, "cB5");
            return (Criteria) this;
        }

        public Criteria andCB6IsNull() {
            addCriterion("c_b6 is null");
            return (Criteria) this;
        }

        public Criteria andCB6IsNotNull() {
            addCriterion("c_b6 is not null");
            return (Criteria) this;
        }

        public Criteria andCB6EqualTo(Integer value) {
            addCriterion("c_b6 =", value, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6NotEqualTo(Integer value) {
            addCriterion("c_b6 <>", value, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6GreaterThan(Integer value) {
            addCriterion("c_b6 >", value, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6GreaterThanOrEqualTo(Integer value) {
            addCriterion("c_b6 >=", value, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6LessThan(Integer value) {
            addCriterion("c_b6 <", value, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6LessThanOrEqualTo(Integer value) {
            addCriterion("c_b6 <=", value, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6In(List<Integer> values) {
            addCriterion("c_b6 in", values, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6NotIn(List<Integer> values) {
            addCriterion("c_b6 not in", values, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6Between(Integer value1, Integer value2) {
            addCriterion("c_b6 between", value1, value2, "cB6");
            return (Criteria) this;
        }

        public Criteria andCB6NotBetween(Integer value1, Integer value2) {
            addCriterion("c_b6 not between", value1, value2, "cB6");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}