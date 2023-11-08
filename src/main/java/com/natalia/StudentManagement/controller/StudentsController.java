package com.natalia.StudentManagement.controller;

import com.natalia.StudentManagement.entity.Student;
import com.natalia.StudentManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentsController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);

        return student;
    }
}
