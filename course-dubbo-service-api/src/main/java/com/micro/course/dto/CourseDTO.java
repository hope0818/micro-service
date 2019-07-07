package com.micro.course.dto;

import com.micro.user.dto.TeacherDTO;
import com.micro.user.dto.UserDTO;

import java.io.Serializable;

public class CourseDTO implements Serializable {

    private int id;
    private String title;
    private String description;
    private UserDTO teacher;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDTO getTeacher() {
        return teacher;
    }

    public void setTeacher(UserDTO teacher) {
        this.teacher = teacher;
    }
}
