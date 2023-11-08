package com.natalia.StudentManagement.service;

import com.natalia.StudentManagement.entity.Course;
import com.natalia.StudentManagement.entity.CourseRegistration;
import com.natalia.StudentManagement.entity.Student;

public interface CourseRegistrationService {

    CourseRegistration addCourseRegistration(CourseRegistration courseRegistration);
}