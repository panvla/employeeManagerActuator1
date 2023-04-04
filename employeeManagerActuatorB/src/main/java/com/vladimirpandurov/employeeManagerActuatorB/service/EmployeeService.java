package com.vladimirpandurov.employeeManagerActuatorB.service;

import com.vladimirpandurov.employeeManagerActuatorB.exception.EmployeeNotFoundException;
import com.vladimirpandurov.employeeManagerActuatorB.model.Employee;
import com.vladimirpandurov.employeeManagerActuatorB.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee){
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return this.employeeRepository.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return this.employeeRepository.findAll();
    }

    public Employee updateEmployee(Employee employee){
        return this.employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        this.employeeRepository.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id){
        return this.employeeRepository.findEmployeeById(id).orElseThrow(()-> new EmployeeNotFoundException("Employee with id " + id + " not foune!"));
    }
}
