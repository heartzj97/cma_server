package com.cma.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SampleReceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SampleReceiveExample() {
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

        public Criteria andSampleIdIsNull() {
            addCriterion("sample_id is null");
            return (Criteria) this;
        }

        public Criteria andSampleIdIsNotNull() {
            addCriterion("sample_id is not null");
            return (Criteria) this;
        }

        public Criteria andSampleIdEqualTo(Long value) {
            addCriterion("sample_id =", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotEqualTo(Long value) {
            addCriterion("sample_id <>", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThan(Long value) {
            addCriterion("sample_id >", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("sample_id >=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThan(Long value) {
            addCriterion("sample_id <", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdLessThanOrEqualTo(Long value) {
            addCriterion("sample_id <=", value, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdIn(List<Long> values) {
            addCriterion("sample_id in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotIn(List<Long> values) {
            addCriterion("sample_id not in", values, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdBetween(Long value1, Long value2) {
            addCriterion("sample_id between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andSampleIdNotBetween(Long value1, Long value2) {
            addCriterion("sample_id not between", value1, value2, "sampleId");
            return (Criteria) this;
        }

        public Criteria andRequesterIsNull() {
            addCriterion("requester is null");
            return (Criteria) this;
        }

        public Criteria andRequesterIsNotNull() {
            addCriterion("requester is not null");
            return (Criteria) this;
        }

        public Criteria andRequesterEqualTo(String value) {
            addCriterion("requester =", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotEqualTo(String value) {
            addCriterion("requester <>", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterGreaterThan(String value) {
            addCriterion("requester >", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterGreaterThanOrEqualTo(String value) {
            addCriterion("requester >=", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLessThan(String value) {
            addCriterion("requester <", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLessThanOrEqualTo(String value) {
            addCriterion("requester <=", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterLike(String value) {
            addCriterion("requester like", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotLike(String value) {
            addCriterion("requester not like", value, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterIn(List<String> values) {
            addCriterion("requester in", values, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotIn(List<String> values) {
            addCriterion("requester not in", values, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterBetween(String value1, String value2) {
            addCriterion("requester between", value1, value2, "requester");
            return (Criteria) this;
        }

        public Criteria andRequesterNotBetween(String value1, String value2) {
            addCriterion("requester not between", value1, value2, "requester");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNull() {
            addCriterion("receiver is null");
            return (Criteria) this;
        }

        public Criteria andReceiverIsNotNull() {
            addCriterion("receiver is not null");
            return (Criteria) this;
        }

        public Criteria andReceiverEqualTo(String value) {
            addCriterion("receiver =", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotEqualTo(String value) {
            addCriterion("receiver <>", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThan(String value) {
            addCriterion("receiver >", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverGreaterThanOrEqualTo(String value) {
            addCriterion("receiver >=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThan(String value) {
            addCriterion("receiver <", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLessThanOrEqualTo(String value) {
            addCriterion("receiver <=", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverLike(String value) {
            addCriterion("receiver like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotLike(String value) {
            addCriterion("receiver not like", value, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverIn(List<String> values) {
            addCriterion("receiver in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotIn(List<String> values) {
            addCriterion("receiver not in", values, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverBetween(String value1, String value2) {
            addCriterion("receiver between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiverNotBetween(String value1, String value2) {
            addCriterion("receiver not between", value1, value2, "receiver");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNull() {
            addCriterion("receive_date is null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIsNotNull() {
            addCriterion("receive_date is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveDateEqualTo(Date value) {
            addCriterionForJDBCDate("receive_date =", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("receive_date <>", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThan(Date value) {
            addCriterionForJDBCDate("receive_date >", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receive_date >=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThan(Date value) {
            addCriterionForJDBCDate("receive_date <", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("receive_date <=", value, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateIn(List<Date> values) {
            addCriterionForJDBCDate("receive_date in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("receive_date not in", values, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receive_date between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andReceiveDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("receive_date not between", value1, value2, "receiveDate");
            return (Criteria) this;
        }

        public Criteria andObtainerIsNull() {
            addCriterion("obtainer is null");
            return (Criteria) this;
        }

        public Criteria andObtainerIsNotNull() {
            addCriterion("obtainer is not null");
            return (Criteria) this;
        }

        public Criteria andObtainerEqualTo(String value) {
            addCriterion("obtainer =", value, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerNotEqualTo(String value) {
            addCriterion("obtainer <>", value, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerGreaterThan(String value) {
            addCriterion("obtainer >", value, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerGreaterThanOrEqualTo(String value) {
            addCriterion("obtainer >=", value, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerLessThan(String value) {
            addCriterion("obtainer <", value, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerLessThanOrEqualTo(String value) {
            addCriterion("obtainer <=", value, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerLike(String value) {
            addCriterion("obtainer like", value, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerNotLike(String value) {
            addCriterion("obtainer not like", value, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerIn(List<String> values) {
            addCriterion("obtainer in", values, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerNotIn(List<String> values) {
            addCriterion("obtainer not in", values, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerBetween(String value1, String value2) {
            addCriterion("obtainer between", value1, value2, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainerNotBetween(String value1, String value2) {
            addCriterion("obtainer not between", value1, value2, "obtainer");
            return (Criteria) this;
        }

        public Criteria andObtainDateIsNull() {
            addCriterion("obtain_date is null");
            return (Criteria) this;
        }

        public Criteria andObtainDateIsNotNull() {
            addCriterion("obtain_date is not null");
            return (Criteria) this;
        }

        public Criteria andObtainDateEqualTo(Date value) {
            addCriterionForJDBCDate("obtain_date =", value, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("obtain_date <>", value, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateGreaterThan(Date value) {
            addCriterionForJDBCDate("obtain_date >", value, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("obtain_date >=", value, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateLessThan(Date value) {
            addCriterionForJDBCDate("obtain_date <", value, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("obtain_date <=", value, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateIn(List<Date> values) {
            addCriterionForJDBCDate("obtain_date in", values, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("obtain_date not in", values, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("obtain_date between", value1, value2, "obtainDate");
            return (Criteria) this;
        }

        public Criteria andObtainDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("obtain_date not between", value1, value2, "obtainDate");
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