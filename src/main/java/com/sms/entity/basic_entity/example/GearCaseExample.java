package com.sms.entity.basic_entity.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class GearCaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GearCaseExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNull() {
            addCriterion("client_name is null");
            return (Criteria) this;
        }

        public Criteria andClientNameIsNotNull() {
            addCriterion("client_name is not null");
            return (Criteria) this;
        }

        public Criteria andClientNameEqualTo(String value) {
            addCriterion("client_name =", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotEqualTo(String value) {
            addCriterion("client_name <>", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThan(String value) {
            addCriterion("client_name >", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("client_name >=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThan(String value) {
            addCriterion("client_name <", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLessThanOrEqualTo(String value) {
            addCriterion("client_name <=", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameLike(String value) {
            addCriterion("client_name like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotLike(String value) {
            addCriterion("client_name not like", value, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameIn(List<String> values) {
            addCriterion("client_name in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotIn(List<String> values) {
            addCriterion("client_name not in", values, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameBetween(String value1, String value2) {
            addCriterion("client_name between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andClientNameNotBetween(String value1, String value2) {
            addCriterion("client_name not between", value1, value2, "clientName");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumIsNull() {
            addCriterion("product_drawing_num is null");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumIsNotNull() {
            addCriterion("product_drawing_num is not null");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumEqualTo(String value) {
            addCriterion("product_drawing_num =", value, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumNotEqualTo(String value) {
            addCriterion("product_drawing_num <>", value, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumGreaterThan(String value) {
            addCriterion("product_drawing_num >", value, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumGreaterThanOrEqualTo(String value) {
            addCriterion("product_drawing_num >=", value, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumLessThan(String value) {
            addCriterion("product_drawing_num <", value, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumLessThanOrEqualTo(String value) {
            addCriterion("product_drawing_num <=", value, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumLike(String value) {
            addCriterion("product_drawing_num like", value, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumNotLike(String value) {
            addCriterion("product_drawing_num not like", value, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumIn(List<String> values) {
            addCriterion("product_drawing_num in", values, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumNotIn(List<String> values) {
            addCriterion("product_drawing_num not in", values, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumBetween(String value1, String value2) {
            addCriterion("product_drawing_num between", value1, value2, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andProductDrawingNumNotBetween(String value1, String value2) {
            addCriterion("product_drawing_num not between", value1, value2, "productDrawingNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumIsNull() {
            addCriterion("gear_case_num is null");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumIsNotNull() {
            addCriterion("gear_case_num is not null");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumEqualTo(String value) {
            addCriterion("gear_case_num =", value, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumNotEqualTo(String value) {
            addCriterion("gear_case_num <>", value, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumGreaterThan(String value) {
            addCriterion("gear_case_num >", value, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumGreaterThanOrEqualTo(String value) {
            addCriterion("gear_case_num >=", value, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumLessThan(String value) {
            addCriterion("gear_case_num <", value, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumLessThanOrEqualTo(String value) {
            addCriterion("gear_case_num <=", value, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumLike(String value) {
            addCriterion("gear_case_num like", value, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumNotLike(String value) {
            addCriterion("gear_case_num not like", value, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumIn(List<String> values) {
            addCriterion("gear_case_num in", values, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumNotIn(List<String> values) {
            addCriterion("gear_case_num not in", values, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumBetween(String value1, String value2) {
            addCriterion("gear_case_num between", value1, value2, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andGearCaseNumNotBetween(String value1, String value2) {
            addCriterion("gear_case_num not between", value1, value2, "gearCaseNum");
            return (Criteria) this;
        }

        public Criteria andPowerIsNull() {
            addCriterion("power is null");
            return (Criteria) this;
        }

        public Criteria andPowerIsNotNull() {
            addCriterion("power is not null");
            return (Criteria) this;
        }

        public Criteria andPowerEqualTo(String value) {
            addCriterion("power =", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotEqualTo(String value) {
            addCriterion("power <>", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThan(String value) {
            addCriterion("power >", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerGreaterThanOrEqualTo(String value) {
            addCriterion("power >=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThan(String value) {
            addCriterion("power <", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLessThanOrEqualTo(String value) {
            addCriterion("power <=", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerLike(String value) {
            addCriterion("power like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotLike(String value) {
            addCriterion("power not like", value, "power");
            return (Criteria) this;
        }

        public Criteria andPowerIn(List<String> values) {
            addCriterion("power in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotIn(List<String> values) {
            addCriterion("power not in", values, "power");
            return (Criteria) this;
        }

        public Criteria andPowerBetween(String value1, String value2) {
            addCriterion("power between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andPowerNotBetween(String value1, String value2) {
            addCriterion("power not between", value1, value2, "power");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioIsNull() {
            addCriterion("velocity_ratio is null");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioIsNotNull() {
            addCriterion("velocity_ratio is not null");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioEqualTo(String value) {
            addCriterion("velocity_ratio =", value, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioNotEqualTo(String value) {
            addCriterion("velocity_ratio <>", value, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioGreaterThan(String value) {
            addCriterion("velocity_ratio >", value, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioGreaterThanOrEqualTo(String value) {
            addCriterion("velocity_ratio >=", value, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioLessThan(String value) {
            addCriterion("velocity_ratio <", value, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioLessThanOrEqualTo(String value) {
            addCriterion("velocity_ratio <=", value, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioLike(String value) {
            addCriterion("velocity_ratio like", value, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioNotLike(String value) {
            addCriterion("velocity_ratio not like", value, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioIn(List<String> values) {
            addCriterion("velocity_ratio in", values, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioNotIn(List<String> values) {
            addCriterion("velocity_ratio not in", values, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioBetween(String value1, String value2) {
            addCriterion("velocity_ratio between", value1, value2, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andVelocityRatioNotBetween(String value1, String value2) {
            addCriterion("velocity_ratio not between", value1, value2, "velocityRatio");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateIsNull() {
            addCriterion("assembly_date is null");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateIsNotNull() {
            addCriterion("assembly_date is not null");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateEqualTo(Date value) {
            addCriterionForJDBCDate("assembly_date =", value, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("assembly_date <>", value, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("assembly_date >", value, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("assembly_date >=", value, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateLessThan(Date value) {
            addCriterionForJDBCDate("assembly_date <", value, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("assembly_date <=", value, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateIn(List<Date> values) {
            addCriterionForJDBCDate("assembly_date in", values, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("assembly_date not in", values, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("assembly_date between", value1, value2, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andAssemblyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("assembly_date not between", value1, value2, "assemblyDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNull() {
            addCriterion("release_date is null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIsNotNull() {
            addCriterion("release_date is not null");
            return (Criteria) this;
        }

        public Criteria andReleaseDateEqualTo(Date value) {
            addCriterionForJDBCDate("release_date =", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <>", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThan(Date value) {
            addCriterionForJDBCDate("release_date >", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date >=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThan(Date value) {
            addCriterionForJDBCDate("release_date <", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("release_date <=", value, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateIn(List<Date> values) {
            addCriterionForJDBCDate("release_date in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("release_date not in", values, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andReleaseDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("release_date not between", value1, value2, "releaseDate");
            return (Criteria) this;
        }

        public Criteria andWindFieldIsNull() {
            addCriterion("wind_field is null");
            return (Criteria) this;
        }

        public Criteria andWindFieldIsNotNull() {
            addCriterion("wind_field is not null");
            return (Criteria) this;
        }

        public Criteria andWindFieldEqualTo(String value) {
            addCriterion("wind_field =", value, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldNotEqualTo(String value) {
            addCriterion("wind_field <>", value, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldGreaterThan(String value) {
            addCriterion("wind_field >", value, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldGreaterThanOrEqualTo(String value) {
            addCriterion("wind_field >=", value, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldLessThan(String value) {
            addCriterion("wind_field <", value, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldLessThanOrEqualTo(String value) {
            addCriterion("wind_field <=", value, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldLike(String value) {
            addCriterion("wind_field like", value, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldNotLike(String value) {
            addCriterion("wind_field not like", value, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldIn(List<String> values) {
            addCriterion("wind_field in", values, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldNotIn(List<String> values) {
            addCriterion("wind_field not in", values, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldBetween(String value1, String value2) {
            addCriterion("wind_field between", value1, value2, "windField");
            return (Criteria) this;
        }

        public Criteria andWindFieldNotBetween(String value1, String value2) {
            addCriterion("wind_field not between", value1, value2, "windField");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumIsNull() {
            addCriterion("wind_turbine_num is null");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumIsNotNull() {
            addCriterion("wind_turbine_num is not null");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumEqualTo(String value) {
            addCriterion("wind_turbine_num =", value, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumNotEqualTo(String value) {
            addCriterion("wind_turbine_num <>", value, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumGreaterThan(String value) {
            addCriterion("wind_turbine_num >", value, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumGreaterThanOrEqualTo(String value) {
            addCriterion("wind_turbine_num >=", value, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumLessThan(String value) {
            addCriterion("wind_turbine_num <", value, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumLessThanOrEqualTo(String value) {
            addCriterion("wind_turbine_num <=", value, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumLike(String value) {
            addCriterion("wind_turbine_num like", value, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumNotLike(String value) {
            addCriterion("wind_turbine_num not like", value, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumIn(List<String> values) {
            addCriterion("wind_turbine_num in", values, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumNotIn(List<String> values) {
            addCriterion("wind_turbine_num not in", values, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumBetween(String value1, String value2) {
            addCriterion("wind_turbine_num between", value1, value2, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andWindTurbineNumNotBetween(String value1, String value2) {
            addCriterion("wind_turbine_num not between", value1, value2, "windTurbineNum");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateIsNull() {
            addCriterion("grid_connected_date is null");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateIsNotNull() {
            addCriterion("grid_connected_date is not null");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateEqualTo(Date value) {
            addCriterionForJDBCDate("grid_connected_date =", value, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("grid_connected_date <>", value, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateGreaterThan(Date value) {
            addCriterionForJDBCDate("grid_connected_date >", value, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grid_connected_date >=", value, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateLessThan(Date value) {
            addCriterionForJDBCDate("grid_connected_date <", value, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("grid_connected_date <=", value, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateIn(List<Date> values) {
            addCriterionForJDBCDate("grid_connected_date in", values, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("grid_connected_date not in", values, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grid_connected_date between", value1, value2, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andGridConnectedDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("grid_connected_date not between", value1, value2, "gridConnectedDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateIsNull() {
            addCriterion("start_warranty_date is null");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateIsNotNull() {
            addCriterion("start_warranty_date is not null");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateEqualTo(Date value) {
            addCriterionForJDBCDate("start_warranty_date =", value, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("start_warranty_date <>", value, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("start_warranty_date >", value, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_warranty_date >=", value, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateLessThan(Date value) {
            addCriterionForJDBCDate("start_warranty_date <", value, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("start_warranty_date <=", value, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateIn(List<Date> values) {
            addCriterionForJDBCDate("start_warranty_date in", values, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("start_warranty_date not in", values, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_warranty_date between", value1, value2, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andStartWarrantyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("start_warranty_date not between", value1, value2, "startWarrantyDate");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteIsNull() {
            addCriterion("quality_problems_note is null");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteIsNotNull() {
            addCriterion("quality_problems_note is not null");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteEqualTo(String value) {
            addCriterion("quality_problems_note =", value, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteNotEqualTo(String value) {
            addCriterion("quality_problems_note <>", value, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteGreaterThan(String value) {
            addCriterion("quality_problems_note >", value, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteGreaterThanOrEqualTo(String value) {
            addCriterion("quality_problems_note >=", value, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteLessThan(String value) {
            addCriterion("quality_problems_note <", value, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteLessThanOrEqualTo(String value) {
            addCriterion("quality_problems_note <=", value, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteLike(String value) {
            addCriterion("quality_problems_note like", value, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteNotLike(String value) {
            addCriterion("quality_problems_note not like", value, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteIn(List<String> values) {
            addCriterion("quality_problems_note in", values, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteNotIn(List<String> values) {
            addCriterion("quality_problems_note not in", values, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteBetween(String value1, String value2) {
            addCriterion("quality_problems_note between", value1, value2, "qualityProblemsNote");
            return (Criteria) this;
        }

        public Criteria andQualityProblemsNoteNotBetween(String value1, String value2) {
            addCriterion("quality_problems_note not between", value1, value2, "qualityProblemsNote");
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