package com.cma.dao.example;

import java.util.ArrayList;
import java.util.List;

public class TestingInstitutionInformationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestingInstitutionInformationExample() {
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

        public Criteria andTestingInstitutionNameIsNull() {
            addCriterion("testing_institution_name is null");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameIsNotNull() {
            addCriterion("testing_institution_name is not null");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameEqualTo(String value) {
            addCriterion("testing_institution_name =", value, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameNotEqualTo(String value) {
            addCriterion("testing_institution_name <>", value, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameGreaterThan(String value) {
            addCriterion("testing_institution_name >", value, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameGreaterThanOrEqualTo(String value) {
            addCriterion("testing_institution_name >=", value, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameLessThan(String value) {
            addCriterion("testing_institution_name <", value, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameLessThanOrEqualTo(String value) {
            addCriterion("testing_institution_name <=", value, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameLike(String value) {
            addCriterion("testing_institution_name like", value, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameNotLike(String value) {
            addCriterion("testing_institution_name not like", value, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameIn(List<String> values) {
            addCriterion("testing_institution_name in", values, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameNotIn(List<String> values) {
            addCriterion("testing_institution_name not in", values, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameBetween(String value1, String value2) {
            addCriterion("testing_institution_name between", value1, value2, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionNameNotBetween(String value1, String value2) {
            addCriterion("testing_institution_name not between", value1, value2, "testingInstitutionName");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressIsNull() {
            addCriterion("testing_institution_address is null");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressIsNotNull() {
            addCriterion("testing_institution_address is not null");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressEqualTo(String value) {
            addCriterion("testing_institution_address =", value, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressNotEqualTo(String value) {
            addCriterion("testing_institution_address <>", value, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressGreaterThan(String value) {
            addCriterion("testing_institution_address >", value, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressGreaterThanOrEqualTo(String value) {
            addCriterion("testing_institution_address >=", value, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressLessThan(String value) {
            addCriterion("testing_institution_address <", value, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressLessThanOrEqualTo(String value) {
            addCriterion("testing_institution_address <=", value, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressLike(String value) {
            addCriterion("testing_institution_address like", value, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressNotLike(String value) {
            addCriterion("testing_institution_address not like", value, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressIn(List<String> values) {
            addCriterion("testing_institution_address in", values, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressNotIn(List<String> values) {
            addCriterion("testing_institution_address not in", values, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressBetween(String value1, String value2) {
            addCriterion("testing_institution_address between", value1, value2, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andTestingInstitutionAddressNotBetween(String value1, String value2) {
            addCriterion("testing_institution_address not between", value1, value2, "testingInstitutionAddress");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNull() {
            addCriterion("postcode is null");
            return (Criteria) this;
        }

        public Criteria andPostcodeIsNotNull() {
            addCriterion("postcode is not null");
            return (Criteria) this;
        }

        public Criteria andPostcodeEqualTo(String value) {
            addCriterion("postcode =", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotEqualTo(String value) {
            addCriterion("postcode <>", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThan(String value) {
            addCriterion("postcode >", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("postcode >=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThan(String value) {
            addCriterion("postcode <", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLessThanOrEqualTo(String value) {
            addCriterion("postcode <=", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeLike(String value) {
            addCriterion("postcode like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotLike(String value) {
            addCriterion("postcode not like", value, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeIn(List<String> values) {
            addCriterion("postcode in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotIn(List<String> values) {
            addCriterion("postcode not in", values, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeBetween(String value1, String value2) {
            addCriterion("postcode between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andPostcodeNotBetween(String value1, String value2) {
            addCriterion("postcode not between", value1, value2, "postcode");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("fax is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("fax is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("fax =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("fax <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("fax >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("fax >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("fax <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("fax <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("fax like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("fax not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("fax in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("fax not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("fax between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("fax not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeIsNull() {
            addCriterion("ti_peopel_in_charge is null");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeIsNotNull() {
            addCriterion("ti_peopel_in_charge is not null");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeEqualTo(String value) {
            addCriterion("ti_peopel_in_charge =", value, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeNotEqualTo(String value) {
            addCriterion("ti_peopel_in_charge <>", value, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeGreaterThan(String value) {
            addCriterion("ti_peopel_in_charge >", value, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeGreaterThanOrEqualTo(String value) {
            addCriterion("ti_peopel_in_charge >=", value, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeLessThan(String value) {
            addCriterion("ti_peopel_in_charge <", value, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeLessThanOrEqualTo(String value) {
            addCriterion("ti_peopel_in_charge <=", value, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeLike(String value) {
            addCriterion("ti_peopel_in_charge like", value, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeNotLike(String value) {
            addCriterion("ti_peopel_in_charge not like", value, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeIn(List<String> values) {
            addCriterion("ti_peopel_in_charge in", values, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeNotIn(List<String> values) {
            addCriterion("ti_peopel_in_charge not in", values, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeBetween(String value1, String value2) {
            addCriterion("ti_peopel_in_charge between", value1, value2, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPeopelInChargeNotBetween(String value1, String value2) {
            addCriterion("ti_peopel_in_charge not between", value1, value2, "tiPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionIsNull() {
            addCriterion("ti_pic_position is null");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionIsNotNull() {
            addCriterion("ti_pic_position is not null");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionEqualTo(String value) {
            addCriterion("ti_pic_position =", value, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionNotEqualTo(String value) {
            addCriterion("ti_pic_position <>", value, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionGreaterThan(String value) {
            addCriterion("ti_pic_position >", value, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionGreaterThanOrEqualTo(String value) {
            addCriterion("ti_pic_position >=", value, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionLessThan(String value) {
            addCriterion("ti_pic_position <", value, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionLessThanOrEqualTo(String value) {
            addCriterion("ti_pic_position <=", value, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionLike(String value) {
            addCriterion("ti_pic_position like", value, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionNotLike(String value) {
            addCriterion("ti_pic_position not like", value, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionIn(List<String> values) {
            addCriterion("ti_pic_position in", values, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionNotIn(List<String> values) {
            addCriterion("ti_pic_position not in", values, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionBetween(String value1, String value2) {
            addCriterion("ti_pic_position between", value1, value2, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicPositionNotBetween(String value1, String value2) {
            addCriterion("ti_pic_position not between", value1, value2, "tiPicPosition");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneIsNull() {
            addCriterion("ti_pic_telephone is null");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneIsNotNull() {
            addCriterion("ti_pic_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneEqualTo(String value) {
            addCriterion("ti_pic_telephone =", value, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneNotEqualTo(String value) {
            addCriterion("ti_pic_telephone <>", value, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneGreaterThan(String value) {
            addCriterion("ti_pic_telephone >", value, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ti_pic_telephone >=", value, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneLessThan(String value) {
            addCriterion("ti_pic_telephone <", value, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneLessThanOrEqualTo(String value) {
            addCriterion("ti_pic_telephone <=", value, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneLike(String value) {
            addCriterion("ti_pic_telephone like", value, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneNotLike(String value) {
            addCriterion("ti_pic_telephone not like", value, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneIn(List<String> values) {
            addCriterion("ti_pic_telephone in", values, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneNotIn(List<String> values) {
            addCriterion("ti_pic_telephone not in", values, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneBetween(String value1, String value2) {
            addCriterion("ti_pic_telephone between", value1, value2, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicTelephoneNotBetween(String value1, String value2) {
            addCriterion("ti_pic_telephone not between", value1, value2, "tiPicTelephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneIsNull() {
            addCriterion("ti_pic_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneIsNotNull() {
            addCriterion("ti_pic_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneEqualTo(String value) {
            addCriterion("ti_pic_mobilephone =", value, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneNotEqualTo(String value) {
            addCriterion("ti_pic_mobilephone <>", value, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneGreaterThan(String value) {
            addCriterion("ti_pic_mobilephone >", value, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("ti_pic_mobilephone >=", value, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneLessThan(String value) {
            addCriterion("ti_pic_mobilephone <", value, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("ti_pic_mobilephone <=", value, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneLike(String value) {
            addCriterion("ti_pic_mobilephone like", value, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneNotLike(String value) {
            addCriterion("ti_pic_mobilephone not like", value, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneIn(List<String> values) {
            addCriterion("ti_pic_mobilephone in", values, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneNotIn(List<String> values) {
            addCriterion("ti_pic_mobilephone not in", values, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneBetween(String value1, String value2) {
            addCriterion("ti_pic_mobilephone between", value1, value2, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andTiPicMobilephoneNotBetween(String value1, String value2) {
            addCriterion("ti_pic_mobilephone not between", value1, value2, "tiPicMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonIsNull() {
            addCriterion("liaison is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonIsNotNull() {
            addCriterion("liaison is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonEqualTo(String value) {
            addCriterion("liaison =", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonNotEqualTo(String value) {
            addCriterion("liaison <>", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonGreaterThan(String value) {
            addCriterion("liaison >", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonGreaterThanOrEqualTo(String value) {
            addCriterion("liaison >=", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonLessThan(String value) {
            addCriterion("liaison <", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonLessThanOrEqualTo(String value) {
            addCriterion("liaison <=", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonLike(String value) {
            addCriterion("liaison like", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonNotLike(String value) {
            addCriterion("liaison not like", value, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonIn(List<String> values) {
            addCriterion("liaison in", values, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonNotIn(List<String> values) {
            addCriterion("liaison not in", values, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonBetween(String value1, String value2) {
            addCriterion("liaison between", value1, value2, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonNotBetween(String value1, String value2) {
            addCriterion("liaison not between", value1, value2, "liaison");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionIsNull() {
            addCriterion("liaison_position is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionIsNotNull() {
            addCriterion("liaison_position is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionEqualTo(String value) {
            addCriterion("liaison_position =", value, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionNotEqualTo(String value) {
            addCriterion("liaison_position <>", value, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionGreaterThan(String value) {
            addCriterion("liaison_position >", value, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionGreaterThanOrEqualTo(String value) {
            addCriterion("liaison_position >=", value, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionLessThan(String value) {
            addCriterion("liaison_position <", value, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionLessThanOrEqualTo(String value) {
            addCriterion("liaison_position <=", value, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionLike(String value) {
            addCriterion("liaison_position like", value, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionNotLike(String value) {
            addCriterion("liaison_position not like", value, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionIn(List<String> values) {
            addCriterion("liaison_position in", values, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionNotIn(List<String> values) {
            addCriterion("liaison_position not in", values, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionBetween(String value1, String value2) {
            addCriterion("liaison_position between", value1, value2, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonPositionNotBetween(String value1, String value2) {
            addCriterion("liaison_position not between", value1, value2, "liaisonPosition");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneIsNull() {
            addCriterion("liaison_telephone is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneIsNotNull() {
            addCriterion("liaison_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneEqualTo(String value) {
            addCriterion("liaison_telephone =", value, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneNotEqualTo(String value) {
            addCriterion("liaison_telephone <>", value, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneGreaterThan(String value) {
            addCriterion("liaison_telephone >", value, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("liaison_telephone >=", value, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneLessThan(String value) {
            addCriterion("liaison_telephone <", value, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneLessThanOrEqualTo(String value) {
            addCriterion("liaison_telephone <=", value, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneLike(String value) {
            addCriterion("liaison_telephone like", value, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneNotLike(String value) {
            addCriterion("liaison_telephone not like", value, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneIn(List<String> values) {
            addCriterion("liaison_telephone in", values, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneNotIn(List<String> values) {
            addCriterion("liaison_telephone not in", values, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneBetween(String value1, String value2) {
            addCriterion("liaison_telephone between", value1, value2, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonTelephoneNotBetween(String value1, String value2) {
            addCriterion("liaison_telephone not between", value1, value2, "liaisonTelephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneIsNull() {
            addCriterion("liaison_mobilephone is null");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneIsNotNull() {
            addCriterion("liaison_mobilephone is not null");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneEqualTo(String value) {
            addCriterion("liaison_mobilephone =", value, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneNotEqualTo(String value) {
            addCriterion("liaison_mobilephone <>", value, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneGreaterThan(String value) {
            addCriterion("liaison_mobilephone >", value, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("liaison_mobilephone >=", value, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneLessThan(String value) {
            addCriterion("liaison_mobilephone <", value, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("liaison_mobilephone <=", value, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneLike(String value) {
            addCriterion("liaison_mobilephone like", value, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneNotLike(String value) {
            addCriterion("liaison_mobilephone not like", value, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneIn(List<String> values) {
            addCriterion("liaison_mobilephone in", values, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneNotIn(List<String> values) {
            addCriterion("liaison_mobilephone not in", values, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneBetween(String value1, String value2) {
            addCriterion("liaison_mobilephone between", value1, value2, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andLiaisonMobilephoneNotBetween(String value1, String value2) {
            addCriterion("liaison_mobilephone not between", value1, value2, "liaisonMobilephone");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIsNull() {
            addCriterion("social_credit_code is null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIsNotNull() {
            addCriterion("social_credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeEqualTo(String value) {
            addCriterion("social_credit_code =", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotEqualTo(String value) {
            addCriterion("social_credit_code <>", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeGreaterThan(String value) {
            addCriterion("social_credit_code >", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("social_credit_code >=", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLessThan(String value) {
            addCriterion("social_credit_code <", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("social_credit_code <=", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeLike(String value) {
            addCriterion("social_credit_code like", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotLike(String value) {
            addCriterion("social_credit_code not like", value, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeIn(List<String> values) {
            addCriterion("social_credit_code in", values, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotIn(List<String> values) {
            addCriterion("social_credit_code not in", values, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeBetween(String value1, String value2) {
            addCriterion("social_credit_code between", value1, value2, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andSocialCreditCodeNotBetween(String value1, String value2) {
            addCriterion("social_credit_code not between", value1, value2, "socialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameIsNull() {
            addCriterion("legal_entity_belonged_name is null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameIsNotNull() {
            addCriterion("legal_entity_belonged_name is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameEqualTo(String value) {
            addCriterion("legal_entity_belonged_name =", value, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameNotEqualTo(String value) {
            addCriterion("legal_entity_belonged_name <>", value, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameGreaterThan(String value) {
            addCriterion("legal_entity_belonged_name >", value, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameGreaterThanOrEqualTo(String value) {
            addCriterion("legal_entity_belonged_name >=", value, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameLessThan(String value) {
            addCriterion("legal_entity_belonged_name <", value, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameLessThanOrEqualTo(String value) {
            addCriterion("legal_entity_belonged_name <=", value, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameLike(String value) {
            addCriterion("legal_entity_belonged_name like", value, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameNotLike(String value) {
            addCriterion("legal_entity_belonged_name not like", value, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameIn(List<String> values) {
            addCriterion("legal_entity_belonged_name in", values, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameNotIn(List<String> values) {
            addCriterion("legal_entity_belonged_name not in", values, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameBetween(String value1, String value2) {
            addCriterion("legal_entity_belonged_name between", value1, value2, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedNameNotBetween(String value1, String value2) {
            addCriterion("legal_entity_belonged_name not between", value1, value2, "legalEntityBelongedName");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressIsNull() {
            addCriterion("legal_entity_belonged_address is null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressIsNotNull() {
            addCriterion("legal_entity_belonged_address is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressEqualTo(String value) {
            addCriterion("legal_entity_belonged_address =", value, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressNotEqualTo(String value) {
            addCriterion("legal_entity_belonged_address <>", value, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressGreaterThan(String value) {
            addCriterion("legal_entity_belonged_address >", value, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressGreaterThanOrEqualTo(String value) {
            addCriterion("legal_entity_belonged_address >=", value, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressLessThan(String value) {
            addCriterion("legal_entity_belonged_address <", value, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressLessThanOrEqualTo(String value) {
            addCriterion("legal_entity_belonged_address <=", value, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressLike(String value) {
            addCriterion("legal_entity_belonged_address like", value, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressNotLike(String value) {
            addCriterion("legal_entity_belonged_address not like", value, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressIn(List<String> values) {
            addCriterion("legal_entity_belonged_address in", values, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressNotIn(List<String> values) {
            addCriterion("legal_entity_belonged_address not in", values, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressBetween(String value1, String value2) {
            addCriterion("legal_entity_belonged_address between", value1, value2, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBelongedAddressNotBetween(String value1, String value2) {
            addCriterion("legal_entity_belonged_address not between", value1, value2, "legalEntityBelongedAddress");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeIsNull() {
            addCriterion("leb_peopel_in_charge is null");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeIsNotNull() {
            addCriterion("leb_peopel_in_charge is not null");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeEqualTo(String value) {
            addCriterion("leb_peopel_in_charge =", value, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeNotEqualTo(String value) {
            addCriterion("leb_peopel_in_charge <>", value, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeGreaterThan(String value) {
            addCriterion("leb_peopel_in_charge >", value, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeGreaterThanOrEqualTo(String value) {
            addCriterion("leb_peopel_in_charge >=", value, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeLessThan(String value) {
            addCriterion("leb_peopel_in_charge <", value, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeLessThanOrEqualTo(String value) {
            addCriterion("leb_peopel_in_charge <=", value, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeLike(String value) {
            addCriterion("leb_peopel_in_charge like", value, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeNotLike(String value) {
            addCriterion("leb_peopel_in_charge not like", value, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeIn(List<String> values) {
            addCriterion("leb_peopel_in_charge in", values, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeNotIn(List<String> values) {
            addCriterion("leb_peopel_in_charge not in", values, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeBetween(String value1, String value2) {
            addCriterion("leb_peopel_in_charge between", value1, value2, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPeopelInChargeNotBetween(String value1, String value2) {
            addCriterion("leb_peopel_in_charge not between", value1, value2, "lebPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionIsNull() {
            addCriterion("leb_pic_position is null");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionIsNotNull() {
            addCriterion("leb_pic_position is not null");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionEqualTo(String value) {
            addCriterion("leb_pic_position =", value, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionNotEqualTo(String value) {
            addCriterion("leb_pic_position <>", value, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionGreaterThan(String value) {
            addCriterion("leb_pic_position >", value, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionGreaterThanOrEqualTo(String value) {
            addCriterion("leb_pic_position >=", value, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionLessThan(String value) {
            addCriterion("leb_pic_position <", value, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionLessThanOrEqualTo(String value) {
            addCriterion("leb_pic_position <=", value, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionLike(String value) {
            addCriterion("leb_pic_position like", value, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionNotLike(String value) {
            addCriterion("leb_pic_position not like", value, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionIn(List<String> values) {
            addCriterion("leb_pic_position in", values, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionNotIn(List<String> values) {
            addCriterion("leb_pic_position not in", values, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionBetween(String value1, String value2) {
            addCriterion("leb_pic_position between", value1, value2, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicPositionNotBetween(String value1, String value2) {
            addCriterion("leb_pic_position not between", value1, value2, "lebPicPosition");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneIsNull() {
            addCriterion("leb_pic_telephone is null");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneIsNotNull() {
            addCriterion("leb_pic_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneEqualTo(String value) {
            addCriterion("leb_pic_telephone =", value, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneNotEqualTo(String value) {
            addCriterion("leb_pic_telephone <>", value, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneGreaterThan(String value) {
            addCriterion("leb_pic_telephone >", value, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("leb_pic_telephone >=", value, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneLessThan(String value) {
            addCriterion("leb_pic_telephone <", value, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneLessThanOrEqualTo(String value) {
            addCriterion("leb_pic_telephone <=", value, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneLike(String value) {
            addCriterion("leb_pic_telephone like", value, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneNotLike(String value) {
            addCriterion("leb_pic_telephone not like", value, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneIn(List<String> values) {
            addCriterion("leb_pic_telephone in", values, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneNotIn(List<String> values) {
            addCriterion("leb_pic_telephone not in", values, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneBetween(String value1, String value2) {
            addCriterion("leb_pic_telephone between", value1, value2, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebPicTelephoneNotBetween(String value1, String value2) {
            addCriterion("leb_pic_telephone not between", value1, value2, "lebPicTelephone");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeIsNull() {
            addCriterion("leb_social_credit_code is null");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeIsNotNull() {
            addCriterion("leb_social_credit_code is not null");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeEqualTo(String value) {
            addCriterion("leb_social_credit_code =", value, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeNotEqualTo(String value) {
            addCriterion("leb_social_credit_code <>", value, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeGreaterThan(String value) {
            addCriterion("leb_social_credit_code >", value, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("leb_social_credit_code >=", value, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeLessThan(String value) {
            addCriterion("leb_social_credit_code <", value, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("leb_social_credit_code <=", value, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeLike(String value) {
            addCriterion("leb_social_credit_code like", value, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeNotLike(String value) {
            addCriterion("leb_social_credit_code not like", value, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeIn(List<String> values) {
            addCriterion("leb_social_credit_code in", values, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeNotIn(List<String> values) {
            addCriterion("leb_social_credit_code not in", values, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeBetween(String value1, String value2) {
            addCriterion("leb_social_credit_code between", value1, value2, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andLebSocialCreditCodeNotBetween(String value1, String value2) {
            addCriterion("leb_social_credit_code not between", value1, value2, "lebSocialCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameIsNull() {
            addCriterion("competent_department_name is null");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameIsNotNull() {
            addCriterion("competent_department_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameEqualTo(String value) {
            addCriterion("competent_department_name =", value, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameNotEqualTo(String value) {
            addCriterion("competent_department_name <>", value, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameGreaterThan(String value) {
            addCriterion("competent_department_name >", value, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameGreaterThanOrEqualTo(String value) {
            addCriterion("competent_department_name >=", value, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameLessThan(String value) {
            addCriterion("competent_department_name <", value, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameLessThanOrEqualTo(String value) {
            addCriterion("competent_department_name <=", value, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameLike(String value) {
            addCriterion("competent_department_name like", value, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameNotLike(String value) {
            addCriterion("competent_department_name not like", value, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameIn(List<String> values) {
            addCriterion("competent_department_name in", values, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameNotIn(List<String> values) {
            addCriterion("competent_department_name not in", values, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameBetween(String value1, String value2) {
            addCriterion("competent_department_name between", value1, value2, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentNameNotBetween(String value1, String value2) {
            addCriterion("competent_department_name not between", value1, value2, "competentDepartmentName");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressIsNull() {
            addCriterion("competent_department_address is null");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressIsNotNull() {
            addCriterion("competent_department_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressEqualTo(String value) {
            addCriterion("competent_department_address =", value, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressNotEqualTo(String value) {
            addCriterion("competent_department_address <>", value, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressGreaterThan(String value) {
            addCriterion("competent_department_address >", value, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressGreaterThanOrEqualTo(String value) {
            addCriterion("competent_department_address >=", value, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressLessThan(String value) {
            addCriterion("competent_department_address <", value, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressLessThanOrEqualTo(String value) {
            addCriterion("competent_department_address <=", value, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressLike(String value) {
            addCriterion("competent_department_address like", value, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressNotLike(String value) {
            addCriterion("competent_department_address not like", value, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressIn(List<String> values) {
            addCriterion("competent_department_address in", values, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressNotIn(List<String> values) {
            addCriterion("competent_department_address not in", values, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressBetween(String value1, String value2) {
            addCriterion("competent_department_address between", value1, value2, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCompetentDepartmentAddressNotBetween(String value1, String value2) {
            addCriterion("competent_department_address not between", value1, value2, "competentDepartmentAddress");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeIsNull() {
            addCriterion("cd_peopel_in_charge is null");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeIsNotNull() {
            addCriterion("cd_peopel_in_charge is not null");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeEqualTo(String value) {
            addCriterion("cd_peopel_in_charge =", value, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeNotEqualTo(String value) {
            addCriterion("cd_peopel_in_charge <>", value, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeGreaterThan(String value) {
            addCriterion("cd_peopel_in_charge >", value, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeGreaterThanOrEqualTo(String value) {
            addCriterion("cd_peopel_in_charge >=", value, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeLessThan(String value) {
            addCriterion("cd_peopel_in_charge <", value, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeLessThanOrEqualTo(String value) {
            addCriterion("cd_peopel_in_charge <=", value, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeLike(String value) {
            addCriterion("cd_peopel_in_charge like", value, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeNotLike(String value) {
            addCriterion("cd_peopel_in_charge not like", value, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeIn(List<String> values) {
            addCriterion("cd_peopel_in_charge in", values, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeNotIn(List<String> values) {
            addCriterion("cd_peopel_in_charge not in", values, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeBetween(String value1, String value2) {
            addCriterion("cd_peopel_in_charge between", value1, value2, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPeopelInChargeNotBetween(String value1, String value2) {
            addCriterion("cd_peopel_in_charge not between", value1, value2, "cdPeopelInCharge");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionIsNull() {
            addCriterion("cd_pic_position is null");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionIsNotNull() {
            addCriterion("cd_pic_position is not null");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionEqualTo(String value) {
            addCriterion("cd_pic_position =", value, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionNotEqualTo(String value) {
            addCriterion("cd_pic_position <>", value, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionGreaterThan(String value) {
            addCriterion("cd_pic_position >", value, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionGreaterThanOrEqualTo(String value) {
            addCriterion("cd_pic_position >=", value, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionLessThan(String value) {
            addCriterion("cd_pic_position <", value, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionLessThanOrEqualTo(String value) {
            addCriterion("cd_pic_position <=", value, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionLike(String value) {
            addCriterion("cd_pic_position like", value, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionNotLike(String value) {
            addCriterion("cd_pic_position not like", value, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionIn(List<String> values) {
            addCriterion("cd_pic_position in", values, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionNotIn(List<String> values) {
            addCriterion("cd_pic_position not in", values, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionBetween(String value1, String value2) {
            addCriterion("cd_pic_position between", value1, value2, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicPositionNotBetween(String value1, String value2) {
            addCriterion("cd_pic_position not between", value1, value2, "cdPicPosition");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneIsNull() {
            addCriterion("cd_pic_telephone is null");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneIsNotNull() {
            addCriterion("cd_pic_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneEqualTo(String value) {
            addCriterion("cd_pic_telephone =", value, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneNotEqualTo(String value) {
            addCriterion("cd_pic_telephone <>", value, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneGreaterThan(String value) {
            addCriterion("cd_pic_telephone >", value, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("cd_pic_telephone >=", value, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneLessThan(String value) {
            addCriterion("cd_pic_telephone <", value, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneLessThanOrEqualTo(String value) {
            addCriterion("cd_pic_telephone <=", value, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneLike(String value) {
            addCriterion("cd_pic_telephone like", value, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneNotLike(String value) {
            addCriterion("cd_pic_telephone not like", value, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneIn(List<String> values) {
            addCriterion("cd_pic_telephone in", values, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneNotIn(List<String> values) {
            addCriterion("cd_pic_telephone not in", values, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneBetween(String value1, String value2) {
            addCriterion("cd_pic_telephone between", value1, value2, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCdPicTelephoneNotBetween(String value1, String value2) {
            addCriterion("cd_pic_telephone not between", value1, value2, "cdPicTelephone");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIsNull() {
            addCriterion("characteristic is null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIsNotNull() {
            addCriterion("characteristic is not null");
            return (Criteria) this;
        }

        public Criteria andCharacteristicEqualTo(Byte value) {
            addCriterion("characteristic =", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotEqualTo(Byte value) {
            addCriterion("characteristic <>", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicGreaterThan(Byte value) {
            addCriterion("characteristic >", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicGreaterThanOrEqualTo(Byte value) {
            addCriterion("characteristic >=", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLessThan(Byte value) {
            addCriterion("characteristic <", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicLessThanOrEqualTo(Byte value) {
            addCriterion("characteristic <=", value, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicIn(List<Byte> values) {
            addCriterion("characteristic in", values, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotIn(List<Byte> values) {
            addCriterion("characteristic not in", values, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicBetween(Byte value1, Byte value2) {
            addCriterion("characteristic between", value1, value2, "characteristic");
            return (Criteria) this;
        }

        public Criteria andCharacteristicNotBetween(Byte value1, Byte value2) {
            addCriterion("characteristic not between", value1, value2, "characteristic");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIsNull() {
            addCriterion("legal_entity is null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIsNotNull() {
            addCriterion("legal_entity is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEntityEqualTo(Byte value) {
            addCriterion("legal_entity =", value, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityNotEqualTo(Byte value) {
            addCriterion("legal_entity <>", value, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityGreaterThan(Byte value) {
            addCriterion("legal_entity >", value, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityGreaterThanOrEqualTo(Byte value) {
            addCriterion("legal_entity >=", value, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityLessThan(Byte value) {
            addCriterion("legal_entity <", value, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityLessThanOrEqualTo(Byte value) {
            addCriterion("legal_entity <=", value, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityIn(List<Byte> values) {
            addCriterion("legal_entity in", values, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityNotIn(List<Byte> values) {
            addCriterion("legal_entity not in", values, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityBetween(Byte value1, Byte value2) {
            addCriterion("legal_entity between", value1, value2, "legalEntity");
            return (Criteria) this;
        }

        public Criteria andLegalEntityNotBetween(Byte value1, Byte value2) {
            addCriterion("legal_entity not between", value1, value2, "legalEntity");
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