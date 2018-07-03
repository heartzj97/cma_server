package com.cma.dao.example;

import java.util.ArrayList;
import java.util.List;

public class SampleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SampleExample() {
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

        public Criteria andSampleIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(Long value) {
            addCriterion("id =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(Long value) {
            addCriterion("id >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(Long value) {
            addCriterion("id <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<Long> values) {
            addCriterion("id in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIsNull() {
            addCriterion("sample_number is null");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIsNotNull() {
            addCriterion("sample_number is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNumberEqualTo(String value) {
            addCriterion("sample_number =", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotEqualTo(String value) {
            addCriterion("sample_number <>", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberGreaterThan(String value) {
            addCriterion("sample_number >", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberGreaterThanOrEqualTo(String value) {
            addCriterion("sample_number >=", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLessThan(String value) {
            addCriterion("sample_number <", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLessThanOrEqualTo(String value) {
            addCriterion("sample_number <=", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberLike(String value) {
            addCriterion("sample_number like", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotLike(String value) {
            addCriterion("sample_number not like", value, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberIn(List<String> values) {
            addCriterion("sample_number in", values, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotIn(List<String> values) {
            addCriterion("sample_number not in", values, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberBetween(String value1, String value2) {
            addCriterion("sample_number between", value1, value2, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNumberNotBetween(String value1, String value2) {
            addCriterion("sample_number not between", value1, value2, "sampleNumber");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNull() {
            addCriterion("sample_name is null");
            return (Criteria) this;
        }

        public Criteria andSampleNameIsNotNull() {
            addCriterion("sample_name is not null");
            return (Criteria) this;
        }

        public Criteria andSampleNameEqualTo(String value) {
            addCriterion("sample_name =", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotEqualTo(String value) {
            addCriterion("sample_name <>", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThan(String value) {
            addCriterion("sample_name >", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sample_name >=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThan(String value) {
            addCriterion("sample_name <", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLessThanOrEqualTo(String value) {
            addCriterion("sample_name <=", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameLike(String value) {
            addCriterion("sample_name like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotLike(String value) {
            addCriterion("sample_name not like", value, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameIn(List<String> values) {
            addCriterion("sample_name in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotIn(List<String> values) {
            addCriterion("sample_name not in", values, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameBetween(String value1, String value2) {
            addCriterion("sample_name between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleNameNotBetween(String value1, String value2) {
            addCriterion("sample_name not between", value1, value2, "sampleName");
            return (Criteria) this;
        }

        public Criteria andSampleAmountIsNull() {
            addCriterion("sample_amount is null");
            return (Criteria) this;
        }

        public Criteria andSampleAmountIsNotNull() {
            addCriterion("sample_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSampleAmountEqualTo(Byte value) {
            addCriterion("sample_amount =", value, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountNotEqualTo(Byte value) {
            addCriterion("sample_amount <>", value, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountGreaterThan(Byte value) {
            addCriterion("sample_amount >", value, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountGreaterThanOrEqualTo(Byte value) {
            addCriterion("sample_amount >=", value, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountLessThan(Byte value) {
            addCriterion("sample_amount <", value, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountLessThanOrEqualTo(Byte value) {
            addCriterion("sample_amount <=", value, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountIn(List<Byte> values) {
            addCriterion("sample_amount in", values, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountNotIn(List<Byte> values) {
            addCriterion("sample_amount not in", values, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountBetween(Byte value1, Byte value2) {
            addCriterion("sample_amount between", value1, value2, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleAmountNotBetween(Byte value1, Byte value2) {
            addCriterion("sample_amount not between", value1, value2, "sampleAmount");
            return (Criteria) this;
        }

        public Criteria andSampleStateIsNull() {
            addCriterion("sample_state is null");
            return (Criteria) this;
        }

        public Criteria andSampleStateIsNotNull() {
            addCriterion("sample_state is not null");
            return (Criteria) this;
        }

        public Criteria andSampleStateEqualTo(Byte value) {
            addCriterion("sample_state =", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotEqualTo(Byte value) {
            addCriterion("sample_state <>", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateGreaterThan(Byte value) {
            addCriterion("sample_state >", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("sample_state >=", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLessThan(Byte value) {
            addCriterion("sample_state <", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateLessThanOrEqualTo(Byte value) {
            addCriterion("sample_state <=", value, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateIn(List<Byte> values) {
            addCriterion("sample_state in", values, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotIn(List<Byte> values) {
            addCriterion("sample_state not in", values, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateBetween(Byte value1, Byte value2) {
            addCriterion("sample_state between", value1, value2, "sampleState");
            return (Criteria) this;
        }

        public Criteria andSampleStateNotBetween(Byte value1, Byte value2) {
            addCriterion("sample_state not between", value1, value2, "sampleState");
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