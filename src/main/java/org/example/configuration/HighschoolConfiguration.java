package org.example.configuration;

import org.example.components.StudentReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
public class HighschoolConfiguration {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

    @Bean
    public StudentReader studentReader(Scanner scanner) {
        return new StudentReader(scanner);
    }

}