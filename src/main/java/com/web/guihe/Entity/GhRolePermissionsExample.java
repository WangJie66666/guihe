package com.web.guihe.Entity;

import java.util.ArrayList;
import java.util.List;

public class GhRolePermissionsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhRolePermissionsExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("a_id is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("a_id is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("a_id =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("a_id <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("a_id >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_id >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("a_id <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_id <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("a_id in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("a_id not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("a_id between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_id not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andARIdIsNull() {
            addCriterion("a_r_id is null");
            return (Criteria) this;
        }

        public Criteria andARIdIsNotNull() {
            addCriterion("a_r_id is not null");
            return (Criteria) this;
        }

        public Criteria andARIdEqualTo(Integer value) {
            addCriterion("a_r_id =", value, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdNotEqualTo(Integer value) {
            addCriterion("a_r_id <>", value, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdGreaterThan(Integer value) {
            addCriterion("a_r_id >", value, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_r_id >=", value, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdLessThan(Integer value) {
            addCriterion("a_r_id <", value, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_r_id <=", value, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdIn(List<Integer> values) {
            addCriterion("a_r_id in", values, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdNotIn(List<Integer> values) {
            addCriterion("a_r_id not in", values, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdBetween(Integer value1, Integer value2) {
            addCriterion("a_r_id between", value1, value2, "aRId");
            return (Criteria) this;
        }

        public Criteria andARIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_r_id not between", value1, value2, "aRId");
            return (Criteria) this;
        }

        public Criteria andAPIdIsNull() {
            addCriterion("a_p_id is null");
            return (Criteria) this;
        }

        public Criteria andAPIdIsNotNull() {
            addCriterion("a_p_id is not null");
            return (Criteria) this;
        }

        public Criteria andAPIdEqualTo(Integer value) {
            addCriterion("a_p_id =", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdNotEqualTo(Integer value) {
            addCriterion("a_p_id <>", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdGreaterThan(Integer value) {
            addCriterion("a_p_id >", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_p_id >=", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdLessThan(Integer value) {
            addCriterion("a_p_id <", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdLessThanOrEqualTo(Integer value) {
            addCriterion("a_p_id <=", value, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdIn(List<Integer> values) {
            addCriterion("a_p_id in", values, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdNotIn(List<Integer> values) {
            addCriterion("a_p_id not in", values, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdBetween(Integer value1, Integer value2) {
            addCriterion("a_p_id between", value1, value2, "aPId");
            return (Criteria) this;
        }

        public Criteria andAPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("a_p_id not between", value1, value2, "aPId");
            return (Criteria) this;
        }

        public Criteria andAB1IsNull() {
            addCriterion("a_b1 is null");
            return (Criteria) this;
        }

        public Criteria andAB1IsNotNull() {
            addCriterion("a_b1 is not null");
            return (Criteria) this;
        }

        public Criteria andAB1EqualTo(String value) {
            addCriterion("a_b1 =", value, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1NotEqualTo(String value) {
            addCriterion("a_b1 <>", value, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1GreaterThan(String value) {
            addCriterion("a_b1 >", value, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1GreaterThanOrEqualTo(String value) {
            addCriterion("a_b1 >=", value, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1LessThan(String value) {
            addCriterion("a_b1 <", value, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1LessThanOrEqualTo(String value) {
            addCriterion("a_b1 <=", value, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1Like(String value) {
            addCriterion("a_b1 like", value, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1NotLike(String value) {
            addCriterion("a_b1 not like", value, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1In(List<String> values) {
            addCriterion("a_b1 in", values, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1NotIn(List<String> values) {
            addCriterion("a_b1 not in", values, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1Between(String value1, String value2) {
            addCriterion("a_b1 between", value1, value2, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB1NotBetween(String value1, String value2) {
            addCriterion("a_b1 not between", value1, value2, "aB1");
            return (Criteria) this;
        }

        public Criteria andAB2IsNull() {
            addCriterion("a_b2 is null");
            return (Criteria) this;
        }

        public Criteria andAB2IsNotNull() {
            addCriterion("a_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andAB2EqualTo(String value) {
            addCriterion("a_b2 =", value, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2NotEqualTo(String value) {
            addCriterion("a_b2 <>", value, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2GreaterThan(String value) {
            addCriterion("a_b2 >", value, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2GreaterThanOrEqualTo(String value) {
            addCriterion("a_b2 >=", value, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2LessThan(String value) {
            addCriterion("a_b2 <", value, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2LessThanOrEqualTo(String value) {
            addCriterion("a_b2 <=", value, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2Like(String value) {
            addCriterion("a_b2 like", value, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2NotLike(String value) {
            addCriterion("a_b2 not like", value, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2In(List<String> values) {
            addCriterion("a_b2 in", values, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2NotIn(List<String> values) {
            addCriterion("a_b2 not in", values, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2Between(String value1, String value2) {
            addCriterion("a_b2 between", value1, value2, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB2NotBetween(String value1, String value2) {
            addCriterion("a_b2 not between", value1, value2, "aB2");
            return (Criteria) this;
        }

        public Criteria andAB3IsNull() {
            addCriterion("a_b3 is null");
            return (Criteria) this;
        }

        public Criteria andAB3IsNotNull() {
            addCriterion("a_b3 is not null");
            return (Criteria) this;
        }

        public Criteria andAB3EqualTo(String value) {
            addCriterion("a_b3 =", value, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3NotEqualTo(String value) {
            addCriterion("a_b3 <>", value, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3GreaterThan(String value) {
            addCriterion("a_b3 >", value, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3GreaterThanOrEqualTo(String value) {
            addCriterion("a_b3 >=", value, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3LessThan(String value) {
            addCriterion("a_b3 <", value, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3LessThanOrEqualTo(String value) {
            addCriterion("a_b3 <=", value, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3Like(String value) {
            addCriterion("a_b3 like", value, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3NotLike(String value) {
            addCriterion("a_b3 not like", value, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3In(List<String> values) {
            addCriterion("a_b3 in", values, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3NotIn(List<String> values) {
            addCriterion("a_b3 not in", values, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3Between(String value1, String value2) {
            addCriterion("a_b3 between", value1, value2, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB3NotBetween(String value1, String value2) {
            addCriterion("a_b3 not between", value1, value2, "aB3");
            return (Criteria) this;
        }

        public Criteria andAB4IsNull() {
            addCriterion("a_b4 is null");
            return (Criteria) this;
        }

        public Criteria andAB4IsNotNull() {
            addCriterion("a_b4 is not null");
            return (Criteria) this;
        }

        public Criteria andAB4EqualTo(Integer value) {
            addCriterion("a_b4 =", value, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4NotEqualTo(Integer value) {
            addCriterion("a_b4 <>", value, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4GreaterThan(Integer value) {
            addCriterion("a_b4 >", value, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4GreaterThanOrEqualTo(Integer value) {
            addCriterion("a_b4 >=", value, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4LessThan(Integer value) {
            addCriterion("a_b4 <", value, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4LessThanOrEqualTo(Integer value) {
            addCriterion("a_b4 <=", value, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4In(List<Integer> values) {
            addCriterion("a_b4 in", values, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4NotIn(List<Integer> values) {
            addCriterion("a_b4 not in", values, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4Between(Integer value1, Integer value2) {
            addCriterion("a_b4 between", value1, value2, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB4NotBetween(Integer value1, Integer value2) {
            addCriterion("a_b4 not between", value1, value2, "aB4");
            return (Criteria) this;
        }

        public Criteria andAB5IsNull() {
            addCriterion("a_b5 is null");
            return (Criteria) this;
        }

        public Criteria andAB5IsNotNull() {
            addCriterion("a_b5 is not null");
            return (Criteria) this;
        }

        public Criteria andAB5EqualTo(Integer value) {
            addCriterion("a_b5 =", value, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5NotEqualTo(Integer value) {
            addCriterion("a_b5 <>", value, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5GreaterThan(Integer value) {
            addCriterion("a_b5 >", value, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5GreaterThanOrEqualTo(Integer value) {
            addCriterion("a_b5 >=", value, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5LessThan(Integer value) {
            addCriterion("a_b5 <", value, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5LessThanOrEqualTo(Integer value) {
            addCriterion("a_b5 <=", value, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5In(List<Integer> values) {
            addCriterion("a_b5 in", values, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5NotIn(List<Integer> values) {
            addCriterion("a_b5 not in", values, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5Between(Integer value1, Integer value2) {
            addCriterion("a_b5 between", value1, value2, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB5NotBetween(Integer value1, Integer value2) {
            addCriterion("a_b5 not between", value1, value2, "aB5");
            return (Criteria) this;
        }

        public Criteria andAB6IsNull() {
            addCriterion("a_b6 is null");
            return (Criteria) this;
        }

        public Criteria andAB6IsNotNull() {
            addCriterion("a_b6 is not null");
            return (Criteria) this;
        }

        public Criteria andAB6EqualTo(Integer value) {
            addCriterion("a_b6 =", value, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6NotEqualTo(Integer value) {
            addCriterion("a_b6 <>", value, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6GreaterThan(Integer value) {
            addCriterion("a_b6 >", value, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6GreaterThanOrEqualTo(Integer value) {
            addCriterion("a_b6 >=", value, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6LessThan(Integer value) {
            addCriterion("a_b6 <", value, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6LessThanOrEqualTo(Integer value) {
            addCriterion("a_b6 <=", value, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6In(List<Integer> values) {
            addCriterion("a_b6 in", values, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6NotIn(List<Integer> values) {
            addCriterion("a_b6 not in", values, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6Between(Integer value1, Integer value2) {
            addCriterion("a_b6 between", value1, value2, "aB6");
            return (Criteria) this;
        }

        public Criteria andAB6NotBetween(Integer value1, Integer value2) {
            addCriterion("a_b6 not between", value1, value2, "aB6");
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