package com.relationship.demo.repo;

import com.relationship.demo.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends CrudRepository<Course, Integer> {
}
