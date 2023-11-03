package com.natalia.StudentManagement.serviceImpl;

import com.natalia.StudentManagement.entity.Student;
import com.natalia.StudentManagement.repository.StudentRepository;
import com.natalia.StudentManagement.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        // tmpStudent = studentRepository.findById(student.getId()).get();
        Student tmpStudent = getStudentById(student.getId());
        tmpStudent.setFirstName(student.getFirstName());
        tmpStudent.setLastName(student.getLastName());
        tmpStudent.setEmail(student.getEmail());

        return studentRepository.save(tmpStudent);
    }

    @Override
    public Student getStudentById(Long studentId) {
        Optional<Student> optionalStudent = studentRepository.findById(studentId);
        return optionalStudent.get();
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }
}
