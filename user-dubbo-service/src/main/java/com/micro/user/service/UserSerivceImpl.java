package com.micro.user.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.micro.user.dto.UserDTO;
import com.micro.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class UserSerivceImpl implements IUserService {


    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUserById(int id)  {

        return userMapper.getUserById(id);
    }

    @Override
    public UserDTO getTeacherById(int id)  {
        return userMapper.getTeacherById(id);
    }

    @Override
    public UserDTO getUserByName(String username)  {
        return userMapper.getUserByName(username);
    }

    @Override
    public void regiserUser(UserDTO userInfo) {
        userMapper.registerUser(userInfo);
    }
}
