package com.edu.demo1.domain;

import java.io.Serializable;
import java.util.Date;

public class Course implements Serializable {
    private Integer id;

    private String courseName;

    private String courseImg;

    private String courseList;

    private Date courseTimer;

    private String coursePermission;

    private String courseMan;

    private String courseType;

    private String info1;

    private String info2;

    private String info4;

    private static final long serialVersionUID = 1L;

    public Course(Integer id, String courseName, String courseImg, String courseList, Date courseTimer, String coursePermission, String courseMan, String courseType, String info1, String info2, String info4) {
        this.id = id;
        this.courseName = courseName;
        this.courseImg = courseImg;
        this.courseList = courseList;
        this.courseTimer = courseTimer;
        this.coursePermission = coursePermission;
        this.courseMan = courseMan;
        this.courseType = courseType;
        this.info1 = info1;
        this.info2 = info2;
        this.info4 = info4;
    }

    public Course() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg == null ? null : courseImg.trim();
    }

    public String getCourseList() {
        return courseList;
    }

    public void setCourseList(String courseList) {
        this.courseList = courseList == null ? null : courseList.trim();
    }

    public Date getCourseTimer() {
        return courseTimer;
    }

    public void setCourseTimer(Date courseTimer) {
        this.courseTimer = courseTimer;
    }

    public String getCoursePermission() {
        return coursePermission;
    }

    public void setCoursePermission(String coursePermission) {
        this.coursePermission = coursePermission == null ? null : coursePermission.trim();
    }

    public String getCourseMan() {
        return courseMan;
    }

    public void setCourseMan(String courseMan) {
        this.courseMan = courseMan == null ? null : courseMan.trim();
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType == null ? null : courseType.trim();
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1 == null ? null : info1.trim();
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2 == null ? null : info2.trim();
    }

    public String getInfo4() {
        return info4;
    }

    public void setInfo4(String info4) {
        this.info4 = info4 == null ? null : info4.trim();
    }
}