package com.example.EmployeeService.employee.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="employee_data")
@Data
public class EmployeeData {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String userId;
    private String designation;
    private Long salary;
    private boolean isActive = true;
}
