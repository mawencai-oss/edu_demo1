package com.edu.demo1.service;

import com.edu.demo1.domain.VideoList;
import com.edu.demo1.domain.VideoListExample;
import com.edu.demo1.mapper.VideoListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoService {

    @Autowired
    private VideoListMapper videoListMapper;
    public Integer findvideolistbyid(String addvideolist, Integer id) {
        VideoList videoList=new VideoList();
        videoList.setCourseid(id);
        videoList.setVideosrc(addvideolist);
        videoListMapper.insert(videoList);
        VideoListExample videoListExample = new VideoListExample();
        videoListExample.createCriteria().andCourseidEqualTo(id);
        return videoListMapper.countByExample(videoListExample);
    }

    public Integer findcount(Integer id) {
        VideoListExample videoListExample = new VideoListExample();
        videoListExample.createCriteria().andCourseidEqualTo(id);
        return videoListMapper.countByExample(videoListExample);
    }

    public List<VideoList> findallvideobyid(Integer courseid) {
        VideoListExample videoListExample = new VideoListExample();
        videoListExample.createCriteria().andCourseidEqualTo(courseid);
        return videoListMapper.selectByExample(videoListExample);
    }

    public int deletevideobyid(Integer id) {
        return videoListMapper.deleteByPrimaryKey(id);
    }

    public int count() {
        return videoListMapper.countByExample(new VideoListExample());
    }

    public List<VideoList> findvideobycourseid(Integer courseid) {
        VideoListExample videoListExample = new VideoListExample();
        videoListExample.createCriteria().andCourseidEqualTo(courseid);
        return videoListMapper.selectByExample(videoListExample);
    }
}
