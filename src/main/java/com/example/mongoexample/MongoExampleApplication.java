package com.example.mongoexample;

import com.example.mongoexample.repository.StudentRepositoryMongoDB;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.Arrays;

@SpringBootApplication
public class MongoExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoExampleApplication.class, args);
    }

}
