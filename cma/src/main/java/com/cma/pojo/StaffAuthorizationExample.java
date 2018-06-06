package com.cma.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class StaffAuthorizationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StaffAuthorizationExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAuthorizationIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdEqualTo(Long value) {
            addCriterion("id =", value, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdGreaterThan(Long value) {
            addCriterion("id >", value, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdLessThan(Long value) {
            addCriterion("id <", value, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdIn(List<Long> values) {
            addCriterion("id in", values, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizationIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "authorizationId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdIsNull() {
            addCriterion("authorizer_id is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdIsNotNull() {
            addCriterion("authorizer_id is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdEqualTo(Long value) {
            addCriterion("authorizer_id =", value, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdNotEqualTo(Long value) {
            addCriterion("authorizer_id <>", value, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdGreaterThan(Long value) {
            addCriterion("authorizer_id >", value, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("authorizer_id >=", value, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdLessThan(Long value) {
            addCriterion("authorizer_id <", value, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdLessThanOrEqualTo(Long value) {
            addCriterion("authorizer_id <=", value, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdIn(List<Long> values) {
            addCriterion("authorizer_id in", values, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdNotIn(List<Long> values) {
            addCriterion("authorizer_id not in", values, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdBetween(Long value1, Long value2) {
            addCriterion("authorizer_id between", value1, value2, "authorizerId");
            return (Criteria) this;
        }

        public Criteria andAuthorizerIdNotBetween(Long value1, Long value2) {
            addCriterion("authorizer_id not between", value1, value2, "authorizerId");
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

        public Criteria andAuthorizerDateIsNull() {
            addCriterion("authorizer_date is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateIsNotNull() {
            addCriterion("authorizer_date is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateEqualTo(Date value) {
            addCriterionForJDBCDate("authorizer_date =", value, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("authorizer_date <>", value, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateGreaterThan(Date value) {
            addCriterionForJDBCDate("authorizer_date >", value, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("authorizer_date >=", value, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateLessThan(Date value) {
            addCriterionForJDBCDate("authorizer_date <", value, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("authorizer_date <=", value, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateIn(List<Date> values) {
            addCriterionForJDBCDate("authorizer_date in", values, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("authorizer_date not in", values, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("authorizer_date between", value1, value2, "authorizerDate");
            return (Criteria) this;
        }

        public Criteria andAuthorizerDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("authorizer_date not between", value1, value2, "authorizerDate");
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