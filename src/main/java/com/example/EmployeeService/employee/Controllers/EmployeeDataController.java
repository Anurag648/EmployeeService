package com.example.EmployeeService.employee.Controllers;

import com.example.EmployeeService.employee.Service.EmployeeService;
import com.example.EmployeeService.employee.domain.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class EmployeeDataController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("api/v1/employeeData/add")
    public EmployeeData addEmployeeData(@RequestBody EmployeeData data){
        return employeeService.addEmployee(data);
    }

    @GetMapping("api/v1/employeeData/get")
    public Map<String,Object> getEmployeeData(@RequestParam long id){
        return employeeService.getEmployeeData(id);
    }
}
