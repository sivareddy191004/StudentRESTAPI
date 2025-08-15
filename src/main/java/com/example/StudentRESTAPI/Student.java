package com.example.StudentRESTAPI;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Student_Info")
public class Student { 

    @Id
    private int st_id;
    private String st_name;
    private String st_branch;

    public Student() {
    }

    public int getSt_id() {
        return st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public String getSt_name() {
        return st_name;
    }

    public void setSt_name(String st_name) {
        this.st_name = st_name;
    }

    public String getSt_branch() {
        return st_branch;
    }

    public void setSt_branch(String st_branch) {
        this.st_branch = st_branch;
    }

    public Student(int st_id, String st_name, String st_branch) {
        this.st_id = st_id;
        this.st_name = st_name;
        this.st_branch = st_branch;
    }

    @Override
    public String toString() {
        return "StudentController [st_id=" + st_id + ", st_name=" + st_name + ", st_branch=" + st_branch + "]";
    }

    
}
