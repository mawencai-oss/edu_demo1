package com.edu.demo1.service;

import com.edu.demo1.domain.User;
import com.edu.demo1.domain.UserExample;
import com.edu.demo1.mapper.UserMapper;
import com.edu.demo1.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public int register(User user) {
        user.setPassword(MD5Util.encode(user.getPassword()));
        return  userMapper.insert(user);
    }

    public User finduserbyname(String name) {
        return userMapper.findUser(name);
    }

    public List finduserbyname2(String nickname) {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andNicknameEqualTo(nickname);
        return userMapper.selectByExample(userExample);
    }
}
