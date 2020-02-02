package com.edu.demo1.controller;

import com.edu.demo1.common.AjaxResult;
import com.edu.demo1.domain.User;
import com.edu.demo1.service.UserService;
import com.edu.demo1.utils.EmailUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private EmailUtil emailUtil;
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/register2")
    @ResponseBody
    public AjaxResult register2(User user) {
        if (userService.finduserbyname2(user.getNickname()).size()>0){
            return AjaxResult.error(1,"用户名已经注册");
        }
        if (userService.register(user) > 0)
            return AjaxResult.success();
        return AjaxResult.error();
    }

    @GetMapping("/forgot")
    public String forgot() {
        return "forgot";
    }

    @GetMapping("/forgot2")
    public String forgot2() {
        return "reset";
    }

    /*校验邮箱验证码*/
    @GetMapping("/getemailcode")
    @ResponseBody
    public AjaxResult getemailcode(String email, String code, HttpSession session) {
        try {
            if (session.getAttribute(email).equals(code)) {
                return AjaxResult.success("");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return AjaxResult.error(100, "验证码已经过期");
        }
        return AjaxResult.error(100, "验证码输入错误");
    }

    /*发送邮箱验证码*/
    @PostMapping("/sendcode")
    @ResponseBody
    public String sendcode(String emailaddr) {
        return emailUtil.sendHTMLMail(emailaddr);
    }

    /*登陆验证*/
    @PostMapping("/login2")
    @ResponseBody
    public AjaxResult login2(String nickname, String password) {
        try {
            Boolean b=false;
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken(nickname, password, true);
            subject.login(usernamePasswordToken);
            if (subject.isAuthenticated()) {
                SecurityUtils.getSubject().getSession().setTimeout(1000*60*60);
            }
        } catch (UnknownAccountException e) {
               e.printStackTrace();
               return AjaxResult.error(1,"用户名不存在");
        }catch (IncorrectCredentialsException e) {
            e.printStackTrace();
            return AjaxResult.error(1, "密码错误");
        }
        return AjaxResult.success();
    }
    @PostMapping("/finduserbyname")
    @ResponseBody
    public AjaxResult finduserbyname(String name) {
        User user=null;
        try {
             user = userService.finduserbyname(name);
            if (user != null)
                return AjaxResult.error(100, "用户已经存在");
        }catch (Exception e){
            return AjaxResult.error(100, "网络异常");
        }
        return AjaxResult.successData(0,user);
    }
    @GetMapping("/getUser")
    @ResponseBody
    public AjaxResult getUser(){
        String username=(String)SecurityUtils.getSubject().getPrincipal();
        User user = userService.finduserbyname(username);
       return AjaxResult.successData(1,user);
    }
    /*推出*/
    @GetMapping("/logout")
    public String logout(){
        SecurityUtils.getSubject().logout();
        return "login";
    }
}
