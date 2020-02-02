package com.edu.demo1.domain;

import java.util.ArrayList;
import java.util.List;

public class VideoListExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoListExample() {
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

        public Criteria andVideosrcIsNull() {
            addCriterion("videosrc is null");
            return (Criteria) this;
        }

        public Criteria andVideosrcIsNotNull() {
            addCriterion("videosrc is not null");
            return (Criteria) this;
        }

        public Criteria andVideosrcEqualTo(String value) {
            addCriterion("videosrc =", value, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcNotEqualTo(String value) {
            addCriterion("videosrc <>", value, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcGreaterThan(String value) {
            addCriterion("videosrc >", value, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcGreaterThanOrEqualTo(String value) {
            addCriterion("videosrc >=", value, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcLessThan(String value) {
            addCriterion("videosrc <", value, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcLessThanOrEqualTo(String value) {
            addCriterion("videosrc <=", value, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcLike(String value) {
            addCriterion("videosrc like", value, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcNotLike(String value) {
            addCriterion("videosrc not like", value, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcIn(List<String> values) {
            addCriterion("videosrc in", values, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcNotIn(List<String> values) {
            addCriterion("videosrc not in", values, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcBetween(String value1, String value2) {
            addCriterion("videosrc between", value1, value2, "videosrc");
            return (Criteria) this;
        }

        public Criteria andVideosrcNotBetween(String value1, String value2) {
            addCriterion("videosrc not between", value1, value2, "videosrc");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(Integer value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(Integer value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(Integer value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(Integer value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(Integer value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(Integer value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<Integer> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<Integer> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(Integer value1, Integer value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(Integer value1, Integer value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
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

        public Criteria andInfo3IsNull() {
            addCriterion("info3 is null");
            return (Criteria) this;
        }

        public Criteria andInfo3IsNotNull() {
            addCriterion("info3 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo3EqualTo(String value) {
            addCriterion("info3 =", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3NotEqualTo(String value) {
            addCriterion("info3 <>", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3GreaterThan(String value) {
            addCriterion("info3 >", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3GreaterThanOrEqualTo(String value) {
            addCriterion("info3 >=", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3LessThan(String value) {
            addCriterion("info3 <", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3LessThanOrEqualTo(String value) {
            addCriterion("info3 <=", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3Like(String value) {
            addCriterion("info3 like", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3NotLike(String value) {
            addCriterion("info3 not like", value, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3In(List<String> values) {
            addCriterion("info3 in", values, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3NotIn(List<String> values) {
            addCriterion("info3 not in", values, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3Between(String value1, String value2) {
            addCriterion("info3 between", value1, value2, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo3NotBetween(String value1, String value2) {
            addCriterion("info3 not between", value1, value2, "info3");
            return (Criteria) this;
        }

        public Criteria andInfo4IsNull() {
            addCriterion("info4 is null");
            return (Criteria) this;
        }

        public Criteria andInfo4IsNotNull() {
            addCriterion("info4 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo4EqualTo(String value) {
            addCriterion("info4 =", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4NotEqualTo(String value) {
            addCriterion("info4 <>", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4GreaterThan(String value) {
            addCriterion("info4 >", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4GreaterThanOrEqualTo(String value) {
            addCriterion("info4 >=", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4LessThan(String value) {
            addCriterion("info4 <", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4LessThanOrEqualTo(String value) {
            addCriterion("info4 <=", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4Like(String value) {
            addCriterion("info4 like", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4NotLike(String value) {
            addCriterion("info4 not like", value, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4In(List<String> values) {
            addCriterion("info4 in", values, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4NotIn(List<String> values) {
            addCriterion("info4 not in", values, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4Between(String value1, String value2) {
            addCriterion("info4 between", value1, value2, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo4NotBetween(String value1, String value2) {
            addCriterion("info4 not between", value1, value2, "info4");
            return (Criteria) this;
        }

        public Criteria andInfo5IsNull() {
            addCriterion("info5 is null");
            return (Criteria) this;
        }

        public Criteria andInfo5IsNotNull() {
            addCriterion("info5 is not null");
            return (Criteria) this;
        }

        public Criteria andInfo5EqualTo(String value) {
            addCriterion("info5 =", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5NotEqualTo(String value) {
            addCriterion("info5 <>", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5GreaterThan(String value) {
            addCriterion("info5 >", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5GreaterThanOrEqualTo(String value) {
            addCriterion("info5 >=", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5LessThan(String value) {
            addCriterion("info5 <", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5LessThanOrEqualTo(String value) {
            addCriterion("info5 <=", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5Like(String value) {
            addCriterion("info5 like", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5NotLike(String value) {
            addCriterion("info5 not like", value, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5In(List<String> values) {
            addCriterion("info5 in", values, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5NotIn(List<String> values) {
            addCriterion("info5 not in", values, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5Between(String value1, String value2) {
            addCriterion("info5 between", value1, value2, "info5");
            return (Criteria) this;
        }

        public Criteria andInfo5NotBetween(String value1, String value2) {
            addCriterion("info5 not between", value1, value2, "info5");
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