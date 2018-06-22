package com.cma.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EquipmentUseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentUseExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNull() {
            addCriterion("equipment_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIsNotNull() {
            addCriterion("equipment_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdEqualTo(Long value) {
            addCriterion("equipment_id =", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotEqualTo(Long value) {
            addCriterion("equipment_id <>", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThan(Long value) {
            addCriterion("equipment_id >", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("equipment_id >=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThan(Long value) {
            addCriterion("equipment_id <", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdLessThanOrEqualTo(Long value) {
            addCriterion("equipment_id <=", value, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdIn(List<Long> values) {
            addCriterion("equipment_id in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotIn(List<Long> values) {
            addCriterion("equipment_id not in", values, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdBetween(Long value1, Long value2) {
            addCriterion("equipment_id between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andEquipmentIdNotBetween(Long value1, Long value2) {
            addCriterion("equipment_id not between", value1, value2, "equipmentId");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNull() {
            addCriterion("use_date is null");
            return (Criteria) this;
        }

        public Criteria andUseDateIsNotNull() {
            addCriterion("use_date is not null");
            return (Criteria) this;
        }

        public Criteria andUseDateEqualTo(Date value) {
            addCriterionForJDBCDate("use_date =", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("use_date <>", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("use_date >", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("use_date >=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThan(Date value) {
            addCriterionForJDBCDate("use_date <", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("use_date <=", value, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateIn(List<Date> values) {
            addCriterionForJDBCDate("use_date in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("use_date not in", values, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("use_date between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andUseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("use_date not between", value1, value2, "useDate");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNull() {
            addCriterion("open_time is null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIsNotNull() {
            addCriterion("open_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTimeEqualTo(Date value) {
            addCriterionForJDBCTime("open_time =", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("open_time <>", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("open_time >", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("open_time >=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThan(Date value) {
            addCriterionForJDBCTime("open_time <", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("open_time <=", value, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeIn(List<Date> values) {
            addCriterionForJDBCTime("open_time in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("open_time not in", values, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("open_time between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andOpenTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("open_time not between", value1, value2, "openTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterionForJDBCTime("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterionForJDBCTime("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterionForJDBCTime("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterionForJDBCTime("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("close_time not between", value1, value2, "closeTime");
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

        public Criteria andTestProjectIsNull() {
            addCriterion("test_project is null");
            return (Criteria) this;
        }

        public Criteria andTestProjectIsNotNull() {
            addCriterion("test_project is not null");
            return (Criteria) this;
        }

        public Criteria andTestProjectEqualTo(String value) {
            addCriterion("test_project =", value, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectNotEqualTo(String value) {
            addCriterion("test_project <>", value, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectGreaterThan(String value) {
            addCriterion("test_project >", value, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectGreaterThanOrEqualTo(String value) {
            addCriterion("test_project >=", value, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectLessThan(String value) {
            addCriterion("test_project <", value, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectLessThanOrEqualTo(String value) {
            addCriterion("test_project <=", value, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectLike(String value) {
            addCriterion("test_project like", value, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectNotLike(String value) {
            addCriterion("test_project not like", value, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectIn(List<String> values) {
            addCriterion("test_project in", values, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectNotIn(List<String> values) {
            addCriterion("test_project not in", values, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectBetween(String value1, String value2) {
            addCriterion("test_project between", value1, value2, "testProject");
            return (Criteria) this;
        }

        public Criteria andTestProjectNotBetween(String value1, String value2) {
            addCriterion("test_project not between", value1, value2, "testProject");
            return (Criteria) this;
        }

        public Criteria andBeforeUseIsNull() {
            addCriterion("before_use is null");
            return (Criteria) this;
        }

        public Criteria andBeforeUseIsNotNull() {
            addCriterion("before_use is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeUseEqualTo(String value) {
            addCriterion("before_use =", value, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseNotEqualTo(String value) {
            addCriterion("before_use <>", value, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseGreaterThan(String value) {
            addCriterion("before_use >", value, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseGreaterThanOrEqualTo(String value) {
            addCriterion("before_use >=", value, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseLessThan(String value) {
            addCriterion("before_use <", value, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseLessThanOrEqualTo(String value) {
            addCriterion("before_use <=", value, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseLike(String value) {
            addCriterion("before_use like", value, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseNotLike(String value) {
            addCriterion("before_use not like", value, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseIn(List<String> values) {
            addCriterion("before_use in", values, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseNotIn(List<String> values) {
            addCriterion("before_use not in", values, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseBetween(String value1, String value2) {
            addCriterion("before_use between", value1, value2, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andBeforeUseNotBetween(String value1, String value2) {
            addCriterion("before_use not between", value1, value2, "beforeUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseIsNull() {
            addCriterion("after_use is null");
            return (Criteria) this;
        }

        public Criteria andAfterUseIsNotNull() {
            addCriterion("after_use is not null");
            return (Criteria) this;
        }

        public Criteria andAfterUseEqualTo(String value) {
            addCriterion("after_use =", value, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseNotEqualTo(String value) {
            addCriterion("after_use <>", value, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseGreaterThan(String value) {
            addCriterion("after_use >", value, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseGreaterThanOrEqualTo(String value) {
            addCriterion("after_use >=", value, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseLessThan(String value) {
            addCriterion("after_use <", value, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseLessThanOrEqualTo(String value) {
            addCriterion("after_use <=", value, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseLike(String value) {
            addCriterion("after_use like", value, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseNotLike(String value) {
            addCriterion("after_use not like", value, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseIn(List<String> values) {
            addCriterion("after_use in", values, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseNotIn(List<String> values) {
            addCriterion("after_use not in", values, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseBetween(String value1, String value2) {
            addCriterion("after_use between", value1, value2, "afterUse");
            return (Criteria) this;
        }

        public Criteria andAfterUseNotBetween(String value1, String value2) {
            addCriterion("after_use not between", value1, value2, "afterUse");
            return (Criteria) this;
        }

        public Criteria andUserIsNull() {
            addCriterion("user is null");
            return (Criteria) this;
        }

        public Criteria andUserIsNotNull() {
            addCriterion("user is not null");
            return (Criteria) this;
        }

        public Criteria andUserEqualTo(String value) {
            addCriterion("user =", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotEqualTo(String value) {
            addCriterion("user <>", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThan(String value) {
            addCriterion("user >", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserGreaterThanOrEqualTo(String value) {
            addCriterion("user >=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThan(String value) {
            addCriterion("user <", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLessThanOrEqualTo(String value) {
            addCriterion("user <=", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserLike(String value) {
            addCriterion("user like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotLike(String value) {
            addCriterion("user not like", value, "user");
            return (Criteria) this;
        }

        public Criteria andUserIn(List<String> values) {
            addCriterion("user in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotIn(List<String> values) {
            addCriterion("user not in", values, "user");
            return (Criteria) this;
        }

        public Criteria andUserBetween(String value1, String value2) {
            addCriterion("user between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andUserNotBetween(String value1, String value2) {
            addCriterion("user not between", value1, value2, "user");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
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