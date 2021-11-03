package com.springbootcrud1.springbootbackend.repository;

import com.springbootcrud1.springbootbackend.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends CrudRepository<Student,Integer> {
    Student getBySno(Integer sno);
}
