package com.example.mongoexample.controllers;

import com.example.mongoexample.models.dto.student.StudentGetDTO;
import com.example.mongoexample.models.dto.student.StudentPostDTO;
import com.example.mongoexample.models.dto.student.StudentPutDTO;
import com.example.mongoexample.services.StudentImpl.StudentServiceImplPostgreSQL;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
@AllArgsConstructor
public class StudentController {

    private StudentServiceImplPostgreSQL studentServiceImplPostgreSQL;

    @GetMapping("/{id}")
    public ResponseEntity<StudentGetDTO> getStudent(@PathVariable Long id) {
        return ResponseEntity.ok().body(studentServiceImplPostgreSQL.getStudent(id));
    }

    @PutMapping("/save")
    public ResponseEntity<?> putStudent(@RequestBody StudentPutDTO studentPutDTO) {
        studentServiceImplPostgreSQL.putStudent(studentPutDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
        studentServiceImplPostgreSQL.deleteStudent(id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/save")
    public ResponseEntity<StudentGetDTO> postStudent(@RequestBody StudentPostDTO studentPostDTO) {
        studentServiceImplPostgreSQL.postStudent(studentPostDTO);
        return ResponseEntity.ok().build();
    }
}
