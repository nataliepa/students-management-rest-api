package com.natalia.StudentManagement.service;

import com.natalia.StudentManagement.entity.Course;

import java.util.List;

public interface CourseService {

    Course createCourse(Course course);
    Course updateCourse(Course course);
    Course getCourseById(Long courseId);
    List<Course> getAllCourses();
    void deleteCourse(Course course);
}
