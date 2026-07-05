package com.example.jpa.runner;

import com.example.jpa.model.Employee;
import com.example.jpa.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository repository;

    public DataLoader(EmployeeRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        repository.save(new Employee("Sherlyne",50000));

        repository.save(new Employee("John",60000));

        System.out.println("Employee Details");

        repository.findAll().forEach(System.out::println);
    }
}