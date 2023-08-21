package com.atwaha.h2demo.controller;

import com.atwaha.h2demo.mdoel.Student;
import com.atwaha.h2demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    Student createStudent(@RequestBody Student newStudent) {
        return studentService.createStudent(newStudent);
    }

    @GetMapping
    List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
}
