package com.relationship.demo.service;

import com.relationship.demo.model.Course;

import java.util.List;

public interface CourseService {
    List<Course> fidAllCourses();

    Course findCourseById(String courseId);
}
