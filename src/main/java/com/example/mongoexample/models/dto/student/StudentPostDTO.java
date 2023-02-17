package com.example.mongoexample.models.dto.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentPostDTO {
    private String name;
    private String surname;
    private Long phone;
    private LocalDate date;
}
