package com.relationship.demo.service;

import com.relationship.demo.model.Course;
import com.relationship.demo.repo.CourseRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
    private final CourseRepo courseRepo;

    public List<Course> fidAllCourses() {
        System.out.println("I am called");

         return (List<Course>) courseRepo.findAll();

    }

    @Override
    public Course findCourseById(String courseId) {
        return courseRepo.findById(Integer.parseInt(courseId)).get();
    }
}
