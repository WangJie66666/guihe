package com.web.guihe.Entity;

import java.util.ArrayList;
import java.util.List;

public class GhRoleModuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhRoleModuleExample() {
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

        public Criteria andBIdIsNull() {
            addCriterion("b_id is null");
            return (Criteria) this;
        }

        public Criteria andBIdIsNotNull() {
            addCriterion("b_id is not null");
            return (Criteria) this;
        }

        public Criteria andBIdEqualTo(Integer value) {
            addCriterion("b_id =", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotEqualTo(Integer value) {
            addCriterion("b_id <>", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThan(Integer value) {
            addCriterion("b_id >", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_id >=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThan(Integer value) {
            addCriterion("b_id <", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdLessThanOrEqualTo(Integer value) {
            addCriterion("b_id <=", value, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdIn(List<Integer> values) {
            addCriterion("b_id in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotIn(List<Integer> values) {
            addCriterion("b_id not in", values, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdBetween(Integer value1, Integer value2) {
            addCriterion("b_id between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBIdNotBetween(Integer value1, Integer value2) {
            addCriterion("b_id not between", value1, value2, "bId");
            return (Criteria) this;
        }

        public Criteria andBRIdIsNull() {
            addCriterion("b_r_id is null");
            return (Criteria) this;
        }

        public Criteria andBRIdIsNotNull() {
            addCriterion("b_r_id is not null");
            return (Criteria) this;
        }

        public Criteria andBRIdEqualTo(Integer value) {
            addCriterion("b_r_id =", value, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdNotEqualTo(Integer value) {
            addCriterion("b_r_id <>", value, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdGreaterThan(Integer value) {
            addCriterion("b_r_id >", value, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_r_id >=", value, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdLessThan(Integer value) {
            addCriterion("b_r_id <", value, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdLessThanOrEqualTo(Integer value) {
            addCriterion("b_r_id <=", value, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdIn(List<Integer> values) {
            addCriterion("b_r_id in", values, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdNotIn(List<Integer> values) {
            addCriterion("b_r_id not in", values, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdBetween(Integer value1, Integer value2) {
            addCriterion("b_r_id between", value1, value2, "bRId");
            return (Criteria) this;
        }

        public Criteria andBRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("b_r_id not between", value1, value2, "bRId");
            return (Criteria) this;
        }

        public Criteria andBMIdIsNull() {
            addCriterion("b_m_id is null");
            return (Criteria) this;
        }

        public Criteria andBMIdIsNotNull() {
            addCriterion("b_m_id is not null");
            return (Criteria) this;
        }

        public Criteria andBMIdEqualTo(Integer value) {
            addCriterion("b_m_id =", value, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdNotEqualTo(Integer value) {
            addCriterion("b_m_id <>", value, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdGreaterThan(Integer value) {
            addCriterion("b_m_id >", value, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_m_id >=", value, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdLessThan(Integer value) {
            addCriterion("b_m_id <", value, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdLessThanOrEqualTo(Integer value) {
            addCriterion("b_m_id <=", value, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdIn(List<Integer> values) {
            addCriterion("b_m_id in", values, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdNotIn(List<Integer> values) {
            addCriterion("b_m_id not in", values, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdBetween(Integer value1, Integer value2) {
            addCriterion("b_m_id between", value1, value2, "bMId");
            return (Criteria) this;
        }

        public Criteria andBMIdNotBetween(Integer value1, Integer value2) {
            addCriterion("b_m_id not between", value1, value2, "bMId");
            return (Criteria) this;
        }

        public Criteria andBB1IsNull() {
            addCriterion("b_b1 is null");
            return (Criteria) this;
        }

        public Criteria andBB1IsNotNull() {
            addCriterion("b_b1 is not null");
            return (Criteria) this;
        }

        public Criteria andBB1EqualTo(String value) {
            addCriterion("b_b1 =", value, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1NotEqualTo(String value) {
            addCriterion("b_b1 <>", value, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1GreaterThan(String value) {
            addCriterion("b_b1 >", value, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1GreaterThanOrEqualTo(String value) {
            addCriterion("b_b1 >=", value, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1LessThan(String value) {
            addCriterion("b_b1 <", value, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1LessThanOrEqualTo(String value) {
            addCriterion("b_b1 <=", value, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1Like(String value) {
            addCriterion("b_b1 like", value, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1NotLike(String value) {
            addCriterion("b_b1 not like", value, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1In(List<String> values) {
            addCriterion("b_b1 in", values, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1NotIn(List<String> values) {
            addCriterion("b_b1 not in", values, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1Between(String value1, String value2) {
            addCriterion("b_b1 between", value1, value2, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB1NotBetween(String value1, String value2) {
            addCriterion("b_b1 not between", value1, value2, "bB1");
            return (Criteria) this;
        }

        public Criteria andBB2IsNull() {
            addCriterion("b_b2 is null");
            return (Criteria) this;
        }

        public Criteria andBB2IsNotNull() {
            addCriterion("b_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andBB2EqualTo(String value) {
            addCriterion("b_b2 =", value, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2NotEqualTo(String value) {
            addCriterion("b_b2 <>", value, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2GreaterThan(String value) {
            addCriterion("b_b2 >", value, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2GreaterThanOrEqualTo(String value) {
            addCriterion("b_b2 >=", value, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2LessThan(String value) {
            addCriterion("b_b2 <", value, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2LessThanOrEqualTo(String value) {
            addCriterion("b_b2 <=", value, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2Like(String value) {
            addCriterion("b_b2 like", value, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2NotLike(String value) {
            addCriterion("b_b2 not like", value, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2In(List<String> values) {
            addCriterion("b_b2 in", values, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2NotIn(List<String> values) {
            addCriterion("b_b2 not in", values, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2Between(String value1, String value2) {
            addCriterion("b_b2 between", value1, value2, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB2NotBetween(String value1, String value2) {
            addCriterion("b_b2 not between", value1, value2, "bB2");
            return (Criteria) this;
        }

        public Criteria andBB3IsNull() {
            addCriterion("b_b3 is null");
            return (Criteria) this;
        }

        public Criteria andBB3IsNotNull() {
            addCriterion("b_b3 is not null");
            return (Criteria) this;
        }

        public Criteria andBB3EqualTo(String value) {
            addCriterion("b_b3 =", value, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3NotEqualTo(String value) {
            addCriterion("b_b3 <>", value, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3GreaterThan(String value) {
            addCriterion("b_b3 >", value, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3GreaterThanOrEqualTo(String value) {
            addCriterion("b_b3 >=", value, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3LessThan(String value) {
            addCriterion("b_b3 <", value, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3LessThanOrEqualTo(String value) {
            addCriterion("b_b3 <=", value, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3Like(String value) {
            addCriterion("b_b3 like", value, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3NotLike(String value) {
            addCriterion("b_b3 not like", value, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3In(List<String> values) {
            addCriterion("b_b3 in", values, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3NotIn(List<String> values) {
            addCriterion("b_b3 not in", values, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3Between(String value1, String value2) {
            addCriterion("b_b3 between", value1, value2, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB3NotBetween(String value1, String value2) {
            addCriterion("b_b3 not between", value1, value2, "bB3");
            return (Criteria) this;
        }

        public Criteria andBB4IsNull() {
            addCriterion("b_b4 is null");
            return (Criteria) this;
        }

        public Criteria andBB4IsNotNull() {
            addCriterion("b_b4 is not null");
            return (Criteria) this;
        }

        public Criteria andBB4EqualTo(Integer value) {
            addCriterion("b_b4 =", value, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4NotEqualTo(Integer value) {
            addCriterion("b_b4 <>", value, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4GreaterThan(Integer value) {
            addCriterion("b_b4 >", value, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4GreaterThanOrEqualTo(Integer value) {
            addCriterion("b_b4 >=", value, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4LessThan(Integer value) {
            addCriterion("b_b4 <", value, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4LessThanOrEqualTo(Integer value) {
            addCriterion("b_b4 <=", value, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4In(List<Integer> values) {
            addCriterion("b_b4 in", values, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4NotIn(List<Integer> values) {
            addCriterion("b_b4 not in", values, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4Between(Integer value1, Integer value2) {
            addCriterion("b_b4 between", value1, value2, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB4NotBetween(Integer value1, Integer value2) {
            addCriterion("b_b4 not between", value1, value2, "bB4");
            return (Criteria) this;
        }

        public Criteria andBB5IsNull() {
            addCriterion("b_b5 is null");
            return (Criteria) this;
        }

        public Criteria andBB5IsNotNull() {
            addCriterion("b_b5 is not null");
            return (Criteria) this;
        }

        public Criteria andBB5EqualTo(Integer value) {
            addCriterion("b_b5 =", value, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5NotEqualTo(Integer value) {
            addCriterion("b_b5 <>", value, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5GreaterThan(Integer value) {
            addCriterion("b_b5 >", value, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5GreaterThanOrEqualTo(Integer value) {
            addCriterion("b_b5 >=", value, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5LessThan(Integer value) {
            addCriterion("b_b5 <", value, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5LessThanOrEqualTo(Integer value) {
            addCriterion("b_b5 <=", value, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5In(List<Integer> values) {
            addCriterion("b_b5 in", values, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5NotIn(List<Integer> values) {
            addCriterion("b_b5 not in", values, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5Between(Integer value1, Integer value2) {
            addCriterion("b_b5 between", value1, value2, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB5NotBetween(Integer value1, Integer value2) {
            addCriterion("b_b5 not between", value1, value2, "bB5");
            return (Criteria) this;
        }

        public Criteria andBB6IsNull() {
            addCriterion("b_b6 is null");
            return (Criteria) this;
        }

        public Criteria andBB6IsNotNull() {
            addCriterion("b_b6 is not null");
            return (Criteria) this;
        }

        public Criteria andBB6EqualTo(Integer value) {
            addCriterion("b_b6 =", value, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6NotEqualTo(Integer value) {
            addCriterion("b_b6 <>", value, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6GreaterThan(Integer value) {
            addCriterion("b_b6 >", value, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6GreaterThanOrEqualTo(Integer value) {
            addCriterion("b_b6 >=", value, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6LessThan(Integer value) {
            addCriterion("b_b6 <", value, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6LessThanOrEqualTo(Integer value) {
            addCriterion("b_b6 <=", value, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6In(List<Integer> values) {
            addCriterion("b_b6 in", values, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6NotIn(List<Integer> values) {
            addCriterion("b_b6 not in", values, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6Between(Integer value1, Integer value2) {
            addCriterion("b_b6 between", value1, value2, "bB6");
            return (Criteria) this;
        }

        public Criteria andBB6NotBetween(Integer value1, Integer value2) {
            addCriterion("b_b6 not between", value1, value2, "bB6");
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