package com.atwaha.h2demo.repository;

import com.atwaha.h2demo.mdoel.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
