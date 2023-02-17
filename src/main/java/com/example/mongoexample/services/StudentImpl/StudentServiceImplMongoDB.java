package com.example.mongoexample.services.StudentImpl;

import com.example.mongoexample.models.dto.student.StudentGetDTO;
import com.example.mongoexample.models.dto.student.StudentPostDTO;
import com.example.mongoexample.models.dto.student.StudentPutDTO;
import com.example.mongoexample.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImplMongoDB implements StudentService {
    @Override
    public StudentGetDTO getStudent(Long id) {
        return null;
    }

    @Override
    public void postStudent(StudentPostDTO studentPostDTO) {

    }

    @Override
    public void deleteStudent(Long id) {

    }

    @Override
    public void putStudent(StudentPutDTO studentPutDTO) {

    }
}
