package com.example.EmployeeService.employee.ServiceImpl;

import com.example.EmployeeService.employee.External.FeignUserApplicationInterface;
import com.example.EmployeeService.employee.Repositories.EmployeeDataRepository;
import com.example.EmployeeService.employee.Service.EmployeeService;
import com.example.EmployeeService.employee.domain.EmployeeData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Repository
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeDataRepository employeeRepo;
    @Autowired
    FeignUserApplicationInterface feign;

    public EmployeeData addEmployee(EmployeeData data){
        return employeeRepo.save(data);
    }

    public Map<String, Object> getEmployeeData(long id){
        Map<String,Object> response = new HashMap<>();
        EmployeeData data = employeeRepo.findById(id).get();
        response.put("name",data.getName());
        response.put("salary",data.getSalary());
        Map<String,Object> userData = feign.getUser(Long.parseLong(data.getUserId().toString()));
        response.put("user",userData);
        return response;
    }

}
