package com.micro.user.service;

import com.micro.user.dto.UserDTO;

public interface IUserService {

    UserDTO getUserById(int id);

    UserDTO getTeacherById(int id);

    UserDTO getUserByName(String username);

    void regiserUser(UserDTO userInfo);
}
