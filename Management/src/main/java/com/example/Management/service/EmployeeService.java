package com.example.Management.service;

import com.example.Management.dto.EmployeeDTO;
import com.example.Management.entity.Employee;
import com.example.Management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();

        employee.setFullName(employeeDTO.getFullName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setBirthDate(employeeDTO.getBirthDate());
        employee.setAddress(employeeDTO.getAddress());
        employee.setPhone(employeeDTO.getPhone());
        employee.setPosition(employeeDTO.getPosition());
        employee.setActive(employeeDTO.getActive());

        return employeeRepository.save(employee);
    }

}