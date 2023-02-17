package com.example.mongoexample.services.StudentImpl;

import com.example.mongoexample.exception.StudentNotFoundException;
import com.example.mongoexample.mapper.MapperStudent;
import com.example.mongoexample.models.dto.student.StudentGetDTO;
import com.example.mongoexample.models.dto.student.StudentPostDTO;
import com.example.mongoexample.models.dto.student.StudentPutDTO;
import com.example.mongoexample.models.entity.Student;
import com.example.mongoexample.repository.StudentRepositoryPostgreSQL;
import com.example.mongoexample.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentServiceImplPostgreSQL implements StudentService {
    private StudentRepositoryPostgreSQL studentRepositoryPostgreSQL;
    private MapperStudent mapperStudent;

    @Override
    public StudentGetDTO getStudent(Long id) {
        Student student = studentRepositoryPostgreSQL.findById(id).orElseThrow(StudentNotFoundException::new);
        return mapperStudent.entityToGet(student);
    }

    @Override
    public void postStudent(StudentPostDTO studentPostDTO) {
        studentRepositoryPostgreSQL.save(mapperStudent.postToEntity(studentPostDTO));
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepositoryPostgreSQL.deleteById(id);
    }

    @Override
    public void putStudent(StudentPutDTO studentPutDTO) {
        studentRepositoryPostgreSQL.save(mapperStudent.putToEntity(studentPutDTO));
    }
}
