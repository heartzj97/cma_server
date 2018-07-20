package com.cma.dao.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class SampleReceiptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SampleReceiptExample() {
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

        public Criteria andApplicationUnitIsNull() {
            addCriterion("application_unit is null");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitIsNotNull() {
            addCriterion("application_unit is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitEqualTo(String value) {
            addCriterion("application_unit =", value, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitNotEqualTo(String value) {
            addCriterion("application_unit <>", value, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitGreaterThan(String value) {
            addCriterion("application_unit >", value, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitGreaterThanOrEqualTo(String value) {
            addCriterion("application_unit >=", value, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitLessThan(String value) {
            addCriterion("application_unit <", value, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitLessThanOrEqualTo(String value) {
            addCriterion("application_unit <=", value, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitLike(String value) {
            addCriterion("application_unit like", value, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitNotLike(String value) {
            addCriterion("application_unit not like", value, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitIn(List<String> values) {
            addCriterion("application_unit in", values, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitNotIn(List<String> values) {
            addCriterion("application_unit not in", values, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitBetween(String value1, String value2) {
            addCriterion("application_unit between", value1, value2, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andApplicationUnitNotBetween(String value1, String value2) {
            addCriterion("application_unit not between", value1, value2, "applicationUnit");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNull() {
            addCriterion("contract_id is null");
            return (Criteria) this;
        }

        public Criteria andContractIdIsNotNull() {
            addCriterion("contract_id is not null");
            return (Criteria) this;
        }

        public Criteria andContractIdEqualTo(String value) {
            addCriterion("contract_id =", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotEqualTo(String value) {
            addCriterion("contract_id <>", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThan(String value) {
            addCriterion("contract_id >", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdGreaterThanOrEqualTo(String value) {
            addCriterion("contract_id >=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThan(String value) {
            addCriterion("contract_id <", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLessThanOrEqualTo(String value) {
            addCriterion("contract_id <=", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdLike(String value) {
            addCriterion("contract_id like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotLike(String value) {
            addCriterion("contract_id not like", value, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdIn(List<String> values) {
            addCriterion("contract_id in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotIn(List<String> values) {
            addCriterion("contract_id not in", values, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdBetween(String value1, String value2) {
            addCriterion("contract_id between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andContractIdNotBetween(String value1, String value2) {
            addCriterion("contract_id not between", value1, value2, "contractId");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNull() {
            addCriterion("test_type is null");
            return (Criteria) this;
        }

        public Criteria andTestTypeIsNotNull() {
            addCriterion("test_type is not null");
            return (Criteria) this;
        }

        public Criteria andTestTypeEqualTo(Byte value) {
            addCriterion("test_type =", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotEqualTo(Byte value) {
            addCriterion("test_type <>", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThan(Byte value) {
            addCriterion("test_type >", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("test_type >=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThan(Byte value) {
            addCriterion("test_type <", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeLessThanOrEqualTo(Byte value) {
            addCriterion("test_type <=", value, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeIn(List<Byte> values) {
            addCriterion("test_type in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotIn(List<Byte> values) {
            addCriterion("test_type not in", values, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeBetween(Byte value1, Byte value2) {
            addCriterion("test_type between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andTestTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("test_type not between", value1, value2, "testType");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaIsNull() {
            addCriterion("electronic_media is null");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaIsNotNull() {
            addCriterion("electronic_media is not null");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaEqualTo(String value) {
            addCriterion("electronic_media =", value, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaNotEqualTo(String value) {
            addCriterion("electronic_media <>", value, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaGreaterThan(String value) {
            addCriterion("electronic_media >", value, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaGreaterThanOrEqualTo(String value) {
            addCriterion("electronic_media >=", value, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaLessThan(String value) {
            addCriterion("electronic_media <", value, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaLessThanOrEqualTo(String value) {
            addCriterion("electronic_media <=", value, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaLike(String value) {
            addCriterion("electronic_media like", value, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaNotLike(String value) {
            addCriterion("electronic_media not like", value, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaIn(List<String> values) {
            addCriterion("electronic_media in", values, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaNotIn(List<String> values) {
            addCriterion("electronic_media not in", values, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaBetween(String value1, String value2) {
            addCriterion("electronic_media between", value1, value2, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andElectronicMediaNotBetween(String value1, String value2) {
            addCriterion("electronic_media not between", value1, value2, "electronicMedia");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeIsNull() {
            addCriterion("software_type is null");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeIsNotNull() {
            addCriterion("software_type is not null");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeEqualTo(Byte value) {
            addCriterion("software_type =", value, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeNotEqualTo(Byte value) {
            addCriterion("software_type <>", value, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeGreaterThan(Byte value) {
            addCriterion("software_type >", value, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("software_type >=", value, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeLessThan(Byte value) {
            addCriterion("software_type <", value, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeLessThanOrEqualTo(Byte value) {
            addCriterion("software_type <=", value, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeIn(List<Byte> values) {
            addCriterion("software_type in", values, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeNotIn(List<Byte> values) {
            addCriterion("software_type not in", values, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeBetween(Byte value1, Byte value2) {
            addCriterion("software_type between", value1, value2, "softwareType");
            return (Criteria) this;
        }

        public Criteria andSoftwareTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("software_type not between", value1, value2, "softwareType");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitIsNull() {
            addCriterion("receive_unit is null");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitIsNotNull() {
            addCriterion("receive_unit is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitEqualTo(String value) {
            addCriterion("receive_unit =", value, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitNotEqualTo(String value) {
            addCriterion("receive_unit <>", value, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitGreaterThan(String value) {
            addCriterion("receive_unit >", value, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitGreaterThanOrEqualTo(String value) {
            addCriterion("receive_unit >=", value, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitLessThan(String value) {
            addCriterion("receive_unit <", value, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitLessThanOrEqualTo(String value) {
            addCriterion("receive_unit <=", value, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitLike(String value) {
            addCriterion("receive_unit like", value, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitNotLike(String value) {
            addCriterion("receive_unit not like", value, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitIn(List<String> values) {
            addCriterion("receive_unit in", values, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitNotIn(List<String> values) {
            addCriterion("receive_unit not in", values, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitBetween(String value1, String value2) {
            addCriterion("receive_unit between", value1, value2, "receiveUnit");
            return (Criteria) this;
        }

        public Criteria andReceiveUnitNotBetween(String value1, String value2) {
            addCriterion("receive_unit not between", value1, value2, "receiveUnit");
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

        public Criteria andSenderIsNull() {
            addCriterion("sender is null");
            return (Criteria) this;
        }

        public Criteria andSenderIsNotNull() {
            addCriterion("sender is not null");
            return (Criteria) this;
        }

        public Criteria andSenderEqualTo(String value) {
            addCriterion("sender =", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotEqualTo(String value) {
            addCriterion("sender <>", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThan(String value) {
            addCriterion("sender >", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderGreaterThanOrEqualTo(String value) {
            addCriterion("sender >=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThan(String value) {
            addCriterion("sender <", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLessThanOrEqualTo(String value) {
            addCriterion("sender <=", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderLike(String value) {
            addCriterion("sender like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotLike(String value) {
            addCriterion("sender not like", value, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderIn(List<String> values) {
            addCriterion("sender in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotIn(List<String> values) {
            addCriterion("sender not in", values, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderBetween(String value1, String value2) {
            addCriterion("sender between", value1, value2, "sender");
            return (Criteria) this;
        }

        public Criteria andSenderNotBetween(String value1, String value2) {
            addCriterion("sender not between", value1, value2, "sender");
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