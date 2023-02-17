package com.example.mongoexample.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException() {
        super("Student not found");
    }
}
