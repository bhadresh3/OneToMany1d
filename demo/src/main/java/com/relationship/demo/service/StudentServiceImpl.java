package com.relationship.demo.service;

import com.relationship.demo.model.Course;
import com.relationship.demo.model.Student;
import com.relationship.demo.repo.CourseRepo;
import com.relationship.demo.repo.StudentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepo studentRepo;
    private final CourseRepo courseRepo;

    public Student findByStudentId(String studentId) {
        return studentRepo.findById(Integer.parseInt(studentId)).get();
    }

    public List<Student> findAll() {
        return (List<Student>) studentRepo.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Student addCourse(String studentId, String courseId) {
        Optional<Student> studentOp = studentRepo.findById(Integer.parseInt(studentId));
        if(studentOp.isPresent()){
            Student student = studentOp.get();
            List<Course> courseList = student.getCourses();
            Optional<Course> courseOp = courseRepo.findById(Integer.parseInt((courseId)));
            Course course = courseOp.get();
            courseList.add(course);
            student.setCourses(courseList);
            return studentRepo.save(student);
        }
        return null;
    }
}
