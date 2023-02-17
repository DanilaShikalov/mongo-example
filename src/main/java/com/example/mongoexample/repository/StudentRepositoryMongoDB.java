package com.example.mongoexample.repository;

import com.example.mongoexample.models.document.StudentMongo;
import com.example.mongoexample.models.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepositoryMongoDB extends MongoRepository<StudentMongo, Long> {
}
