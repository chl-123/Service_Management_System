package com.sms.entity.system_entity.example;

import java.util.ArrayList;
import java.util.List;

public class ResourcesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourcesExample() {
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

        public Criteria andResourceNameIsNull() {
            addCriterion("resource_name is null");
            return (Criteria) this;
        }

        public Criteria andResourceNameIsNotNull() {
            addCriterion("resource_name is not null");
            return (Criteria) this;
        }

        public Criteria andResourceNameEqualTo(String value) {
            addCriterion("resource_name =", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotEqualTo(String value) {
            addCriterion("resource_name <>", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThan(String value) {
            addCriterion("resource_name >", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("resource_name >=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThan(String value) {
            addCriterion("resource_name <", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLessThanOrEqualTo(String value) {
            addCriterion("resource_name <=", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameLike(String value) {
            addCriterion("resource_name like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotLike(String value) {
            addCriterion("resource_name not like", value, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameIn(List<String> values) {
            addCriterion("resource_name in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotIn(List<String> values) {
            addCriterion("resource_name not in", values, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameBetween(String value1, String value2) {
            addCriterion("resource_name between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceNameNotBetween(String value1, String value2) {
            addCriterion("resource_name not between", value1, value2, "resourceName");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNull() {
            addCriterion("resource_id is null");
            return (Criteria) this;
        }

        public Criteria andResourceIdIsNotNull() {
            addCriterion("resource_id is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIdEqualTo(String value) {
            addCriterion("resource_id =", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotEqualTo(String value) {
            addCriterion("resource_id <>", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThan(String value) {
            addCriterion("resource_id >", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("resource_id >=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThan(String value) {
            addCriterion("resource_id <", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLessThanOrEqualTo(String value) {
            addCriterion("resource_id <=", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdLike(String value) {
            addCriterion("resource_id like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotLike(String value) {
            addCriterion("resource_id not like", value, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdIn(List<String> values) {
            addCriterion("resource_id in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotIn(List<String> values) {
            addCriterion("resource_id not in", values, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdBetween(String value1, String value2) {
            addCriterion("resource_id between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceIdNotBetween(String value1, String value2) {
            addCriterion("resource_id not between", value1, value2, "resourceId");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResourceTypeEqualTo(Integer value) {
            addCriterion("resource_type =", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotEqualTo(Integer value) {
            addCriterion("resource_type <>", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThan(Integer value) {
            addCriterion("resource_type >", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_type >=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThan(Integer value) {
            addCriterion("resource_type <", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeLessThanOrEqualTo(Integer value) {
            addCriterion("resource_type <=", value, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeIn(List<Integer> values) {
            addCriterion("resource_type in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotIn(List<Integer> values) {
            addCriterion("resource_type not in", values, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeBetween(Integer value1, Integer value2) {
            addCriterion("resource_type between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_type not between", value1, value2, "resourceType");
            return (Criteria) this;
        }

        public Criteria andResourceIconIsNull() {
            addCriterion("resource_icon is null");
            return (Criteria) this;
        }

        public Criteria andResourceIconIsNotNull() {
            addCriterion("resource_icon is not null");
            return (Criteria) this;
        }

        public Criteria andResourceIconEqualTo(String value) {
            addCriterion("resource_icon =", value, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconNotEqualTo(String value) {
            addCriterion("resource_icon <>", value, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconGreaterThan(String value) {
            addCriterion("resource_icon >", value, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconGreaterThanOrEqualTo(String value) {
            addCriterion("resource_icon >=", value, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconLessThan(String value) {
            addCriterion("resource_icon <", value, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconLessThanOrEqualTo(String value) {
            addCriterion("resource_icon <=", value, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconLike(String value) {
            addCriterion("resource_icon like", value, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconNotLike(String value) {
            addCriterion("resource_icon not like", value, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconIn(List<String> values) {
            addCriterion("resource_icon in", values, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconNotIn(List<String> values) {
            addCriterion("resource_icon not in", values, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconBetween(String value1, String value2) {
            addCriterion("resource_icon between", value1, value2, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourceIconNotBetween(String value1, String value2) {
            addCriterion("resource_icon not between", value1, value2, "resourceIcon");
            return (Criteria) this;
        }

        public Criteria andResourcePathIsNull() {
            addCriterion("resource_path is null");
            return (Criteria) this;
        }

        public Criteria andResourcePathIsNotNull() {
            addCriterion("resource_path is not null");
            return (Criteria) this;
        }

        public Criteria andResourcePathEqualTo(String value) {
            addCriterion("resource_path =", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathNotEqualTo(String value) {
            addCriterion("resource_path <>", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathGreaterThan(String value) {
            addCriterion("resource_path >", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathGreaterThanOrEqualTo(String value) {
            addCriterion("resource_path >=", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathLessThan(String value) {
            addCriterion("resource_path <", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathLessThanOrEqualTo(String value) {
            addCriterion("resource_path <=", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathLike(String value) {
            addCriterion("resource_path like", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathNotLike(String value) {
            addCriterion("resource_path not like", value, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathIn(List<String> values) {
            addCriterion("resource_path in", values, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathNotIn(List<String> values) {
            addCriterion("resource_path not in", values, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathBetween(String value1, String value2) {
            addCriterion("resource_path between", value1, value2, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourcePathNotBetween(String value1, String value2) {
            addCriterion("resource_path not between", value1, value2, "resourcePath");
            return (Criteria) this;
        }

        public Criteria andResourceLinkIsNull() {
            addCriterion("resource_link is null");
            return (Criteria) this;
        }

        public Criteria andResourceLinkIsNotNull() {
            addCriterion("resource_link is not null");
            return (Criteria) this;
        }

        public Criteria andResourceLinkEqualTo(String value) {
            addCriterion("resource_link =", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkNotEqualTo(String value) {
            addCriterion("resource_link <>", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkGreaterThan(String value) {
            addCriterion("resource_link >", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkGreaterThanOrEqualTo(String value) {
            addCriterion("resource_link >=", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkLessThan(String value) {
            addCriterion("resource_link <", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkLessThanOrEqualTo(String value) {
            addCriterion("resource_link <=", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkLike(String value) {
            addCriterion("resource_link like", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkNotLike(String value) {
            addCriterion("resource_link not like", value, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkIn(List<String> values) {
            addCriterion("resource_link in", values, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkNotIn(List<String> values) {
            addCriterion("resource_link not in", values, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkBetween(String value1, String value2) {
            addCriterion("resource_link between", value1, value2, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceLinkNotBetween(String value1, String value2) {
            addCriterion("resource_link not between", value1, value2, "resourceLink");
            return (Criteria) this;
        }

        public Criteria andResourceOrderIsNull() {
            addCriterion("resource_order is null");
            return (Criteria) this;
        }

        public Criteria andResourceOrderIsNotNull() {
            addCriterion("resource_order is not null");
            return (Criteria) this;
        }

        public Criteria andResourceOrderEqualTo(Integer value) {
            addCriterion("resource_order =", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderNotEqualTo(Integer value) {
            addCriterion("resource_order <>", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderGreaterThan(Integer value) {
            addCriterion("resource_order >", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_order >=", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderLessThan(Integer value) {
            addCriterion("resource_order <", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderLessThanOrEqualTo(Integer value) {
            addCriterion("resource_order <=", value, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderIn(List<Integer> values) {
            addCriterion("resource_order in", values, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderNotIn(List<Integer> values) {
            addCriterion("resource_order not in", values, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderBetween(Integer value1, Integer value2) {
            addCriterion("resource_order between", value1, value2, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_order not between", value1, value2, "resourceOrder");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayIsNull() {
            addCriterion("resource_display is null");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayIsNotNull() {
            addCriterion("resource_display is not null");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayEqualTo(Integer value) {
            addCriterion("resource_display =", value, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayNotEqualTo(Integer value) {
            addCriterion("resource_display <>", value, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayGreaterThan(Integer value) {
            addCriterion("resource_display >", value, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayGreaterThanOrEqualTo(Integer value) {
            addCriterion("resource_display >=", value, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayLessThan(Integer value) {
            addCriterion("resource_display <", value, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayLessThanOrEqualTo(Integer value) {
            addCriterion("resource_display <=", value, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayIn(List<Integer> values) {
            addCriterion("resource_display in", values, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayNotIn(List<Integer> values) {
            addCriterion("resource_display not in", values, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayBetween(Integer value1, Integer value2) {
            addCriterion("resource_display between", value1, value2, "resourceDisplay");
            return (Criteria) this;
        }

        public Criteria andResourceDisplayNotBetween(Integer value1, Integer value2) {
            addCriterion("resource_display not between", value1, value2, "resourceDisplay");
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