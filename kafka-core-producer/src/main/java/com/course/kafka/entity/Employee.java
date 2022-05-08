package com.course.kafka.entity;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import java.time.LocalDate;
@JsonNaming(value= PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Employee {
    private String employeeId;
    private String name;
    private LocalDate birthDate;

    public String getEmployeeId() {
        return employeeId;
    }

    public Employee(String employeeId, String name, LocalDate birthDate) {
        this.employeeId = employeeId;
        this.name = name;
        this.birthDate = birthDate;
    }
    public Employee() {
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


}