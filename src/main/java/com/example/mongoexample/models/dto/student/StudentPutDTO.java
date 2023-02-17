package com.example.mongoexample.models.dto.student;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class StudentPutDTO {
    private String name;
    private String surname;
    private Long phone;
    private LocalDate date;
}
