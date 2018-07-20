package com.cma.dao.example;

import java.util.ArrayList;
import java.util.List;

public class StaffQualificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffQualificationExample() {
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

        public Criteria andQualificationIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andQualificationIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationIdEqualTo(Long value) {
            addCriterion("id =", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdGreaterThan(Long value) {
            addCriterion("id >", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdLessThan(Long value) {
            addCriterion("id <", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdIn(List<Long> values) {
            addCriterion("id in", values, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "qualificationId");
            return (Criteria) this;
        }

        public Criteria andQualificationNameIsNull() {
            addCriterion("qualification_name is null");
            return (Criteria) this;
        }

        public Criteria andQualificationNameIsNotNull() {
            addCriterion("qualification_name is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationNameEqualTo(String value) {
            addCriterion("qualification_name =", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameNotEqualTo(String value) {
            addCriterion("qualification_name <>", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameGreaterThan(String value) {
            addCriterion("qualification_name >", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_name >=", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameLessThan(String value) {
            addCriterion("qualification_name <", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameLessThanOrEqualTo(String value) {
            addCriterion("qualification_name <=", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameLike(String value) {
            addCriterion("qualification_name like", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameNotLike(String value) {
            addCriterion("qualification_name not like", value, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameIn(List<String> values) {
            addCriterion("qualification_name in", values, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameNotIn(List<String> values) {
            addCriterion("qualification_name not in", values, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameBetween(String value1, String value2) {
            addCriterion("qualification_name between", value1, value2, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationNameNotBetween(String value1, String value2) {
            addCriterion("qualification_name not between", value1, value2, "qualificationName");
            return (Criteria) this;
        }

        public Criteria andQualificationImageIsNull() {
            addCriterion("qualification_image is null");
            return (Criteria) this;
        }

        public Criteria andQualificationImageIsNotNull() {
            addCriterion("qualification_image is not null");
            return (Criteria) this;
        }

        public Criteria andQualificationImageEqualTo(String value) {
            addCriterion("qualification_image =", value, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageNotEqualTo(String value) {
            addCriterion("qualification_image <>", value, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageGreaterThan(String value) {
            addCriterion("qualification_image >", value, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageGreaterThanOrEqualTo(String value) {
            addCriterion("qualification_image >=", value, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageLessThan(String value) {
            addCriterion("qualification_image <", value, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageLessThanOrEqualTo(String value) {
            addCriterion("qualification_image <=", value, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageLike(String value) {
            addCriterion("qualification_image like", value, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageNotLike(String value) {
            addCriterion("qualification_image not like", value, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageIn(List<String> values) {
            addCriterion("qualification_image in", values, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageNotIn(List<String> values) {
            addCriterion("qualification_image not in", values, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageBetween(String value1, String value2) {
            addCriterion("qualification_image between", value1, value2, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andQualificationImageNotBetween(String value1, String value2) {
            addCriterion("qualification_image not between", value1, value2, "qualificationImage");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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