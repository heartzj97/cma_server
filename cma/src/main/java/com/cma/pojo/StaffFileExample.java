package com.cma.pojo;

import java.util.ArrayList;
import java.util.List;

public class StaffFileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffFileExample() {
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

        public Criteria andFileIdIsNull() {
            addCriterion("file_id is null");
            return (Criteria) this;
        }

        public Criteria andFileIdIsNotNull() {
            addCriterion("file_id is not null");
            return (Criteria) this;
        }

        public Criteria andFileIdEqualTo(String value) {
            addCriterion("file_id =", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotEqualTo(String value) {
            addCriterion("file_id <>", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThan(String value) {
            addCriterion("file_id >", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdGreaterThanOrEqualTo(String value) {
            addCriterion("file_id >=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThan(String value) {
            addCriterion("file_id <", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLessThanOrEqualTo(String value) {
            addCriterion("file_id <=", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdLike(String value) {
            addCriterion("file_id like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotLike(String value) {
            addCriterion("file_id not like", value, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdIn(List<String> values) {
            addCriterion("file_id in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotIn(List<String> values) {
            addCriterion("file_id not in", values, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdBetween(String value1, String value2) {
            addCriterion("file_id between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileIdNotBetween(String value1, String value2) {
            addCriterion("file_id not between", value1, value2, "fileId");
            return (Criteria) this;
        }

        public Criteria andFileLocationIsNull() {
            addCriterion("file_location is null");
            return (Criteria) this;
        }

        public Criteria andFileLocationIsNotNull() {
            addCriterion("file_location is not null");
            return (Criteria) this;
        }

        public Criteria andFileLocationEqualTo(String value) {
            addCriterion("file_location =", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotEqualTo(String value) {
            addCriterion("file_location <>", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationGreaterThan(String value) {
            addCriterion("file_location >", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationGreaterThanOrEqualTo(String value) {
            addCriterion("file_location >=", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLessThan(String value) {
            addCriterion("file_location <", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLessThanOrEqualTo(String value) {
            addCriterion("file_location <=", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationLike(String value) {
            addCriterion("file_location like", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotLike(String value) {
            addCriterion("file_location not like", value, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationIn(List<String> values) {
            addCriterion("file_location in", values, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotIn(List<String> values) {
            addCriterion("file_location not in", values, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationBetween(String value1, String value2) {
            addCriterion("file_location between", value1, value2, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileLocationNotBetween(String value1, String value2) {
            addCriterion("file_location not between", value1, value2, "fileLocation");
            return (Criteria) this;
        }

        public Criteria andFileImageIsNull() {
            addCriterion("file_image is null");
            return (Criteria) this;
        }

        public Criteria andFileImageIsNotNull() {
            addCriterion("file_image is not null");
            return (Criteria) this;
        }

        public Criteria andFileImageEqualTo(String value) {
            addCriterion("file_image =", value, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageNotEqualTo(String value) {
            addCriterion("file_image <>", value, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageGreaterThan(String value) {
            addCriterion("file_image >", value, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageGreaterThanOrEqualTo(String value) {
            addCriterion("file_image >=", value, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageLessThan(String value) {
            addCriterion("file_image <", value, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageLessThanOrEqualTo(String value) {
            addCriterion("file_image <=", value, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageLike(String value) {
            addCriterion("file_image like", value, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageNotLike(String value) {
            addCriterion("file_image not like", value, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageIn(List<String> values) {
            addCriterion("file_image in", values, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageNotIn(List<String> values) {
            addCriterion("file_image not in", values, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageBetween(String value1, String value2) {
            addCriterion("file_image between", value1, value2, "fileImage");
            return (Criteria) this;
        }

        public Criteria andFileImageNotBetween(String value1, String value2) {
            addCriterion("file_image not between", value1, value2, "fileImage");
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