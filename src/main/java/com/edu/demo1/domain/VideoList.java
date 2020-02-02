package com.edu.demo1.domain;

import java.io.Serializable;

public class VideoList implements Serializable {
    private Integer id;

    private String videosrc;

    private Integer courseid;

    private String info1;

    private String info2;

    private String info3;

    private String info4;

    private String info5;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVideosrc() {
        return videosrc;
    }

    public void setVideosrc(String videosrc) {
        this.videosrc = videosrc == null ? null : videosrc.trim();
    }

    public Integer getCourseid() {
        return courseid;
    }

    public void setCourseid(Integer courseid) {
        this.courseid = courseid;
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

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3 == null ? null : info3.trim();
    }

    public String getInfo4() {
        return info4;
    }

    public void setInfo4(String info4) {
        this.info4 = info4 == null ? null : info4.trim();
    }

    public String getInfo5() {
        return info5;
    }

    public void setInfo5(String info5) {
        this.info5 = info5 == null ? null : info5.trim();
    }
}