package com.example.EmployeeService.employee.Repositories;

import com.example.EmployeeService.employee.domain.EmployeeData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeDataRepository extends JpaRepository<EmployeeData,Long> {



}
