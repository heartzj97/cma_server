package com.cma.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class IntermediateChecksRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IntermediateChecksRecordExample() {
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

        public Criteria andRecordIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andRecordIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andRecordIdEqualTo(Long value) {
            addCriterion("id =", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThan(Long value) {
            addCriterion("id >", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThan(Long value) {
            addCriterion("id <", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdIn(List<Long> values) {
            addCriterion("id in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andRecordIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "recordId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNull() {
            addCriterion("plan_id is null");
            return (Criteria) this;
        }

        public Criteria andPlanIdIsNotNull() {
            addCriterion("plan_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlanIdEqualTo(Long value) {
            addCriterion("plan_id =", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotEqualTo(Long value) {
            addCriterion("plan_id <>", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThan(Long value) {
            addCriterion("plan_id >", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdGreaterThanOrEqualTo(Long value) {
            addCriterion("plan_id >=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThan(Long value) {
            addCriterion("plan_id <", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdLessThanOrEqualTo(Long value) {
            addCriterion("plan_id <=", value, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdIn(List<Long> values) {
            addCriterion("plan_id in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotIn(List<Long> values) {
            addCriterion("plan_id not in", values, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdBetween(Long value1, Long value2) {
            addCriterion("plan_id between", value1, value2, "planId");
            return (Criteria) this;
        }

        public Criteria andPlanIdNotBetween(Long value1, Long value2) {
            addCriterion("plan_id not between", value1, value2, "planId");
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

        public Criteria andCheckDateIsNull() {
            addCriterion("check_date is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("check_date is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterionForJDBCDate("check_date =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("check_date <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterionForJDBCDate("check_date >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_date >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterionForJDBCDate("check_date <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_date <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterionForJDBCDate("check_date in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("check_date not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_date between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_date not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordIsNull() {
            addCriterion("process_record is null");
            return (Criteria) this;
        }

        public Criteria andProcessRecordIsNotNull() {
            addCriterion("process_record is not null");
            return (Criteria) this;
        }

        public Criteria andProcessRecordEqualTo(String value) {
            addCriterion("process_record =", value, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordNotEqualTo(String value) {
            addCriterion("process_record <>", value, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordGreaterThan(String value) {
            addCriterion("process_record >", value, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordGreaterThanOrEqualTo(String value) {
            addCriterion("process_record >=", value, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordLessThan(String value) {
            addCriterion("process_record <", value, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordLessThanOrEqualTo(String value) {
            addCriterion("process_record <=", value, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordLike(String value) {
            addCriterion("process_record like", value, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordNotLike(String value) {
            addCriterion("process_record not like", value, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordIn(List<String> values) {
            addCriterion("process_record in", values, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordNotIn(List<String> values) {
            addCriterion("process_record not in", values, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordBetween(String value1, String value2) {
            addCriterion("process_record between", value1, value2, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordNotBetween(String value1, String value2) {
            addCriterion("process_record not between", value1, value2, "processRecord");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonIsNull() {
            addCriterion("process_record_person is null");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonIsNotNull() {
            addCriterion("process_record_person is not null");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonEqualTo(String value) {
            addCriterion("process_record_person =", value, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonNotEqualTo(String value) {
            addCriterion("process_record_person <>", value, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonGreaterThan(String value) {
            addCriterion("process_record_person >", value, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonGreaterThanOrEqualTo(String value) {
            addCriterion("process_record_person >=", value, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonLessThan(String value) {
            addCriterion("process_record_person <", value, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonLessThanOrEqualTo(String value) {
            addCriterion("process_record_person <=", value, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonLike(String value) {
            addCriterion("process_record_person like", value, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonNotLike(String value) {
            addCriterion("process_record_person not like", value, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonIn(List<String> values) {
            addCriterion("process_record_person in", values, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonNotIn(List<String> values) {
            addCriterion("process_record_person not in", values, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonBetween(String value1, String value2) {
            addCriterion("process_record_person between", value1, value2, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordPersonNotBetween(String value1, String value2) {
            addCriterion("process_record_person not between", value1, value2, "processRecordPerson");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateIsNull() {
            addCriterion("process_record_date is null");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateIsNotNull() {
            addCriterion("process_record_date is not null");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateEqualTo(Date value) {
            addCriterionForJDBCDate("process_record_date =", value, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("process_record_date <>", value, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateGreaterThan(Date value) {
            addCriterionForJDBCDate("process_record_date >", value, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("process_record_date >=", value, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateLessThan(Date value) {
            addCriterionForJDBCDate("process_record_date <", value, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("process_record_date <=", value, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateIn(List<Date> values) {
            addCriterionForJDBCDate("process_record_date in", values, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("process_record_date not in", values, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("process_record_date between", value1, value2, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andProcessRecordDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("process_record_date not between", value1, value2, "processRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordIsNull() {
            addCriterion("result_record is null");
            return (Criteria) this;
        }

        public Criteria andResultRecordIsNotNull() {
            addCriterion("result_record is not null");
            return (Criteria) this;
        }

        public Criteria andResultRecordEqualTo(String value) {
            addCriterion("result_record =", value, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordNotEqualTo(String value) {
            addCriterion("result_record <>", value, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordGreaterThan(String value) {
            addCriterion("result_record >", value, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordGreaterThanOrEqualTo(String value) {
            addCriterion("result_record >=", value, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordLessThan(String value) {
            addCriterion("result_record <", value, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordLessThanOrEqualTo(String value) {
            addCriterion("result_record <=", value, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordLike(String value) {
            addCriterion("result_record like", value, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordNotLike(String value) {
            addCriterion("result_record not like", value, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordIn(List<String> values) {
            addCriterion("result_record in", values, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordNotIn(List<String> values) {
            addCriterion("result_record not in", values, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordBetween(String value1, String value2) {
            addCriterion("result_record between", value1, value2, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordNotBetween(String value1, String value2) {
            addCriterion("result_record not between", value1, value2, "resultRecord");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonIsNull() {
            addCriterion("result_record_person is null");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonIsNotNull() {
            addCriterion("result_record_person is not null");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonEqualTo(String value) {
            addCriterion("result_record_person =", value, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonNotEqualTo(String value) {
            addCriterion("result_record_person <>", value, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonGreaterThan(String value) {
            addCriterion("result_record_person >", value, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonGreaterThanOrEqualTo(String value) {
            addCriterion("result_record_person >=", value, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonLessThan(String value) {
            addCriterion("result_record_person <", value, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonLessThanOrEqualTo(String value) {
            addCriterion("result_record_person <=", value, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonLike(String value) {
            addCriterion("result_record_person like", value, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonNotLike(String value) {
            addCriterion("result_record_person not like", value, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonIn(List<String> values) {
            addCriterion("result_record_person in", values, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonNotIn(List<String> values) {
            addCriterion("result_record_person not in", values, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonBetween(String value1, String value2) {
            addCriterion("result_record_person between", value1, value2, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordPersonNotBetween(String value1, String value2) {
            addCriterion("result_record_person not between", value1, value2, "resultRecordPerson");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateIsNull() {
            addCriterion("result_record_date is null");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateIsNotNull() {
            addCriterion("result_record_date is not null");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateEqualTo(Date value) {
            addCriterionForJDBCDate("result_record_date =", value, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("result_record_date <>", value, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateGreaterThan(Date value) {
            addCriterionForJDBCDate("result_record_date >", value, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("result_record_date >=", value, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateLessThan(Date value) {
            addCriterionForJDBCDate("result_record_date <", value, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("result_record_date <=", value, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateIn(List<Date> values) {
            addCriterionForJDBCDate("result_record_date in", values, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("result_record_date not in", values, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("result_record_date between", value1, value2, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andResultRecordDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("result_record_date not between", value1, value2, "resultRecordDate");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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