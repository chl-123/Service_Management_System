package com.sms.entity.business_entity.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ServiceRegistrationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ServiceRegistrationExample() {
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

        public Criteria andArchiveNumIsNull() {
            addCriterion("archive_num is null");
            return (Criteria) this;
        }

        public Criteria andArchiveNumIsNotNull() {
            addCriterion("archive_num is not null");
            return (Criteria) this;
        }

        public Criteria andArchiveNumEqualTo(String value) {
            addCriterion("archive_num =", value, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumNotEqualTo(String value) {
            addCriterion("archive_num <>", value, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumGreaterThan(String value) {
            addCriterion("archive_num >", value, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumGreaterThanOrEqualTo(String value) {
            addCriterion("archive_num >=", value, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumLessThan(String value) {
            addCriterion("archive_num <", value, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumLessThanOrEqualTo(String value) {
            addCriterion("archive_num <=", value, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumLike(String value) {
            addCriterion("archive_num like", value, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumNotLike(String value) {
            addCriterion("archive_num not like", value, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumIn(List<String> values) {
            addCriterion("archive_num in", values, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumNotIn(List<String> values) {
            addCriterion("archive_num not in", values, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumBetween(String value1, String value2) {
            addCriterion("archive_num between", value1, value2, "archiveNum");
            return (Criteria) this;
        }

        public Criteria andArchiveNumNotBetween(String value1, String value2) {
            addCriterion("archive_num not between", value1, value2, "archiveNum");
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

        public Criteria andDisposerNameIsNull() {
            addCriterion("disposer_name is null");
            return (Criteria) this;
        }

        public Criteria andDisposerNameIsNotNull() {
            addCriterion("disposer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDisposerNameEqualTo(String value) {
            addCriterion("disposer_name =", value, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameNotEqualTo(String value) {
            addCriterion("disposer_name <>", value, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameGreaterThan(String value) {
            addCriterion("disposer_name >", value, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameGreaterThanOrEqualTo(String value) {
            addCriterion("disposer_name >=", value, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameLessThan(String value) {
            addCriterion("disposer_name <", value, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameLessThanOrEqualTo(String value) {
            addCriterion("disposer_name <=", value, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameLike(String value) {
            addCriterion("disposer_name like", value, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameNotLike(String value) {
            addCriterion("disposer_name not like", value, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameIn(List<String> values) {
            addCriterion("disposer_name in", values, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameNotIn(List<String> values) {
            addCriterion("disposer_name not in", values, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameBetween(String value1, String value2) {
            addCriterion("disposer_name between", value1, value2, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposerNameNotBetween(String value1, String value2) {
            addCriterion("disposer_name not between", value1, value2, "disposerName");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodIsNull() {
            addCriterion("dispose_method is null");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodIsNotNull() {
            addCriterion("dispose_method is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodEqualTo(String value) {
            addCriterion("dispose_method =", value, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodNotEqualTo(String value) {
            addCriterion("dispose_method <>", value, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodGreaterThan(String value) {
            addCriterion("dispose_method >", value, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodGreaterThanOrEqualTo(String value) {
            addCriterion("dispose_method >=", value, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodLessThan(String value) {
            addCriterion("dispose_method <", value, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodLessThanOrEqualTo(String value) {
            addCriterion("dispose_method <=", value, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodLike(String value) {
            addCriterion("dispose_method like", value, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodNotLike(String value) {
            addCriterion("dispose_method not like", value, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodIn(List<String> values) {
            addCriterion("dispose_method in", values, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodNotIn(List<String> values) {
            addCriterion("dispose_method not in", values, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodBetween(String value1, String value2) {
            addCriterion("dispose_method between", value1, value2, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeMethodNotBetween(String value1, String value2) {
            addCriterion("dispose_method not between", value1, value2, "disposeMethod");
            return (Criteria) this;
        }

        public Criteria andDisposeDateIsNull() {
            addCriterion("dispose_date is null");
            return (Criteria) this;
        }

        public Criteria andDisposeDateIsNotNull() {
            addCriterion("dispose_date is not null");
            return (Criteria) this;
        }

        public Criteria andDisposeDateEqualTo(Date value) {
            addCriterionForJDBCDate("dispose_date =", value, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("dispose_date <>", value, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateGreaterThan(Date value) {
            addCriterionForJDBCDate("dispose_date >", value, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dispose_date >=", value, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateLessThan(Date value) {
            addCriterionForJDBCDate("dispose_date <", value, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("dispose_date <=", value, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateIn(List<Date> values) {
            addCriterionForJDBCDate("dispose_date in", values, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("dispose_date not in", values, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dispose_date between", value1, value2, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andDisposeDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("dispose_date not between", value1, value2, "disposeDate");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionIsNull() {
            addCriterion("error_description is null");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionIsNotNull() {
            addCriterion("error_description is not null");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionEqualTo(String value) {
            addCriterion("error_description =", value, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionNotEqualTo(String value) {
            addCriterion("error_description <>", value, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionGreaterThan(String value) {
            addCriterion("error_description >", value, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("error_description >=", value, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionLessThan(String value) {
            addCriterion("error_description <", value, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionLessThanOrEqualTo(String value) {
            addCriterion("error_description <=", value, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionLike(String value) {
            addCriterion("error_description like", value, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionNotLike(String value) {
            addCriterion("error_description not like", value, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionIn(List<String> values) {
            addCriterion("error_description in", values, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionNotIn(List<String> values) {
            addCriterion("error_description not in", values, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionBetween(String value1, String value2) {
            addCriterion("error_description between", value1, value2, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andErrorDescriptionNotBetween(String value1, String value2) {
            addCriterion("error_description not between", value1, value2, "errorDescription");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathIsNull() {
            addCriterion("attachment_path is null");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathIsNotNull() {
            addCriterion("attachment_path is not null");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathEqualTo(String value) {
            addCriterion("attachment_path =", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathNotEqualTo(String value) {
            addCriterion("attachment_path <>", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathGreaterThan(String value) {
            addCriterion("attachment_path >", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathGreaterThanOrEqualTo(String value) {
            addCriterion("attachment_path >=", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathLessThan(String value) {
            addCriterion("attachment_path <", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathLessThanOrEqualTo(String value) {
            addCriterion("attachment_path <=", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathLike(String value) {
            addCriterion("attachment_path like", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathNotLike(String value) {
            addCriterion("attachment_path not like", value, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathIn(List<String> values) {
            addCriterion("attachment_path in", values, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathNotIn(List<String> values) {
            addCriterion("attachment_path not in", values, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathBetween(String value1, String value2) {
            addCriterion("attachment_path between", value1, value2, "attachmentPath");
            return (Criteria) this;
        }

        public Criteria andAttachmentPathNotBetween(String value1, String value2) {
            addCriterion("attachment_path not between", value1, value2, "attachmentPath");
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