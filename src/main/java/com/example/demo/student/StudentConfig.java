package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
             Student jane = new Student(
                    "Jane",
                    "jane@test.com",
                    LocalDate.of(2000, 1, 5),
                    21
                    );
            Student john = new Student(
                    "John",
                    "john@test.com",
                    LocalDate.of(2010, 10, 13),
                    11
            );

            repository.saveAll(
                    List.of(jane, john)
            );
        };
    }
}
