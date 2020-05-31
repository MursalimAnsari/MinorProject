package com.mursu.model;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Students {

    public Students() {
    }

    public Students(int id, String studentName,String emailId, String password) {

        super();
        this.id=id;
        this.studentName=studentName;
        this.emailId=emailId;
        this.password=password;
    }

    @Id
    private int id;

    public String getStudentName() {
        return studentName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    private String emailId;
    private  String studentName;
    private String password;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
