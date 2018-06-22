package com.cma.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EquipmentReceiveExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentReceiveExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("manufacturer is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("manufacturer is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("manufacturer =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("manufacturer <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("manufacturer >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("manufacturer >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("manufacturer <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("manufacturer <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("manufacturer like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("manufacturer not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("manufacturer in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("manufacturer not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("manufacturer between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("manufacturer not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationIsNull() {
            addCriterion("receive_situation is null");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationIsNotNull() {
            addCriterion("receive_situation is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationEqualTo(String value) {
            addCriterion("receive_situation =", value, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationNotEqualTo(String value) {
            addCriterion("receive_situation <>", value, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationGreaterThan(String value) {
            addCriterion("receive_situation >", value, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationGreaterThanOrEqualTo(String value) {
            addCriterion("receive_situation >=", value, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationLessThan(String value) {
            addCriterion("receive_situation <", value, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationLessThanOrEqualTo(String value) {
            addCriterion("receive_situation <=", value, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationLike(String value) {
            addCriterion("receive_situation like", value, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationNotLike(String value) {
            addCriterion("receive_situation not like", value, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationIn(List<String> values) {
            addCriterion("receive_situation in", values, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationNotIn(List<String> values) {
            addCriterion("receive_situation not in", values, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationBetween(String value1, String value2) {
            addCriterion("receive_situation between", value1, value2, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andReceiveSituationNotBetween(String value1, String value2) {
            addCriterion("receive_situation not between", value1, value2, "receiveSituation");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNull() {
            addCriterion("recipient is null");
            return (Criteria) this;
        }

        public Criteria andRecipientIsNotNull() {
            addCriterion("recipient is not null");
            return (Criteria) this;
        }

        public Criteria andRecipientEqualTo(String value) {
            addCriterion("recipient =", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotEqualTo(String value) {
            addCriterion("recipient <>", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThan(String value) {
            addCriterion("recipient >", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientGreaterThanOrEqualTo(String value) {
            addCriterion("recipient >=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThan(String value) {
            addCriterion("recipient <", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLessThanOrEqualTo(String value) {
            addCriterion("recipient <=", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientLike(String value) {
            addCriterion("recipient like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotLike(String value) {
            addCriterion("recipient not like", value, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientIn(List<String> values) {
            addCriterion("recipient in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotIn(List<String> values) {
            addCriterion("recipient not in", values, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientBetween(String value1, String value2) {
            addCriterion("recipient between", value1, value2, "recipient");
            return (Criteria) this;
        }

        public Criteria andRecipientNotBetween(String value1, String value2) {
            addCriterion("recipient not between", value1, value2, "recipient");
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

        public Criteria andEquipmentSituationIsNull() {
            addCriterion("equipment_situation is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationIsNotNull() {
            addCriterion("equipment_situation is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationEqualTo(String value) {
            addCriterion("equipment_situation =", value, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationNotEqualTo(String value) {
            addCriterion("equipment_situation <>", value, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationGreaterThan(String value) {
            addCriterion("equipment_situation >", value, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationGreaterThanOrEqualTo(String value) {
            addCriterion("equipment_situation >=", value, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationLessThan(String value) {
            addCriterion("equipment_situation <", value, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationLessThanOrEqualTo(String value) {
            addCriterion("equipment_situation <=", value, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationLike(String value) {
            addCriterion("equipment_situation like", value, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationNotLike(String value) {
            addCriterion("equipment_situation not like", value, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationIn(List<String> values) {
            addCriterion("equipment_situation in", values, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationNotIn(List<String> values) {
            addCriterion("equipment_situation not in", values, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationBetween(String value1, String value2) {
            addCriterion("equipment_situation between", value1, value2, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andEquipmentSituationNotBetween(String value1, String value2) {
            addCriterion("equipment_situation not between", value1, value2, "equipmentSituation");
            return (Criteria) this;
        }

        public Criteria andAcceptanceIsNull() {
            addCriterion("acceptance is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceIsNotNull() {
            addCriterion("acceptance is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceEqualTo(String value) {
            addCriterion("acceptance =", value, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceNotEqualTo(String value) {
            addCriterion("acceptance <>", value, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceGreaterThan(String value) {
            addCriterion("acceptance >", value, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceGreaterThanOrEqualTo(String value) {
            addCriterion("acceptance >=", value, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceLessThan(String value) {
            addCriterion("acceptance <", value, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceLessThanOrEqualTo(String value) {
            addCriterion("acceptance <=", value, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceLike(String value) {
            addCriterion("acceptance like", value, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceNotLike(String value) {
            addCriterion("acceptance not like", value, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceIn(List<String> values) {
            addCriterion("acceptance in", values, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceNotIn(List<String> values) {
            addCriterion("acceptance not in", values, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceBetween(String value1, String value2) {
            addCriterion("acceptance between", value1, value2, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptanceNotBetween(String value1, String value2) {
            addCriterion("acceptance not between", value1, value2, "acceptance");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonIsNull() {
            addCriterion("acceptance_person is null");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonIsNotNull() {
            addCriterion("acceptance_person is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonEqualTo(String value) {
            addCriterion("acceptance_person =", value, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonNotEqualTo(String value) {
            addCriterion("acceptance_person <>", value, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonGreaterThan(String value) {
            addCriterion("acceptance_person >", value, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonGreaterThanOrEqualTo(String value) {
            addCriterion("acceptance_person >=", value, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonLessThan(String value) {
            addCriterion("acceptance_person <", value, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonLessThanOrEqualTo(String value) {
            addCriterion("acceptance_person <=", value, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonLike(String value) {
            addCriterion("acceptance_person like", value, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonNotLike(String value) {
            addCriterion("acceptance_person not like", value, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonIn(List<String> values) {
            addCriterion("acceptance_person in", values, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonNotIn(List<String> values) {
            addCriterion("acceptance_person not in", values, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonBetween(String value1, String value2) {
            addCriterion("acceptance_person between", value1, value2, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptancePersonNotBetween(String value1, String value2) {
            addCriterion("acceptance_person not between", value1, value2, "acceptancePerson");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIsNull() {
            addCriterion("acceptance_date is null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIsNotNull() {
            addCriterion("acceptance_date is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date =", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date <>", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("acceptance_date >", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date >=", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateLessThan(Date value) {
            addCriterionForJDBCDate("acceptance_date <", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("acceptance_date <=", value, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("acceptance_date in", values, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("acceptance_date not in", values, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("acceptance_date between", value1, value2, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAcceptanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("acceptance_date not between", value1, value2, "acceptanceDate");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNull() {
            addCriterion("attachment is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentIsNotNull() {
            addCriterion("attachment is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentEqualTo(String value) {
            addCriterion("attachment =", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotEqualTo(String value) {
            addCriterion("attachment <>", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThan(String value) {
            addCriterion("attachment >", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentGreaterThanOrEqualTo(String value) {
            addCriterion("attachment >=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThan(String value) {
            addCriterion("attachment <", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLessThanOrEqualTo(String value) {
            addCriterion("attachment <=", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentLike(String value) {
            addCriterion("attachment like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotLike(String value) {
            addCriterion("attachment not like", value, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentIn(List<String> values) {
            addCriterion("attachment in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotIn(List<String> values) {
            addCriterion("attachment not in", values, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentBetween(String value1, String value2) {
            addCriterion("attachment between", value1, value2, "attachment");
            return (Criteria) this;
        }

        public Criteria andAttachmentNotBetween(String value1, String value2) {
            addCriterion("attachment not between", value1, value2, "attachment");
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