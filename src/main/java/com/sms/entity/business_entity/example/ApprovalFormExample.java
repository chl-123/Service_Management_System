package com.sms.entity.business_entity.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ApprovalFormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApprovalFormExample() {
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

        public Criteria andFeedbackInfoIsNull() {
            addCriterion("feedback_info is null");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoIsNotNull() {
            addCriterion("feedback_info is not null");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoEqualTo(String value) {
            addCriterion("feedback_info =", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoNotEqualTo(String value) {
            addCriterion("feedback_info <>", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoGreaterThan(String value) {
            addCriterion("feedback_info >", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoGreaterThanOrEqualTo(String value) {
            addCriterion("feedback_info >=", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoLessThan(String value) {
            addCriterion("feedback_info <", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoLessThanOrEqualTo(String value) {
            addCriterion("feedback_info <=", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoLike(String value) {
            addCriterion("feedback_info like", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoNotLike(String value) {
            addCriterion("feedback_info not like", value, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoIn(List<String> values) {
            addCriterion("feedback_info in", values, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoNotIn(List<String> values) {
            addCriterion("feedback_info not in", values, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoBetween(String value1, String value2) {
            addCriterion("feedback_info between", value1, value2, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andFeedbackInfoNotBetween(String value1, String value2) {
            addCriterion("feedback_info not between", value1, value2, "feedbackInfo");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNull() {
            addCriterion("creator_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIsNotNull() {
            addCriterion("creator_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorNameEqualTo(String value) {
            addCriterion("creator_name =", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotEqualTo(String value) {
            addCriterion("creator_name <>", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThan(String value) {
            addCriterion("creator_name >", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("creator_name >=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThan(String value) {
            addCriterion("creator_name <", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLessThanOrEqualTo(String value) {
            addCriterion("creator_name <=", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameLike(String value) {
            addCriterion("creator_name like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotLike(String value) {
            addCriterion("creator_name not like", value, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameIn(List<String> values) {
            addCriterion("creator_name in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotIn(List<String> values) {
            addCriterion("creator_name not in", values, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameBetween(String value1, String value2) {
            addCriterion("creator_name between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreatorNameNotBetween(String value1, String value2) {
            addCriterion("creator_name not between", value1, value2, "creatorName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifierNameIsNull() {
            addCriterion("modifier_name is null");
            return (Criteria) this;
        }

        public Criteria andModifierNameIsNotNull() {
            addCriterion("modifier_name is not null");
            return (Criteria) this;
        }

        public Criteria andModifierNameEqualTo(String value) {
            addCriterion("modifier_name =", value, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameNotEqualTo(String value) {
            addCriterion("modifier_name <>", value, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameGreaterThan(String value) {
            addCriterion("modifier_name >", value, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameGreaterThanOrEqualTo(String value) {
            addCriterion("modifier_name >=", value, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameLessThan(String value) {
            addCriterion("modifier_name <", value, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameLessThanOrEqualTo(String value) {
            addCriterion("modifier_name <=", value, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameLike(String value) {
            addCriterion("modifier_name like", value, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameNotLike(String value) {
            addCriterion("modifier_name not like", value, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameIn(List<String> values) {
            addCriterion("modifier_name in", values, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameNotIn(List<String> values) {
            addCriterion("modifier_name not in", values, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameBetween(String value1, String value2) {
            addCriterion("modifier_name between", value1, value2, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifierNameNotBetween(String value1, String value2) {
            addCriterion("modifier_name not between", value1, value2, "modifierName");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterionForJDBCDate("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterionForJDBCDate("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterionForJDBCDate("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("modify_date not between", value1, value2, "modifyDate");
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