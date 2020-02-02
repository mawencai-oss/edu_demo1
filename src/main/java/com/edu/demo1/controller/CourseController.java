package com.edu.demo1.controller;

import com.edu.demo1.common.AjaxResult;
import com.edu.demo1.domain.Course;
import com.edu.demo1.domain.RollImg;
import com.edu.demo1.domain.VideoList;
import com.edu.demo1.service.CourseService;
import com.edu.demo1.service.VideoService;
import com.edu.demo1.utils.UploadUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @Autowired
    private UploadUtils uploadUtils;
    @Autowired
    private VideoService videoService;
    @RequestMapping(value = "/addCourse",method = RequestMethod.POST)
    public AjaxResult addCourse(Course course){
        int i=0;
        if(course.getId()==null)
            i=courseService.addCourse(course);
        else
            i=courseService.editcourse(course);
        if(i>0){
          return   AjaxResult.success();
        }
        return AjaxResult.error();
    }
//    "code":0,"msg":"","count":1000,"data"
    @GetMapping("/getCourseList")
    public AjaxResult getCourseList(@RequestParam(value = "page",defaultValue = "1",required = false) Integer page,@RequestParam(value = "limit",defaultValue = "10",required = false) Integer limit){
        PageHelper.startPage(page,10);
        List<Course> courseList=courseService.getCourseList();
        PageInfo pageInfo=new PageInfo(courseList);
        return AjaxResult.successLayui(0,"返回数据",pageInfo.getTotal(),courseList);
    }
    @PostMapping("/UploadImg")
    public AjaxResult UploadImg( MultipartFile file){
        String upload = uploadUtils.upload(file);
        return AjaxResult.successData(1,upload);
    }
    @GetMapping("/deleteCourseByid")
    public AjaxResult deleteCourseByid(Integer id){
        int i=courseService.deleteCourseByid(id);
        if(i>0)
            return AjaxResult.success();
        return AjaxResult.error();
    }
    @GetMapping("/batchdeletebyid")
    public AjaxResult batchdeletebyid(Integer[] id){
        try {
            int i=courseService.batchdeletebyid(id);
            if(i>0)
                return AjaxResult.success();
        }catch (Exception e){
            return AjaxResult.error();
        }
        return AjaxResult.error();
    }
    @GetMapping("/editcourse")
    public ModelAndView editcourse(Integer id, ModelAndView modelAndView){
        modelAndView.setViewName("admin/edit");
        modelAndView.addObject("id",id);
        return  modelAndView;
    }
    @GetMapping("/findcoursebyid")
    public AjaxResult findcoursebyid(Integer id){
        Course editcourse = courseService.editcourse(id);
        if(editcourse!=null)
            return AjaxResult.successData(1,editcourse);

        return AjaxResult.error();
    }
    @GetMapping("/addimgofroll")
    public AjaxResult addimgofroll(String imgsrc){
        int  i= courseService.addimgofroll(imgsrc);
        if(i>0)
        return AjaxResult.success();
        return AjaxResult.error();
    }
    @GetMapping("/findallrollimg")
    public AjaxResult findallrollimg(){
        List<RollImg> rollImgs = courseService.findallrollimg();
        return AjaxResult.successData(0,rollImgs);
    }
    @GetMapping("/delrollimg")
    public AjaxResult delrollimg(Integer id){
        int i=courseService.delrollimg(id);
        if(i>0)
        return AjaxResult.success();
        return AjaxResult.error();
    }
    @GetMapping("/findcoursebytype")
    public AjaxResult findcoursebytype(String type){
        List<Course> courseList=courseService.findcoursebytype(type);
        return AjaxResult.successData(0,courseList);
    }
    @GetMapping("/findhotcourse")
    public AjaxResult findhotcourse(){
        List<Course> courseList=courseService.findhotcourse();
        return AjaxResult.successData(0,courseList);
    }
    /*上传视频*/
    @GetMapping("/addvideolist")
    public Integer addvideolist(Integer id,String videosrc){
        return videoService.findvideolistbyid(videosrc,id);
    }

    /*获取课节*/
    @GetMapping("/findcount")
    public Integer findcount(Integer id){
        return videoService.findcount(id);
    }
    /*查询课程*/
    @GetMapping("/findallvideobyid")
    public AjaxResult findallvideobyid(Integer courseid,Integer page){
        PageHelper.startPage(page,10);
        List<VideoList> videoLists=videoService.findallvideobyid(courseid);
        PageInfo pageInfo=new PageInfo(videoLists);
        int count=videoService.count();
        return AjaxResult.successLayui(0,"",count,videoLists);
    }
    @GetMapping("/deletevideobyid")
    public AjaxResult deletevideobyid(Integer id){
        int i=videoService.deletevideobyid(id);
        if(i>0)
            return AjaxResult.success();
        return AjaxResult.error();
    }
    @GetMapping("/findallcourse")
    public AjaxResult ajaxResult(Integer page){
        PageHelper.startPage(page,6);
        List<Course> list=courseService.findallcourse();
        PageInfo pageInfo=new PageInfo(list);
        return AjaxResult.successData(0,pageInfo);
    }
    /*根据课程id查找视频*/
    @GetMapping("/findvideobycourseid")
    public AjaxResult findvideobycourseid (Integer courseid){
        List<VideoList> videoLists=videoService.findvideobycourseid(courseid);
        return AjaxResult.successData(0,videoLists);
    }


}
