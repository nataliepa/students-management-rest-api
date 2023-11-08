package com.natalia.StudentManagement.serviceImpl;

import com.natalia.StudentManagement.entity.Course;
import com.natalia.StudentManagement.entity.CourseRegistration;
import com.natalia.StudentManagement.entity.Student;
import com.natalia.StudentManagement.repository.CourseRegistrationRepository;
import com.natalia.StudentManagement.repository.CourseRepository;
import com.natalia.StudentManagement.repository.StudentRepository;
import com.natalia.StudentManagement.service.CourseRegistrationService;

public class CourseRegistrationServiceImpl implements CourseRegistrationService {

    private StudentRepository studentRepository;
    private CourseRepository courseRepository;
    private CourseRegistrationRepository courseRegistrationRepository;

    @Override
    public CourseRegistration addCourseRegistration(CourseRegistration courseRegistration) {
        Student tmpStudent = studentRepository.findById(courseRegistration.getStudent().getId()).get();
        Course tmpCourse = courseRepository.findById(courseRegistration.getCourse().getId()).get();

        courseRegistration.setStudent(tmpStudent);
        courseRegistration.setCourse(tmpCourse);

        return courseRegistrationRepository.save(courseRegistration);
    }
}
