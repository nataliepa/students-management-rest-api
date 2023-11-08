package com.natalia.StudentManagement.repository;


import com.natalia.StudentManagement.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}
