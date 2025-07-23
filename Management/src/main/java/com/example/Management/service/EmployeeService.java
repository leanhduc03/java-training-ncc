package com.example.Management.service;

import com.example.Management.dto.EmployeeDTO;
import com.example.Management.dto.EmployeeUpdateDTO;
import com.example.Management.entity.Employee;
import com.example.Management.mapper.EmployeeMapper;
import com.example.Management.repository.EmployeeRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EmployeeService {
    EmployeeRepository employeeRepository;
    EmployeeMapper employeeMapper;

    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {

        if (employeeRepository.existsByEmail(employeeDTO.getEmail())) {
            throw new RuntimeException("Email already exists");
        }

        Employee employee = employeeMapper.toEntity(employeeDTO);
        return employeeMapper.toDto(employeeRepository.save(employee));
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public EmployeeDTO getEmployeeById(Long id) {
        Employee employee = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found"));
        return employeeMapper.toDto(employee);
    }

    public EmployeeDTO updateEmployee(Long id, EmployeeUpdateDTO employeeUpdateDTO) {
        Employee employee = employeeMapper.toEntity(getEmployeeById(id));

        if (!employeeUpdateDTO.getEmail().equals(employee.getEmail())) {
            if (employeeRepository.existsByEmail(employeeUpdateDTO.getEmail())) {
                throw new DataIntegrityViolationException("Email already exists");
            }
            employee.setEmail(employeeUpdateDTO.getEmail());
        }

        employeeMapper.updateEmployee(employeeUpdateDTO, employee);

        return employeeMapper.toDto(employeeRepository.save(employee));
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}