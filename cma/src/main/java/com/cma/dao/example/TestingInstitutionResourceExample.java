package com.cma.dao.example;

import java.util.ArrayList;
import java.util.List;

public class TestingInstitutionResourceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestingInstitutionResourceExample() {
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

        public Criteria andTotalNumberIsNull() {
            addCriterion("total_number is null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIsNotNull() {
            addCriterion("total_number is not null");
            return (Criteria) this;
        }

        public Criteria andTotalNumberEqualTo(Byte value) {
            addCriterion("total_number =", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotEqualTo(Byte value) {
            addCriterion("total_number <>", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberGreaterThan(Byte value) {
            addCriterion("total_number >", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("total_number >=", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberLessThan(Byte value) {
            addCriterion("total_number <", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberLessThanOrEqualTo(Byte value) {
            addCriterion("total_number <=", value, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberIn(List<Byte> values) {
            addCriterion("total_number in", values, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotIn(List<Byte> values) {
            addCriterion("total_number not in", values, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberBetween(Byte value1, Byte value2) {
            addCriterion("total_number between", value1, value2, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andTotalNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("total_number not between", value1, value2, "totalNumber");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleIsNull() {
            addCriterion("senior_professional_title is null");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleIsNotNull() {
            addCriterion("senior_professional_title is not null");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleEqualTo(Byte value) {
            addCriterion("senior_professional_title =", value, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleNotEqualTo(Byte value) {
            addCriterion("senior_professional_title <>", value, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleGreaterThan(Byte value) {
            addCriterion("senior_professional_title >", value, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleGreaterThanOrEqualTo(Byte value) {
            addCriterion("senior_professional_title >=", value, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleLessThan(Byte value) {
            addCriterion("senior_professional_title <", value, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleLessThanOrEqualTo(Byte value) {
            addCriterion("senior_professional_title <=", value, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleIn(List<Byte> values) {
            addCriterion("senior_professional_title in", values, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleNotIn(List<Byte> values) {
            addCriterion("senior_professional_title not in", values, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleBetween(Byte value1, Byte value2) {
            addCriterion("senior_professional_title between", value1, value2, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andSeniorProfessionalTitleNotBetween(Byte value1, Byte value2) {
            addCriterion("senior_professional_title not between", value1, value2, "seniorProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleIsNull() {
            addCriterion("intermediate_professional_title is null");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleIsNotNull() {
            addCriterion("intermediate_professional_title is not null");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleEqualTo(Byte value) {
            addCriterion("intermediate_professional_title =", value, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleNotEqualTo(Byte value) {
            addCriterion("intermediate_professional_title <>", value, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleGreaterThan(Byte value) {
            addCriterion("intermediate_professional_title >", value, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleGreaterThanOrEqualTo(Byte value) {
            addCriterion("intermediate_professional_title >=", value, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleLessThan(Byte value) {
            addCriterion("intermediate_professional_title <", value, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleLessThanOrEqualTo(Byte value) {
            addCriterion("intermediate_professional_title <=", value, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleIn(List<Byte> values) {
            addCriterion("intermediate_professional_title in", values, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleNotIn(List<Byte> values) {
            addCriterion("intermediate_professional_title not in", values, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleBetween(Byte value1, Byte value2) {
            addCriterion("intermediate_professional_title between", value1, value2, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andIntermediateProfessionalTitleNotBetween(Byte value1, Byte value2) {
            addCriterion("intermediate_professional_title not between", value1, value2, "intermediateProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleIsNull() {
            addCriterion("primary_professional_title is null");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleIsNotNull() {
            addCriterion("primary_professional_title is not null");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleEqualTo(Byte value) {
            addCriterion("primary_professional_title =", value, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleNotEqualTo(Byte value) {
            addCriterion("primary_professional_title <>", value, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleGreaterThan(Byte value) {
            addCriterion("primary_professional_title >", value, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleGreaterThanOrEqualTo(Byte value) {
            addCriterion("primary_professional_title >=", value, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleLessThan(Byte value) {
            addCriterion("primary_professional_title <", value, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleLessThanOrEqualTo(Byte value) {
            addCriterion("primary_professional_title <=", value, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleIn(List<Byte> values) {
            addCriterion("primary_professional_title in", values, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleNotIn(List<Byte> values) {
            addCriterion("primary_professional_title not in", values, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleBetween(Byte value1, Byte value2) {
            addCriterion("primary_professional_title between", value1, value2, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andPrimaryProfessionalTitleNotBetween(Byte value1, Byte value2) {
            addCriterion("primary_professional_title not between", value1, value2, "primaryProfessionalTitle");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIsNull() {
            addCriterion("fixed_assets is null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIsNotNull() {
            addCriterion("fixed_assets is not null");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsEqualTo(Double value) {
            addCriterion("fixed_assets =", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotEqualTo(Double value) {
            addCriterion("fixed_assets <>", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsGreaterThan(Double value) {
            addCriterion("fixed_assets >", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsGreaterThanOrEqualTo(Double value) {
            addCriterion("fixed_assets >=", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsLessThan(Double value) {
            addCriterion("fixed_assets <", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsLessThanOrEqualTo(Double value) {
            addCriterion("fixed_assets <=", value, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsIn(List<Double> values) {
            addCriterion("fixed_assets in", values, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotIn(List<Double> values) {
            addCriterion("fixed_assets not in", values, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsBetween(Double value1, Double value2) {
            addCriterion("fixed_assets between", value1, value2, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andFixedAssetsNotBetween(Double value1, Double value2) {
            addCriterion("fixed_assets not between", value1, value2, "fixedAssets");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIsNull() {
            addCriterion("equipment_number is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIsNotNull() {
            addCriterion("equipment_number is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberEqualTo(Byte value) {
            addCriterion("equipment_number =", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotEqualTo(Byte value) {
            addCriterion("equipment_number <>", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberGreaterThan(Byte value) {
            addCriterion("equipment_number >", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberGreaterThanOrEqualTo(Byte value) {
            addCriterion("equipment_number >=", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLessThan(Byte value) {
            addCriterion("equipment_number <", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberLessThanOrEqualTo(Byte value) {
            addCriterion("equipment_number <=", value, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberIn(List<Byte> values) {
            addCriterion("equipment_number in", values, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotIn(List<Byte> values) {
            addCriterion("equipment_number not in", values, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberBetween(Byte value1, Byte value2) {
            addCriterion("equipment_number between", value1, value2, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andEquipmentNumberNotBetween(Byte value1, Byte value2) {
            addCriterion("equipment_number not between", value1, value2, "equipmentNumber");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIsNull() {
            addCriterion("floor_space is null");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIsNotNull() {
            addCriterion("floor_space is not null");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceEqualTo(Double value) {
            addCriterion("floor_space =", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotEqualTo(Double value) {
            addCriterion("floor_space <>", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceGreaterThan(Double value) {
            addCriterion("floor_space >", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceGreaterThanOrEqualTo(Double value) {
            addCriterion("floor_space >=", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLessThan(Double value) {
            addCriterion("floor_space <", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceLessThanOrEqualTo(Double value) {
            addCriterion("floor_space <=", value, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceIn(List<Double> values) {
            addCriterion("floor_space in", values, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotIn(List<Double> values) {
            addCriterion("floor_space not in", values, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceBetween(Double value1, Double value2) {
            addCriterion("floor_space between", value1, value2, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andFloorSpaceNotBetween(Double value1, Double value2) {
            addCriterion("floor_space not between", value1, value2, "floorSpace");
            return (Criteria) this;
        }

        public Criteria andStableAreaIsNull() {
            addCriterion("stable_area is null");
            return (Criteria) this;
        }

        public Criteria andStableAreaIsNotNull() {
            addCriterion("stable_area is not null");
            return (Criteria) this;
        }

        public Criteria andStableAreaEqualTo(Double value) {
            addCriterion("stable_area =", value, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaNotEqualTo(Double value) {
            addCriterion("stable_area <>", value, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaGreaterThan(Double value) {
            addCriterion("stable_area >", value, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("stable_area >=", value, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaLessThan(Double value) {
            addCriterion("stable_area <", value, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaLessThanOrEqualTo(Double value) {
            addCriterion("stable_area <=", value, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaIn(List<Double> values) {
            addCriterion("stable_area in", values, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaNotIn(List<Double> values) {
            addCriterion("stable_area not in", values, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaBetween(Double value1, Double value2) {
            addCriterion("stable_area between", value1, value2, "stableArea");
            return (Criteria) this;
        }

        public Criteria andStableAreaNotBetween(Double value1, Double value2) {
            addCriterion("stable_area not between", value1, value2, "stableArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaIsNull() {
            addCriterion("outdoors_area is null");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaIsNotNull() {
            addCriterion("outdoors_area is not null");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaEqualTo(Double value) {
            addCriterion("outdoors_area =", value, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaNotEqualTo(Double value) {
            addCriterion("outdoors_area <>", value, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaGreaterThan(Double value) {
            addCriterion("outdoors_area >", value, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaGreaterThanOrEqualTo(Double value) {
            addCriterion("outdoors_area >=", value, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaLessThan(Double value) {
            addCriterion("outdoors_area <", value, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaLessThanOrEqualTo(Double value) {
            addCriterion("outdoors_area <=", value, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaIn(List<Double> values) {
            addCriterion("outdoors_area in", values, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaNotIn(List<Double> values) {
            addCriterion("outdoors_area not in", values, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaBetween(Double value1, Double value2) {
            addCriterion("outdoors_area between", value1, value2, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andOutdoorsAreaNotBetween(Double value1, Double value2) {
            addCriterion("outdoors_area not between", value1, value2, "outdoorsArea");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressIsNull() {
            addCriterion("name_and_address is null");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressIsNotNull() {
            addCriterion("name_and_address is not null");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressEqualTo(String value) {
            addCriterion("name_and_address =", value, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressNotEqualTo(String value) {
            addCriterion("name_and_address <>", value, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressGreaterThan(String value) {
            addCriterion("name_and_address >", value, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressGreaterThanOrEqualTo(String value) {
            addCriterion("name_and_address >=", value, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressLessThan(String value) {
            addCriterion("name_and_address <", value, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressLessThanOrEqualTo(String value) {
            addCriterion("name_and_address <=", value, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressLike(String value) {
            addCriterion("name_and_address like", value, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressNotLike(String value) {
            addCriterion("name_and_address not like", value, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressIn(List<String> values) {
            addCriterion("name_and_address in", values, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressNotIn(List<String> values) {
            addCriterion("name_and_address not in", values, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressBetween(String value1, String value2) {
            addCriterion("name_and_address between", value1, value2, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNameAndAddressNotBetween(String value1, String value2) {
            addCriterion("name_and_address not between", value1, value2, "nameAndAddress");
            return (Criteria) this;
        }

        public Criteria andNewPlaceIsNull() {
            addCriterion("new_place is null");
            return (Criteria) this;
        }

        public Criteria andNewPlaceIsNotNull() {
            addCriterion("new_place is not null");
            return (Criteria) this;
        }

        public Criteria andNewPlaceEqualTo(String value) {
            addCriterion("new_place =", value, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceNotEqualTo(String value) {
            addCriterion("new_place <>", value, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceGreaterThan(String value) {
            addCriterion("new_place >", value, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("new_place >=", value, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceLessThan(String value) {
            addCriterion("new_place <", value, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceLessThanOrEqualTo(String value) {
            addCriterion("new_place <=", value, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceLike(String value) {
            addCriterion("new_place like", value, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceNotLike(String value) {
            addCriterion("new_place not like", value, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceIn(List<String> values) {
            addCriterion("new_place in", values, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceNotIn(List<String> values) {
            addCriterion("new_place not in", values, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceBetween(String value1, String value2) {
            addCriterion("new_place between", value1, value2, "newPlace");
            return (Criteria) this;
        }

        public Criteria andNewPlaceNotBetween(String value1, String value2) {
            addCriterion("new_place not between", value1, value2, "newPlace");
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