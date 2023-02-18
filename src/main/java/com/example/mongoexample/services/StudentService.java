package com.example.mongoexample.services;

import com.example.mongoexample.models.dto.student.StudentGetDTO;
import com.example.mongoexample.models.dto.student.StudentPostDTO;
import com.example.mongoexample.models.dto.student.StudentPutDTO;

public interface StudentService {

    StudentGetDTO getStudent(Long id);

    void postStudent(StudentPostDTO studentPostDTO);

    void deleteStudent(Long id);

    void putStudent(StudentPutDTO studentPutDTO, Long id);
}
