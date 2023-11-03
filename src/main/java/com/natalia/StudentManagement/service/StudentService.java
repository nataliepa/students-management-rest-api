package com.natalia.StudentManagement.service;

import com.natalia.StudentManagement.entity.Student;

import java.util.List;

public interface StudentService {

    Student createStudent(Student student);
    Student updateStudent(Student student);
    Student getStudentById(Long studentId);
    List<Student> getAllStudents();
    void deleteStudent(Long studentId);

}
