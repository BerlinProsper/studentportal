package com.studentportal.student.controller;
import com.studentportal.student.entity.Student;


import com.studentportal.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin( origins = "http://localhost:3000/")

@RestController
public  class StudentController {
    @Autowired
    private StudentService service;

    @PostMapping("student/")
    public List<Student> addStudent(@RequestBody Student student) throws exception.InvalidDetailsException {
        System.out.println("Post method invoked........"+student.getStudentName());
        service.addStudent(student);
        return service.getStudents();
    }

    @GetMapping("students/")
    public List<Student> getStudentsDetails() {
        System.out.println("Get all students.......");
        return service.getStudents();
    }
}
