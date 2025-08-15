package com.example.StudentRESTAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    
    @Autowired
    private StudentRepository StudentRepo;

    @GetMapping("/students")
    public List<Student> getStudent(){
        List<Student> students = StudentRepo.findAll();
        return students;
    }

    @GetMapping("/students/{st_id}")
    public Student getById(@PathVariable int st_id){
        return StudentRepo.findById(st_id).get();
    }

    @PostMapping("/student")
    @ResponseStatus(code = HttpStatus.CREATED)
    public Student addStudent(@RequestBody Student student){
        StudentRepo.save(student);
        return student;
    }

    @PutMapping("/student/update/{st_id}")
    public void updateStudent(@PathVariable int st_id){
        Student student = StudentRepo.findById(st_id).get();
        student.setSt_name("Vadinia");
        StudentRepo.save(student);
    }

    @DeleteMapping("student/delete/{st_id}")
    public void deleteStudent(@PathVariable int st_id){
        Student student = StudentRepo.findById(st_id).get();
        StudentRepo.delete(student);
    }
}
