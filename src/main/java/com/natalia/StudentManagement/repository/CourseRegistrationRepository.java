package com.natalia.StudentManagement.repository;

import com.natalia.StudentManagement.entity.CourseRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistrationRepository extends JpaRepository<CourseRegistration, Long> {
}
