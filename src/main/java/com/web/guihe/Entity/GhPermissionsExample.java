package com.web.guihe.Entity;

import java.util.ArrayList;
import java.util.List;

public class GhPermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhPermissionsExample() {
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPRemarksIsNull() {
            addCriterion("p_remarks is null");
            return (Criteria) this;
        }

        public Criteria andPRemarksIsNotNull() {
            addCriterion("p_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andPRemarksEqualTo(String value) {
            addCriterion("p_remarks =", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksNotEqualTo(String value) {
            addCriterion("p_remarks <>", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksGreaterThan(String value) {
            addCriterion("p_remarks >", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("p_remarks >=", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksLessThan(String value) {
            addCriterion("p_remarks <", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksLessThanOrEqualTo(String value) {
            addCriterion("p_remarks <=", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksLike(String value) {
            addCriterion("p_remarks like", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksNotLike(String value) {
            addCriterion("p_remarks not like", value, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksIn(List<String> values) {
            addCriterion("p_remarks in", values, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksNotIn(List<String> values) {
            addCriterion("p_remarks not in", values, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksBetween(String value1, String value2) {
            addCriterion("p_remarks between", value1, value2, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPRemarksNotBetween(String value1, String value2) {
            addCriterion("p_remarks not between", value1, value2, "pRemarks");
            return (Criteria) this;
        }

        public Criteria andPB1IsNull() {
            addCriterion("p_b1 is null");
            return (Criteria) this;
        }

        public Criteria andPB1IsNotNull() {
            addCriterion("p_b1 is not null");
            return (Criteria) this;
        }

        public Criteria andPB1EqualTo(String value) {
            addCriterion("p_b1 =", value, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1NotEqualTo(String value) {
            addCriterion("p_b1 <>", value, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1GreaterThan(String value) {
            addCriterion("p_b1 >", value, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1GreaterThanOrEqualTo(String value) {
            addCriterion("p_b1 >=", value, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1LessThan(String value) {
            addCriterion("p_b1 <", value, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1LessThanOrEqualTo(String value) {
            addCriterion("p_b1 <=", value, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1Like(String value) {
            addCriterion("p_b1 like", value, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1NotLike(String value) {
            addCriterion("p_b1 not like", value, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1In(List<String> values) {
            addCriterion("p_b1 in", values, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1NotIn(List<String> values) {
            addCriterion("p_b1 not in", values, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1Between(String value1, String value2) {
            addCriterion("p_b1 between", value1, value2, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB1NotBetween(String value1, String value2) {
            addCriterion("p_b1 not between", value1, value2, "pB1");
            return (Criteria) this;
        }

        public Criteria andPB2IsNull() {
            addCriterion("p_b2 is null");
            return (Criteria) this;
        }

        public Criteria andPB2IsNotNull() {
            addCriterion("p_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andPB2EqualTo(String value) {
            addCriterion("p_b2 =", value, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2NotEqualTo(String value) {
            addCriterion("p_b2 <>", value, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2GreaterThan(String value) {
            addCriterion("p_b2 >", value, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2GreaterThanOrEqualTo(String value) {
            addCriterion("p_b2 >=", value, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2LessThan(String value) {
            addCriterion("p_b2 <", value, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2LessThanOrEqualTo(String value) {
            addCriterion("p_b2 <=", value, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2Like(String value) {
            addCriterion("p_b2 like", value, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2NotLike(String value) {
            addCriterion("p_b2 not like", value, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2In(List<String> values) {
            addCriterion("p_b2 in", values, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2NotIn(List<String> values) {
            addCriterion("p_b2 not in", values, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2Between(String value1, String value2) {
            addCriterion("p_b2 between", value1, value2, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB2NotBetween(String value1, String value2) {
            addCriterion("p_b2 not between", value1, value2, "pB2");
            return (Criteria) this;
        }

        public Criteria andPB3IsNull() {
            addCriterion("p_b3 is null");
            return (Criteria) this;
        }

        public Criteria andPB3IsNotNull() {
            addCriterion("p_b3 is not null");
            return (Criteria) this;
        }

        public Criteria andPB3EqualTo(String value) {
            addCriterion("p_b3 =", value, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3NotEqualTo(String value) {
            addCriterion("p_b3 <>", value, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3GreaterThan(String value) {
            addCriterion("p_b3 >", value, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3GreaterThanOrEqualTo(String value) {
            addCriterion("p_b3 >=", value, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3LessThan(String value) {
            addCriterion("p_b3 <", value, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3LessThanOrEqualTo(String value) {
            addCriterion("p_b3 <=", value, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3Like(String value) {
            addCriterion("p_b3 like", value, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3NotLike(String value) {
            addCriterion("p_b3 not like", value, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3In(List<String> values) {
            addCriterion("p_b3 in", values, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3NotIn(List<String> values) {
            addCriterion("p_b3 not in", values, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3Between(String value1, String value2) {
            addCriterion("p_b3 between", value1, value2, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB3NotBetween(String value1, String value2) {
            addCriterion("p_b3 not between", value1, value2, "pB3");
            return (Criteria) this;
        }

        public Criteria andPB4IsNull() {
            addCriterion("p_b4 is null");
            return (Criteria) this;
        }

        public Criteria andPB4IsNotNull() {
            addCriterion("p_b4 is not null");
            return (Criteria) this;
        }

        public Criteria andPB4EqualTo(String value) {
            addCriterion("p_b4 =", value, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4NotEqualTo(String value) {
            addCriterion("p_b4 <>", value, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4GreaterThan(String value) {
            addCriterion("p_b4 >", value, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4GreaterThanOrEqualTo(String value) {
            addCriterion("p_b4 >=", value, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4LessThan(String value) {
            addCriterion("p_b4 <", value, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4LessThanOrEqualTo(String value) {
            addCriterion("p_b4 <=", value, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4Like(String value) {
            addCriterion("p_b4 like", value, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4NotLike(String value) {
            addCriterion("p_b4 not like", value, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4In(List<String> values) {
            addCriterion("p_b4 in", values, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4NotIn(List<String> values) {
            addCriterion("p_b4 not in", values, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4Between(String value1, String value2) {
            addCriterion("p_b4 between", value1, value2, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB4NotBetween(String value1, String value2) {
            addCriterion("p_b4 not between", value1, value2, "pB4");
            return (Criteria) this;
        }

        public Criteria andPB5IsNull() {
            addCriterion("p_b5 is null");
            return (Criteria) this;
        }

        public Criteria andPB5IsNotNull() {
            addCriterion("p_b5 is not null");
            return (Criteria) this;
        }

        public Criteria andPB5EqualTo(String value) {
            addCriterion("p_b5 =", value, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5NotEqualTo(String value) {
            addCriterion("p_b5 <>", value, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5GreaterThan(String value) {
            addCriterion("p_b5 >", value, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5GreaterThanOrEqualTo(String value) {
            addCriterion("p_b5 >=", value, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5LessThan(String value) {
            addCriterion("p_b5 <", value, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5LessThanOrEqualTo(String value) {
            addCriterion("p_b5 <=", value, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5Like(String value) {
            addCriterion("p_b5 like", value, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5NotLike(String value) {
            addCriterion("p_b5 not like", value, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5In(List<String> values) {
            addCriterion("p_b5 in", values, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5NotIn(List<String> values) {
            addCriterion("p_b5 not in", values, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5Between(String value1, String value2) {
            addCriterion("p_b5 between", value1, value2, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB5NotBetween(String value1, String value2) {
            addCriterion("p_b5 not between", value1, value2, "pB5");
            return (Criteria) this;
        }

        public Criteria andPB6IsNull() {
            addCriterion("p_b6 is null");
            return (Criteria) this;
        }

        public Criteria andPB6IsNotNull() {
            addCriterion("p_b6 is not null");
            return (Criteria) this;
        }

        public Criteria andPB6EqualTo(Integer value) {
            addCriterion("p_b6 =", value, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6NotEqualTo(Integer value) {
            addCriterion("p_b6 <>", value, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6GreaterThan(Integer value) {
            addCriterion("p_b6 >", value, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6GreaterThanOrEqualTo(Integer value) {
            addCriterion("p_b6 >=", value, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6LessThan(Integer value) {
            addCriterion("p_b6 <", value, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6LessThanOrEqualTo(Integer value) {
            addCriterion("p_b6 <=", value, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6In(List<Integer> values) {
            addCriterion("p_b6 in", values, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6NotIn(List<Integer> values) {
            addCriterion("p_b6 not in", values, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6Between(Integer value1, Integer value2) {
            addCriterion("p_b6 between", value1, value2, "pB6");
            return (Criteria) this;
        }

        public Criteria andPB6NotBetween(Integer value1, Integer value2) {
            addCriterion("p_b6 not between", value1, value2, "pB6");
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