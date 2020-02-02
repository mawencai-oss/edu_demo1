package com.edu.demo1.service;

import com.edu.demo1.domain.*;
import com.edu.demo1.mapper.CourseMapper;
import com.edu.demo1.mapper.CourseTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Service

public class CourseService {
    @Autowired
    private CourseMapper courseMapper;
    @Autowired
    private CourseTypeMapper courseTypeMapper;
    public int addcoursetype(CourseType courseType) {
        return courseTypeMapper.insert(courseType);
    }

    public List coursetypeall() {
        return courseTypeMapper.selectByExample(new CourseTypeExample());
    }

    public int addCourse(Course course) {
        return courseMapper.insert(course);
    }

    public List<Course> getCourseList() {
        return courseMapper.selectByExample(new CourseExample());
    }

    public int deleteCourseByid(Integer id) {
        return courseMapper.deleteByPrimaryKey(id);
    }

    public int batchdeletebyid(Integer[] arrid) {
        CourseExample courseExample=new CourseExample();
        courseExample.createCriteria().andIdIn(Arrays.asList(arrid));
        return courseMapper.deleteByExample(courseExample);
    }

    public Course editcourse(Integer id) {
      return   courseMapper.selectByPrimaryKey(id);
    }

    public int editcourse(Course course) {
        CourseExample courseExample=new CourseExample();
        courseExample.createCriteria().andIdEqualTo(course.getId());
        return courseMapper.updateByExampleSelective(course,courseExample);
    }

    public int addimgofroll(String imgsrc) {
        return courseMapper.addimgofroll(imgsrc);
    }

    public List<RollImg> findallrollimg() {
        return courseMapper.findallrollimg();
    }
    @Transactional
    public int delrollimg(Integer id) {
        return courseMapper.delrollimg(id);
    }

    public int deletetypebyid(Integer id) {
        return courseTypeMapper.deleteByPrimaryKey(id);
    }

    public List<Course> findcoursebytype(String type) {
        CourseExample courseExample=new CourseExample();
        courseExample.createCriteria().andCourseTypeEqualTo(type);
        List<Course> courseList = courseMapper.selectByExample(courseExample);
        return courseList;
    }

    public List<Course> findhotcourse() {
        List<Course> courseList = courseMapper.findhotcourse();
        return courseList;
    }

    public List<Course> findallcourse() {
        return courseMapper.selectByExample(new CourseExample());
    }
}
