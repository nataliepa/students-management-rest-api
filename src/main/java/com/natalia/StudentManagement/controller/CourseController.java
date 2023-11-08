package com.natalia.StudentManagement.controller;

import com.natalia.StudentManagement.entity.Course;
import com.natalia.StudentManagement.entity.Student;
import com.natalia.StudentManagement.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/courses")
public class CourseController {

    private CourseService courseService;

    @PostMapping
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course saveCourse = courseService.createCourse(course);

        return new ResponseEntity<>(saveCourse, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Course> getCourseById(@PathVariable("id") Long courseId) {
        Course course = courseService.getCourseById(courseId);

        return new ResponseEntity<>(course, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCourse(@PathVariable("id") Long courseId) {
        courseService.deleteCourse(courseId);

        return new ResponseEntity<>("Course successfully deleted", HttpStatus.OK);
    }

    // http://localhost:8080/api/courses
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();

        return new ResponseEntity<>(courses, HttpStatus.OK);
    }

    // http://localhost:8080/api/courses/id
    @PutMapping("{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable("id") Long courseId, @RequestBody Course course) {
        course.setId(courseId);
        Course updateCourse = courseService.updateCourse(course);

        return new ResponseEntity<>(updateCourse, HttpStatus.OK);
    }
}
