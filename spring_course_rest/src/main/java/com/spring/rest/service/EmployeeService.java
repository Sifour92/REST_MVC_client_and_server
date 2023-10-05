package com.spring.rest.service;

import com.spring.rest.entity.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployee(int id);
    void deleteEmployee(int id);
}
