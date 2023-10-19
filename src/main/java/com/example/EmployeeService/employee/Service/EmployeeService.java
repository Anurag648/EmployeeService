package com.example.EmployeeService.employee.Service;

import com.example.EmployeeService.employee.domain.EmployeeData;

import java.util.HashMap;
import java.util.Map;

public interface EmployeeService {

    public EmployeeData addEmployee(EmployeeData data);
    public Map<String,Object> getEmployeeData(long id);
}
