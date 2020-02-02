package com.edu.demo1.controller;

import com.edu.demo1.common.AjaxResult;
import com.edu.demo1.domain.CourseType;
import com.edu.demo1.service.CourseService;
import com.edu.demo1.service.VideoService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping("admin")
@Controller
public class AdminController {
    @Autowired
    private CourseService courseService;
    @GetMapping("/index")
    @RequiresRoles("admin")
    public String index(){
        return "admin/后台";
    }
    @GetMapping("/login")
    public String login(){
        return "admin/login";
    }
    @GetMapping("/coursemanage")
    public String coursemanage(){
        return "admin/课程管理";
    }
    @GetMapping("/addcourse")
    public String addcourse(){
        return "admin/添加课程";
    }
    @PostMapping("/addcoursetype")
    @ResponseBody
    public AjaxResult addcoursetype(CourseType courseType){
        int i=courseService.addcoursetype(courseType);
        if(i>0)
        return AjaxResult.success("添加成功");
        return AjaxResult.success("添加失败");
    }
    @GetMapping("/coursetypeall")
    @ResponseBody
    public AjaxResult coursetypeall(){
        List list=courseService.coursetypeall();
        return AjaxResult.successData(0,list);
    }
    @GetMapping("/test")
    public String uu(){
        return "edit";
    }
    @GetMapping("/deletetypebyid")
    @ResponseBody
    public AjaxResult deletetypebyid(Integer id){
        int i=courseService.deletetypebyid(id);
        if(i>0)
        return AjaxResult.success();
        return AjaxResult.error();
    }

}
