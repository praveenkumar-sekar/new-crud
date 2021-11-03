package com.springbootcrud1.springbootbackend.controller;

import com.springbootcrud1.springbootbackend.Service.StudentService;
import com.springbootcrud1.springbootbackend.entity.Student;
import com.springbootcrud1.springbootbackend.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/studentDetails")
public class StudentController {
    @Autowired
    private StudentService Students;

    @Autowired
    private Studentrepository studentrepository;

    @PostMapping("/saveStudent")
    public String saveStudent(@RequestBody Student student) {
         Integer id = Students.saveStudent(student);
        return "Student with  '" + id + "' has been saved";

    }

    @GetMapping("/studentList")
    public List<Student> getAllStudentDetails() {
        List<Student> list = Students.getAllStudents();
        return list;
    }

    @GetMapping("/getStudentById{sno}")
    public Student getStudentById(@PathVariable("sno") Integer sno) {

        Student std = Students.getStudentByID(sno);
        return std;
    }

    @PutMapping("/updateStudent/{sno}")
      public String updateStudent(@PathVariable("sno") Integer sno, @RequestBody Student student) {

        String message = Students.update(sno,student);
        return message;
    }

    @DeleteMapping("/deleteStudent/{sno}")
    public String deleteStudent(@PathVariable("sno") Integer sno) {
          String message= Students.deleteStudent(sno);
        return message;
    }
}





