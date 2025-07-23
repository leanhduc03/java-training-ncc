package com.example.Management.mapper;

import com.example.Management.dto.EmployeeDTO;
import com.example.Management.dto.EmployeeUpdateDTO;
import com.example.Management.entity.Employee;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeDTO toDto(Employee employee);

    Employee toEntity(EmployeeDTO dto);

    @Mapping(target = "email", ignore = true)
    void updateEmployee(EmployeeUpdateDTO employeeUpdateDTO, @MappingTarget Employee employee);
}