package com.cma.pojo;

import java.util.ArrayList;
import java.util.List;

public class SupervisionPlanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SupervisionPlanExample() {
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

        public Criteria andPlanIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Long value) {
            addCriterion("id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Long value) {
            addCriterion("id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Long value) {
            addCriterion("id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Long> values) {
            addCriterion("id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdIsNull() {
            addCriterion("supervise_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdIsNotNull() {
            addCriterion("supervise_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdEqualTo(Long value) {
            addCriterion("supervise_id =", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdNotEqualTo(Long value) {
            addCriterion("supervise_id <>", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdGreaterThan(Long value) {
            addCriterion("supervise_id >", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdGreaterThanOrEqualTo(Long value) {
            addCriterion("supervise_id >=", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdLessThan(Long value) {
            addCriterion("supervise_id <", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdLessThanOrEqualTo(Long value) {
            addCriterion("supervise_id <=", value, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdIn(List<Long> values) {
            addCriterion("supervise_id in", values, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdNotIn(List<Long> values) {
            addCriterion("supervise_id not in", values, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdBetween(Long value1, Long value2) {
            addCriterion("supervise_id between", value1, value2, "superviseId");
            return (Criteria) this;
        }

        public Criteria andSuperviseIdNotBetween(Long value1, Long value2) {
            addCriterion("supervise_id not between", value1, value2, "superviseId");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andObjectIsNull() {
            addCriterion("object is null");
            return (Criteria) this;
        }

        public Criteria andObjectIsNotNull() {
            addCriterion("object is not null");
            return (Criteria) this;
        }

        public Criteria andObjectEqualTo(String value) {
            addCriterion("object =", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotEqualTo(String value) {
            addCriterion("object <>", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThan(String value) {
            addCriterion("object >", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectGreaterThanOrEqualTo(String value) {
            addCriterion("object >=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThan(String value) {
            addCriterion("object <", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLessThanOrEqualTo(String value) {
            addCriterion("object <=", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectLike(String value) {
            addCriterion("object like", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotLike(String value) {
            addCriterion("object not like", value, "object");
            return (Criteria) this;
        }

        public Criteria andObjectIn(List<String> values) {
            addCriterion("object in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotIn(List<String> values) {
            addCriterion("object not in", values, "object");
            return (Criteria) this;
        }

        public Criteria andObjectBetween(String value1, String value2) {
            addCriterion("object between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andObjectNotBetween(String value1, String value2) {
            addCriterion("object not between", value1, value2, "object");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyIsNull() {
            addCriterion("date_frequency is null");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyIsNotNull() {
            addCriterion("date_frequency is not null");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyEqualTo(String value) {
            addCriterion("date_frequency =", value, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyNotEqualTo(String value) {
            addCriterion("date_frequency <>", value, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyGreaterThan(String value) {
            addCriterion("date_frequency >", value, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyGreaterThanOrEqualTo(String value) {
            addCriterion("date_frequency >=", value, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyLessThan(String value) {
            addCriterion("date_frequency <", value, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyLessThanOrEqualTo(String value) {
            addCriterion("date_frequency <=", value, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyLike(String value) {
            addCriterion("date_frequency like", value, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyNotLike(String value) {
            addCriterion("date_frequency not like", value, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyIn(List<String> values) {
            addCriterion("date_frequency in", values, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyNotIn(List<String> values) {
            addCriterion("date_frequency not in", values, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyBetween(String value1, String value2) {
            addCriterion("date_frequency between", value1, value2, "dateFrequency");
            return (Criteria) this;
        }

        public Criteria andDateFrequencyNotBetween(String value1, String value2) {
            addCriterion("date_frequency not between", value1, value2, "dateFrequency");
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