package com.natalia.StudentManagement.serviceImpl;

import com.natalia.StudentManagement.entity.Course;
import com.natalia.StudentManagement.repository.CourseRepository;
import com.natalia.StudentManagement.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CourseServiceImpl implements CourseService {

    private CourseRepository courseRepository;

    @Override
    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public Course updateCourse(Course course) {
        Course tmpCourse = getCourseById(course.getId());
        tmpCourse.setId(course.getId());
        tmpCourse.setTitle(course.getTitle());
        tmpCourse.setMaterial(course.getMaterial());
        return courseRepository.save(tmpCourse);
    }

    @Override
    public Course getCourseById(Long courseId) {
        Optional<Course> optionalCourse = courseRepository.findById(courseId);
        return optionalCourse.get();
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public void deleteCourse(Course course) {
        courseRepository.delete(course);
    }
}
