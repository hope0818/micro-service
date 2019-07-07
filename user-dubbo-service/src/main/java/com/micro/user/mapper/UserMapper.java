package com.micro.user.mapper;

import com.micro.user.dto.UserDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select id,username, password, real_name as realName," +
            "mobile, email from pe_user where id=#{id}")
    UserDTO getUserById(@Param("id")int id);


    @Select("select id,username, password, real_name as realName," +
            "mobile, email from pe_user where username=#{username}")
    UserDTO getUserByName(@Param("username")String username);


    @Insert("insert into pe_user (username, password, real_name, mobile, email)" +
            "values (#{u.username}, #{u.password}, #{u.realName}, #{u.mobile}, #{u.email})")
    void registerUser(@Param("u") UserDTO userInfo);


    @Select("select u.id,u.username,u.password,u.real_name as realName," +
            "u.mobile,u.email,t.intro,t.stars from pe_user u," +
            "pe_teacher t where u.id=#{id} " +
            "and u.id=t.user_id")
    UserDTO getTeacherById(@Param("id")int id);
}
