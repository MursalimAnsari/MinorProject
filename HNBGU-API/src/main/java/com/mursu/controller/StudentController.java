package com.mursu.controller;

import com.mursu.model.Students;
import com.mursu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController

public class StudentController {

    @Autowired
  StudentService studentService;

      @PostMapping("/registerstudent")
      @CrossOrigin(origins = "http://localhost:4200")
      public Students registerStudent(@RequestBody Students student) throws Exception{
         String tempEmailId= student.getEmailId();
         if (tempEmailId!=null && !"".equals(tempEmailId)){
          Students studentObj=  studentService.fetchStudentByEmailId(tempEmailId);

          if (studentObj != null){

              throw new Exception("Student with"+tempEmailId+"is already exists");
          }
         }

          Students studentObj= null;
        studentObj= studentService.saveStudent(student);
         return  studentObj;
     }

     @PostMapping("/login")
     @CrossOrigin(origins = "http://localhost:4200")
    public Students loginStudent( @RequestBody Students student) throws Exception {
         String tempEmailId = student.getEmailId();
         String tempPassword = student.getPassword();
         Students studentObj = null;

         if (tempEmailId != null && tempPassword != null) {

             studentObj = studentService.fetchStudentByEmailIdAndPassword(tempEmailId, tempPassword);

         }
             if (studentObj==null){

                 throw new Exception("bad credentials");
             }

             return studentObj;

     }

}
