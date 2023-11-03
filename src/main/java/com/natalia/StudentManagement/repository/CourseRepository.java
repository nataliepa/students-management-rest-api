package com.natalia.StudentManagement.repository;

import com.natalia.StudentManagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
