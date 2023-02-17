package com.example.mongoexample.mapper;

import com.example.mongoexample.models.dto.student.StudentGetDTO;
import com.example.mongoexample.models.dto.student.StudentPostDTO;
import com.example.mongoexample.models.dto.student.StudentPutDTO;
import com.example.mongoexample.models.entity.Student;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring")
public interface MapperStudent {
    StudentGetDTO entityToGet(Student student);

    Student postToEntity(StudentPostDTO studentPostDTO);

    Student putToEntity(StudentPutDTO studentPutDTO);
}
