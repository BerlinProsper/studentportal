package com.studentportal.student.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


    @Getter
    @Setter
    @ToString
    @Document(collection = "Student")
    public class Student {
        @Id
        String studentId;
        String studentName;
        String date;
        int rollNo;
        String classId;
        String division;
        String gender;

    }

