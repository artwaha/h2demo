package com.atwaha.h2demo.mdoel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String registrationNumber;
}
