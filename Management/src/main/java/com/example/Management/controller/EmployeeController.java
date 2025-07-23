package com.example.Management.controller;

import com.example.Management.dto.ApiResponse;
import com.example.Management.dto.EmployeeDTO;
import com.example.Management.dto.EmployeeUpdateDTO;
import com.example.Management.entity.Employee;
import com.example.Management.service.EmployeeService;
import jakarta.validation.Valid;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/employees")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class EmployeeController {
    EmployeeService employeeService;

    @PostMapping
    ApiResponse<EmployeeDTO> createEmployee(@RequestBody @Valid EmployeeDTO employeeDTO) {
        ApiResponse<EmployeeDTO> apiResponse = new ApiResponse<>();
        apiResponse.setResult(employeeService.createEmployee(employeeDTO));
        return apiResponse;
    }

    @GetMapping
    List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{employeeId}")
    EmployeeDTO getEmployeeById(@PathVariable("employeeId") Long id){
        return employeeService.getEmployeeById(id);
    }

    @PutMapping("/{employeeId}")
    EmployeeDTO updateEmployee(@RequestBody EmployeeUpdateDTO employeeUpdateDTO, @PathVariable("employeeId") Long id){
        return employeeService.updateEmployee(id,  employeeUpdateDTO);
    }

    @DeleteMapping("/{employeeId}")
    String deleteEmployee(@PathVariable("employeeId") Long id){
        employeeService.deleteEmployee(id);
        return "Delete successfully";

    }
}