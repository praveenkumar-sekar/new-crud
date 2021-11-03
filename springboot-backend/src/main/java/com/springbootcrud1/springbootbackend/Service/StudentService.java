package com.springbootcrud1.springbootbackend.Service;

import com.springbootcrud1.springbootbackend.entity.Student;


import java.util.List;

public interface StudentService {
    public  Integer saveStudent(Student student);

    public List<Student>getAllStudents();
    public Student getStudentByID(Integer sno);

    public String deleteStudent(Integer sno);

    String update(Integer sno, Student student);
}

