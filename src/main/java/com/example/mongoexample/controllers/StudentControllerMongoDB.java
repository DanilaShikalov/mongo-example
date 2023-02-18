package com.example.mongoexample.controllers;

import com.example.mongoexample.models.dto.student.StudentGetDTO;
import com.example.mongoexample.models.dto.student.StudentPostDTO;
import com.example.mongoexample.models.dto.student.StudentPutDTO;
import com.example.mongoexample.services.StudentImpl.StudentServiceImplMongoDB;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/mongo/students")
@AllArgsConstructor
public class StudentControllerMongoDB {
    private StudentServiceImplMongoDB studentServiceImplMongoDB;

    @GetMapping("/{id}")
    public ResponseEntity<StudentGetDTO> getStudent(@PathVariable String id) {
        return ResponseEntity.ok().body(studentServiceImplMongoDB.getStudent(id));
    }

    @PutMapping("/save/{id}")
    public ResponseEntity<?> putStudent(@RequestBody StudentPutDTO studentPutDTO, @PathVariable String id) {
        studentServiceImplMongoDB.putStudent(studentPutDTO, id);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable String id) {
        studentServiceImplMongoDB.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/save")
    public ResponseEntity<StudentGetDTO> postStudent(@RequestBody StudentPostDTO studentPostDTO) {
        studentServiceImplMongoDB.postStudent(studentPostDTO);
        return ResponseEntity.ok().build();
    }
}
