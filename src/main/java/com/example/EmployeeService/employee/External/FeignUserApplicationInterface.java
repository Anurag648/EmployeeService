package com.example.EmployeeService.employee.External;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "User-Service", url = "localhost:9090/")
public interface FeignUserApplicationInterface {

    @GetMapping("api/v1/user")
    public Map<String,Object> getUser(@RequestParam long id);
}
