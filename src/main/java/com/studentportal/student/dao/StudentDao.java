package com.studentportal.student.dao;

import com.studentportal.student.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentDao {
    public String saveStudent(Student student);
    public List<Student> getStudents();
}
