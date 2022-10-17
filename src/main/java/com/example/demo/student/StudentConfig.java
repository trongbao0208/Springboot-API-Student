package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student trong = new Student(
                    "Trong",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    "tbao0208@gmail.com"
            );

            Student alex = new Student(
                    "Alex",
                    LocalDate.of(1996, Month.JANUARY, 5),
                    "giangthn@gmail.com"
            );

            repository.saveAll(
                    List.of(trong, alex)
            );
        };
    }
}
