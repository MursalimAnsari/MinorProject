package com.mursu.service;

import com.mursu.model.Students;
import com.mursu.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Students saveStudent(Students student) {

        return studentRepository.save(student);
    }

    public Students fetchStudentByEmailId(String email) {
        return studentRepository.findByEmailId(email);


    }

    public Students fetchStudentByEmailIdAndPassword(String email, String password) {
        return studentRepository.findByEmailIdAndPassword(email, password);


    }


}
