package com.edu.demo1.utils;

import com.edu.demo1.domain.MailBean;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Repository;

import javax.mail.internet.MimeMessage;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;
@Repository
public class EmailUtil {
    @Autowired
    private JavaMailSender javaMailSender;
    private static final Logger LOG = LoggerFactory.getLogger(Logger.class);
    //发送html格式的邮件
    @Autowired
    private HttpSession session;
    public String sendHTMLMail(String  emailaddr) {

        String str="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder code=new StringBuilder(6);
        for(int i=0;i<6;i++)
        {
            char ch=str.charAt(new Random().nextInt(str.length()));
            code.append(ch);
        }
        MimeMessage mimeMailMessage = null;
        try {
            mimeMailMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);
            mimeMessageHelper.setFrom("1358616552@qq.com");
            mimeMessageHelper.setTo(emailaddr);
            mimeMessageHelper.setSubject("邮箱验证码");
            StringBuilder sb = new StringBuilder();
            sb.append("<h3>邮箱验证码,<非凡科技提示你，注意不要泄露，3分钟后失效></h4>")
                    .append("<p style='color:#F00;font-size: x-large;color:red'>"+code+"</p>");
            mimeMessageHelper.setText(sb.toString(), true);
            javaMailSender.send(mimeMailMessage);
            session.setAttribute(emailaddr,code.toString());
            session.setMaxInactiveInterval(180);
            return "邮件发送成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "邮件发送失败";
        }
    }
}
