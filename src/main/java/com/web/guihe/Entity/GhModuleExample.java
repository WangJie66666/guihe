package com.web.guihe.Entity;

import java.util.ArrayList;
import java.util.List;

public class GhModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhModuleExample() {
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

        public Criteria andMIdIsNull() {
            addCriterion("m_id is null");
            return (Criteria) this;
        }

        public Criteria andMIdIsNotNull() {
            addCriterion("m_id is not null");
            return (Criteria) this;
        }

        public Criteria andMIdEqualTo(Integer value) {
            addCriterion("m_id =", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotEqualTo(Integer value) {
            addCriterion("m_id <>", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThan(Integer value) {
            addCriterion("m_id >", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("m_id >=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThan(Integer value) {
            addCriterion("m_id <", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdLessThanOrEqualTo(Integer value) {
            addCriterion("m_id <=", value, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdIn(List<Integer> values) {
            addCriterion("m_id in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotIn(List<Integer> values) {
            addCriterion("m_id not in", values, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdBetween(Integer value1, Integer value2) {
            addCriterion("m_id between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("m_id not between", value1, value2, "mId");
            return (Criteria) this;
        }

        public Criteria andMIconIsNull() {
            addCriterion("m_icon is null");
            return (Criteria) this;
        }

        public Criteria andMIconIsNotNull() {
            addCriterion("m_icon is not null");
            return (Criteria) this;
        }

        public Criteria andMIconEqualTo(String value) {
            addCriterion("m_icon =", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconNotEqualTo(String value) {
            addCriterion("m_icon <>", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconGreaterThan(String value) {
            addCriterion("m_icon >", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconGreaterThanOrEqualTo(String value) {
            addCriterion("m_icon >=", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconLessThan(String value) {
            addCriterion("m_icon <", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconLessThanOrEqualTo(String value) {
            addCriterion("m_icon <=", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconLike(String value) {
            addCriterion("m_icon like", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconNotLike(String value) {
            addCriterion("m_icon not like", value, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconIn(List<String> values) {
            addCriterion("m_icon in", values, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconNotIn(List<String> values) {
            addCriterion("m_icon not in", values, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconBetween(String value1, String value2) {
            addCriterion("m_icon between", value1, value2, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMIconNotBetween(String value1, String value2) {
            addCriterion("m_icon not between", value1, value2, "mIcon");
            return (Criteria) this;
        }

        public Criteria andMTitleIsNull() {
            addCriterion("m_title is null");
            return (Criteria) this;
        }

        public Criteria andMTitleIsNotNull() {
            addCriterion("m_title is not null");
            return (Criteria) this;
        }

        public Criteria andMTitleEqualTo(String value) {
            addCriterion("m_title =", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleNotEqualTo(String value) {
            addCriterion("m_title <>", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleGreaterThan(String value) {
            addCriterion("m_title >", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleGreaterThanOrEqualTo(String value) {
            addCriterion("m_title >=", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleLessThan(String value) {
            addCriterion("m_title <", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleLessThanOrEqualTo(String value) {
            addCriterion("m_title <=", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleLike(String value) {
            addCriterion("m_title like", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleNotLike(String value) {
            addCriterion("m_title not like", value, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleIn(List<String> values) {
            addCriterion("m_title in", values, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleNotIn(List<String> values) {
            addCriterion("m_title not in", values, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleBetween(String value1, String value2) {
            addCriterion("m_title between", value1, value2, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMTitleNotBetween(String value1, String value2) {
            addCriterion("m_title not between", value1, value2, "mTitle");
            return (Criteria) this;
        }

        public Criteria andMIndexIsNull() {
            addCriterion("m_index is null");
            return (Criteria) this;
        }

        public Criteria andMIndexIsNotNull() {
            addCriterion("m_index is not null");
            return (Criteria) this;
        }

        public Criteria andMIndexEqualTo(String value) {
            addCriterion("m_index =", value, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexNotEqualTo(String value) {
            addCriterion("m_index <>", value, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexGreaterThan(String value) {
            addCriterion("m_index >", value, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexGreaterThanOrEqualTo(String value) {
            addCriterion("m_index >=", value, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexLessThan(String value) {
            addCriterion("m_index <", value, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexLessThanOrEqualTo(String value) {
            addCriterion("m_index <=", value, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexLike(String value) {
            addCriterion("m_index like", value, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexNotLike(String value) {
            addCriterion("m_index not like", value, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexIn(List<String> values) {
            addCriterion("m_index in", values, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexNotIn(List<String> values) {
            addCriterion("m_index not in", values, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexBetween(String value1, String value2) {
            addCriterion("m_index between", value1, value2, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMIndexNotBetween(String value1, String value2) {
            addCriterion("m_index not between", value1, value2, "mIndex");
            return (Criteria) this;
        }

        public Criteria andMSubsIsNull() {
            addCriterion("m_subs is null");
            return (Criteria) this;
        }

        public Criteria andMSubsIsNotNull() {
            addCriterion("m_subs is not null");
            return (Criteria) this;
        }

        public Criteria andMSubsEqualTo(String value) {
            addCriterion("m_subs =", value, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsNotEqualTo(String value) {
            addCriterion("m_subs <>", value, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsGreaterThan(String value) {
            addCriterion("m_subs >", value, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsGreaterThanOrEqualTo(String value) {
            addCriterion("m_subs >=", value, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsLessThan(String value) {
            addCriterion("m_subs <", value, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsLessThanOrEqualTo(String value) {
            addCriterion("m_subs <=", value, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsLike(String value) {
            addCriterion("m_subs like", value, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsNotLike(String value) {
            addCriterion("m_subs not like", value, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsIn(List<String> values) {
            addCriterion("m_subs in", values, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsNotIn(List<String> values) {
            addCriterion("m_subs not in", values, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsBetween(String value1, String value2) {
            addCriterion("m_subs between", value1, value2, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMSubsNotBetween(String value1, String value2) {
            addCriterion("m_subs not between", value1, value2, "mSubs");
            return (Criteria) this;
        }

        public Criteria andMFatherIsNull() {
            addCriterion("m_father is null");
            return (Criteria) this;
        }

        public Criteria andMFatherIsNotNull() {
            addCriterion("m_father is not null");
            return (Criteria) this;
        }

        public Criteria andMFatherEqualTo(String value) {
            addCriterion("m_father =", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherNotEqualTo(String value) {
            addCriterion("m_father <>", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherGreaterThan(String value) {
            addCriterion("m_father >", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherGreaterThanOrEqualTo(String value) {
            addCriterion("m_father >=", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherLessThan(String value) {
            addCriterion("m_father <", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherLessThanOrEqualTo(String value) {
            addCriterion("m_father <=", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherLike(String value) {
            addCriterion("m_father like", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherNotLike(String value) {
            addCriterion("m_father not like", value, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherIn(List<String> values) {
            addCriterion("m_father in", values, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherNotIn(List<String> values) {
            addCriterion("m_father not in", values, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherBetween(String value1, String value2) {
            addCriterion("m_father between", value1, value2, "mFather");
            return (Criteria) this;
        }

        public Criteria andMFatherNotBetween(String value1, String value2) {
            addCriterion("m_father not between", value1, value2, "mFather");
            return (Criteria) this;
        }

        public Criteria andMChildIsNull() {
            addCriterion("m_child is null");
            return (Criteria) this;
        }

        public Criteria andMChildIsNotNull() {
            addCriterion("m_child is not null");
            return (Criteria) this;
        }

        public Criteria andMChildEqualTo(String value) {
            addCriterion("m_child =", value, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildNotEqualTo(String value) {
            addCriterion("m_child <>", value, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildGreaterThan(String value) {
            addCriterion("m_child >", value, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildGreaterThanOrEqualTo(String value) {
            addCriterion("m_child >=", value, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildLessThan(String value) {
            addCriterion("m_child <", value, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildLessThanOrEqualTo(String value) {
            addCriterion("m_child <=", value, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildLike(String value) {
            addCriterion("m_child like", value, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildNotLike(String value) {
            addCriterion("m_child not like", value, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildIn(List<String> values) {
            addCriterion("m_child in", values, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildNotIn(List<String> values) {
            addCriterion("m_child not in", values, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildBetween(String value1, String value2) {
            addCriterion("m_child between", value1, value2, "mChild");
            return (Criteria) this;
        }

        public Criteria andMChildNotBetween(String value1, String value2) {
            addCriterion("m_child not between", value1, value2, "mChild");
            return (Criteria) this;
        }

        public Criteria andMSunIsNull() {
            addCriterion("m_sun is null");
            return (Criteria) this;
        }

        public Criteria andMSunIsNotNull() {
            addCriterion("m_sun is not null");
            return (Criteria) this;
        }

        public Criteria andMSunEqualTo(String value) {
            addCriterion("m_sun =", value, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunNotEqualTo(String value) {
            addCriterion("m_sun <>", value, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunGreaterThan(String value) {
            addCriterion("m_sun >", value, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunGreaterThanOrEqualTo(String value) {
            addCriterion("m_sun >=", value, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunLessThan(String value) {
            addCriterion("m_sun <", value, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunLessThanOrEqualTo(String value) {
            addCriterion("m_sun <=", value, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunLike(String value) {
            addCriterion("m_sun like", value, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunNotLike(String value) {
            addCriterion("m_sun not like", value, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunIn(List<String> values) {
            addCriterion("m_sun in", values, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunNotIn(List<String> values) {
            addCriterion("m_sun not in", values, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunBetween(String value1, String value2) {
            addCriterion("m_sun between", value1, value2, "mSun");
            return (Criteria) this;
        }

        public Criteria andMSunNotBetween(String value1, String value2) {
            addCriterion("m_sun not between", value1, value2, "mSun");
            return (Criteria) this;
        }

        public Criteria andMB1IsNull() {
            addCriterion("m_b1 is null");
            return (Criteria) this;
        }

        public Criteria andMB1IsNotNull() {
            addCriterion("m_b1 is not null");
            return (Criteria) this;
        }

        public Criteria andMB1EqualTo(String value) {
            addCriterion("m_b1 =", value, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1NotEqualTo(String value) {
            addCriterion("m_b1 <>", value, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1GreaterThan(String value) {
            addCriterion("m_b1 >", value, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1GreaterThanOrEqualTo(String value) {
            addCriterion("m_b1 >=", value, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1LessThan(String value) {
            addCriterion("m_b1 <", value, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1LessThanOrEqualTo(String value) {
            addCriterion("m_b1 <=", value, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1Like(String value) {
            addCriterion("m_b1 like", value, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1NotLike(String value) {
            addCriterion("m_b1 not like", value, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1In(List<String> values) {
            addCriterion("m_b1 in", values, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1NotIn(List<String> values) {
            addCriterion("m_b1 not in", values, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1Between(String value1, String value2) {
            addCriterion("m_b1 between", value1, value2, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB1NotBetween(String value1, String value2) {
            addCriterion("m_b1 not between", value1, value2, "mB1");
            return (Criteria) this;
        }

        public Criteria andMB2IsNull() {
            addCriterion("m_b2 is null");
            return (Criteria) this;
        }

        public Criteria andMB2IsNotNull() {
            addCriterion("m_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andMB2EqualTo(String value) {
            addCriterion("m_b2 =", value, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2NotEqualTo(String value) {
            addCriterion("m_b2 <>", value, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2GreaterThan(String value) {
            addCriterion("m_b2 >", value, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2GreaterThanOrEqualTo(String value) {
            addCriterion("m_b2 >=", value, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2LessThan(String value) {
            addCriterion("m_b2 <", value, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2LessThanOrEqualTo(String value) {
            addCriterion("m_b2 <=", value, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2Like(String value) {
            addCriterion("m_b2 like", value, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2NotLike(String value) {
            addCriterion("m_b2 not like", value, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2In(List<String> values) {
            addCriterion("m_b2 in", values, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2NotIn(List<String> values) {
            addCriterion("m_b2 not in", values, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2Between(String value1, String value2) {
            addCriterion("m_b2 between", value1, value2, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB2NotBetween(String value1, String value2) {
            addCriterion("m_b2 not between", value1, value2, "mB2");
            return (Criteria) this;
        }

        public Criteria andMB3IsNull() {
            addCriterion("m_b3 is null");
            return (Criteria) this;
        }

        public Criteria andMB3IsNotNull() {
            addCriterion("m_b3 is not null");
            return (Criteria) this;
        }

        public Criteria andMB3EqualTo(String value) {
            addCriterion("m_b3 =", value, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3NotEqualTo(String value) {
            addCriterion("m_b3 <>", value, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3GreaterThan(String value) {
            addCriterion("m_b3 >", value, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3GreaterThanOrEqualTo(String value) {
            addCriterion("m_b3 >=", value, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3LessThan(String value) {
            addCriterion("m_b3 <", value, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3LessThanOrEqualTo(String value) {
            addCriterion("m_b3 <=", value, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3Like(String value) {
            addCriterion("m_b3 like", value, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3NotLike(String value) {
            addCriterion("m_b3 not like", value, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3In(List<String> values) {
            addCriterion("m_b3 in", values, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3NotIn(List<String> values) {
            addCriterion("m_b3 not in", values, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3Between(String value1, String value2) {
            addCriterion("m_b3 between", value1, value2, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB3NotBetween(String value1, String value2) {
            addCriterion("m_b3 not between", value1, value2, "mB3");
            return (Criteria) this;
        }

        public Criteria andMB4IsNull() {
            addCriterion("m_b4 is null");
            return (Criteria) this;
        }

        public Criteria andMB4IsNotNull() {
            addCriterion("m_b4 is not null");
            return (Criteria) this;
        }

        public Criteria andMB4EqualTo(Integer value) {
            addCriterion("m_b4 =", value, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4NotEqualTo(Integer value) {
            addCriterion("m_b4 <>", value, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4GreaterThan(Integer value) {
            addCriterion("m_b4 >", value, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4GreaterThanOrEqualTo(Integer value) {
            addCriterion("m_b4 >=", value, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4LessThan(Integer value) {
            addCriterion("m_b4 <", value, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4LessThanOrEqualTo(Integer value) {
            addCriterion("m_b4 <=", value, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4In(List<Integer> values) {
            addCriterion("m_b4 in", values, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4NotIn(List<Integer> values) {
            addCriterion("m_b4 not in", values, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4Between(Integer value1, Integer value2) {
            addCriterion("m_b4 between", value1, value2, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB4NotBetween(Integer value1, Integer value2) {
            addCriterion("m_b4 not between", value1, value2, "mB4");
            return (Criteria) this;
        }

        public Criteria andMB5IsNull() {
            addCriterion("m_b5 is null");
            return (Criteria) this;
        }

        public Criteria andMB5IsNotNull() {
            addCriterion("m_b5 is not null");
            return (Criteria) this;
        }

        public Criteria andMB5EqualTo(Integer value) {
            addCriterion("m_b5 =", value, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5NotEqualTo(Integer value) {
            addCriterion("m_b5 <>", value, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5GreaterThan(Integer value) {
            addCriterion("m_b5 >", value, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5GreaterThanOrEqualTo(Integer value) {
            addCriterion("m_b5 >=", value, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5LessThan(Integer value) {
            addCriterion("m_b5 <", value, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5LessThanOrEqualTo(Integer value) {
            addCriterion("m_b5 <=", value, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5In(List<Integer> values) {
            addCriterion("m_b5 in", values, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5NotIn(List<Integer> values) {
            addCriterion("m_b5 not in", values, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5Between(Integer value1, Integer value2) {
            addCriterion("m_b5 between", value1, value2, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB5NotBetween(Integer value1, Integer value2) {
            addCriterion("m_b5 not between", value1, value2, "mB5");
            return (Criteria) this;
        }

        public Criteria andMB6IsNull() {
            addCriterion("m_b6 is null");
            return (Criteria) this;
        }

        public Criteria andMB6IsNotNull() {
            addCriterion("m_b6 is not null");
            return (Criteria) this;
        }

        public Criteria andMB6EqualTo(Integer value) {
            addCriterion("m_b6 =", value, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6NotEqualTo(Integer value) {
            addCriterion("m_b6 <>", value, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6GreaterThan(Integer value) {
            addCriterion("m_b6 >", value, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6GreaterThanOrEqualTo(Integer value) {
            addCriterion("m_b6 >=", value, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6LessThan(Integer value) {
            addCriterion("m_b6 <", value, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6LessThanOrEqualTo(Integer value) {
            addCriterion("m_b6 <=", value, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6In(List<Integer> values) {
            addCriterion("m_b6 in", values, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6NotIn(List<Integer> values) {
            addCriterion("m_b6 not in", values, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6Between(Integer value1, Integer value2) {
            addCriterion("m_b6 between", value1, value2, "mB6");
            return (Criteria) this;
        }

        public Criteria andMB6NotBetween(Integer value1, Integer value2) {
            addCriterion("m_b6 not between", value1, value2, "mB6");
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