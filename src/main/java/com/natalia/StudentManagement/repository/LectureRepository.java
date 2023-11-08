package com.natalia.StudentManagement.repository;

import com.natalia.StudentManagement.entity.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
}
