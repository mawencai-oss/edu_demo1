package com.edu.demo1.shiro;

import com.edu.demo1.domain.User;
import com.edu.demo1.domain.UserExample;
import com.edu.demo1.mapper.UserMapper;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.util.SimpleByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MyShiroRealm extends AuthorizingRealm {
    @Autowired
    private UserMapper userMapper;
    //系统授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String usernmae=(String)principals.getPrimaryPrincipal();
        List<String> roles=userMapper.findRolesByName(usernmae);
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRoles(roles);
        return simpleAuthorizationInfo;
    }
    //用户认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String primaryPrincipal =(String) token.getPrincipal();
        //根据用户信息查询数据库获取后端的用户身份，转交给securityManager判定
        User user = userMapper.findUser(primaryPrincipal);
        if(user!=null){
            SimpleAuthenticationInfo simpleAuthenticationInfo=new SimpleAuthenticationInfo(user.getEmailAddr(),user.getPassword(),ByteSource.Util.bytes("salt"),getName());
            return simpleAuthenticationInfo;
        }
        return null;
    }
}
