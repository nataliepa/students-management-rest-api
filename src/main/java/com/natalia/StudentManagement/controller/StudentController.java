package com.natalia.StudentManagement.controller;

import com.natalia.StudentManagement.entity.Student;
import com.natalia.StudentManagement.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/students")
public class StudentController {

    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
        Student saveStudent = studentService.createStudent(student);

        return new ResponseEntity<>(saveStudent, HttpStatus.CREATED);
    }

    // http://localhost:8080/api/students/1
    @GetMapping("{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId) {
        Student student = studentService.getStudentById(studentId);

        return new ResponseEntity<>(student, HttpStatus.OK);
    }


    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId) {
        studentService.deleteStudent(studentId);

        return new ResponseEntity<>("Student successfully deleted", HttpStatus.OK);
    }

    // http://localhost:8080/api/students
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();

        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    // http://localhost:8080/api/students/1
    @PutMapping("{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long studentId, @RequestBody Student student) {
        student.setId(studentId); // the id of the student we want to update
        Student updateStudent = studentService.updateStudent(student);

        return new ResponseEntity<>(updateStudent, HttpStatus.OK);
    }
}
