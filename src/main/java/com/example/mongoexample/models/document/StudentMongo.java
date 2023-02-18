package com.example.mongoexample.models.document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentMongo {
    @Id
    private String id;
    private String name;
    private String surname;
    private Long phone;
    private LocalDate date;
}
