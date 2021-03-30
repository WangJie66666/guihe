package com.web.guihe.Entity;

import java.util.ArrayList;
import java.util.List;

public class GhUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhUserExample() {
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(Integer value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(Integer value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(Integer value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(Integer value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<Integer> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<Integer> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(Integer value1, Integer value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUNameIsNull() {
            addCriterion("u_name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("u_name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("u_name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("u_name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("u_name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("u_name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("u_name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("u_name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("u_name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("u_name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("u_name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("u_name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("u_name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("u_name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUUserIsNull() {
            addCriterion("u_user is null");
            return (Criteria) this;
        }

        public Criteria andUUserIsNotNull() {
            addCriterion("u_user is not null");
            return (Criteria) this;
        }

        public Criteria andUUserEqualTo(String value) {
            addCriterion("u_user =", value, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserNotEqualTo(String value) {
            addCriterion("u_user <>", value, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserGreaterThan(String value) {
            addCriterion("u_user >", value, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserGreaterThanOrEqualTo(String value) {
            addCriterion("u_user >=", value, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserLessThan(String value) {
            addCriterion("u_user <", value, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserLessThanOrEqualTo(String value) {
            addCriterion("u_user <=", value, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserLike(String value) {
            addCriterion("u_user like", value, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserNotLike(String value) {
            addCriterion("u_user not like", value, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserIn(List<String> values) {
            addCriterion("u_user in", values, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserNotIn(List<String> values) {
            addCriterion("u_user not in", values, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserBetween(String value1, String value2) {
            addCriterion("u_user between", value1, value2, "uUser");
            return (Criteria) this;
        }

        public Criteria andUUserNotBetween(String value1, String value2) {
            addCriterion("u_user not between", value1, value2, "uUser");
            return (Criteria) this;
        }

        public Criteria andUPassIsNull() {
            addCriterion("u_pass is null");
            return (Criteria) this;
        }

        public Criteria andUPassIsNotNull() {
            addCriterion("u_pass is not null");
            return (Criteria) this;
        }

        public Criteria andUPassEqualTo(String value) {
            addCriterion("u_pass =", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotEqualTo(String value) {
            addCriterion("u_pass <>", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThan(String value) {
            addCriterion("u_pass >", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassGreaterThanOrEqualTo(String value) {
            addCriterion("u_pass >=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThan(String value) {
            addCriterion("u_pass <", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLessThanOrEqualTo(String value) {
            addCriterion("u_pass <=", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassLike(String value) {
            addCriterion("u_pass like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotLike(String value) {
            addCriterion("u_pass not like", value, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassIn(List<String> values) {
            addCriterion("u_pass in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotIn(List<String> values) {
            addCriterion("u_pass not in", values, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassBetween(String value1, String value2) {
            addCriterion("u_pass between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUPassNotBetween(String value1, String value2) {
            addCriterion("u_pass not between", value1, value2, "uPass");
            return (Criteria) this;
        }

        public Criteria andUSaltIsNull() {
            addCriterion("u_salt is null");
            return (Criteria) this;
        }

        public Criteria andUSaltIsNotNull() {
            addCriterion("u_salt is not null");
            return (Criteria) this;
        }

        public Criteria andUSaltEqualTo(String value) {
            addCriterion("u_salt =", value, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltNotEqualTo(String value) {
            addCriterion("u_salt <>", value, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltGreaterThan(String value) {
            addCriterion("u_salt >", value, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltGreaterThanOrEqualTo(String value) {
            addCriterion("u_salt >=", value, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltLessThan(String value) {
            addCriterion("u_salt <", value, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltLessThanOrEqualTo(String value) {
            addCriterion("u_salt <=", value, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltLike(String value) {
            addCriterion("u_salt like", value, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltNotLike(String value) {
            addCriterion("u_salt not like", value, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltIn(List<String> values) {
            addCriterion("u_salt in", values, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltNotIn(List<String> values) {
            addCriterion("u_salt not in", values, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltBetween(String value1, String value2) {
            addCriterion("u_salt between", value1, value2, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUSaltNotBetween(String value1, String value2) {
            addCriterion("u_salt not between", value1, value2, "uSalt");
            return (Criteria) this;
        }

        public Criteria andUStateIsNull() {
            addCriterion("u_state is null");
            return (Criteria) this;
        }

        public Criteria andUStateIsNotNull() {
            addCriterion("u_state is not null");
            return (Criteria) this;
        }

        public Criteria andUStateEqualTo(Integer value) {
            addCriterion("u_state =", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotEqualTo(Integer value) {
            addCriterion("u_state <>", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThan(Integer value) {
            addCriterion("u_state >", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_state >=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThan(Integer value) {
            addCriterion("u_state <", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateLessThanOrEqualTo(Integer value) {
            addCriterion("u_state <=", value, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateIn(List<Integer> values) {
            addCriterion("u_state in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotIn(List<Integer> values) {
            addCriterion("u_state not in", values, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateBetween(Integer value1, Integer value2) {
            addCriterion("u_state between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUStateNotBetween(Integer value1, Integer value2) {
            addCriterion("u_state not between", value1, value2, "uState");
            return (Criteria) this;
        }

        public Criteria andUNumIsNull() {
            addCriterion("u_num is null");
            return (Criteria) this;
        }

        public Criteria andUNumIsNotNull() {
            addCriterion("u_num is not null");
            return (Criteria) this;
        }

        public Criteria andUNumEqualTo(Integer value) {
            addCriterion("u_num =", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumNotEqualTo(Integer value) {
            addCriterion("u_num <>", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumGreaterThan(Integer value) {
            addCriterion("u_num >", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_num >=", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumLessThan(Integer value) {
            addCriterion("u_num <", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumLessThanOrEqualTo(Integer value) {
            addCriterion("u_num <=", value, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumIn(List<Integer> values) {
            addCriterion("u_num in", values, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumNotIn(List<Integer> values) {
            addCriterion("u_num not in", values, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumBetween(Integer value1, Integer value2) {
            addCriterion("u_num between", value1, value2, "uNum");
            return (Criteria) this;
        }

        public Criteria andUNumNotBetween(Integer value1, Integer value2) {
            addCriterion("u_num not between", value1, value2, "uNum");
            return (Criteria) this;
        }

        public Criteria andUErrIsNull() {
            addCriterion("u_err is null");
            return (Criteria) this;
        }

        public Criteria andUErrIsNotNull() {
            addCriterion("u_err is not null");
            return (Criteria) this;
        }

        public Criteria andUErrEqualTo(Integer value) {
            addCriterion("u_err =", value, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrNotEqualTo(Integer value) {
            addCriterion("u_err <>", value, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrGreaterThan(Integer value) {
            addCriterion("u_err >", value, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_err >=", value, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrLessThan(Integer value) {
            addCriterion("u_err <", value, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrLessThanOrEqualTo(Integer value) {
            addCriterion("u_err <=", value, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrIn(List<Integer> values) {
            addCriterion("u_err in", values, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrNotIn(List<Integer> values) {
            addCriterion("u_err not in", values, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrBetween(Integer value1, Integer value2) {
            addCriterion("u_err between", value1, value2, "uErr");
            return (Criteria) this;
        }

        public Criteria andUErrNotBetween(Integer value1, Integer value2) {
            addCriterion("u_err not between", value1, value2, "uErr");
            return (Criteria) this;
        }

        public Criteria andURIdIsNull() {
            addCriterion("u_r_id is null");
            return (Criteria) this;
        }

        public Criteria andURIdIsNotNull() {
            addCriterion("u_r_id is not null");
            return (Criteria) this;
        }

        public Criteria andURIdEqualTo(Integer value) {
            addCriterion("u_r_id =", value, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdNotEqualTo(Integer value) {
            addCriterion("u_r_id <>", value, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdGreaterThan(Integer value) {
            addCriterion("u_r_id >", value, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_r_id >=", value, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdLessThan(Integer value) {
            addCriterion("u_r_id <", value, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdLessThanOrEqualTo(Integer value) {
            addCriterion("u_r_id <=", value, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdIn(List<Integer> values) {
            addCriterion("u_r_id in", values, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdNotIn(List<Integer> values) {
            addCriterion("u_r_id not in", values, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdBetween(Integer value1, Integer value2) {
            addCriterion("u_r_id between", value1, value2, "uRId");
            return (Criteria) this;
        }

        public Criteria andURIdNotBetween(Integer value1, Integer value2) {
            addCriterion("u_r_id not between", value1, value2, "uRId");
            return (Criteria) this;
        }

        public Criteria andUB1IsNull() {
            addCriterion("u_b1 is null");
            return (Criteria) this;
        }

        public Criteria andUB1IsNotNull() {
            addCriterion("u_b1 is not null");
            return (Criteria) this;
        }

        public Criteria andUB1EqualTo(String value) {
            addCriterion("u_b1 =", value, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1NotEqualTo(String value) {
            addCriterion("u_b1 <>", value, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1GreaterThan(String value) {
            addCriterion("u_b1 >", value, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1GreaterThanOrEqualTo(String value) {
            addCriterion("u_b1 >=", value, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1LessThan(String value) {
            addCriterion("u_b1 <", value, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1LessThanOrEqualTo(String value) {
            addCriterion("u_b1 <=", value, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1Like(String value) {
            addCriterion("u_b1 like", value, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1NotLike(String value) {
            addCriterion("u_b1 not like", value, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1In(List<String> values) {
            addCriterion("u_b1 in", values, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1NotIn(List<String> values) {
            addCriterion("u_b1 not in", values, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1Between(String value1, String value2) {
            addCriterion("u_b1 between", value1, value2, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB1NotBetween(String value1, String value2) {
            addCriterion("u_b1 not between", value1, value2, "uB1");
            return (Criteria) this;
        }

        public Criteria andUB2IsNull() {
            addCriterion("u_b2 is null");
            return (Criteria) this;
        }

        public Criteria andUB2IsNotNull() {
            addCriterion("u_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andUB2EqualTo(String value) {
            addCriterion("u_b2 =", value, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2NotEqualTo(String value) {
            addCriterion("u_b2 <>", value, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2GreaterThan(String value) {
            addCriterion("u_b2 >", value, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2GreaterThanOrEqualTo(String value) {
            addCriterion("u_b2 >=", value, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2LessThan(String value) {
            addCriterion("u_b2 <", value, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2LessThanOrEqualTo(String value) {
            addCriterion("u_b2 <=", value, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2Like(String value) {
            addCriterion("u_b2 like", value, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2NotLike(String value) {
            addCriterion("u_b2 not like", value, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2In(List<String> values) {
            addCriterion("u_b2 in", values, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2NotIn(List<String> values) {
            addCriterion("u_b2 not in", values, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2Between(String value1, String value2) {
            addCriterion("u_b2 between", value1, value2, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB2NotBetween(String value1, String value2) {
            addCriterion("u_b2 not between", value1, value2, "uB2");
            return (Criteria) this;
        }

        public Criteria andUB3IsNull() {
            addCriterion("u_b3 is null");
            return (Criteria) this;
        }

        public Criteria andUB3IsNotNull() {
            addCriterion("u_b3 is not null");
            return (Criteria) this;
        }

        public Criteria andUB3EqualTo(String value) {
            addCriterion("u_b3 =", value, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3NotEqualTo(String value) {
            addCriterion("u_b3 <>", value, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3GreaterThan(String value) {
            addCriterion("u_b3 >", value, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3GreaterThanOrEqualTo(String value) {
            addCriterion("u_b3 >=", value, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3LessThan(String value) {
            addCriterion("u_b3 <", value, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3LessThanOrEqualTo(String value) {
            addCriterion("u_b3 <=", value, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3Like(String value) {
            addCriterion("u_b3 like", value, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3NotLike(String value) {
            addCriterion("u_b3 not like", value, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3In(List<String> values) {
            addCriterion("u_b3 in", values, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3NotIn(List<String> values) {
            addCriterion("u_b3 not in", values, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3Between(String value1, String value2) {
            addCriterion("u_b3 between", value1, value2, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB3NotBetween(String value1, String value2) {
            addCriterion("u_b3 not between", value1, value2, "uB3");
            return (Criteria) this;
        }

        public Criteria andUB4IsNull() {
            addCriterion("u_b4 is null");
            return (Criteria) this;
        }

        public Criteria andUB4IsNotNull() {
            addCriterion("u_b4 is not null");
            return (Criteria) this;
        }

        public Criteria andUB4EqualTo(Integer value) {
            addCriterion("u_b4 =", value, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4NotEqualTo(Integer value) {
            addCriterion("u_b4 <>", value, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4GreaterThan(Integer value) {
            addCriterion("u_b4 >", value, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4GreaterThanOrEqualTo(Integer value) {
            addCriterion("u_b4 >=", value, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4LessThan(Integer value) {
            addCriterion("u_b4 <", value, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4LessThanOrEqualTo(Integer value) {
            addCriterion("u_b4 <=", value, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4In(List<Integer> values) {
            addCriterion("u_b4 in", values, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4NotIn(List<Integer> values) {
            addCriterion("u_b4 not in", values, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4Between(Integer value1, Integer value2) {
            addCriterion("u_b4 between", value1, value2, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB4NotBetween(Integer value1, Integer value2) {
            addCriterion("u_b4 not between", value1, value2, "uB4");
            return (Criteria) this;
        }

        public Criteria andUB5IsNull() {
            addCriterion("u_b5 is null");
            return (Criteria) this;
        }

        public Criteria andUB5IsNotNull() {
            addCriterion("u_b5 is not null");
            return (Criteria) this;
        }

        public Criteria andUB5EqualTo(Integer value) {
            addCriterion("u_b5 =", value, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5NotEqualTo(Integer value) {
            addCriterion("u_b5 <>", value, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5GreaterThan(Integer value) {
            addCriterion("u_b5 >", value, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5GreaterThanOrEqualTo(Integer value) {
            addCriterion("u_b5 >=", value, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5LessThan(Integer value) {
            addCriterion("u_b5 <", value, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5LessThanOrEqualTo(Integer value) {
            addCriterion("u_b5 <=", value, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5In(List<Integer> values) {
            addCriterion("u_b5 in", values, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5NotIn(List<Integer> values) {
            addCriterion("u_b5 not in", values, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5Between(Integer value1, Integer value2) {
            addCriterion("u_b5 between", value1, value2, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB5NotBetween(Integer value1, Integer value2) {
            addCriterion("u_b5 not between", value1, value2, "uB5");
            return (Criteria) this;
        }

        public Criteria andUB6IsNull() {
            addCriterion("u_b6 is null");
            return (Criteria) this;
        }

        public Criteria andUB6IsNotNull() {
            addCriterion("u_b6 is not null");
            return (Criteria) this;
        }

        public Criteria andUB6EqualTo(Integer value) {
            addCriterion("u_b6 =", value, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6NotEqualTo(Integer value) {
            addCriterion("u_b6 <>", value, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6GreaterThan(Integer value) {
            addCriterion("u_b6 >", value, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6GreaterThanOrEqualTo(Integer value) {
            addCriterion("u_b6 >=", value, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6LessThan(Integer value) {
            addCriterion("u_b6 <", value, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6LessThanOrEqualTo(Integer value) {
            addCriterion("u_b6 <=", value, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6In(List<Integer> values) {
            addCriterion("u_b6 in", values, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6NotIn(List<Integer> values) {
            addCriterion("u_b6 not in", values, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6Between(Integer value1, Integer value2) {
            addCriterion("u_b6 between", value1, value2, "uB6");
            return (Criteria) this;
        }

        public Criteria andUB6NotBetween(Integer value1, Integer value2) {
            addCriterion("u_b6 not between", value1, value2, "uB6");
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