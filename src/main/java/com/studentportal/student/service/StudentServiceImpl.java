package com.studentportal.student.service;

import com.studentportal.student.dao.StudentDao;
import com.studentportal.student.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {


    @Autowired
    private StudentDao dao;


    @Override
    public String addStudent(Student student) throws exception.InvalidDetailsException {
        if (student == null || student.getStudentName() == null) {
            throw new exception.InvalidDetailsException("Student name is mandatory");
        } else {

            student.setStudentId(generateStudentId());
            System.out.println("student " + student.getStudentName() + " " + student.getStudentId() + " " + student.getDate() +
                    " " + student.getRollNo() + " " + student.getClassId() + " " + student.getDivision() + " " + student.getGender());
            System.out.println("[StudentService] " + student.getStudentId());
            return dao.saveStudent(student);
        }
    }


    private String generateStudentId() {
        String id;
        List<Student> students = dao.getStudents();
        if (students.isEmpty()) {
            id = "R-001";
        } else {
            Student lastStudent = students.get(students.size() - 1);
            String[] lastStudentId = lastStudent.getStudentId().split("-");
            int newStudentId = Integer.parseInt(lastStudentId[1]) + 1;
            id = "R-00" + newStudentId;

        }
        //get all students from repository
        //split string by - , this will be a string array
        //get 1 index of string array
        // increament by one
        //set string as R - and the generated number
        //return the string
        return id;


    }

    @Override
    public List<Student> getStudents() {

        return dao.getStudents();

    }

}
