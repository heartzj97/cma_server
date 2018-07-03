package com.cma.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EquipmentMaintenanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentMaintenanceExample() {
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

        public Criteria andMaintenanceDateIsNull() {
            addCriterion("maintenance_date is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateIsNotNull() {
            addCriterion("maintenance_date is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("maintenance_date =", value, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("maintenance_date <>", value, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("maintenance_date >", value, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maintenance_date >=", value, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateLessThan(Date value) {
            addCriterionForJDBCDate("maintenance_date <", value, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maintenance_date <=", value, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("maintenance_date in", values, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("maintenance_date not in", values, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maintenance_date between", value1, value2, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maintenance_date not between", value1, value2, "maintenanceDate");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentIsNull() {
            addCriterion("maintenance_content is null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentIsNotNull() {
            addCriterion("maintenance_content is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentEqualTo(String value) {
            addCriterion("maintenance_content =", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentNotEqualTo(String value) {
            addCriterion("maintenance_content <>", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentGreaterThan(String value) {
            addCriterion("maintenance_content >", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentGreaterThanOrEqualTo(String value) {
            addCriterion("maintenance_content >=", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentLessThan(String value) {
            addCriterion("maintenance_content <", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentLessThanOrEqualTo(String value) {
            addCriterion("maintenance_content <=", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentLike(String value) {
            addCriterion("maintenance_content like", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentNotLike(String value) {
            addCriterion("maintenance_content not like", value, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentIn(List<String> values) {
            addCriterion("maintenance_content in", values, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentNotIn(List<String> values) {
            addCriterion("maintenance_content not in", values, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentBetween(String value1, String value2) {
            addCriterion("maintenance_content between", value1, value2, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenanceContentNotBetween(String value1, String value2) {
            addCriterion("maintenance_content not between", value1, value2, "maintenanceContent");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonIsNull() {
            addCriterion("maintenance_person is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonIsNotNull() {
            addCriterion("maintenance_person is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonEqualTo(String value) {
            addCriterion("maintenance_person =", value, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonNotEqualTo(String value) {
            addCriterion("maintenance_person <>", value, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonGreaterThan(String value) {
            addCriterion("maintenance_person >", value, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonGreaterThanOrEqualTo(String value) {
            addCriterion("maintenance_person >=", value, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonLessThan(String value) {
            addCriterion("maintenance_person <", value, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonLessThanOrEqualTo(String value) {
            addCriterion("maintenance_person <=", value, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonLike(String value) {
            addCriterion("maintenance_person like", value, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonNotLike(String value) {
            addCriterion("maintenance_person not like", value, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonIn(List<String> values) {
            addCriterion("maintenance_person in", values, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonNotIn(List<String> values) {
            addCriterion("maintenance_person not in", values, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonBetween(String value1, String value2) {
            addCriterion("maintenance_person between", value1, value2, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andMaintenancePersonNotBetween(String value1, String value2) {
            addCriterion("maintenance_person not between", value1, value2, "maintenancePerson");
            return (Criteria) this;
        }

        public Criteria andConfirmerIsNull() {
            addCriterion("confirmer is null");
            return (Criteria) this;
        }

        public Criteria andConfirmerIsNotNull() {
            addCriterion("confirmer is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmerEqualTo(String value) {
            addCriterion("confirmer =", value, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerNotEqualTo(String value) {
            addCriterion("confirmer <>", value, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerGreaterThan(String value) {
            addCriterion("confirmer >", value, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerGreaterThanOrEqualTo(String value) {
            addCriterion("confirmer >=", value, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerLessThan(String value) {
            addCriterion("confirmer <", value, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerLessThanOrEqualTo(String value) {
            addCriterion("confirmer <=", value, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerLike(String value) {
            addCriterion("confirmer like", value, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerNotLike(String value) {
            addCriterion("confirmer not like", value, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerIn(List<String> values) {
            addCriterion("confirmer in", values, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerNotIn(List<String> values) {
            addCriterion("confirmer not in", values, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerBetween(String value1, String value2) {
            addCriterion("confirmer between", value1, value2, "confirmer");
            return (Criteria) this;
        }

        public Criteria andConfirmerNotBetween(String value1, String value2) {
            addCriterion("confirmer not between", value1, value2, "confirmer");
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