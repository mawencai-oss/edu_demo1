package com.edu.demo1.mapper;

import com.edu.demo1.domain.VideoList;
import com.edu.demo1.domain.VideoListExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface VideoListMapper {
    int countByExample(VideoListExample example);

    int deleteByExample(VideoListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VideoList record);

    int insertSelective(VideoList record);

    List<VideoList> selectByExample(VideoListExample example);

    VideoList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VideoList record, @Param("example") VideoListExample example);

    int updateByExample(@Param("record") VideoList record, @Param("example") VideoListExample example);

    int updateByPrimaryKeySelective(VideoList record);

    int updateByPrimaryKey(VideoList record);
}