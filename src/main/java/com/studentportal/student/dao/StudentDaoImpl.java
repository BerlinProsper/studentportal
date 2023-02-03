package com.studentportal.student.dao;

import com.studentportal.student.entity.Student;
import com.studentportal.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository repository;

    @Override
    public String saveStudent(Student student){
        repository.save(student);
        return student.getStudentId();
    }

    @Override
    public List<Student> getStudents() {
        return repository.findAll();
    }
}
