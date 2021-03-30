package com.web.guihe.Entity;

import java.util.ArrayList;
import java.util.List;

public class GhRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GhRoleExample() {
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

        public Criteria andRIdIsNull() {
            addCriterion("r_id is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("r_id is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Integer value) {
            addCriterion("r_id =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Integer value) {
            addCriterion("r_id <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Integer value) {
            addCriterion("r_id >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("r_id >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Integer value) {
            addCriterion("r_id <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Integer value) {
            addCriterion("r_id <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Integer> values) {
            addCriterion("r_id in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Integer> values) {
            addCriterion("r_id not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Integer value1, Integer value2) {
            addCriterion("r_id between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Integer value1, Integer value2) {
            addCriterion("r_id not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRNameIsNull() {
            addCriterion("r_name is null");
            return (Criteria) this;
        }

        public Criteria andRNameIsNotNull() {
            addCriterion("r_name is not null");
            return (Criteria) this;
        }

        public Criteria andRNameEqualTo(String value) {
            addCriterion("r_name =", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotEqualTo(String value) {
            addCriterion("r_name <>", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThan(String value) {
            addCriterion("r_name >", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameGreaterThanOrEqualTo(String value) {
            addCriterion("r_name >=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThan(String value) {
            addCriterion("r_name <", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLessThanOrEqualTo(String value) {
            addCriterion("r_name <=", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameLike(String value) {
            addCriterion("r_name like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotLike(String value) {
            addCriterion("r_name not like", value, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameIn(List<String> values) {
            addCriterion("r_name in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotIn(List<String> values) {
            addCriterion("r_name not in", values, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameBetween(String value1, String value2) {
            addCriterion("r_name between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRNameNotBetween(String value1, String value2) {
            addCriterion("r_name not between", value1, value2, "rName");
            return (Criteria) this;
        }

        public Criteria andRRemarksIsNull() {
            addCriterion("r_remarks is null");
            return (Criteria) this;
        }

        public Criteria andRRemarksIsNotNull() {
            addCriterion("r_remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRRemarksEqualTo(String value) {
            addCriterion("r_remarks =", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksNotEqualTo(String value) {
            addCriterion("r_remarks <>", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksGreaterThan(String value) {
            addCriterion("r_remarks >", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("r_remarks >=", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksLessThan(String value) {
            addCriterion("r_remarks <", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksLessThanOrEqualTo(String value) {
            addCriterion("r_remarks <=", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksLike(String value) {
            addCriterion("r_remarks like", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksNotLike(String value) {
            addCriterion("r_remarks not like", value, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksIn(List<String> values) {
            addCriterion("r_remarks in", values, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksNotIn(List<String> values) {
            addCriterion("r_remarks not in", values, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksBetween(String value1, String value2) {
            addCriterion("r_remarks between", value1, value2, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRRemarksNotBetween(String value1, String value2) {
            addCriterion("r_remarks not between", value1, value2, "rRemarks");
            return (Criteria) this;
        }

        public Criteria andRB1IsNull() {
            addCriterion("r_b1 is null");
            return (Criteria) this;
        }

        public Criteria andRB1IsNotNull() {
            addCriterion("r_b1 is not null");
            return (Criteria) this;
        }

        public Criteria andRB1EqualTo(String value) {
            addCriterion("r_b1 =", value, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1NotEqualTo(String value) {
            addCriterion("r_b1 <>", value, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1GreaterThan(String value) {
            addCriterion("r_b1 >", value, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1GreaterThanOrEqualTo(String value) {
            addCriterion("r_b1 >=", value, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1LessThan(String value) {
            addCriterion("r_b1 <", value, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1LessThanOrEqualTo(String value) {
            addCriterion("r_b1 <=", value, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1Like(String value) {
            addCriterion("r_b1 like", value, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1NotLike(String value) {
            addCriterion("r_b1 not like", value, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1In(List<String> values) {
            addCriterion("r_b1 in", values, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1NotIn(List<String> values) {
            addCriterion("r_b1 not in", values, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1Between(String value1, String value2) {
            addCriterion("r_b1 between", value1, value2, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB1NotBetween(String value1, String value2) {
            addCriterion("r_b1 not between", value1, value2, "rB1");
            return (Criteria) this;
        }

        public Criteria andRB2IsNull() {
            addCriterion("r_b2 is null");
            return (Criteria) this;
        }

        public Criteria andRB2IsNotNull() {
            addCriterion("r_b2 is not null");
            return (Criteria) this;
        }

        public Criteria andRB2EqualTo(String value) {
            addCriterion("r_b2 =", value, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2NotEqualTo(String value) {
            addCriterion("r_b2 <>", value, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2GreaterThan(String value) {
            addCriterion("r_b2 >", value, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2GreaterThanOrEqualTo(String value) {
            addCriterion("r_b2 >=", value, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2LessThan(String value) {
            addCriterion("r_b2 <", value, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2LessThanOrEqualTo(String value) {
            addCriterion("r_b2 <=", value, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2Like(String value) {
            addCriterion("r_b2 like", value, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2NotLike(String value) {
            addCriterion("r_b2 not like", value, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2In(List<String> values) {
            addCriterion("r_b2 in", values, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2NotIn(List<String> values) {
            addCriterion("r_b2 not in", values, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2Between(String value1, String value2) {
            addCriterion("r_b2 between", value1, value2, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB2NotBetween(String value1, String value2) {
            addCriterion("r_b2 not between", value1, value2, "rB2");
            return (Criteria) this;
        }

        public Criteria andRB3IsNull() {
            addCriterion("r_b3 is null");
            return (Criteria) this;
        }

        public Criteria andRB3IsNotNull() {
            addCriterion("r_b3 is not null");
            return (Criteria) this;
        }

        public Criteria andRB3EqualTo(String value) {
            addCriterion("r_b3 =", value, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3NotEqualTo(String value) {
            addCriterion("r_b3 <>", value, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3GreaterThan(String value) {
            addCriterion("r_b3 >", value, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3GreaterThanOrEqualTo(String value) {
            addCriterion("r_b3 >=", value, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3LessThan(String value) {
            addCriterion("r_b3 <", value, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3LessThanOrEqualTo(String value) {
            addCriterion("r_b3 <=", value, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3Like(String value) {
            addCriterion("r_b3 like", value, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3NotLike(String value) {
            addCriterion("r_b3 not like", value, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3In(List<String> values) {
            addCriterion("r_b3 in", values, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3NotIn(List<String> values) {
            addCriterion("r_b3 not in", values, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3Between(String value1, String value2) {
            addCriterion("r_b3 between", value1, value2, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB3NotBetween(String value1, String value2) {
            addCriterion("r_b3 not between", value1, value2, "rB3");
            return (Criteria) this;
        }

        public Criteria andRB4IsNull() {
            addCriterion("r_b4 is null");
            return (Criteria) this;
        }

        public Criteria andRB4IsNotNull() {
            addCriterion("r_b4 is not null");
            return (Criteria) this;
        }

        public Criteria andRB4EqualTo(Integer value) {
            addCriterion("r_b4 =", value, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4NotEqualTo(Integer value) {
            addCriterion("r_b4 <>", value, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4GreaterThan(Integer value) {
            addCriterion("r_b4 >", value, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4GreaterThanOrEqualTo(Integer value) {
            addCriterion("r_b4 >=", value, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4LessThan(Integer value) {
            addCriterion("r_b4 <", value, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4LessThanOrEqualTo(Integer value) {
            addCriterion("r_b4 <=", value, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4In(List<Integer> values) {
            addCriterion("r_b4 in", values, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4NotIn(List<Integer> values) {
            addCriterion("r_b4 not in", values, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4Between(Integer value1, Integer value2) {
            addCriterion("r_b4 between", value1, value2, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB4NotBetween(Integer value1, Integer value2) {
            addCriterion("r_b4 not between", value1, value2, "rB4");
            return (Criteria) this;
        }

        public Criteria andRB5IsNull() {
            addCriterion("r_b5 is null");
            return (Criteria) this;
        }

        public Criteria andRB5IsNotNull() {
            addCriterion("r_b5 is not null");
            return (Criteria) this;
        }

        public Criteria andRB5EqualTo(Integer value) {
            addCriterion("r_b5 =", value, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5NotEqualTo(Integer value) {
            addCriterion("r_b5 <>", value, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5GreaterThan(Integer value) {
            addCriterion("r_b5 >", value, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5GreaterThanOrEqualTo(Integer value) {
            addCriterion("r_b5 >=", value, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5LessThan(Integer value) {
            addCriterion("r_b5 <", value, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5LessThanOrEqualTo(Integer value) {
            addCriterion("r_b5 <=", value, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5In(List<Integer> values) {
            addCriterion("r_b5 in", values, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5NotIn(List<Integer> values) {
            addCriterion("r_b5 not in", values, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5Between(Integer value1, Integer value2) {
            addCriterion("r_b5 between", value1, value2, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB5NotBetween(Integer value1, Integer value2) {
            addCriterion("r_b5 not between", value1, value2, "rB5");
            return (Criteria) this;
        }

        public Criteria andRB6IsNull() {
            addCriterion("r_b6 is null");
            return (Criteria) this;
        }

        public Criteria andRB6IsNotNull() {
            addCriterion("r_b6 is not null");
            return (Criteria) this;
        }

        public Criteria andRB6EqualTo(Integer value) {
            addCriterion("r_b6 =", value, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6NotEqualTo(Integer value) {
            addCriterion("r_b6 <>", value, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6GreaterThan(Integer value) {
            addCriterion("r_b6 >", value, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6GreaterThanOrEqualTo(Integer value) {
            addCriterion("r_b6 >=", value, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6LessThan(Integer value) {
            addCriterion("r_b6 <", value, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6LessThanOrEqualTo(Integer value) {
            addCriterion("r_b6 <=", value, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6In(List<Integer> values) {
            addCriterion("r_b6 in", values, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6NotIn(List<Integer> values) {
            addCriterion("r_b6 not in", values, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6Between(Integer value1, Integer value2) {
            addCriterion("r_b6 between", value1, value2, "rB6");
            return (Criteria) this;
        }

        public Criteria andRB6NotBetween(Integer value1, Integer value2) {
            addCriterion("r_b6 not between", value1, value2, "rB6");
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