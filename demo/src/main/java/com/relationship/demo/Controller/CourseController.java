package com.relationship.demo.Controller;

import com.relationship.demo.model.Course;
import com.relationship.demo.service.CourseServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseServiceImpl courseServiceImpl;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Course> fidAllCourses(){
        return courseServiceImpl.fidAllCourses();
    }

    @GetMapping
    @RequestMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Course findCourseById(@PathVariable(name = "id") String courseId)
    {
        return courseServiceImpl.findCourseById(courseId);
    }

}
