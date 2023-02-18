package com.example.mongoexample.services.StudentImpl;

import com.example.mongoexample.exception.StudentNotFoundException;
import com.example.mongoexample.mapper.MapperStudent;
import com.example.mongoexample.models.document.StudentMongo;
import com.example.mongoexample.models.dto.student.StudentGetDTO;
import com.example.mongoexample.models.dto.student.StudentPostDTO;
import com.example.mongoexample.models.dto.student.StudentPutDTO;
import com.example.mongoexample.repository.StudentRepositoryMongoDB;
import com.example.mongoexample.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentServiceImplMongoDB {
    private StudentRepositoryMongoDB studentRepositoryMongoDB;
    private MapperStudent mapperStudent;
    public StudentGetDTO getStudent(String id) {
        StudentMongo student = studentRepositoryMongoDB.findById(id).orElseThrow(StudentNotFoundException::new);
        return mapperStudent.documentToGet(student);
    }

    public void postStudent(StudentPostDTO studentPostDTO) {
        studentRepositoryMongoDB.save(mapperStudent.postToDocument(studentPostDTO));
    }

    public void deleteStudent(String id) {
        studentRepositoryMongoDB.deleteById(id);
    }

    public void putStudent(StudentPutDTO studentPutDTO, String id) {
        StudentMongo student = mapperStudent.putToDocument(studentPutDTO);
        student.setId(id);
        studentRepositoryMongoDB.save(student);
    }
}
