package com.edu.demo1.mapper;

import com.edu.demo1.domain.Course;
import com.edu.demo1.domain.CourseExample;
import java.util.List;

import com.edu.demo1.domain.RollImg;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CourseMapper {
    long countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
    @Insert(value = "insert into roll_img value(null,#{imgsrc})")
    int addimgofroll(String imgsrc);
    @Select(value = "select * from roll_img ")
    List<RollImg> findallrollimg();
    @Delete(value = "delete  from roll_img where id=#{id}")
    int delrollimg(Integer id);
    List<Course> findhotcourse();
}