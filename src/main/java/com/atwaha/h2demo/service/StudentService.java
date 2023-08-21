package com.atwaha.h2demo.service;

import com.atwaha.h2demo.mdoel.Student;
import com.atwaha.h2demo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public Student createStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
