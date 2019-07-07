package com.micro.course.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.micro.course.dto.CourseDTO;
import com.micro.course.service.ICourseService;
import com.micro.user.dto.UserDTO;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Controller
@RequestMapping("/course")
public class CourseController {

    @Reference
    private ICourseService courseService;

    private static Logger logger = LoggerFactory.getLogger(CourseController.class);

    @RequestMapping(value = "/courseList", method = RequestMethod.GET)
    @ResponseBody
    public List<CourseDTO> courseList(HttpServletRequest request) {

        UserDTO user = (UserDTO)request.getAttribute("user");
        logger.info("user:{}",user);
        System.out.println(user.toString());

        return courseService.courseList();
    }
}
