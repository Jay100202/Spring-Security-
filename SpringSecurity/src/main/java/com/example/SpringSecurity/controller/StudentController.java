package com.example.SpringSecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringSecurity.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {
    
    private List<Student> students = new ArrayList<>(
        List.of(
            new Student(1, "Alice", 90),
            new Student(2, "Bob", 80),
            new Student(3, "Charlie", 70)
        )
    );

    @RequestMapping("/students")
    public List<Student> getStudents() {
       return students; 
    }
    
    @GetMapping("/csrf")
    public CsrfToken getcsrftoken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student) {
        System.out.println(student);
        students.add(student);
        return student;
    }

}
