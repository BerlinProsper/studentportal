package com.studentportal.student.service;

import com.studentportal.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface StudentService {
    public String addStudent(Student student) throws exception.InvalidDetailsException;
    public List<Student> getStudents();
}
