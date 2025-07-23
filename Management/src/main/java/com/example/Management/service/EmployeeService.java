package com.example.Management.service;

import com.example.Management.dto.EmployeeDTO;
import com.example.Management.dto.EmployeeUpdateDTO;
import com.example.Management.entity.Employee;
import com.example.Management.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();

        if(employeeRepository.existsByEmail(employeeDTO.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        employee.setFullName(employeeDTO.getFullName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setBirthDate(employeeDTO.getBirthDate());
        employee.setAddress(employeeDTO.getAddress());
        employee.setPhone(employeeDTO.getPhone());
        employee.setPosition(employeeDTO.getPosition());
        employee.setActive(employeeDTO.getActive());

        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public Employee updateEmployee(Long id, EmployeeUpdateDTO employeeUpdateDTO) {
        Employee employee = getEmployeeById(id);

        if(!employeeUpdateDTO.getEmail().equals(employee.getEmail())){
                employee.setEmail(employeeUpdateDTO.getEmail());
        }

        employee.setFullName(employeeUpdateDTO.getFullName());
        employee.setBirthDate(employeeUpdateDTO.getBirthDate());
        employee.setAddress(employeeUpdateDTO.getAddress());
        employee.setPhone(employeeUpdateDTO.getPhone());
        employee.setPosition(employeeUpdateDTO.getPosition());
        employee.setActive(employeeUpdateDTO.getActive());

        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
    }