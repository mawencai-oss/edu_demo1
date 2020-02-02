package com.edu.demo1.shiro;

import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 54110 on 2019-07-05.
 */
@Configuration
public class ShiroConfig {

    @Bean
    public ShiroFilterFactoryBean  shiroFilterFactoryBean(@Qualifier("defaultWebSecurityManager") DefaultWebSecurityManager defaultWebSecurityManager){
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
        shiroFilterFactoryBean.setSecurityManager(defaultWebSecurityManager);
        Map<String ,String> map  = new HashMap<>();
//        map.put("/","authc");  //必须登录才可访问
//        map.put("/index","perms[user_edit]");//只有特定权限（“user_edit”）的用户登录后才可访问
//        map.put("/two","perms[user_forbidden]");//只有特定权限（“user_forbidden”）的用户登录后才可访问
//        shiroFilterFactoryBean.setLoginUrl("/login");//设置登录页（匿名）
        shiroFilterFactoryBean.setUnauthorizedUrl("/404");//权限不足的错误提示页
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);//装配拦截策略
        return shiroFilterFactoryBean;
    }
    //    配置安全管理器（注入Realm对象）
    @Bean(name="defaultWebSecurityManager")
    public DefaultWebSecurityManager defaultWebSecurityManager(@Qualifier("myShiroRealm") MyShiroRealm myShiroRealm){
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(myShiroRealm);
        return defaultWebSecurityManager;
    }

    @Bean(name="myShiroRealm")  //使用该注解是的Realm对象由spring容器管理
    public MyShiroRealm  myShiroRealm(){
        MyShiroRealm shiroRealm = new MyShiroRealm();
        return shiroRealm;
    }
    //开启shiro aop注解支持
    @Bean
    public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
        AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();
        authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);
        return authorizationAttributeSourceAdvisor;
    }
}
