package com.example.mongoexample.repository;

import com.example.mongoexample.models.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryPostgreSQL extends JpaRepository<Student, Long> {
}
