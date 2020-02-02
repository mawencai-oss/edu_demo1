package com.edu.demo1.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CourseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseExample() {
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

        public Criteria andCourseNameIsNull() {
            addCriterion("course_name is null");
            return (Criteria) this;
        }

        public Criteria andCourseNameIsNotNull() {
            addCriterion("course_name is not null");
            return (Criteria) this;
        }

        public Criteria andCourseNameEqualTo(String value) {
            addCriterion("course_name =", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotEqualTo(String value) {
            addCriterion("course_name <>", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThan(String value) {
            addCriterion("course_name >", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameGreaterThanOrEqualTo(String value) {
            addCriterion("course_name >=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThan(String value) {
            addCriterion("course_name <", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLessThanOrEqualTo(String value) {
            addCriterion("course_name <=", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameLike(String value) {
            addCriterion("course_name like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotLike(String value) {
            addCriterion("course_name not like", value, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameIn(List<String> values) {
            addCriterion("course_name in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotIn(List<String> values) {
            addCriterion("course_name not in", values, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameBetween(String value1, String value2) {
            addCriterion("course_name between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseNameNotBetween(String value1, String value2) {
            addCriterion("course_name not between", value1, value2, "courseName");
            return (Criteria) this;
        }

        public Criteria andCourseImgIsNull() {
            addCriterion("course_img is null");
            return (Criteria) this;
        }

        public Criteria andCourseImgIsNotNull() {
            addCriterion("course_img is not null");
            return (Criteria) this;
        }

        public Criteria andCourseImgEqualTo(String value) {
            addCriterion("course_img =", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotEqualTo(String value) {
            addCriterion("course_img <>", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgGreaterThan(String value) {
            addCriterion("course_img >", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgGreaterThanOrEqualTo(String value) {
            addCriterion("course_img >=", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLessThan(String value) {
            addCriterion("course_img <", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLessThanOrEqualTo(String value) {
            addCriterion("course_img <=", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgLike(String value) {
            addCriterion("course_img like", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotLike(String value) {
            addCriterion("course_img not like", value, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgIn(List<String> values) {
            addCriterion("course_img in", values, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotIn(List<String> values) {
            addCriterion("course_img not in", values, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgBetween(String value1, String value2) {
            addCriterion("course_img between", value1, value2, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseImgNotBetween(String value1, String value2) {
            addCriterion("course_img not between", value1, value2, "courseImg");
            return (Criteria) this;
        }

        public Criteria andCourseListIsNull() {
            addCriterion("course_list is null");
            return (Criteria) this;
        }

        public Criteria andCourseListIsNotNull() {
            addCriterion("course_list is not null");
            return (Criteria) this;
        }

        public Criteria andCourseListEqualTo(String value) {
            addCriterion("course_list =", value, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListNotEqualTo(String value) {
            addCriterion("course_list <>", value, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListGreaterThan(String value) {
            addCriterion("course_list >", value, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListGreaterThanOrEqualTo(String value) {
            addCriterion("course_list >=", value, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListLessThan(String value) {
            addCriterion("course_list <", value, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListLessThanOrEqualTo(String value) {
            addCriterion("course_list <=", value, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListLike(String value) {
            addCriterion("course_list like", value, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListNotLike(String value) {
            addCriterion("course_list not like", value, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListIn(List<String> values) {
            addCriterion("course_list in", values, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListNotIn(List<String> values) {
            addCriterion("course_list not in", values, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListBetween(String value1, String value2) {
            addCriterion("course_list between", value1, value2, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseListNotBetween(String value1, String value2) {
            addCriterion("course_list not between", value1, value2, "courseList");
            return (Criteria) this;
        }

        public Criteria andCourseTimerIsNull() {
            addCriterion("course_timer is null");
            return (Criteria) this;
        }

        public Criteria andCourseTimerIsNotNull() {
            addCriterion("course_timer is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTimerEqualTo(Date value) {
            addCriterion("course_timer =", value, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerNotEqualTo(Date value) {
            addCriterion("course_timer <>", value, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerGreaterThan(Date value) {
            addCriterion("course_timer >", value, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerGreaterThanOrEqualTo(Date value) {
            addCriterion("course_timer >=", value, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerLessThan(Date value) {
            addCriterion("course_timer <", value, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerLessThanOrEqualTo(Date value) {
            addCriterion("course_timer <=", value, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerIn(List<Date> values) {
            addCriterion("course_timer in", values, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerNotIn(List<Date> values) {
            addCriterion("course_timer not in", values, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerBetween(Date value1, Date value2) {
            addCriterion("course_timer between", value1, value2, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCourseTimerNotBetween(Date value1, Date value2) {
            addCriterion("course_timer not between", value1, value2, "courseTimer");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionIsNull() {
            addCriterion("course_permission is null");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionIsNotNull() {
            addCriterion("course_permission is not null");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionEqualTo(String value) {
            addCriterion("course_permission =", value, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionNotEqualTo(String value) {
            addCriterion("course_permission <>", value, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionGreaterThan(String value) {
            addCriterion("course_permission >", value, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionGreaterThanOrEqualTo(String value) {
            addCriterion("course_permission >=", value, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionLessThan(String value) {
            addCriterion("course_permission <", value, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionLessThanOrEqualTo(String value) {
            addCriterion("course_permission <=", value, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionLike(String value) {
            addCriterion("course_permission like", value, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionNotLike(String value) {
            addCriterion("course_permission not like", value, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionIn(List<String> values) {
            addCriterion("course_permission in", values, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionNotIn(List<String> values) {
            addCriterion("course_permission not in", values, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionBetween(String value1, String value2) {
            addCriterion("course_permission between", value1, value2, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCoursePermissionNotBetween(String value1, String value2) {
            addCriterion("course_permission not between", value1, value2, "coursePermission");
            return (Criteria) this;
        }

        public Criteria andCourseManIsNull() {
            addCriterion("course_man is null");
            return (Criteria) this;
        }

        public Criteria andCourseManIsNotNull() {
            addCriterion("course_man is not null");
            return (Criteria) this;
        }

        public Criteria andCourseManEqualTo(String value) {
            addCriterion("course_man =", value, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManNotEqualTo(String value) {
            addCriterion("course_man <>", value, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManGreaterThan(String value) {
            addCriterion("course_man >", value, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManGreaterThanOrEqualTo(String value) {
            addCriterion("course_man >=", value, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManLessThan(String value) {
            addCriterion("course_man <", value, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManLessThanOrEqualTo(String value) {
            addCriterion("course_man <=", value, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManLike(String value) {
            addCriterion("course_man like", value, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManNotLike(String value) {
            addCriterion("course_man not like", value, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManIn(List<String> values) {
            addCriterion("course_man in", values, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManNotIn(List<String> values) {
            addCriterion("course_man not in", values, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManBetween(String value1, String value2) {
            addCriterion("course_man between", value1, value2, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseManNotBetween(String value1, String value2) {
            addCriterion("course_man not between", value1, value2, "courseMan");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNull() {
            addCriterion("course_type is null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIsNotNull() {
            addCriterion("course_type is not null");
            return (Criteria) this;
        }

        public Criteria andCourseTypeEqualTo(String value) {
            addCriterion("course_type =", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotEqualTo(String value) {
            addCriterion("course_type <>", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThan(String value) {
            addCriterion("course_type >", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeGreaterThanOrEqualTo(String value) {
            addCriterion("course_type >=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThan(String value) {
            addCriterion("course_type <", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLessThanOrEqualTo(String value) {
            addCriterion("course_type <=", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeLike(String value) {
            addCriterion("course_type like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotLike(String value) {
            addCriterion("course_type not like", value, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeIn(List<String> values) {
            addCriterion("course_type in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotIn(List<String> values) {
            addCriterion("course_type not in", values, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeBetween(String value1, String value2) {
            addCriterion("course_type between", value1, value2, "courseType");
            return (Criteria) this;
        }

        public Criteria andCourseTypeNotBetween(String value1, String value2) {
            addCriterion("course_type not between", value1, value2, "courseType");
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