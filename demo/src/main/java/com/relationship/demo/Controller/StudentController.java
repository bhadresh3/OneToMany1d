package com.relationship.demo.Controller;

import com.relationship.demo.model.Student;
import com.relationship.demo.service.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentServiceImpl studentServiceImpl;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Student> findAllStudent()
    {
        return studentServiceImpl.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student saveStudent(@RequestBody Student student)
    {
        return studentServiceImpl.saveStudent(student);
    }


    @ResponseStatus(HttpStatus.CREATED)
    @RequestMapping("/{id}/add")
    @PostMapping
    public Student addCourse(@PathVariable(value = "id") String studentId,
                          @RequestParam(value = "courseID") String courseId)
    {
        return studentServiceImpl.addCourse(studentId,courseId);
    }

    @ResponseStatus(HttpStatus.OK)
    @RequestMapping("/{id}")
    @GetMapping
    public Student findStudentById(@PathVariable(name = "id") String studentId)
    {
        return studentServiceImpl.findByStudentId(studentId);
    }

}
