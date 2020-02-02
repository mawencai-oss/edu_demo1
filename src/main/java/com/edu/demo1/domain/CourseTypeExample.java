package com.edu.demo1.domain;

import java.util.ArrayList;
import java.util.List;

public class CourseTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseTypeExample() {
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

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuIsNull() {
            addCriterion("type_miaoshu is null");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuIsNotNull() {
            addCriterion("type_miaoshu is not null");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuEqualTo(String value) {
            addCriterion("type_miaoshu =", value, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuNotEqualTo(String value) {
            addCriterion("type_miaoshu <>", value, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuGreaterThan(String value) {
            addCriterion("type_miaoshu >", value, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuGreaterThanOrEqualTo(String value) {
            addCriterion("type_miaoshu >=", value, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuLessThan(String value) {
            addCriterion("type_miaoshu <", value, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuLessThanOrEqualTo(String value) {
            addCriterion("type_miaoshu <=", value, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuLike(String value) {
            addCriterion("type_miaoshu like", value, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuNotLike(String value) {
            addCriterion("type_miaoshu not like", value, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuIn(List<String> values) {
            addCriterion("type_miaoshu in", values, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuNotIn(List<String> values) {
            addCriterion("type_miaoshu not in", values, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuBetween(String value1, String value2) {
            addCriterion("type_miaoshu between", value1, value2, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andTypeMiaoshuNotBetween(String value1, String value2) {
            addCriterion("type_miaoshu not between", value1, value2, "typeMiaoshu");
            return (Criteria) this;
        }

        public Criteria andInfo1IsNull() {
            addCriterion("info1 is null");
            return (Criteria) this;
        }

        public Criteria andInfo1IsNotNull() {
            addCriterion("info1 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo1EqualTo(String value) {
            addCriterion("info1 =", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1NotEqualTo(String value) {
            addCriterion("info1 <>", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1GreaterThan(String value) {
            addCriterion("info1 >", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1GreaterThanOrEqualTo(String value) {
            addCriterion("info1 >=", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1LessThan(String value) {
            addCriterion("info1 <", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1LessThanOrEqualTo(String value) {
            addCriterion("info1 <=", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1Like(String value) {
            addCriterion("info1 like", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1NotLike(String value) {
            addCriterion("info1 not like", value, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1In(List<String> values) {
            addCriterion("info1 in", values, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1NotIn(List<String> values) {
            addCriterion("info1 not in", values, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1Between(String value1, String value2) {
            addCriterion("info1 between", value1, value2, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo1NotBetween(String value1, String value2) {
            addCriterion("info1 not between", value1, value2, "info1");
            return (Criteria) this;
        }

        public Criteria andInfo2IsNull() {
            addCriterion("info2 is null");
            return (Criteria) this;
        }

        public Criteria andInfo2IsNotNull() {
            addCriterion("info2 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo2EqualTo(String value) {
            addCriterion("info2 =", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2NotEqualTo(String value) {
            addCriterion("info2 <>", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2GreaterThan(String value) {
            addCriterion("info2 >", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2GreaterThanOrEqualTo(String value) {
            addCriterion("info2 >=", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2LessThan(String value) {
            addCriterion("info2 <", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2LessThanOrEqualTo(String value) {
            addCriterion("info2 <=", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2Like(String value) {
            addCriterion("info2 like", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2NotLike(String value) {
            addCriterion("info2 not like", value, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2In(List<String> values) {
            addCriterion("info2 in", values, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2NotIn(List<String> values) {
            addCriterion("info2 not in", values, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2Between(String value1, String value2) {
            addCriterion("info2 between", value1, value2, "info2");
            return (Criteria) this;
        }

        public Criteria andInfo2NotBetween(String value1, String value2) {
            addCriterion("info2 not between", value1, value2, "info2");
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