package com.edu.demo1.domain;

import java.io.Serializable;

public class CourseType implements Serializable {
    private Integer id;

    private String typeName;

    private String typeMiaoshu;

    private String info1;

    private String info2;

    private static final long serialVersionUID = 1L;

    public CourseType(Integer id, String typeName, String typeMiaoshu, String info1, String info2) {
        this.id = id;
        this.typeName = typeName;
        this.typeMiaoshu = typeMiaoshu;
        this.info1 = info1;
        this.info2 = info2;
    }

    public CourseType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeMiaoshu() {
        return typeMiaoshu;
    }

    public void setTypeMiaoshu(String typeMiaoshu) {
        this.typeMiaoshu = typeMiaoshu == null ? null : typeMiaoshu.trim();
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
}