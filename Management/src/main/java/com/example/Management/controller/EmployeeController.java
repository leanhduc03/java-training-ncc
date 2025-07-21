package com.example.Management.controller;

import com.example.Management.dto.EmployeeDTO;
import com.example.Management.dto.EmployeeUpdateDTO;
import com.example.Management.entity.Employee;
import com.example.Management.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    Employee createEmployee(@RequestBody @Valid EmployeeDTO employeeDTO) {
        return employeeService.createEmployee(employeeDTO);
    }

    @GetMapping
    List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    Employee getEmployeeById(@PathVariable("employeeId") Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{employeeId}")
    Employee updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO, @PathVariable("employeeId") Long id){
        return employeeService.updateEmployee(id,  employeeUpdateDTO);
    }

    @DeleteMapping("/{employeeId}")
    String deleteEmployee(@PathVariable("employeeId") Long id){
        employeeService.deleteEmployee(id);
        return "Delete successfully";

    }
}