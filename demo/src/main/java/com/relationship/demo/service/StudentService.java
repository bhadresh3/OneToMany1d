package com.relationship.demo.service;

import com.relationship.demo.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Student saveStudent(Student student);

    Student addCourse(String studentId, String courseId);

    Student findByStudentId(String studentId);
}
